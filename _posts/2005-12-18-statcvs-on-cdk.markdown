---
layout: post
title:  "StatCVS on CDK"
date:   2005-12-18
blogger-link: https://chem-bla-ics.blogspot.com/2005/12/statcvs-on-cdk.html
tags: cdk
doi: 10.59350/q7ehm-v1m81
---

One of the [Classpath](http://www.classpath.org/) developers pointed me to their
[CVS statistics](http://object-refinery.com/classpath/statcvs/) when I asked them
how actively their project is currently developed, i.e. the number of active developers.

The pages are generated with [StatCVS](http://statcvs.sourceforge.net/), and I ran it one the CDK too.

I knew I did a lot of work on the CDK, but never realized that [62.7%](http://www.woc.science.ru.nl/devel/egonw/log.html/authors.html)
of the commits were mine! Keep in mind, though, that a lot of these commits are for code maintainance! Next in line are
[steinbeck](http://almost.cubic.uni-koeln.de/jrg/Members/steinbeck) and [rajarshi](http://blue.chem.psu.edu/~rajarshi/).
In total 28 people commited patches to CVS, though other people contributed patches too, which were commited by a developer with write
access. There is jump in the commit messages somewhere this summer, which I think is the move of the data directory from cdk/data to
cdk/src/data.

The full analysis results can be found [here](http://www.woc.science.ru.nl/devel/egonw/log.html/). It was generated with the
[StatCVS version in sid](http://packages.debian.org/unstable/devel/statcvs), and will rerun it soon with a more recent StatCVS version.
