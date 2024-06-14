---
layout: post
title:  "Open Text Mining Interface and Bioclipse"
date:   2006-05-07
modified_date: 2024-06-14
blogger-link: https://chem-bla-ics.blogspot.com/2006/05/open-text-mining-interface-and.html
tags: cml bioclipse xml textmining rss doi:10.1021/CI034244P
image: /blog/assets/images/otmiSupport.png
---

Timo Hannay [blogged <i class="fa-solid fa-box-archive fa-xs"></i>](https://web.archive.org/web/20060620194249/http://blogs.nature.com/wp/nascent/2006/04/open_text_mining_interface.html)
in [Nature](http://www.nature.com/)'s [Nascent blog <i class="fa-solid fa-box-archive fa-xs"></i>](https://web.archive.org/web/20060504035155/http://blogs.nature.com/wp/nascent/)
about the Open Text Mining Interface (OTMI), which is "a suggestion from Nature about how we might achieve text-mining
and indexing purposes". The idea is that each article has a link pointing to a machine readable file
containing raw data about (and from?) the article. The standing example uses
[Atom 1.0](http://atompub.org/2005/07/11/draft-ietf-atompub-format-10.html) as a container, allowing raw
data to be included using foreign namespaces, such as [Dublic Core](http://prismstandard.org/)
(for metadata) and [Prism](http://prismstandard.org/) (for bibliographic data), and the OTMI text
mining statistics uses a namespace too.

In a comment, [Henry Rzepa](http://www.ch.ic.ac.uk/rzepa/) proposed inclusion of CML, and refers to earlier
work on CMLRSS where [Chemical Markup Language](http://www.xml-cml.org/) is embedded in RSS news feeds
for which I wrote readers for [Jmol](http://www.jmol.org/) and
[JChemPaint](http://jchempaint.sf.net/) (DOI:[10.1021/ci034244p](https://doi.org/10.1021/ci034244p)).

As readers of my blog know, the [Bioclipse](http://www.bioclipse.net/) project has been working hard
on an integrated (bio)chemistry workbench, and the [latest release](http://bioclipse.blogspot.com/2006/05/bioclipse-090-released.html)
includes a [CMLRSS reader plugin](http://wiki.bioclipse.net/index.php?title=CMLRSS_plugin) too, which
supports CML embedded in Atom 0.3/1.0 and RSS 1.0/2.0 feeds. Now, adding support for other embedded
namespaces is trivial, and this morning I hacked in support for OTMI:

![](/blog/assets/images/otmiSupport.png)

This screenshot show the [original OTMI example](https://chem-bla-ics.blogspot.com/2006/05/open-text-mining-interface-and.html)
with the Atom 1.0 entry now wrapped in an Atom 1.0 `<feed>` element. There is no nice OTMI icon for the OTMI content in the
Atom 1.0 entry, neither did I make a 'view' yet showing the actual vector's or the snippet's, but that's a piece of cake too.

Now, the nice thing about this is that the Bioclipse code for the Atom and RSS feeds, just greps through the feed entry
and show whatever CML or OTMI content is present. When Nature decides to include CML in these OTMI files too,
I will not have to update the current code.
