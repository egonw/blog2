---
layout: post
title:  "Open Source Swing: Jmol renderer runs!"
date:   2005-11-27
blogger-link: https://chem-bla-ics.blogspot.com/2005/11/open-source-swing-jmol-renderer-runs.html
tags: jmol java
---

Where I was able to mention [earlier](http://chem-bla-ics.blogspot.com/2005/11/open-source-swing-jchempaint-runs.html) that JChemPaint now runs with free
(as in open source) Java virtual machines, I just tried to run the core Jmol renderer, using the
[Integration.java](http://cvs.sourceforge.net/viewcvs.py/jmol/Jmol/examples/Integration.java?rev=1.13&view=markup) which comes as an example:

The screenshot was made with [jamvm](http://jamvm.sourceforge.net/) 1.3.3 and [classpath](http://developer.classpath.org/) 0.19.

It is very slow, however. I have not tried it with other free virtual machines, which are supposedly faster. It is a good start nevertheless: it means that a
Jmol based [Bioclipse](http://www.bioclipse.net/) plugin will work with free virtual machines too.
