---
layout: post
title:  "Math libraries for Java?"
date:   2005-12-13
blogger-link: https://chem-bla-ics.blogspot.com/2005/12/math-libraries-for-java.html
tags: math java
doi: 10.59350/er890-p9m81
---

I drop in on the `#classpath` channel of [freenode.net](http://www.freenode.net/) IRC network, where the `#cdk` channel runs too.
The `#classpath` channel is for the [Classpath](http://www.gnu.org/software/classpath/) project which is developing the free Java libraries used by most
open source virtual machines.

A [Slashdot.org](http://slashdot.org/) item was mentioned ["Java Is So 90s"](http://developers.slashdot.org/developers/05/12/13/1824236.shtml?tid=108&tid=156).
It lead to a funny discussion about what that would make C/C++ and Fortran. A more serious question was brought up: where are the efficient and super fast
Java linear algebra and complex number libraries?

There is [Weka](http://www.cs.waikato.ac.nz/ml/weka/) but it is more aimed at data analysis. I believe it has support principle component analysis, so it
must have singular value decomposition. There is a book called **Java Number Cruncher: The Java Programmer's Guide to Numerical Computing**
by Ronald Mak, 2003, Prentice Hall.

After some further asking about it on the channel, they mentioned the [Apache commons math](http://jakarta.apache.org/commons/math/) project,
which seems promising. The website mentions complex numbers, linear algebra, statistics and numerical analysis, but have not looked at the full API,
so not sure how well populated these areas are.

Anyone, with experience in the area of numerical computing and Java?
