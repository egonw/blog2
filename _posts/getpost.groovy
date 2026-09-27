// Copyright (c) 2023-2026  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

@Grab(group='io.github.egonw.bacting', module='managers-ui', version='1.0.12')
@Grab(group='io.github.egonw.bacting', module='net.bioclipse.managers.jsoup', version='1.0.12')

bioclipse = new net.bioclipse.managers.BioclipseManager("..");
ui = new net.bioclipse.managers.UIManager("..");
jsoup = new net.bioclipse.managers.JSoupManager("..");

// Command line options
def cli = new groovy.cli.commons.CliBuilder(usage: 'groovy getpost.groovy [options] <blogger-url> [day]', stopAtNonOption: false)
cli.h(longOpt: 'help', 'show this help')
cli._(longOpt: 'doi', args: 1, argName: 'doi', 'use this DOI instead of creating one with commonmeta')
cli._(longOpt: 'fakedoi', 'use 10.fake/xxxx as DOI instead of creating one with commonmeta (for testing)')
def options = cli.parse(args)
if (!options) System.exit(1)
if (options.h || options.arguments().isEmpty()) { cli.usage(); System.exit(0) }
if (options.doi && options.fakedoi) {
  System.err.println("Use only one of --doi and --fakedoi")
  System.exit(1)
}

blogpost = options.arguments()[0]
dayOverride = options.arguments().size() > 1 ? options.arguments()[1] : null // this 2nd parameter is now optional. it will take it from the Atom feed entry

if (options.doi) {
  doi = options.doi.replace("https://doi.org/", "")
} else if (options.fakedoi) {
  doi = "10.fake/xxxx"
} else {
  def sout = new StringBuilder(), serr = new StringBuilder()
  def proc = 'commonmeta encode 10.59350'.execute()
  proc.consumeProcessOutput(sout, serr)
  proc.waitForOrKill(5000)
  println "out> $sout\nerr> $serr"
  doi = serr.toString().replace("https://doi.org/10.", "10.").replace("\n","").replace("\r","")
  if (doi == null || doi.isEmpty()) {
    doi = sout.toString().replace("https://doi.org/10.", "10.").replace("\n","").replace("\r","")
  }
}

htmlContent = bioclipse.download(blogpost)
htmlDom = jsoup.parseString(htmlContent)
// print htmlDom

title = jsoup.select(htmlDom, "meta[property='og:title']");
parts = blogpost.split("/")
year = parts[3]; if (year.length() == 1) year = "0" + year
month = parts[4]; if (month.length() == 1) month = "0" + month
key = parts[5].replace(".html","")

// fetch the blog post content from the Atom feed entry
postIdMatcher = (htmlContent =~ /'postId':\s*'(\d+)'/)
if (!postIdMatcher.find()) {
  System.err.println("Could not find the postId in ${blogpost}")
  System.exit(1)
}
postId = postIdMatcher.group(1)
blogBase = parts[0..2].join("/")

entryXml = bioclipse.download("${blogBase}/feeds/posts/default/${postId}")
entry = new groovy.xml.XmlSlurper().parseText(entryXml)
published = entry.published.text()

if (published.substring(0,4) != year || published.substring(5,7) != month) {
  System.err.println("Warning: published date ${published} does not match the year and month in the URL")
}
day = dayOverride ?: published.substring(8,10)
if (day.length() == 1) day = "0" + day

// convert the blog post HTML into Markdown: simple markup becomes Markdown,
// complex markup (tables, iframes, <pre>, etc) is kept as HTML
RAW = "\uE000"      // placeholder delimiter for text that should not be touched anymore
BR = "\uE001"       // placeholder for <br />
HARDBR = "\uE002"   // placeholder for the two trailing spaces of a Markdown line break
rawStore = []

String keep(String text) { rawStore << text; return RAW + (rawStore.size()-1) + RAW }
String restore(String text) {
  // loop, because kept text can itself contain placeholders
  while (text =~ /\uE000(\d+)\uE000/) text = text.replaceAll(/\uE000(\d+)\uE000/) { all, i -> rawStore[i as int] }
  return text
}
String block(String text) { return "\n\n" + text + "\n\n" }

String escapeText(String text) {
  return text
    .replaceAll(/[\s ]+/, " ")
    .replace("\\", "\\\\").replace("*", "\\*").replace("`", "\\`").replace("|", "\\|")
    .replaceAll(/(?<!\w)_|_(?!\w)/, "\\\\_")
    .replace("<", "&lt;")
}

// cleans up whitespace around line breaks, and turns <br /> into Markdown
String tidy(String text) {
  return text
    .replaceAll(/[ \t]*\n[ \t]*/, "\n")
    .replaceAll(/[ \t]*(\uE001[ \t\n]*){2,}/, "\n\n")
    .replaceAll(/[ \t]*\uE001[ \t]*\n?/, HARDBR + "\n")
    .replaceAll(/\uE002\n(?=\n|\z)/, "\n") // no line break needed at the end of a paragraph
    .replaceAll(/(^|\n)\uE002\n/, "\$1\n") // nor at the start of one
    .replaceAll(/^\n+/, "").replaceAll(/\n{3,}/, "\n\n")
}

// wraps inline text in markers, like *...*, keeping the whitespace outside
String wrap(String marker, String text) {
  if (text.trim().isEmpty()) return text
  def m = (text =~ /^(\s*)(.*?)(\s*)$/)
  m.matches()
  return m.group(1) + marker + m.group(2) + marker + m.group(3)
}

String children(org.jsoup.nodes.Node node) { return node.childNodes().collect { convert(it) }.join("") }

// RDFa markup is kept as HTML
boolean hasRDFa(org.jsoup.nodes.Element el) {
  return el.attributes().any { attr ->
    attr.key in ["about", "typeof", "property", "resource", "datatype", "prefix", "vocab"] ||
    attr.key.startsWith("xmlns") ||
    (attr.key in ["rel", "rev"] && attr.value.contains(":"))
  }
}

// converts <span style="font-weight: bold"> etc, but keeps spans with a class or other styling as HTML
String span(org.jsoup.nodes.Element el) {
  def other = el.attributes().findAll { it.key != "style" }
  def styles = el.attr("style").split(";").collect { it.trim().toLowerCase() }.findAll { !it.isEmpty() }
  if (!other.isEmpty() || styles.any { !(it ==~ /font-(weight|style)\s*:.*/) }) return keep(el.outerHtml())
  def text = children(el)
  if (styles.any { it ==~ /font-weight\s*:\s*(bold|[6-9]00)/ }) text = wrap("**", text)
  if (styles.any { it ==~ /font-style\s*:\s*italic/ }) text = wrap("*", text)
  return text
}

String convert(org.jsoup.nodes.Node node) {
  if (node instanceof org.jsoup.nodes.TextNode) return escapeText(node.getWholeText())
  if (!(node instanceof org.jsoup.nodes.Element)) return "" // comments, etc
  def el = (org.jsoup.nodes.Element)node
  def tag = el.tagName().toLowerCase()
  if (hasRDFa(el)) return el.isBlock() ? block(keep(el.outerHtml())) : keep(el.outerHtml())
  switch (tag) {
    case "br": return BR
    case ["p", "div", "center"]:
      if (el.hasClass("blogger-post-footer")) return ""
      return block(children(el))
    case ["span", "font"]: return span(el)
    case ["i", "em", "cite"]: return wrap("*", children(el))
    case ["b", "strong"]: return wrap("**", children(el))
    case ["code", "tt"]: return el.text().contains("`") ? keep(el.outerHtml()) : "`" + el.text() + "`"
    case ~/h[1-6]/:
      return block("#" * (tag.substring(1) as int) + " " + restore(tidy(children(el))).replaceAll(/\s+/, " ").trim())
    case "a":
      def text = children(el)
      if (!el.hasAttr("href")) return text
      if (text.trim().isEmpty() && !text.contains(RAW)) return text
      def href = el.attr("href").trim().replace(" ", "%20").replace("(", "%28").replace(")", "%29")
      return "[" + text.trim() + "](" + href + ")"
    case "img":
      def src = el.attr("src")
      if (src.contains("/tracker/")) return "" // Blogger stats pixel
      return "![" + el.attr("alt").replace("[", "").replace("]", "") + "](" + src.replace(" ", "%20") + ")"
    case ["ul", "ol"]:
      def marker = (tag == "ol") ? "1. " : "* "
      def pad = " " * marker.length()
      def items = el.children().findAll { it.tagName() == "li" }.collect { li ->
        def body = restore(tidy(children(li)).replaceAll(/\n{2,}/, "\n").trim())
        marker + body.split("\n").join("\n" + pad)
      }
      return block(keep(items.join("\n")))
    case "blockquote":
      def body = restore(tidy(children(el)).trim())
      return block(keep(body.split("\n").collect { it.isEmpty() ? ">" : "> " + it }.join("\n")))
    case "hr": return block("---")
    case "iframe":
      if (el.attr("src") =~ /amazon\.com|amazon-adsystem/) return "" // obsolete Amazon affiliate widgets
      return block(keep(el.outerHtml()))
    default:
      // tables, <pre>, <script>, <object>, etc: keep as HTML
      return el.isBlock() ? block(keep(el.outerHtml())) : keep(el.outerHtml())
  }
}

// download images from Blogger into /assets/images/ (links to Posterous images are left as they are)
imagesDir = new File("../assets/images")
localImages = [:] // original URL -> local path

// returns the local path of the image, or null if it could not be downloaded
String localImage(String url) {
  if (localImages.containsKey(url)) return localImages[url]
  def bytes, disposition
  try {
    def connection = new URL(url).openConnection()
    bytes = connection.inputStream.bytes
    disposition = connection.getHeaderField("Content-Disposition") ?: ""
  } catch (Exception exception) {
    System.err.println("Warning: could not download ${url}, keeping the original URL: ${exception.message}")
    return localImages[url] = null
  }
  // Blogger gives the original file name, which is not always in the URL
  def dispositionName = (disposition =~ /filename="?([^";]+)"?/)
  def name = dispositionName.find() ? dispositionName.group(1) : URLDecoder.decode(url.tokenize("/").last(), "UTF-8")
  name = name.replaceAll(/[^A-Za-z0-9._-]/, "_")
  def base = name.replaceAll(/\.\w+$/, "")
  def ext = name.substring(base.length())
  // on a file name collision, reuse the existing image if identical, otherwise add a suffix
  def file = new File(imagesDir, name)
  for (int i = 1; file.exists() && file.bytes != bytes; i++) file = new File(imagesDir, "${base}-${i}${ext}")
  if (file.exists()) {
    println "Reusing the identical ${file.name}"
  } else {
    file.bytes = bytes
    println "Saved ${url} as ${file.name}"
  }
  return localImages[url] = "/blog/assets/images/" + file.name
}

postHtml = org.jsoup.Jsoup.parseBodyFragment(entry.content.text())
postHtml.outputSettings().prettyPrint(false)

if (!imagesDir.isDirectory()) {
  System.err.println("Warning: ${imagesDir} not found, so not downloading images. Run this script from the _posts/ folder.")
} else {
  def isBlogger = { String url -> url ==~ /https?:\/\/(blogger\.googleusercontent\.com|\d\.bp\.blogspot\.com)\/.*/ }
  postHtml.select("img").each { img ->
    // Blogger links a thumbnail to the full size image, so download the latter and drop the link
    def link = img.parent()
    def thumbnail = link.tagName() == "a" && link.childNodeSize() == 1 && isBlogger(link.attr("href"))
    def url = thumbnail ? link.attr("href") : img.attr("src")
    if (!isBlogger(url) || url.contains("/tracker/")) return
    def local = localImage(url)
    if (local == null) return
    img.attr("src", local)
    if (thumbnail) link.unwrap()
  }
}
firstImage = localImages.values().find { it != null }

markdown = restore(tidy(children(postHtml.body())).trim()).replace(HARDBR, "  ") + "\n"

// match the Blogger labels of the post against the local tags in /tag/, ignoring case, spaces, and punctuation
tagMappings = [
  "cheminformatics": "cheminf"
]
String normalizeTag(String text) {
  text = text.toLowerCase().replaceAll(/[^a-z0-9]/, "")
  if (tagMappings.containsKey(text)) text = tagMappings.get(text)
  return text
}
bloggerLabels = entry.category.findAll { it.@scheme.text() == "http://www.blogger.com/atom/ns#" }.collect { it.@term.text() }
tagsDir = new File("../tag")
localTags = [:] // normalized name or title -> tag
if (!tagsDir.isDirectory()) {
  System.err.println("Warning: ${tagsDir} not found, so not matching tags. Run this script from the _posts/ folder.")
} else {
  // first the titles, so that the tag names themselves take precedence
  tagsDir.eachFileMatch(~/.*\.markdown/) { file ->
    def tag = file.name.replace(".markdown", "")
    def titleMatcher = (file.text =~ /(?m)^title:\s*"?Tag:\s*(.*?)"?\s*$/)
    if (titleMatcher.find()) localTags[normalizeTag(titleMatcher.group(1))] = tag
  }
  tagsDir.eachFileMatch(~/.*\.markdown/) { file ->
    def tag = file.name.replace(".markdown", "")
    localTags[normalizeTag(tag)] = tag
  }
}
tags = bloggerLabels.collect { localTags[normalizeTag(it)] }.findAll { it != null }.unique()
missingLabels = bloggerLabels.findAll { localTags[normalizeTag(it)] == null }
if (tagsDir.isDirectory() && !missingLabels.isEmpty()) {
  println "Blogger labels without a local tag: " + missingLabels.join(", ")
}

content = """---
layout: post
title:  "${title.first().attr("content")}"
date:   ${year}-${month}-${day}
blogger-link: ${blogpost}
doi: ${doi}${firstImage ? "\nimage: " + firstImage : ""}
tags:${tags ? " " + tags.join(" ") : ""}
---

${markdown}"""

ui.newFile("/_posts/${year}-${month}-${day}-${key}.markdown", content)
