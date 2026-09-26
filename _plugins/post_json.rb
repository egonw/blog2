# License: MIT
#
# Adds a JSON Feed with just that post next to every post, e.g. /2026/07/13/foo.json
# next to /2026/07/13/foo.html, rendered with _layouts/post-json.json.

module ChemBlaIcs
  class PostJsonGenerator < Jekyll::Generator
    safe true
    priority :low

    def generate(site)
      site.posts.docs.each do |post|
        name = File.basename(post.url, ".*") + ".json"
        page = Jekyll::PageWithoutAFile.new(site, site.source, File.dirname(post.url), name)
        page.data["layout"] = "post-json"
        page.data["post"] = post
        page.data["sitemap"] = false
        site.pages << page
      end
    end
  end
end
