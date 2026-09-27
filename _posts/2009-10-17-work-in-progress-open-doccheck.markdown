---
layout: post
title:  "Work in Progress: an Open DocCheck replacement"
date:   2009-10-17
blogger-link: https://chem-bla-ics.blogspot.com/2009/10/work-in-progress-open-doccheck.html
doi: 10.59350/qfnkc-xtx89
tags: cdk javadoc java xml
image: /assets/images/ojdcheckXHTML.png
modified_date: 2026-09-27
---

While it is still very much in progress, I have already made more progress than I had hoped for. The [JavaDoc Doclet API](http://java.sun.com/j2se/1.5.0/docs/guide/javadoc/doclet/spec/index.html)
is actually not too difficult to use, though my use will very likely improve more later. The [CDK](http://cdk.sf.net/) has been using
[Sun's DocCheck](http://java.sun.com/j2se/javadoc/doccheck/) utility for testing the library's JavaDoc quality, but the reports never
really satisfied me. Moreover, the most recent version is ancient and because it is *closed source*, no one can continue on those efforts.
DocCheck is [MIA](http://en.wikipedia.org/wiki/Missing_In_Action).

Instead, [PMD](http://pmd.sf.net/) is given nice overviews of what it believes to be wrong with the CDK, and also provides a decent XML
format which allows extraction of information, which is used by, for example, [SuperNightly](http://pele.farmbio.uu.se/supernightly/) as
showed yesterday in [PMD 2.4.5 installed in the CDK 1.2.x branch <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/10/16/pmd-245-installed-in-cdk-12x-branch.html).

I have been pondering about it for a long time now, but writing a JavaDoc checking library is hardly core cheminformatics research;
at least, you would not get funding for it, despite everyone always complaining about good documentation. *Alas*.

Last week, I was reviewing some more code, and again saw the very common error of the missing period at the end of the first sentence
in JavaDoc. This one is sort of important for proper JavaDoc documentation generation, but the complexity of the current DocCheck
reporting, people are not familiar enough with it. Being tired of having to repeat myself, I decided to address the problen, but
creating better [Nightly error reporting for the CDK JavaDoc](http://pele.farmbio.uu.se/nightly/javadoc/data/).

So, I started [OpenJavaDocCheck](http://github.com/egonw/ojdcheck), or *ojdcheck*. As mentioned, I have made quite promising progress,
and the current version provides the ability to write custom tests (which I plan to use for validating content of
[CDK taglet](http://cdk.sourceforge.net/guides/devel/ch01.html) content), and create XML as well as XHTML which can be saved to any file.
To give you a glimps of where things are going, here's a screenshot of the current XHTML output:

![](/assets/images/ojdcheckXHTML.png)

The current list of tests is really small, and consists of a single test:

* test if each class and method has JavaDoc
