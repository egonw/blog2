---
layout: post
title:  "CDK Bug Squash Party - Day 5"
date:   2006-09-24
blogger-link: https://chem-bla-ics.blogspot.com/2006/09/cdk-bug-squash-party-day-5.html
tags: cdk bsp junit
image: /blog/assets/images/junit_tests.png
---

Day 5 was formally the last day (see also the summaries of [day 1](http://chem-bla-ics.blogspot.com/2006/09/cdk-bug-squash-party-day-1.html),
[day 2](http://chem-bla-ics.blogspot.com/2006/09/cdk-bug-squash-party-day-2.html) and
[day 3/4](http://chem-bla-ics.blogspot.com/2006/09/cdk-bug-squash-party-day-3-and-4.html)) of the
[Chemistry Development Kit](http://cdk.sf.net/) [Bug Squash Party](http://wiki.cubic.uni-koeln.de/cdkwiki/doku.php?id=bsp200609) (BSP).
Miguel uploaded the last bits of his CDK [PDBPolymer](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/api/org/openscience/cdk/protein/data/PDBPolymer.html)
to CML to CDK PDBPolymer roundtripping functionality (closing a bug and a feature request in one go). Have not tested this first hand yet,
but looking forward to playing with this bit of code. Kai continued to work on the more difficult bits of the
[code refactoring](http://wiki.cubic.uni-koeln.de/cdkwiki/doku.php?id=refactoringkernelclasses), resulting in fewer though more
comprehensive commits. Stefan fixed another bug in JChemPaint; the rendering of implicit hydrogens.

About the last, the [Renderer2D](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/api/org/openscience/cdk/renderer/Renderer2D.html)
needs a serious overhaul. That is, a complete rewrite in proper Java2D, which can use affine transformations for zooming, scaling and fixing the
coordinate system. The current code is ancient and predates Java2D. [Rich' code](http://depth-first.com/articles/2006/08/28/drawing-2-d-structures-with-structure-cdk)
might be a good starting point. I would love to do this rewrite, but lack the resources... anyone in need of some open source fame?

I worked on atom typing, which is yet largely untested, and often integrated with other bits of code. Yesterday I uploaded
[some first patches](http://svn.sourceforge.net/viewvc/cdk/trunk/cdk/src/org/openscience/cdk/atomtype/) which I wrote on the train ride
back to the Netherlands.

Now, what can be concluded from this BSP? The participant count was below what I had hoped for, but those who did worked hard (and
with pleasure I hope :) The total number of JUnit test has increased:

![](/blog/assets/images/junit_tests.png)

And so has the number of failing tests:

![](/blog/assets/images/fails_tests.png)

These plots were made with [R](http://www.r-project.org/) from data created with two custom scripts both found in
[cdk/tools](http://svn.sourceforge.net/viewvc/cdk/trunk/cdk/tools/): makeBugCountPlot.pl and extractBugCountPlotData.bsh.
Note that [96.86% of the tests do not fail](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/junitsummary.html)!

The bump in failing tests seems to be due to [commit 7010-7011](http://svn.sourceforge.net/viewvc/cdk/trunk/cdk/src/org/openscience/cdk/smiles/SmilesParser.java?r1=7009&r2=7011),
which has to do with SMILES parsing. Yes, the bond order resolving is still not solved. I don't seem to get Todd's patch for this working,
but not giving up either. The bump is so large, because quite some JUnit tests use the SmilesParser as a quick tool to get a configured
connection table. However, these tests should be replaced by explicit CDK models, which is easy done with the
[CDKSourceCodeWriter](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/api/org/openscience/cdk/io/CDKSourceCodeWriter.html).
I'll blog about how to use that soon.
