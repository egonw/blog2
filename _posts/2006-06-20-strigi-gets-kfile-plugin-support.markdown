---
layout: post
title:  "Strigi gets kfile plugin support"
date:   2006-06-20
blogger-link: https://chem-bla-ics.blogspot.com/2006/06/strigi-gets-kfile-plugin-support.html
tags: strigi kde
---

With some help, I got the [kfile](http://developer.kde.org/documentation/tutorials/kfile-plugin/t1.html) stream analyzer
for [Strigi](http://www.vandenoever.info/software/strigi/) working. This means that Strigi will now index the meta data
fields defined by the [kfile-chemical](http://www.kde-apps.org/content/show.php?content=28995) plugins.

The problem why it was not working earlier, was that it segfaulted on every creation of KDE classes. That's something I
really hate about C/C++: the lack of stack traces, though [valgrind](http://valgrind.org/) was helpful. It turned out
that adding the below line fixed all. A [KInstance](http://developer.kde.org/documentation/library/3.0-api/classref/kdecore/KInstance.html)
is needed when using KDE technology outside a KDE program:

```
KInstance instance( "strigita_kfile" );
```

Combine this with the [xattr](http://wiki.linuxquestions.org/wiki/Extended_attributes) support added by Jos earlier today, I hope to
see an interesting new Strigi release soon! Now we only need to get [editing of keywords](http://chem-bla-ics.blogspot.com/2006/06/kde-desktop-search-kat-strigi-and.html)
into KDE4.
