---
layout: post
title:  "CDK and the Java 6 beta"
date:   2006-08-01
blogger-link: https://chem-bla-ics.blogspot.com/2006/08/cdk-and-java-6-beta.html
tags: cdk java debian
---

Recently, a second beta of Java 6 was [released](http://java.sun.com/javase/downloads/ea.jsp), which triggered a
[patch](http://lists.alioth.debian.org/pipermail/pkg-java-maintainers/2006-June/008385.html) for the
[Debian](http://www.debian.org/) [java-package](http://packages.debian.org/java-package) package. It was a Bioclipse
[bug report](http://sourceforge.net/tracker/index.php?func=detail&aid=1532612&group_id=150681&atid=778609) today,
however, which made me patch my java-package setup and install the beta.

So, next thing was to try to get the [CDK](http://cdk.sf.net/) compile with the Java 6 beta. Because our build system uses
JavaDoc (anyone with a pointer with a easy to use Java parser, which parses JavaDoc too?), and because this setup is
different for literally every platform and Java version, the [build.xml](http://svn.sourceforge.net/viewvc/cdk/trunk/cdk/build.xml?view=log)
needed some tweaking (patch 6719 and 6721). Additionally, a number of source files were marked as needing Java 1.5, while they actually
depend on features introduced in Java 5 (aka 1.5) and which are present in Java 6 (aka 1.6) too, so that needed some tweaking
too (patch 6720).

I have no idea what Java 6 will change and/or introduce, but I did note some comments on it being faster, which is always a good thing.
The [JUnit](http://www.junit.org/) test timings seems to agree with this. While my Java 1.5.0_06 installation needed 204 seconds
(no duplicates), Java 1.6.0_beta2 needed only 168 seconds (no duplicates), and improvement of 18%.
