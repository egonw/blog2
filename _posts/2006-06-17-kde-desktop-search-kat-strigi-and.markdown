---
layout: post
title:  "KDE desktop search: Kat, Strigi and Tenor"
date:   2006-06-17
blogger-link: https://chem-bla-ics.blogspot.com/2006/06/kde-desktop-search-kat-strigi-and.html
tags: kde strigi kalzium linux
---

Desktop searching has become a hot topic (some [earlier](http://chem-bla-ics.blogspot.com/2006/05/molecular-indexing-on-kde-and-osx.html)
[blogs](http://chem-bla-ics.blogspot.com/2005/11/ubuntu-dapper-will-include-chemistry.html)), now that years of data accumulated on ones
hard disk: PDFs, OpenOffice.org documents, Latex manuscripts, old Java source code, digitized music, and a lot of chemical files. Well,
on my hard disk that is. Unlike piles of paper, a computer could search this data, but due to the size an index is required. What's KDE4
going to offer?

For the [KDE](http://www.kde.org/) desktop [Kat](http://kat.mandriva.com/) has for more than a year offered this, and latter
[Kerry](http://www.kde-apps.org/content/show.php?content=36832) came along as frontend to [Beagle(http://beaglewiki.org/Main_Page)],
though this does not have the nice integration with KDE [kfile plugins](http://developer.kde.org/documentation/tutorials/kfile-plugin/t1.html).
Since then, Kat developed has come to a stop (unfortunately), and attempts to reach the main author
([Roberto](mailto:roberto.cappuccio@gmail.com)) have been unsuccesfull. Last thing happening was a rewrite of the database backend.

Additionally, [Scott Wheeler proposed Tenor](http://dot.kde.org/1109163846/) on [FOSDEM](http://www.fosdem.org/) 2005:
*"KDE 4: Beyond Hierarchical Data, The Desktop as a Searchable Web of Context"*. A semantic desktop; potentially cool, but I have heard
[little from it lately](http://www.kdedevelopers.org/blog/72?from=10), except for some rumours that
[Scott has some actual code at home](http://mail.kde.org/pipermail/klink/2006-April/000133.html).

Now, [Strigi](http://www.vandenoever.info/software/strigi/) ([download](http://www.kde-look.org/content/show.php?content=40889)) has come along,
with a fast indexing engine, just the thing where the Kat developed seemed to have stopped. The design is different from that of Kat, but it
does not seem unlikely that Kat code can be ported. No support for PDF or OpenOffice.org documents yet, but that's really the easy part, and
kfile is on its way.

Getting back to Tenor, one might wonder how Strigi could implement Tenor concepts. A simple approach is at least to allow users to tag files,
just like we have become used to with blogs (e.g. [Technorati.com](http://www.technorati.com/)) and websites (e.g.
[Connotea](http://www.connotea.org/)). This could be easily implemented using [extended attributes](http://wiki.linuxquestions.org/wiki/Extended_attributes)
(xattr), [already used by Beagle](http://chem-bla-ics.blogspot.com/2006/05/molecular-indexing-on-kde-and-osx.html):

```
# file: home/egonw/1CRN.jpg
user.Tenor.Keywords="crambin"
user.Tenor.Comment="Used in my ontologies presentation."
```

Obviously, this example shows not just these tags, but a user comment too. The idea, here, is that Strigi mines these attributes in
addition to the file itself, so that search on tags can be done too. BTW, my argument to use this, instead of putting these things
in the Strigi database itself, is persistence: data and metadata are kept together. KDE's file properties dialog would be extended
with an extra tab that allows editing these fields.

Strigi itself can be embedded in KDE applications to search specific information (e.g. search molecular data within
[Kalzium](http://cniehaus.livejournal.com/23010.html) using the [InChI](http://www.iupac.org/inchi/)), and even in the FileOpen dialog.
We need patches for KDE4 that allows this, soon.
