---
layout: post
title:  "Pimp my JavaDoc"
date:   2007-02-19
blogger-link: https://chem-bla-ics.blogspot.com/2007/02/pimp-my-javadoc.html
tags: cdk javadoc literature
image: /blog/assets/images/pimpedJavaDoc.png
---

[Jörg](http://miningdrugs.blogspot.com/)'s PhD book *Data Mining und Graph Mining auf molekularen Graphen - Chemoinformatik und
molekulare Kodierungen für ADME/Tox-QSAR-Analysen* has a dump of the JavaDoc of the `GroupContributionPredictor` in
[JOELib](http://joelib.sf.net/) (Figure 3.2, page 43). There are two nice things to the shown JavaDoc: 1. it has links to
[Wikipedia](http://www.wikipedia.org/); 2. it has a Further Reading section.

Now, the [CDK](http://cdk.sf.net/) already links to a bibliography for some time now. However, it would just give a BibTex
key, and link to a webpage created from a [BibTeXML](http://bibtexml.sf.net/) file in which we store all references
([cdk/doc/refs/cheminf.bibx](http://cdk.svn.sourceforge.net/viewvc/cdk/trunk/cdk/doc/refs/cheminf.bibx?view=log)).
Putting the full citation inline makes the JavaDoc more informative, but I wanted to preserve the `@cdk.cite`
mechanism we were using.

This weekend I hacked up a nice CDKCiteDoclet that would read the BibTeXML file with [XOM](http://www.xom.nu/),
and convert items to HTML to put into the pimped JavaDoc:

![](/blog/assets/images/pimpedJavaDoc.png)
