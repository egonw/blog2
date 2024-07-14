---
layout: post
title:  "Text mining for chemistry using OSCAR3"
date:   2006-06-22
blogger-link: https://chem-bla-ics.blogspot.com/2006/06/text-mining-for-chemistry-using-oscar3.html
tags: oscar bioclipse textmining
image: /blog/assets/images/opsin.png
---

[Peter Corbett](http://wwmm.ch.cam.ac.uk/wikis/wwmm/index.php/User:ptc24) from [Peter Murray-Rust's group](http://wwmm.ch.cam.ac.uk/)
at the [Unilever Cambridge Centre for Molecular Informatics](http://www-ucc.ch.cam.ac.uk/) visited
[Christoph Steinbeck's junior Research Group on Molecular Informatics](http://almost.cubic.uni-koeln.de/jrg/) at the
[CUBIC](http://www.cubic.uni-koeln.de/) today, and spoke about the status of [Oscar3](http://sourceforge.net/projects/oscar3-chem),
a chemistry text mining program with the [Artistic License](http://www.opensource.org/licenses/artistic-license.php).
Oscar3, the successor of version 1 and 2, can detect and extract molecular structures and experimental details from plain text articles,
using a variety of text mining techniques.

The afternoon was spend on hacking Oscar3 into [Bioclipse](http://www.bioclipse.net/), with good success. It involved updating Oscar3
for the latest [CDK](http://cdk.sf.net/) and setting up a plugin infrastructure for Bioclipse. This plugin will allow mining
(scientific) articles for chemical compounds and there properties from within Bioclipse. The outcome of today's hacking session was
somewhat less ambitious and focused on the general infrastructure, and getting the OPSIN functionality in Oscar3 available as a wizard.
OPSIN is a IUPAC name 2 structure tool and, amongst many other names, is able to recognize [caffeine](http://pubchem.ncbi.nlm.nih.gov/summary/summary.cgi?cid=2519)
(`InChI=1/C8H10N4O2/c1-10-4-9-6-5(10)7(13)12(3)8(14)11(6)2/h4H,1-3H3`):

![](/blog/assets/images/opsin.png)
