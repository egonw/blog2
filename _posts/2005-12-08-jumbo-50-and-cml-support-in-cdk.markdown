---
layout: post
title:  "Jumbo 5.0 and CML support in CDK"
date:   2005-12-08
blogger-link: https://chem-bla-ics.blogspot.com/2005/12/jumbo-50-and-cml-support-in-cdk.html
tags: cdk blue-obelisk cml
doi: 10.59350/dzvnw-3b413
---

Tobias [commited](http://cvs.sourceforge.net/viewcvs.py/cdk/cdk/jar/jumbo50.jar?rev=1.1&view=log)
[Jumbo 5.0](http://sourceforge.net/forum/forum.php?forum_id=518283) to CDK CVS, so that the CDK is now
again up to date with the latest [CML](http://www.xml-cml.org/) library. Note that Jumbo 5.0 requires Java 5.0.

At first all JUnit tests seems to work, but apparently the [CML2Writer](http://cvs.sourceforge.net/viewcvs.py/cdk/cdk/src/org/openscience/cdk/test/io/cml/CML2WriterTest.java?rev=1.13&view=log)
tests were skipped because they were only run when Java 1.4 was found. I updated the test for the a appropriate
Java version, and then it turned out that most tests fail. So those running CDK from CVS and depent on CML
writing: hang on, it will be fixed very soon.
