---
layout: post
title:  "Code coverage: making sure your code is tested"
date:   2006-11-28
blogger-link: https://chem-bla-ics.blogspot.com/2006/11/code-coverage-making-sure-your-code-is.html
tags: opensource cdk
image: /blog/assets/images/emmaCoverage1.png
---

Recently I [discussed JUnit testing from within Eclipse](http://chem-bla-ics.blogspot.com/2006/10/running-single-junit-tests-in-eclipse.html),
and blogged at [several occasions](http://search.blogger.com/?as_q=JUnit&ie=UTF-8&x=0&y=0&q=JUnit+blogurl:chem-bla-ics.blogspot.com&ui=blg&start=0)
about it in other situations. I cannot stress enough how useful unit testing is: it adds this extra set of
[eyeballs to make bugs shallow](http://en.wikipedia.org/wiki/Given_enough_eyeballs,_all_bugs_are_shallow).
And it does that, indeed.

Ensuring that you actually test all the code you write, however, is not easy. A couple of years back I read an article about
[Hansel](http://hansel.sf.net/), which does code coverage checking, but never got it nicely working for the
[CDK project](http://cdk.sf.net/). Never looked at that lately, so no idea how the current release would work out.
Hansel is an extension of [JUnit](http://www.junit.org/), and requires hard coding class names, which conflicts with
CDK's module setup.

Thomas Kuhn pointed me last week to [Emma](http://emma.sf.net/), which seems a nice tool. It does not require hacking
our source, and generates cool HTML:

![](/blog/assets/images/emmaCoverage.png)

And even highlights the source code:

![](/blog/assets/images/emmaCoverage1.png)

BTW, I seem to be in good company: [Classpath](http://www.gnu.org/software/classpath/) is
[using it too](http://builder.classpath.org/~cpdev/coverage/).

Below is the command I issued to generate the HTML output. Rajarshi, maybe this can be integrated into
[Nightly](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/)? Note that it only runs the tests
for the data module:

```shell
ant dist-large dist-test-large
java -cp ~/tmp/emma-2.0.5312/lib/emma.jar emmarun \
  -cp develjar/junit.jar:dist/jar/cdk-svn-20061128.jar:dist/jar/cdk-test-svn-20061128.jar \
  -r html -sp src junit.textui.TestRunner org.openscience.cdk.test.MdataTest
```
