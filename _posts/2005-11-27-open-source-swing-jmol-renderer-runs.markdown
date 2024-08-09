---
layout: post
title:  "Open Source Swing: Jmol renderer runs!"
date:   2005-11-27
modified_date: 2024-08-09
blogger-link: https://chem-bla-ics.blogspot.com/2005/11/open-source-swing-jmol-renderer-runs.html
tags: jmol java
doi: 10.59350/s1sxs-8qb11
---

Where I was able to mention [earlier <i class="fa-solid fa-recycle fa-xs"></i>](/blog/2005/11/20/open-source-swing-jchempaint-runs.html) that JChemPaint now runs with free
(as in open source) Java virtual machines, I just tried to run the core Jmol renderer, using the
[Integration.java <i class="fa-solid fa-recycle fa-xs"></i>](https://sourceforge.net/p/jmol/code/4289/tree//trunk/Jmol/examples/Integration.java) which comes as an example.

Sadly, the original screenshots got lost that were made with [jamvm](http://jamvm.sourceforge.net/) 1.3.3 and [classpath](http://developer.classpath.org/) 0.19.

It is very slow, however. I have not tried it with other free virtual machines, which are supposedly faster. It is a good start nevertheless: it means that a
Jmol based [Bioclipse](http://www.bioclipse.net/) plugin will work with free virtual machines too.
