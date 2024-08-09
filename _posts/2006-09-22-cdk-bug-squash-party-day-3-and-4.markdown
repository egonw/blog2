---
layout: post
title:  "CDK Bug Squash Party - Day 3 and 4"
date:   2006-09-22
blogger-link: https://chem-bla-ics.blogspot.com/2006/09/cdk-bug-squash-party-day-3-and-4.html
tags: cdk bsp java pdb
image: /blog/assets/images/flyerScreeny.png
---

Because I was struggling hard with [default values for cdk.interfaces fields](http://sourceforge.net/mailarchive/forum.php?thread_id=30594266&forum_id=2178),
I did not have time to write up the [Bug Squash Party](http://wiki.cubic.uni-koeln.de/cdkwiki/doku.php?id=bsp200609) report for day 3 (see also
[day 1](http://chem-bla-ics.blogspot.com/2006/09/cdk-bug-squash-party-day-1.html) and [day 2](http://chem-bla-ics.blogspot.com/2006/09/cdk-bug-squash-party-day-2.html)).
But here it is.

# Day 3

Kai worked hard on getting the `cdk.interfaces` API cleaned up, as [agreed upon earlier](http://wiki.cubic.uni-koeln.de/cdkwiki/doku.php?id=refactoringkernelclasses).
Christian added a test for the [RMSD calculator](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/api/org/openscience/cdk/geometry/GeometryTools.html)
(see `getAllAtomRMSD()`), and cleaned up his code a bit. Stefan continued his bug-squashing on JChemPaint and fixed another one or two bugs.

Rajarshi uploaded a patch to set undefined atomic properties, like partial and formal charges and the implicit hydrogen count, to `UNSET` by default.
However, this broke the CDK at many places, as apparently many class methods assume the default to be zero. After discussing the issue at the CUBIC,
it turned out that this was sort of the intended, though undocumented, behavior: use the [default Java values](http://java.sun.com/docs/books/tutorial/java/nutsandbolts/datatypes.html).

And I added missing `clone()` methods, closing one bug on SourceForge, added files for Eclipse to know how to build the CDK with Ant (thanx
to Nico for similar files for [Jmol](http://www.jmol.org/)), and got CDK compiled again against [Classpath](http://www.classpath.org/).

# Day 4

Miguel uploaded his first patched for support saving [PDBPolymer](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/api/org/openscience/cdk/protein/data/PDBPolymer.html)
data structures into and restoring them again from CML, addressing an [almost two-year-old bug](https://sourceforge.net/tracker/index.php?func=detail&aid=1085912&group_id=20024&atid=120024).
He created new cdk.interfaces for them, to address module dependencies, but a large set of JUnit tests are [yet missing](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/test/result-data.html).

Kai continued his cdk.interfaces refactoring, working on the more involved changes. Stefan, Tobias, and me worked on a poster and three three-fold
flyers for our CDK booth at [CompLife2006](http://www.inf.uni-konstanz.de/complife06/), so have not been very productive in bug squashing.
But we are happy with the result. Below is a screenshot on one side of the main CDK folder:

![](/blog/assets/images/flyerScreeny.png)

With [77 failing JUnit test](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/junitsummary.html), and still a too large number of
[open bugs on SourceForge](http://sourceforge.net/tracker/?atid=120024&group_id=20024&func=browse), there is plenty of things to do today.
