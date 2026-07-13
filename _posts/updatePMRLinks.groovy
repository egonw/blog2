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
  "murrayrust/?p=299": "2007/05/09/chemical-microformats-have-arrived-some-time-ago/",
  "murrayrust/?p=295": "2007/05/08/microformats-in-the-chemical-blogosphere-the-chemical-sematic-web-has-arrived/"
]

oldPref = "http://wwmm.ch.cam.ac.uk/blogs/"
newPref = "https://blogs.ch.cam.ac.uk/pmr/"

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
