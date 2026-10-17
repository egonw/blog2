// Copyright (c) 2026  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

// Adds missing blogspot-to-new-URL mappings to updateLinks.groovy, based on
// the blogger-link in the YAML header of the *.markdown posts. It keeps the
// mappings sorted by the date in the new URL.
//
// Only links that are actually used in the post bodies are added (links on
// lines marked "keep link" and the YAML headers are ignored, like
// updateLinks.groovy does).
//
// Existing mappings are never changed, only (re)ordered.
//
// Usage: groovy updateUpdateLinks.groovy [--sort-only]

import groovy.io.FileType

sortOnly = args.contains("--sort-only")

target = new File("updateLinks.groovy")
lines = target.readLines()

start = lines.findIndexOf { it.startsWith("mappings = [") }
end = start < 0 ? -1 : (start + 1 ..< lines.size()).find { lines[it].equals("]") }
if (start < 0 || end == null || end < 0) {
  println "Could not find the mappings block in ${target}"
  System.exit(1)
}

// existing mappings: key -> new path (a list of [key, value] to keep the order for ties)
entries = []
existing = [] as Set
lines[(start+1)..<end].each { line ->
  def mapping = (line =~ /^\s*"([^"]+)"\s*:\s*"([^"]+)"\s*,?\s*$/)
  if (!mapping.find()) {
    println "Unexpected line in the mappings block: ${line}"
    System.exit(1)
  }
  entries.add([mapping.group(1), mapping.group(2)])
  existing.add(mapping.group(1))
}

if (!sortOnly) {
  // blogspot links used in the post bodies, as updateLinks.groovy would replace them
  used = [] as Set
  new File(".").eachFile(FileType.FILES) { file ->
    if (file.extension != "markdown") return
    def inHeader = false
    def headerDone = false
    file.eachLine { line ->
      if (line.equals("---") && !headerDone) {
        if (inHeader) headerDone = true
        inHeader = !inHeader
      } else if (headerDone && !line.contains("keep link")) {
        def um = (line =~ /\]\(https?:\/\/chem-bla-ics\.blogspot\.com\/([^)\s?#]+)/)
        while (um.find()) used.add(um.group(1))
      }
    }
  }

  // collect new mappings from the post headers
  found = [:] // file name -> [old, new]
  new File(".").eachFile(FileType.FILES) { file ->
    if (file.extension != "markdown") return
    def name = file.name
    def fm = (name =~ /^(\d{4})-(\d{2})-(\d{2})-(.+)\.markdown$/)
    if (!fm.find()) return
    def inHeader = false
    def link = null
    for (String line : file.readLines()) {
      if (line.equals("---")) {
        if (inHeader) break
        inHeader = true
      } else if (inHeader && line.startsWith("blogger-link:")) {
        def lm = (line =~ /blogger-link:\s*https?:\/\/chem-bla-ics\.blogspot\.com\/(\S+)/)
        if (lm.find()) link = lm.group(1)
        break
      }
    }
    if (link == null || existing.contains(link) || !used.contains(link)) return
    existing.add(link) // first post wins if a link is duplicated
    def newPath = "${fm.group(1)}/${fm.group(2)}/${fm.group(3)}/${fm.group(4)}.html"
    found[name] = [link, newPath]
  }

  found.sort { a, b -> b.key <=> a.key }.each { name, entry ->
    println "Adding ${entry[0]}"
    entries.add(entry)
  }
}

// sort by the date in the new URL, newest first; the sort is stable so equal dates keep their order
sortDate = { entry ->
  def dm = (entry[1] =~ /^\/?(\d{4})\/(\d{2})\/(?:(\d{2})\/)?/)
  dm.find() ? "${dm.group(1)}-${dm.group(2)}-${dm.group(3) ?: '00'}" : "0000-00-00"
}
entries = entries.sort(false) { a, b -> sortDate(b) <=> sortDate(a) }

mappingLines = entries.withIndex().collect { entry, i ->
  "  \"${entry[0]}\": \"${entry[1]}\"" + (i < entries.size() - 1 ? "," : "")
}
result = lines[0..start] + mappingLines + lines[end..-1]
target.text = result.join("\n") + "\n"
