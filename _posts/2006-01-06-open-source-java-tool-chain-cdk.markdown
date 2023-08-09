---
layout: post
title:  "Open Source Java tool chain: CDK compiles and JUnit tests run"
date:   2006-01-06
blogger-link: https://chem-bla-ics.blogspot.com/2006/01/open-source-java-tool-chain-cdk.html
tags: cdk java
---

While waiting for a [Dragon](http://www.talete.mi.it/products/dragon_description.htm) calculation to finish (it does not work for molecules with more than
300 atoms!), I updated [CDK](http://cdk.sf.net/)'s build.xml to support [gjdoc](http://www.gnu.org/software/classpath/cp-tools/). The build script is now
able to compile the custom doclets we use for creating the `src/*.javafiles` and others from the Java source files. And using
[gij](http://gcc.gnu.org/onlinedocs/gcc-3.0.4/gcj_8.html) I could also run
[CDK's 1688 JUnit tests](http://cvs.sourceforge.net/viewcvs.py/cdk/cdk/src/org/openscience/cdk/test/)!

On my Debian GNU/Linux sid chroot, I have java-gcj-compat installed allowing me to do (thanx man-di!):

```
JAVA_HOME=/usr/lib/jvm/java-1.4.2-gcj-4.0-1.4.2.0 ant -Dbuild.compiler=gcj runDoclet
JAVA_HOME=/usr/lib/jvm/java-1.4.2-gcj-4.0-1.4.2.0 ant -Dbuild.compiler=gcj test-all
```

The first command creates the custom doclets, while the second command compiles the CDK and runs the JUnit tests. For Classpath developers:
[here](http://sourceforge.net/cvs/?group_id=20024)'s how to check out the cdk module from CVS.

The results are interesting: while Sun's JVM gives 11 problems, gij gives 399 problems. The test-all target creates a `reports/result.txt`
document listing all failing tests, and I've put the [diff -u](http://www.woc.science.ru.nl/devel/egonw/diff_cdk_junit_sun_vs_gij_debianSid_20060106.txt)
for the two JVMs online. I will make diffs for jamvm, kaffe and cacao too.

I hope this gives the free Java community extra feedback on the excellent work they are doing.
