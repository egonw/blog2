---
layout: post
title:  "InChI meta data with kfile_chemical"
date:   2005-10-19
modified_date: 2023-07-27
blogger-link: https://chem-bla-ics.blogspot.com/2005/10/inchi-meta-data-with-kfilechemical.html
tags: kde inchi
doi: 10.59350/bs3x9-0em56
---

I've just uploaded [kfile_chemical 0.9 <i class="fa-solid fa-box-archive fa-xs"></i>](http://web.archive.org/web/20051120044043/http://www.kde-apps.org/content/show.php?content=28995). It has new translations for
ES and DA, and plugins for [InChI](http://www.iupac.org/inchi/) files. It will extract the InChI string as meta data (and will thus be used by the
[KDE](http://www.kde.org/) desktop search [Kat <i class="fa-solid fa-recycle fa-xs"></i>](http://web.archive.org/web/20230727174017/https://lwn.net/Articles/148822/), and the InChI version number.

Thinking about this, it might be useful to extract all layers as meta data, so that one can search on chemical formula and even
connectivity, and find all matching structures. Not really close to substructure search, but we'll tackle that later :)
