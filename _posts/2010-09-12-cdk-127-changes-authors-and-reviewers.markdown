---
layout: post
title:  "CDK 1.2.7: the changes, the authors, and the reviewers"
date:   2010-09-12
blogger-link: https://chem-bla-ics.blogspot.com/2010/09/cdk-127-changes-authors-and-reviewers.html
doi: 10.59350/336mq-1xy13
tags: cdk cheminf java
---

[CDK](http://cdk.sf.net) 1.2.7 is the latest of bug fix releases in the 1.2
series. It brings a number of JavaDoc fixes, but, importantly, also bug fixes
in SMILES handling and atom type perception. I am really pleased to see the
application domain of various algorithms in the CDK continously grow: SMILES
parsing for some transition metals has been fixed, and the SMILES generation
for some types of ring closures too. Additionally, an important bug was fixed
in the atom type perception algorithm, which failed for custom atom types with
formal charges. Everyone using the CDK 1.2 series is advised to upgrade to this
version.

**The changes**

* Compare values not objects (fixes #3061263) [324f7f5](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=324f7f5)
* Unit test to reproduce failing atom type perception with one of the options
  to create a -1 Integer object [9c1b95a](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=9c1b95a)
* Removed output to STDOUT [223fc9a](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=223fc9a)
* Fix for branching bracket issue when generating SMILES for BrC1C(Br)C(Br)C(Br)C(Br)C1Br
  [b9b2272](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=b9b2272)
* Unit test for bug #3040273. [6d9b3d2](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=6d9b3d2)
* Fixed hybridization information: these are sp3 hybridized systems [a01de91](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=a01de91)
* More missing elements for SMILES parsing problems reported in bug #3048501
  [31f7462](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=31f7462)
* Unit tests for SMILES parsing bugs reported in #3048501 [bf8defd](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=bf8defd)
* A few more missing elements in the SMILES two-character element symbol parsing
  [5cf9334](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=5cf9334)
* Added missing elements, fixing several problems reported in bug #3048501 [6ab74bc](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=6ab74bc)
* Upper case the first character to also properly recognize lower cased 'aromatic'
  two-character element symbols (fixes SMILES parsign of things like c1[se]ccccc1
  [3ec1480](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=3ec1480)
* JavaDoc fixes: correct @cdk.cite use, and small typo [394f9ed](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=394f9ed)
* Updated the JavaDoc for an API changed a while ago: the getInChIToStructure()
  method now takes an IChemObjectBuilder as second argument (fixes #3035890)
  [be56aac](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=be56aac)
* Updated the JavaDoc for the atoms() Iterable API change (fixes #3034824) [38873dc](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=38873dc)

**The authors**
The below numbers are based on the number of commits, but keep in mind that
some developers, like myself, need more commits for the same number of changed
lines.

<pre>13  Egon Willighagen
 2  Saravanaraj
</pre>

**The reviewers**
The below list is based on who signed off the patches. Anyone who reviews patches
in the patch tracker can basically do this. Ask on cdk-devel on how to do this.

<pre> 8  Rajarshi Guha
 4  Gilleain Torrance
 2  Egon Willighagen
</pre>
