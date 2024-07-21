---
layout: post
title:  "Hacking InChI support into postgenomic.com"
date:   2006-02-25
modified_date: 2023-09-16
blogger-link: https://chem-bla-ics.blogspot.com/2006/02/hacking-inchi-support-into.html
tags: cb inchi
doi: 10.59350/nth2m-yyk05
---

Earlier I [reported](2006-02-15-hot-articles-mining-semantic-web.markdown) about
[postgenomic.com <i class="fa-solid fa-box-archive fa-xs"></i>](https://web.archive.org/web/20060303081952/https://postgenomic.com/),
and needed some diversion from my manuscript work (could no longer think straight about the article I'm working on). So time for
some reading up on new technologies. Timing was perfect, because the source code of postgenomic.com got just uploaded to
[SourceForge SVN](http://sourceforge.net/projects/postgenomic).

Though the author marks it as not-well-documented and alpha, I was quite happy to see a clear modularisation, and good enough
docs to get me started with [InChI](http://www.iupac.org/inchi/) support: if it can do mining for papers on
[DOIs](http://www.doi.org/), then it can do mining for InChI's too.

It does not show which blog items cite this compound, not does it extract some molecular info from PubChem, but
I'm happy with the result of four hours of hacking. BTW, the first two InChI's are left overs from bad
regular expressions :)
