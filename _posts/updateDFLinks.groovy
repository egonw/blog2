// Copyright (c) 2025  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

@Grab(group='io.github.egonw.bacting', module='managers-ui', version='1.0.12')

import java.text.SimpleDateFormat;
import java.util.Date;
import groovy.io.FileType

String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

ui = new net.bioclipse.managers.UIManager("..");

// EMPTY

mappings = [
  "2010/03/26/game-mechanics-in-science-your-soaking-in-them": "10.59350/2c1vx-5p005",
  "2009/11/06/warren-delano": "10.59350/rj9fv-7mf71",
  "2009/07/03/seventeen-github-accounts-to-watch-in-cheminformatics": "10.59350/ps1ms-z0e55",
  "2006/10/30/agile-chemical-informatics-development-with-cdk-and-ruby-rcdk-0-3-0": "10.59350/c8h7w-n4922"
]

oldPref = "http://depth-first.com/articles/"
newPref = "https://doi.org/"

dir = new File(".")
dir.eachFileRecurse (FileType.FILES) { file ->
  if (file.extension == "markdown") {
    content = ""
    updated = false
    inHeader = false
    headerDone = false
    modifiedFound = false
    
    file.eachLine { line ->
      if (line.equals("---")) {
        if (inHeader) { // end of header
          inHeader = false
          headerDone = true
          if (!modifiedFound) line = "modified_date: ${date}\n" + line
        } else {
          inHeader = true
        }
      } else if (inHeader) {
        if (line.startsWith("modified_date: ")) {
          line = "modified_date: ${date}"
          modifiedFound = true
        }
      }
      mappings.each { entry ->
        oldContent = "](" + oldPref + entry.key
        newContent = " <i class=\"fa-solid fa-recycle fa-xs\"></i>](" + newPref + entry.value
        if (line.contains(oldContent) && !(line.contains("keep link"))) {
          line = line.replace(oldContent, newContent)
          updated = true
        }
        oldContent = "](" + oldPref.replace("http://","https://") + entry.key
        if (line.contains(oldContent) && !(line.contains("keep link"))) {
          line = line.replace(oldContent, newContent)
          updated = true
        }
      }
      content += line + "\n"
    }
    if (updated) {
      println "Processing ${file}"
      file.text = content
    }
  }
}
