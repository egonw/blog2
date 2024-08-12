---
layout: post
title:  "Running single JUnit tests in Eclipse"
date:   2006-10-26
blogger-link: https://chem-bla-ics.blogspot.com/2006/10/running-single-junit-tests-in-eclipse.html
tags: junit eclipse
---

Unit testing is important when developing source code. [JUnit](http://www.junit.org/) provides a library to facilitate this in Java,
and [Eclipse](http://www.eclipse.org/te) had the functionality to run JUnit tests. Even better, it allows you to run single JUnit
tests, even in debug mode:

![](http://www.woc.science.ru.nl/devel/egonw/JUnitTestInDebugMode.png)

Just open the java class in your Package Explorer, right click on the JUnit method you want to run, then pick `Run As` or `Debug As`,
and then `JUnit test`.
