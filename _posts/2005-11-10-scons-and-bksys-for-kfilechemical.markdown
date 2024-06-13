---
layout: post
title:  "Scons and bksys for kfile_chemical"
date:   2005-11-10
blogger-link: https://chem-bla-ics.blogspot.com/2005/11/scons-and-bksys-for-kfilechemical.html
tags: kde chemistry
doi: 10.59350/6n4we-wam18
---

Not so long ago, it was [decided](http://conference2005.kde.org/slides/software-construction-tools-talk--thomas-nagy.pdf) that KDE 4.0
will use [SCons](http://www.scons.org/) as a configuration and building tool, instead of the autotools and make: the common
`./configure && make && make install` which has served the open source community very well for so long.

SCons is [different](http://dot.kde.org/1126452494/) in several ways. One of these is that the tar.gz packages it produces are some
500kB smaller, which makes a huge difference for [kfile_chemical](http://kde-apps.org/content/show.php?content=28995) which is
now 121kB instead of 635kB.

Now, the [KDE](http://www.kde.org/) community, or Thomas Nagy to be precise, developed a helper for KDE software, called
[bksys](http://www.kde-apps.org/content/show.php?content=19243). Version 1.5.1, however, did not contain an example directory for kfile
plugins, but I managed to work something out starting from the configuring scripts from [kdissert](http://kde-apps.org/content/show.php?content=12725),
and ended up with these [SConstruct](http://websvn.kde.org/trunk/playground/utils/kfile_chemical/SConstruct?rev=479410&view=log) and
[config.bks](http://websvn.kde.org/trunk/playground/utils/kfile_chemical/config.bks?rev=479414&view=log).

Now, I haven't figured out how to include the translations, but will figure that out sooner or later... for now, I'm quite happy with the new build system.
