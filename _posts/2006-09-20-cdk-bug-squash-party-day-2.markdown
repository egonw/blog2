---
layout: post
title:  "CDK Bug Squash Party - Day 2"
date:   2006-09-20
blogger-link: https://chem-bla-ics.blogspot.com/2006/09/cdk-bug-squash-party-day-2.html
tags: cdk bsp
---

Like [yesterday](http://chem-bla-ics.blogspot.com/2006/09/cdk-bug-squash-party-day-1.html) I will give short overview of things done at the
[Chemistry Development Kit](http://cdk.sf.net/) [Bug Squash Party](http://wiki.cubic.uni-koeln.de/cdkwiki/doku.php?id=bsp200609) (BSP).
I think Stefan was the only to fix and close a bug report yesterday. Rajarshi added the
[MDE descriptor](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/api/org/openscience/cdk/qsar/descriptors/molecular/MDEDescriptor.html)
(yes, during a BSP new code might be commited too ;)

More interestingly, discussion on the [developers mailing list](http://sourceforge.net/mailarchive/forum.php?forum_id=2178) on the
patch by Todd Martin of the [EPA](http://www.epa.gov/) to address deducing bond orders in
SMILES parsing (the major source of current open bugs!). A problem seems to be when his tool should be called in the SmilesParser class.

More details on the proceedings can be found on the [BSP wiki page](http://wiki.cubic.uni-koeln.de/cdkwiki/doku.php?id=bsp200609).
