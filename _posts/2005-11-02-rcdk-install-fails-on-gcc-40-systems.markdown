---
layout: post
title:  "R/CDK install fails on GCC 4.0 systems"
date:   2005-11-02
blogger-link: https://chem-bla-ics.blogspot.com/2005/11/rcdk-install-fails-on-gcc-40-systems.html
tags: cdk rstats
doi: 10.59350/b1vyj-0kd63
---

Some time ago [Rajarshi Guha](http://blue.chem.psu.edu/~rajarshi/) introduced [R](http://www.r-project.org/) bindings for the
[CDK](http://cdk.sf.net/) (see his CDK News [articles](http://almost.cubic.uni-koeln.de/cdk/cdk_top/cdk_news/)), and
today I tried to install his rcdk package that makes it happen.

However, it requires [SJava](http://www.omegahat.org/RSJava/) which compiled fine on other machines, but not on my AMD64
machine. The problem seems to be related to the GNU GCC 4.0 compiler I have installed. Compiling with 3.4 works fine,
but 4.0 complains with:

```shell
CtoJava.cweb:215: error: static declaration of 'std_env' follows non-static declaration
CtoJava.cweb:195: error: previous declaration of 'std_env' was here
```

Googling, learned me that I am not the only one with this problem, but did not find any solution. If you know how to fix this problem, please leave a message in the comments.
