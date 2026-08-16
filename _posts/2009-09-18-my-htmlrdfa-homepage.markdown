---
layout: post
title:  "My HTML+RDFa homepage"
date:   2009-09-18
blogger-link: https://chem-bla-ics.blogspot.com/2009/09/my-htmlrdfa-homepage.html
doi: 10.59350/rv6nz-p8j13
tags: html rdf foaf rdfa
image: /assets/images/egonwGithub1.png
---

Finally got around to adding a few more bits to my new science homepage: [egonw.github.com](http://egonw.github.com/). Cool thing about this new page is that it is
[HTML+RDFa](http://www.w3.org/TR/rdfa-syntax/), so, my new [FOAF](http://en.wikipedia.org/wiki/FOAF_%28software%29) profile is embedded in the HTML:

![](/assets/images/egonwGithub.png)

Down the bottom is link to extract the RDF triples:

![](/assets/images/egonwGithub1.png)

Next, is to write a piece of code that creates HTML+RDFa+BIBO from a BibTeX file, and to write a plugin for Bioclipse to extract triples from HTML+RDFA.
