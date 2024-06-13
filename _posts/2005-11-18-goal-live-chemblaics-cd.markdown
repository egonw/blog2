---
layout: post
title:  "The goal: a live chemblaics CD"
date:   2005-11-18
blogger-link: https://chem-bla-ics.blogspot.com/2005/11/goal-live-chemblaics-cd.html
tags: cheminf linux java workflow
doi: 10.59350/e2cdx-9q525
---

This evening I have been looking at with the [KNOPPIX](http://www.knoppix.net/) customization howto, and ran many of the interesting commands.
I've setup a environment with Kalzium, OpenBabel, CDK, jython, [PyMOL](http://pymol.sourceforge.net/), and for development I included gcj and
Eclipse. At some later point I will include kfile_chemical too, but I want to make a deb package first.

Moreover, I also wanted it to include JChemPaint, Jmol and [Taverna](http://taverna.sourceforge.net/) (with the CDK extension). However, these
depend on Swing, which is not suffiently provided by open source java virtual machines. I attempted gij 4.0, [kaffe](http://www.kaffe.org/)
and [sablevm](http://sablevm.org/), all without success.

A live CD with all the open source chemo- and bioinformatics tools would be a real killer. We could take a burned live CD with us to conferences
and have others run our software on their laptop! But we need to stop use Swing. Fortunately, there seems to be a serious project going on to
port JChemPaint and Jmol to a free Java GUI environment, so maybe we can have the live CD up and going before the 2006 conferences start.
