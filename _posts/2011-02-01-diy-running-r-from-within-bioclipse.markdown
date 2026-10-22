---
layout: post
title:  "DIY: Running R from within Bioclipse"
date:   2011-02-01 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2011/02/diy-running-r-from-within-bioclipse.html
doi: 10.59350/rqgjr-7b013
image: /blog/assets/images/bc26statsUpdateSite3.png
tags: bioclipse chemometrics
---

**Important: this blog post is about a development version of Bioclipse, not
about the stable 2.4 series. See also Gilleain's comment for this post.**

Arvid has done an excellent job in setting up [Hudson for Bioclipse](http://pele.farmbio.uu.se/hudson/),
which is not so trivial as for Maven projects. With the [R functionality](http://chem-bla-ics.blogspot.com/2011/02/running-r-from-within-bioclipse.html)
I blogged about earlier today moved to the [bioclipse.statistics repository](https://github.com/bioclipse/bioclipse.statistics),
things are automatically build when new patches hit the repository. And Hudson
doesn't just compile the code, it also exports binaries. The main [Bioclipse](http://www.bioclipse.net/)
products build can be downloaded [here](http://pele.farmbio.uu.se/hudson/job/Bioclipse.product/)
(Windows, Linux, OS/X; if you need more, please let use know). And, all the
additional features got automatically uploaded to individual update sites, very
much like Maven projects getting pushed to a Maven repository.

So, here's an Bioclipse-R install guide for the adventurous (i.e. Christian,
Rajarshi and Rebecca, perhaps Juuso :). I will describe it from a [Debian GNU/Linux](http://www.debian.org/)
perspective.

First, make sure you have [R](http://www.r-project.org/) and [rJava](http://cran.r-project.org/web/packages/rJava/index.html)
installed. I strongly recommend the versions from [sid/unstable](http://www.debian.org/releases/unstable/)
(2.12 and 0.8-8), which are more stable here than those from [testing](http://www.debian.org/releases/testing/):

```shell
apt-get install r-base-core/sid r-cran-rjava/sid
```

Then you download the nightly build of Bioclipse 2.5.x from Hudson, e.g. for
my 32bit Linux:

```shell
cd /tmp
wget http://pele.farmbio.uu.se/hudson/job/Bioclipse.product/lastSuccessfulBuild/artifact/tmp/bioclipse/net.bioclipse.platform_feature_2.4.0-eclipse.feature/Bioclipse.2.5.0.linux.gtk.x86.zip
unzip Bioclipse.2.5.0.linux.gtk.x86.zip
cd Bioclipse.2.5.0.linux.gtk.x86/</pre>
```
But before we boot Bioclipse, we first need to tell it where to find the R instance,
and we need to set two variables for that: *R_HOME* and *java.library.path*.
The latter is set via the *bioclipse.ini* file, by adding this line to the end:

```shell
-Djava.library.path=/usr/lib/R/site-library/rJava/jri
```

The other is an environment variable and can be set with:

```shell
export R_HOME=//usr/lib/R
```

Then Bioclipse can be started:

```shell
./bioclipse
```

The first thing to do is install the *R Feature*. To do this open the *Install
New Software...* dialog from the *Help* menu, and add (with the *Add* button)
the Bioclipse Statistics update site on Hudson at [this Location](http://pele.farmbio.uu.se/hudson/view/Release/job/Bioclipse.statistics/lastSuccessfulBuild/artifact/buckminster.output/net.bioclipse.statistics_site_1.0.0-eclipse.feature/site.p2/)
(copy/paste the Location URL into the below dialog):

![](/blog/assets/images/bc26statsUpdateSite3.png)

When back in the Available Software dialog, select the new update site, and
mark the *Bioclipse-R Integration* feature to be installed:

![](/blog/assets/images/bc26statsUpdateSite2.png)

After the install is completed, which will require a reboot of Bioclipse (why?!?!),
you can open the R console by opening a dialog from the Window -> Show View ->
Other... menu:

![](/blog/assets/images/bc26statsUpdateSite4.png)

The *R Console* will then show up as view, as depicted in my [earlier post](http://chem-bla-ics.blogspot.com/2011/02/running-r-from-within-bioclipse.html).

Loading of libraries, like running *library("[rcdk](http://cran.r-project.org/web/packages/rcdk/index.html)")*
or *library("[pls](http://cran.r-project.org/web/packages/pls/index.html)")*,
crashes the whole thing if you use R and rJava from Debian testing, and silently
fails with those from unstable. It's on my agenda.
