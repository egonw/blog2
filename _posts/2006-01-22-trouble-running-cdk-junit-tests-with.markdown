---
layout: post
title:  "Trouble running the CDK JUnit tests with Cacao and Kaffe"
date:   2006-01-22
blogger-link: https://chem-bla-ics.blogspot.com/2006/01/trouble-running-cdk-junit-tests-with.html
tags: cdk java
---

Because I am still looking forward to testing CDK against the latest [Classpath 0.20](http://gnu.wildebeest.org/diary/index.php?p=147),
I downloaded cacao 0.94-1 for Debian sid, then tried to compile CDK with it:

```shell
JAVA_HOME=/usr/lib/jvm/cacao ant -Dbuild.compiler=gcj clean test-all
```

But that hangs at some point with zero load. I have no idea what is going on there. I've spoken with twisti on the
#classpath IRC channel, and he helped me run the compile with gdb, which indicated that at some point all threads were waiting.

I also tried it with kaffe 1.1.6.91-2 in sid, but now with a XML parser in the CLASSPATH, as Dalibor in
[a previous blog item suggested](http://chem-bla-ics.blogspot.com/2006/01/open-source-java-tool-chain-cdk.html):

```shell
export CLASSPATH=/usr/share/java/xercesImpl.jar:xmlParserAPIs.jar
JAVA_HOME=/usr/lib/kaffe ant -Dbuild.compiler=gcj clean test-all
```

But that failed too with:

```shell
test:
    [junit] Running org.openscience.cdk.test.CDKTests
    [junit] kaffe-bin: /home/mkoch/debian/kaffe/kaffe-1.1.6.91/build-tree/kaffe-1.1.6.91/kaffe/kaffevm/jit3/machine.c:276: translate: Assertion `reinvoke == false' failed.
    [junit] Test org.openscience.cdk.test.CDKTests FAILED
```

It did work previously :(

OK, to reproduce this yourself, you need to check out CDK from CVS (hoping that anonymous CVS is reasonable in sync, and online) with:

```shell
cvs -d:pserver:anonymous@cvs.sourceforge.net:/cvsroot/cdk login
cvs -z3 -d:pserver:anonymous@cvs.sourceforge.net:/cvsroot/cdk co -P cdk
```
