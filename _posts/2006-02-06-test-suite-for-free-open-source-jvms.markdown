---
layout: post
title:  "An test suite for free, open source JVMs"
date:   2006-02-06
blogger-link: https://chem-bla-ics.blogspot.com/2006/02/test-suite-for-free-open-source-jvms.html
tags: linux java cdk jmol
---

This weekend I continued my work on getting the [CDK](http://cdk.sf.net/) and [Jmol](http://www.jmol.org/) run with free, open source JVMs.
Really, a lot works fine, as reported earlier in this blog: JChemPaint works and Jmol almost works (see the
[Classpath's FreeSwingTestApps wiki page](http://developer.classpath.org/mediation/FreeSwingTestApps)), and well over 95% of the CDK JUnit
tests run without trouble too. So it comes down to identifying what does not run properly, and file bugs for this. For example,
[26101](http://gcc.gnu.org/bugzilla/show_bug.cgi?id=26101) and [26108](http://gcc.gnu.org/bugzilla/show_bug.cgi?id=26108).

To make this finding bugs in Classpath and the free virtual machines easier, I have setup a CDK based test suite: the CDK
[OpenSource JVM Test Suite](http://sourceforge.net/project/showfiles.php?group_id=20024). The idea is it can be used for regression testing,
and identification of bugs in the virtual machines. It can also be used to do timing benchmarks, and I will report on both of these soon.

But I first need to write some scripts to make nice XHTML pages. And, I have tweaked the CDK tests to skip known bugs, so that all reported
bugs are actually caused by the virtual machine and the Java library that it uses, and not by a bug in the CDK itself.
