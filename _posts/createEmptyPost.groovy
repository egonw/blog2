// Copyright (c) 2025  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

@Grab(group='io.github.egonw.bacting', module='managers-ui', version='1.0.12')

import java.text.SimpleDateFormat;
import java.util.Date;

String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

ui = new net.bioclipse.managers.UIManager("..");

if (args.length < 1) {
  System.err.println("Must provide a title")
  System.exit(-1)
}

title = args.join(" ")

key = title.replace(" ", "-").toLowerCase().replace(":", "")

def sout = new StringBuilder(), serr = new StringBuilder()
def proc = 'commonmeta encode 10.59350'.execute()
proc.consumeProcessOutput(sout, serr)
proc.waitForOrKill(5000)
println "out> $sout\nerr> $serr"
doi = serr.toString().replace("https://doi.org/10.", "10.").replace("\n","").replace("\r","")
if (doi == null || doi.isEmpty()) {
  doi = sout.toString().replace("https://doi.org/10.", "10.").replace("\n","").replace("\r","")
}

content = """---
layout: post
title:  "${title}"
date:   ${date}
doi: ${doi}
tags:
#comments:
#  host: social.edu.nl
#  username: egonw
#  id: ...
---

<i class="fa-solid fa-box-archive fa-xs"></i>
<i class="fa-solid fa-recycle fa-xs"></i>
<i class="fa-solid fa-link-slash fa-xs"></i>
"""

ui.newFile("/_posts/${date}-${key}.markdown", content)
