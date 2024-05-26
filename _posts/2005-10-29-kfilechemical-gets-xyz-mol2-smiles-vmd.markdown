---
layout: post
title:  "kfile_chemical gets XYZ, Mol2, SMILES, VMD and GenBank support"
date:   2005-10-29
modified_date: 2023-07-30
blogger-link: https://chem-bla-ics.blogspot.com/2005/10/kfilechemical-gets-xyz-mol2-smiles-vmd.html
tags: kde chemistry web
doi: 10.59350/frske-p0649
---

Jerome Pansanel contributed new patches for [kfile_chemical](http://www.kde-apps.org/content/show.php?content=28995); on
Monday actually, but I have been busy with other things, among which a presentation I have to give next Monday for some 100+
analytical chemists. The patch adds support to [KDE](http://www.kde.org/) for five new chemical MIMEs: XYZ, Mol2, SMILES,
VMD and GenBank. Therefore, I just released a new version (0.10), and added an announcement to
[Freshmeat.net](http://freshmeat.net/projects/kfile_chemical/).

As a reminder, version 1.0 will have all chemical mime types supported, after which I will initiate a process to formalize
the meta data we want the kfile plugins to give, which will lead to the 2.0 release. So far, I had in mind that the next
step was to make the plugins ready for KDE 4.0, but I became aware of the [mime magic](http://developer.kde.org/documentation/library/kdeqt/kde3arch/mime.html)
as implemented in [KMimeMagic](http://developer.kde.org/documentation/library/3.1-api/classref/kio/KMimeMagic.html).

So, concluding, I might squeeze in another beta release 3.0, where this magic gets addressed; knowing that it will definately
not work for all files, but hopefully it will for files with stupid file extensions like .log.
