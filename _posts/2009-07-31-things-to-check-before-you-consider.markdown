---
layout: post
title:  "Things to check before you consider submitting a (final) CDK patch #1"
date:   2009-07-31 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2009/07/things-to-check-before-you-consider.html
doi: 10.59350/h3v19-vh903
tags: cdk rse
modified_date: 2026-09-27
---

Mark the *final* in the above title; if you merely seek advice on your patch, feel free to send them in whatever state. However, if you bring up your patch for peer review, make sure to have gone through the following steps, in random order:

* be prepared for peer review feedback
* realize your code will have to be [LGPL](http://www.gnu.org/copyleft/lesser.html) or LGPL-compatible
* make sure the copyright lines are properly updated (see [Making patches; Attribution; Copyright and License. <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/06/30/making-patches-attribution-copyright.html))
* your code is fully unit tested
* your code does not cause [PMD](http://pmd.sourceforge.net/) failures
* your code is fully JavaDoc-umented
  * no empty templates
  * JavaDoc for every class field, method and class
  * use of {@link}
  * use of CDK tags @cdk.bug, @cdk.cite, etc
  * period at the end of the first sentence
  * ...
* make sure all the code still compiles
* make your code readable
  * 80 characters per line
  * variable names that reflect their purpose and nature
  * no code complexity errors with PMD
  * camelCasing as custom in Java
  * comment your code where appropriate, explaining what your code is supposed to do
  * ...

These are reasons to reject your patch, so better make sure to not have to be reminded of that. The build environment comes with some code to make these
checks easier (though not the fixing). For example, say I introduced a new module `uff` (for the UFF force field):

```shell
$ cd cdk/
$ ant clean dist-all test-dist-all
$ ant -Dmodule=uff test-module
$ ant -f javadoc.xml -Dmodule=uff doccheck-module
$ ant -f pmd.xml -Dpmd.test=custom -Dmodule=uff test-module
$ ant -f pmd.xml -Dpmd.test=custom -Dmodule=test-uff test-module
```
