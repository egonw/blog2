// Copyright (C) 2023  Egon Willighagen
// License: MIT

import groovy.io.FileType

// I have been pondering about using a Markdown parser here, but I did not want to learn another "powerful" API.
// So, below is a bit of custom code: extract "tags:" from the content from the first two "---" lines

def posts = []
def tags = new HashSet<String>()

def dir = new File("_posts/")
dir.eachFileRecurse (FileType.FILES) { file ->
  if (!file.name.startsWith("template"))
    posts << file
}

posts.each() { post ->
  // println "Processing ${post}"
  header = false
  tagline = false
  post.eachLine { line ->
    if (header) {
      if (line == "---") {
        header = false
        return true // stop parsing
      } else {
        if (tagline && line.startsWith("  ")) {
          line.split().each { tag -> tags.add(tag) }
        } else if (line.startsWith("tags:")) {
          tagline = true
          line = line.substring(5)
          line.split().each { tag -> tags.add(tag) }
        } else {
          tagline = false
        }
      }
    } else if (line == "---") {
      header = true
    }
  }
}

// Now that we have the tags, look for the interesting ones

// First, works with DOIs
tags.grep{ it.toString().startsWith("doi:") }.each() { tag ->
  tag = tag.substring(4).toUpperCase()
  file = new File("work/${tag}.markdown")
  if (!file.exists()) {
    println "Creating $file"
    file.text = """---
layout: work
title: "Work: XXXX"
type: XXXX
tag: doi:${tag}
doi: doi:${tag}
---
"""
  }
}

// Next, substances with an InChIKeys
tags.grep{ it.toString().startsWith("inchikey:") }.each() { tag ->
  tag = tag.substring(9).toUpperCase()
  file = new File("molecule/${tag}.markdown")
  if (!file.exists()) {
    println "Creating $file"
    file.text = """---
layout: molecule
title: "Molecule: ${tag}"
tag: inchikey:${tag}
smiles: XXXX
---
"""
  }
}  

// Finally, other tags (anything without an ':')
tags.grep{ !(it.toString().contains(":")) }.each() { tag ->
  tag = tag.toLowerCase()
  file = new File("tag/${tag}.markdown")
  if (!file.exists()) {
    println "Creating $file"
    file.text = """---
layout: tagpage
title: "Tag: ${tag}"
tag: ${tag}
---
"""
  }
}

