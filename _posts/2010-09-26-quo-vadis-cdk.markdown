---
layout: post
title:  "Quo vadis, CDK?"
date:   2010-09-26 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2010/09/quo-vadis-cdk.html
doi: 10.59350/vkwj2-rg523
tags: cdk cheminf opensource justdoi:10.1021/ja00051a040
---

Tomorrow it is [10 years ago that the CDK was founded](https://sourceforge.net/apps/mediawiki/cdk/index.php?title=10th_Anniversary).
The project has considerably grown and has a [high impact on science](http://chem-bla-ics.blogspot.com/2010/09/cdk-2003-paper-is-now-cited-99-times.html).
The CDK code base did not start 10 years ago, but was founded on the code bases
of CompChem, JChemPaint, and [Jmol](http://www.jmol.org), but has seen several
reincarnations since the start.

The CDK project by now is so large, it is hardly possible to keep up, and I
am very grateful to particularly [Chris](http://www.steinbeck-molecular.de/steinblog/)
and [Rajarshi](http://blog.rguha.net/) for actively keeping the project going,
to all those that submit patches and bug reports, and to all that use the CDK
in their software. This created a healthy development and user community, as
is visible from the blog aggregator [Planet CDK](http://pele.farmbio.uu.se/planetcdk/).

But, reflecting on the past, it is also clear where the project needs help.
The flow of [CDK News](http://cdknews.org) papers is effectively void, the documentation
needs serious updating, we still need way more unit testing, as well as more
in-depth validation of algorithm implementations. And we all know we are short
on code reviewers to control the flow of patches going into the library. There
is also still some functionality missing, like a simple force field (the Jmol
LGPL UFF code could be ported, doi:[10.1021/ja00051a040](http://dx.doi.org/10.1021/ja00051a040))
and support for popular file formats like Symyx V3000 molfiles and the [ChemDraw
CDX formats](http://depth-first.com/articles/2010/09/21/making-sense-of-the-chemdraw-cdx-file-format-with-cdxhexdumper).

I am really positive about the future of the CDK project and the current future
is mostly limited by the number of people working on maintenance, code quality,
and releases. For example, I would love more frequent releases, but making a
release takes about half a day. It is not merely creating the files to distribute,
but also to ensure that the branch is in a releasable state, that it has no
important outstanding bugs and at least does not have more unit test fails than
the past release (preferably fewer...), and writing a release message.

This maintenance also involves writing unit tests for reported bugs, and ensuring
that someone fixes the bug. This is a second important challenge to the project:
how to keep the original code authors involved, and make them feel responsible
for making bug fixes in the code they wrote. Cheminformatics is very much a
field of *write once, go off to another job, and forget about it*. This is why
I am so strong on having unit tests, proper JavaDoc, and clean code, so that
others can do this required code maintenance.

If we look at [the current numbers](https://sourceforge.net/tracker/?group_id=20024),
we see about 170 open bugs out of 1115 ever reported, and 24 open patch reports
out of 276 reported. Those are acceptable numbers, though they need to go further
down.

I really hope that 2011 will be the year that commercial CDK support is picking
up, providing value for users by providing dedicated support. Right now, to
get something fixed, you need to wait for someone to fix the problem; however,
none of the CDK developers actually is working solely on the CDK and many contributions
are done in spare time. That nicely shows the power of Open Source, but also
well illustrates the need of proper funding. That said, this is merely limited
by people actually willing to pay for such support, or even just to donate financial
support to the project. If you are interested in that, please contact me offline,
as we have the means in place to do this.

In short, I have no clue where the CDK will go, except that it will continue
to grow. This is another power of Open Source: the accumulated effort cannot
be lost. Seriously, back in 2004 I wrote a [What's 2004 going to bring?](http://www.steinbeck-molecular.de/cdknews/index.php/CDKNews/article/view/6),
and here's a lousy attempt for 2011:

* a new stable series, 2.4 or 3.0 (versioning has not been decided on yet)
* it will be faster and support parallel computing
* we will have a UFF implementation
* more extensive chirality support (EZ, ...)
* rendering and editor will be integrated
* we will use JExample for unit testing
* cheminformatics in the webbrowser (using the CDK)
* we will have books about the CDK
* more molecular descriptors

But we will also have to overcome these issues, for which we need your help:

* CDK News needs a new editorial board
* we need an second release managers (one for stable, one for the development
  branch)
* we need more code reviewers
* making patches is easier than ever
