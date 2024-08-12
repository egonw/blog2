---
layout: post
title:  "Being a good opensource user"
date:   2006-10-25
blogger-link: https://chem-bla-ics.blogspot.com/2006/10/being-good-opensource-user.html
tags: openscience
---

There are many ways to contribute to opensource software (OSS), programming only being one of them. I develop OSS, but use OSS too.
For example, I am a big user of the [Linux](http://www.kernel.org/) kernel, the [KDE desktop](http://www.kde.org/), [Kubuntu](http://www.kubuntu.org/),
[Debian](http://www.debian.org/) (I have unstable in a [chroot](http://www.ubuntuforums.org/showthread.php?t=24575)),
[Firefox](http://www.getfirefox.com/), [Eclipse](http://www.eclipse.org/), [Classpath](http://www.gnu.org/software/classpath/), and many,
many others. What these have in common, is that I generally have no time to look into the source code of these projects. A small patch excluded,
I am really a regular user of these projects.

However, I try not to [leech](http://en.wikipedia.org/wiki/Leech_(computing)) (see also [Peter's related comment on that](http://wwmm.ch.cam.ac.uk/blogs/murrayrust/?p=78)):
I care about these projects and, therefore, I file bug reports. Sometimes, I even join the developers and talk to them via commonly used IRC and
mailing lists. Even, every now and then I get this itch and then I do look up source code and contribute a patch. But filing bug reports is the
least one can do, the least everyone should do.

# Classpath

[Classpath](http://www.gnu.org/software/classpath/) is the GNU project to provide a free Java library, i.e. the set of `java.*` classes
that come with the Sun JVM. It is not a virtual machine, though, for which several opensource implementations are available, many of
which use Classpath as library provider. They have a very nice chat channel at irc.freenode.net, called `#classpath`.
There wiki provides a [platform for given feedback](http://developer.classpath.org/mediation/FreeSwingTestApps) on how well software
runs. A bug track system (BTS) is [available too](http://www.gnu.org/software/classpath/bugs.html). An overview of the bugs that I filed,
can be found at [my del.icio.us account](http://del.icio.us/egonw): [bugreports+Classpath](http://del.icio.us/egonw/bugreports%2BClasspath).

Needless to say, Classpath is important in making our Java based chemoinformatics truely opensource.

# Debian/Kubuntu

Things are different for [Debian](http://www.debian.org/) and [Kubuntu](http://www.kubuntu.org/): these are distributions and, except for
some patching, are generally not involved software development as done by upstream. However, they generally do appreciate to know about
bugs too, so there is some duplication of bug reports here.

That said, they do provide nice tools for bug reporting which works for all packages that they distribute. Debian has
[reportbug](http://packages.debian.org/reportbug) and Kubuntu has [Launchpad](http://launchpad.net/). An over view of bugs I reported with
Debian can be found at del.icio.us [bugreports+debian](http://del.icio.us/egonw/bugreports%2Bdebian). I do not have bug reports in Launchpad
yet, but two can be found in mailing list archives, see del.icio.us [bugreports+ubuntu](http://del.icio.us/egonw/bugreports%2Bubuntu).

# KDE

I also tracked back two bugs I reported with KDE, see del.icio.us [bugreports+KDE](http://del.icio.us/egonw/bugreports%2BKDE).

# SourceForge

Surely, I filed many more bugs to many other projects. A long list of bug reports can be found on SourceForge. However, it seems not
possible to make an easy list of that :(
