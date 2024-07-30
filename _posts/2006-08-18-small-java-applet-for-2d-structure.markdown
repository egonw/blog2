---
layout: post
title:  "Small java applet for 2D structure drawing"
date:   2006-08-18
blogger-link: https://chem-bla-ics.blogspot.com/2006/08/small-java-applet-for-2d-structure.html
tags: java justdoi:10.3390/11040219
---

Trepalin et al. published in [Molecules](http://mdpi.org/molecules/) the article *A Java Chemical Structure Editor Supporting the Modular Chemical Descriptor
Language (MCDL)* (open access [PDF](http://mdpi.org/molecules/papers/11040219.pdf)). The applet is about 250kB (though the article mentions 200kB) in size and
downloadable from the [MCDL](http://sourceforge.net/projects/mcdl/) project on SourceForge (license: Public Domain). The article compares the applet with the
[JChemPaint](http://jchempaint.sf.net/) applet and notes that their applet is much smaller. Both allow a template database for automated structure diagram
generation, and the database that comes with the MCDL applet contains 105 fragments, whereas the JChemPaint applet contains a few.

The article also discusses the algorithm they use to deduce bond orders, starting from the MCDL, a problem [CDK](http://cdk.sf.net/) is struggling with when
dealing with SMILES strings.
