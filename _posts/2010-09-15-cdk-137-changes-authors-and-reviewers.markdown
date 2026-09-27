---
layout: post
title:  "CDK 1.3.6: the changes, authors, and reviewers"
date:   2010-09-15
blogger-link: https://chem-bla-ics.blogspot.com/2010/09/cdk-137-changes-authors-and-reviewers.html
doi: 10.59350/0dk0s-f3c43
tags: cdk cheminf java
---

The list of changes is particularly long for this development release. Therefore,
I will list the authors and reviewers first. Note that this release also includes
the changes of the [1.2.6](http://chem-bla-ics.blogspot.com/2010/07/cdk-126-changes-and-authors.html)
and [CDK 1.2.7 release](http://chem-bla-ics.blogspot.com/2010/09/cdk-127-changes-authors-and-reviewers.html).

**The authors**  
I am mildly impressed by this release's list of authors... it is certainly not
the usual suspects anymore, and I would like to thank all contributors very
much. Interestingly, we also see the number of places where contributions increase,
and see patches from 7 different institutes (6 if you count the current ones)!

<pre>87  Egon Willighagen
42  Gilleain Torrance
17  Syed Asad Rahman
 9  Rajarshi Guha
 3  Jules Kerssemakers
 4  Mark Rijnbeek
 2  Andreas Truszkowski
 2  Saravanaraj
 1  Jonathan Alversson
</pre>

**The reviewers**  
The below list has also slight gained size, and I welcome [Gilliean](http://gilleain.blogspot.com/)
and [Syed](http://sites.google.com/site/chembioinfo/) as active reviewers.

<pre>56  Rajarshi  Guha 
18  Egon Willighagen 
12  Syed Asad Rahman 
 4  Gilleain Torrance
</pre>

**The changes**  
The changes include bug fixes (see also the [1.2.6](http://chem-bla-ics.blogspot.com/2010/07/cdk-126-changes-and-authors.html)
and [1.2.7 release notes](http://chem-bla-ics.blogspot.com/2010/09/cdk-127-changes-authors-and-reviewers.html)),
but also an updated SMSD engine, a rename of the *IAtomType* method *getHydrogenCount()*
into *getImplicitHydrogenCount()* and of *MDLWriter* into *MDLV2000Writer*,
and the addition of the [signature code by Gilleain](http://gilleain.blogspot.com/2009/06/faulons-signatures-possible.html),
and many, many small fixes.

* Compare values not objects (fixes #3061263) [1e4adac](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=1e4adac)
* Unit test to reproduce failing atom type perception with one of the options
  to create a -1 Integer object [87f8bfe](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=87f8bfe)
* Smiles parser setting to preserve aromaticity as provided in the Smiles String
  itself. [ae21ee2](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=ae21ee2)
* Added two further unit tests: one to see if the descriptor properly 'ignores'
  hydrogens; a second to reproduce the numbers in the original Wiener paper
  from 1947 [91c58dd](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=91c58dd)
* Renabled test which was (accidentally?) outcommented when switching to JUnit4
  in commit 06a1a3dd [ac82b12](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=ac82b12)
* Added a reference to the original Wiener paper [0c5187e](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=0c5187e)
* No need to declare throws for other Exception's if the superclass is already
  declared thrown itself (also, no need to define java.lang explicitly) [e73a291](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=e73a291)
* Minor cleanup: corrected copyright statement; simplified JavaDoc by removing
  empty parameter table [6292875](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=6292875)
* Replaced inline citation by reference to the main bibliography [8ddbb1b](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=8ddbb1b)
* Implementation of a descriptor to measure molecular complexity in terms of
  sp3 to sp2 ratio of carbon atoms [6a6db0b](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=6a6db0b)
* Updated javadocs and added extra unit test [ac211ce](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=ac211ce)
* Implementation of a descriptor to measure molecular complexity in terms of
  sp3 to sp2 ratio of carbon atoms [bd9fb4f](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=bd9fb4f)
* Removed output to STDOUT [18f7d52](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=18f7d52)
* Fix for branching bracket issue when generating SMILES for BrC1C(Br)C(Br)C(Br)C(Br)C1Br
  [526362e](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=526362e)
* Unit test for bug #3040273. [3bf8397](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=3bf8397)
* Fixed hybridization information: these are sp3 hybridized systems [e8cec0f](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=e8cec0f)
* More missing elements for SMILES parsing problems reported in bug #3048501
  [bcb8432](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=bcb8432)
* Unit tests for SMILES parsing bugs reported in #3048501 [bb5ffe1](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=bb5ffe1)
* Upper case the first character to also properly recognize lower cased 'aromatic'
  two-character element symbols (fixes SMILES parsign of things like c1[se]ccccc1
  [3f6056b](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=3f6056b)
* JavaDoc fixes: correct @cdk.cite use, and small typo [d097acf](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=d097acf)
* Updated the JavaDoc for an API changed a while ago: the getInChIToStructure()
  method now takes an IChemObjectBuilder as second argument (fixes #3035890)
  [3e1aba0](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=3e1aba0)
* Updated the JavaDoc for the atoms() Iterable API change (fixes #3034824) [2a5bb6b](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=2a5bb6b)
* Added the maven build file (closes #3042475) [6209a48](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=6209a48)
* a)removed blank/unused methods and fixed imports Signed-off-by: Syed Asad
  Rahman <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=911af3f">911af3f</a>
* a)IMatch to Match and constructor call for state used TargetProperties for
  faster processing Signed-off-by: Syed Asad Rahman <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=4a2f9c1">4a2f9c1</a>
* a)Assert cleaned and fixed b)Correct ASSERT imports used [a420b61](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=a420b61)
* Removed unused code [cb4048e](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=cb4048e)
* Updated checking of indices which now are -1 if unset, instead of null [cd8ccee](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=cd8ccee)
* a) Default constructor supported as per changes in the CDK b) VFMCS index
  error should point to -1 not null Signed-off-by: Syed Asad Rahman <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=9c6c830">9c6c830</a>
* a)Refactored matchers, atom matcher and bond matcher b)getTanimoto score fixed
  for single atoms [1dae4f2](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=1dae4f2)
* Updates for the getImplicitHydrogenCount() renaming [0f64e4d](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=0f64e4d)
* The smsd module now depends on the signature module [7d5fc9d](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=7d5fc9d)
* Latest SMSD code 1.2.0: Major changes are: [7217e82](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=7217e82)
* Use the factory to not depend on an implementation [e2c8329](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=e2c8329)
* Renamed get/setHydrogenCount() to get/setImplicitHydrogenCount(), per report #3020065
  [8ec9ad4](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=8ec9ad4)
* Introduced a helper class with info about the CDK library: the version number,
  which is read from the build.props which is now included in the cdk-core.jar
  [5a2bc65](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=5a2bc65)
* Also take into account super classes [0de5777](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=0de5777)
* Renamed MDLWriter into MDLV2000Writer (implements #3029447) [f0256d0](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=f0256d0)
* Assert pattern has the expected value as first argument [d4045cc](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=d4045cc)
* Use the builder pattern to instantiate an IIsotope [6760330](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=6760330)
* MDLV2000 reader interprets D and T without M ISO line mandatory [f6fd82b](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=f6fd82b)
* Use the PT class to see if something can be an element and removing the redundant
  element symbol info [937c4c7](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=937c4c7)
* Fixed annotation with TestMethod, not TestClass (fixes #3016632) [9eb04e5](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=9eb04e5)
* Skip inner classes for @cdk.module and @cdk.githash JavaDoc tests (fixes #3043084)
  [d070396](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=d070396)
* Throw a CDKException when a QUADRUPLE bond order is in the input, which is
  not supported by the MDL/Symyx molfile format (fixes #3029352) [32cdc48](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=32cdc48)
* Deal with a special situation: pyridine N-oxide in the non-charge-separated
  representation, with a N.sp2.3 nitrogen, with two double bonds. Previously,
  any ring-outward double bond would disqualify the ring as aromatic. This compound
  is now an exception. [c66039d](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=c66039d)
* Assert the compound is aromatic (fixes false negative) [d1da527](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=d1da527)
* Exporting the signatures jar [7959947](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=7959947)
* Removed the OpenJavaDocCheck Jazzy extension which was not supposed to go
  in; it's not ready for prime time [9364179](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=9364179)
* Added missing dependencies (fixes failing unit tests) [e582852](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=e582852)
* Added missing dependencies (fixes failing unit tests) [ef14ef0](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=ef14ef0)
* Added missing dependency [a0f22f6](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=a0f22f6)
* Copy the 2D templates into the source distribution [5bcd111](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=5bcd111)
* Added finally blocks to MolHandler to close its input streams, with proper
  logging calls if it fails Fixes bug #3032568 [1201e01](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=1201e01)
* UIT timeout fix [5a329d4](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=5a329d4)
* Cleaned up exception handling in TemplateHandler.loadTemplates() to be more
  specific and less pessimistic. [e1df763](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=e1df763)
* QSAR descriptor values made serializeable [2ef459c](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=2ef459c)
* Fixed assertion to compare two Vector3d's [c133da5](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=c133da5)
* Added test to assert that two Vector3d's are identical [6651956](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=6651956)
* All methods now tested [004770a](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=004770a)
* Hooking up test machinery [32155b0](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=32155b0)
* Altered the getTetrahedralDescription to be get stereo and return ITetrahedralChirality.Stereo
  [f61266c](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=f61266c)
* Moved Stereotool to stereo package [a99c918](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=a99c918)
* Convenience method that returns chirality descriptor (R/S) given four atoms
  in priority order [7abbdcc](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=7abbdcc)
* Missing docs [9a55100](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=9a55100)
* Copyright statements [d96f596](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=d96f596)
* Just to be paranoid, test +/- tetrahedra above and below the XY plane [e32f334](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=e32f334)
* Tests for square planar shapes, trig bipyr, and oct [8b49490](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=8b49490)
* Cleanup and fixing (I think) of the trigonal bipyramidal method [1b01c84](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=1b01c84)
* Test for 3 colinear points [01ae3fc](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=01ae3fc)
* Better docs [bb38d10](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=bb38d10)
* Tests for tetrahedral sign, some basic defined vectors [897b6ee](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=897b6ee)
* Test class, and name change of distanceToPlane to show that it returns signed
  (+/-) distance [1735551](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=1735551)
* Initial go at the StereoTool - functions taken from Jmol's smiles package
  for 3D stereo checking [c25591f](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=c25591f)
* Updated OB note and robustified unit tests [2b96512](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=2b96512)
* Added support for multi-molecule mol2 files. Updated source and added unit
  test and test file [dbd6df4](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=dbd6df4)
* Updated cdk-1.2.x patches for master API [e383f4b](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=e383f4b)
* Updated the DebugBond unit test too now: new DebugBond() has zero atoms [6ef1fb1](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=6ef1fb1)
* Backport patch, to make the patches compile with cdk-1.2.x [ce9b1bd](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=ce9b1bd)
* Additional patch to reduce atom count on setAtom(null, int) and unit tests
  for the setAtom(IAtom, int) behavior. [6cf95db](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=6cf95db)
* Also fix the new NNBond() == 0 atoms for the nonotify module [23d9685](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=23d9685)
* Fixed Bond() constructor to create a bond with zero atoms. Also fixed setAtom(IAtom,
  int) to increase the atom count if a null entry is filled with a non-null
  IAtom. [916ab96](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=916ab96)
* Updated test to assume new Bond() creates a bond with zero atoms [4ac7111](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=4ac7111)
* Added two unit tests for aromatic N-oxides that are the basis for failures
  in SMARTS matching [12fb96b](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=12fb96b)
* added javadoc to IChemObjectReader explaining the split between ISimple and
  IIterating ChemObjectReaders [1574e42](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=1574e42)
* Exceptions when clone atomless ISingleElectron and ILonePair too [c5d4cd3](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=c5d4cd3)
* Unit test for ArrayIndexOutOfBoundsException occuring when trying to clone
  an IAtomContainer with an IBond with no IAtoms [d71c31c](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=d71c31c)
* Added unit tests for SMILES with failing atom typing, from email on the cdk-devel
  mailing list June 11 2010 [890d0f5](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=890d0f5)
* Added the N.oxide atom type, for structures like (CH3)N=O [bb431e3](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=bb431e3)
* Fixed reading of SD properties: keep the first line too [3133a18](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=3133a18)
* Added missing dependency [14003dc](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=14003dc)
* Fixed unit test: surely there is no atom with symbol 0... how long has this
  been failing?? [c888e4f](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=c888e4f)
* Updated fingerprinter javadoc [e6fecf2](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=e6fecf2)
* Added a test class to aromaticity of three compounds: the last incorrectly
  fails [a454ab8](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=a454ab8)
* Also except N.amide as part of an aromatic ring [3357113](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=3357113)
* Added a test class to repeat atom type perception and test consistency [0bd5b42](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=0bd5b42)
* Unit test fix: the molecules \*is\* aromatic, as we should assume it is. Fixes
  a big goof up [cd83236](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=cd83236)
* Replace special chars where spaces are supposed to occur, fixing the fail
  of the unit tests every now and then [483c856](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=483c856)
* Merge branch 'master' of ssh://cdk.git.sourceforge.net/gitroot/cdk/cdk [eb6defd](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=eb6defd)
* BooleanIOSetting to let MDLWriter output bond type 4 (aromatic) [a586d6a](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=a586d6a)
* Reorderd imports [2896226](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=2896226)
* Added test cases to check that the code runs when faced with covalently bonded
  metals. Currenly on failure is due to the presence of Pt, for which we do
  not have a valency in AtomValence [f32e9a2](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=f32e9a2)
* chemfilter improvised Signed-off-by: Syed Asad Rahman <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=2a7ee54">2a7ee54</a>
* SMSD Test cases updated as per new code Signed-off-by: Syed Asad Rahman <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=8f3c70a">8f3c70a</a>
* SMSD Test cases updated as per new code Signed-off-by: Syed Asad Rahman <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=3266460">3266460</a>
* added ExtAtomContainerManipulator Signed-off-by: Syed Asad Rahman <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=d4d8339">d4d8339</a>
* deleted ext Signed-off-by: Syed Asad Rahman <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=b44c82b">b44c82b</a>
* updated SMSD code Signed-off-by: Syed Asad Rahman <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=eccc70d">eccc70d</a>
* updated SMSD code Signed-off-by: Syed Asad Rahman <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=370a926">370a926</a>
* Convenience constructors for AtomSignature that take IAtoms rather than atom
  indices [935b5f6](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=935b5f6)
* Added missing jar meta file for the Signatures library [805103a](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=805103a)
* Updated to reflect the upstream jar name [d33a71a](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=d33a71a)
* Abstract methods not part of API are now protected, to discourage thier use
  [7a92d42](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=7a92d42)
* Various fixes to tests [592b920](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=592b920)
* Added the missing assert: runCoverageTest() returns a boolean stating the
  success [850fd1a](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=850fd1a)
* cdk.cite references for two Faulon papers [e7ccc4e](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=e7ccc4e)
* More missing javadocs - notably the class documentation for AtomSignature
  and MoleculeSignature [8bd664f](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=8bd664f)
* Mising constructor javadoc, and inheritdoc annotation on AtomSignature [88ffdd6](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=88ffdd6)
* Final missing test [cf148dd](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=cf148dd)
* Atom signature test methods [888bf60](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=888bf60)
* Molecule signature tests [b64c4e5](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=b64c4e5)
* Signature quotient graph test method [0d0a95e](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=0d0a95e)
* Missing test for Orbit::iterator [2609f1b](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=2609f1b)
* Removed unused import [020fb92](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=020fb92)
* Molecule From Signature Builder tests [9d2a0c0](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=9d2a0c0)
* All orbit methods tested [7c46a7c](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=7c46a7c)
* Finally correct junit annotations, and sort test [fba5ff5](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=fba5ff5)
* BeforeClass method must be static; better clone test [7e370a2](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=7e370a2)
* Fixes some problems flagged by PMD [cd3a866](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=cd3a866)
* Use junit's BeforeClass instead of Before annotation [2566b87](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=2566b87)
* Added missing githash tags, to add links in the JavaDoc to the source code
  repository [fc0a9f9](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=fc0a9f9)
* Inherit JavaDoc where methods overwrite a super method [d4a9436](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=d4a9436)
* Fixed PMD warnings: more descriptive field names; use of Integer.valueOf()
  [02020d6](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=02020d6)
* Added test method annotation for the clone() method [cabd95f](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=cabd95f)
* Removed some unnecessary imports [19b21a3](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=19b21a3)
* Test orbit cloning [3c85ab2](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=3c85ab2)
* Improved canonical label method in graph signature [0bca11f](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=0bca11f)
* Integer invariants, and updated signatures jarfile [5c838b6](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=5c838b6)
* Added JavaDoc HTML generation for the signature module [7617074](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=7617074)
* Hooked in PMD testing for the signature module [7384bc3](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=7384bc3)
* Defined dependencies for the test module [132badc](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=132badc)
* Hooked the signature module into the CDK build system [4ea7d48](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=4ea7d48)
* Removed the dependency on the nonotify module [93e0a22](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=93e0a22)
* Created a CDK style module test suite [a9a4aa8](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=a9a4aa8)
* MoleculeFromSignatureBuilder tests [d7bb6f6](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=d7bb6f6)
* Extend from CDKTestCase and use the slow running test check [6969629](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=6969629)
* Fixed and cleaned up molecule signature tests [3998ed7](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=3998ed7)
* Initial commit of signature package [ff2bdeb](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=ff2bdeb)
* Added OpenJavaDocCheck 0.5 - the Jazzy spell checking extension [57e7eea](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=57e7eea)
* specify fail behavior (returns null) in javadoc [bfd06db](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=bfd06db)
* Added PMD tests for detecting misuse of TestClass and TestMethod, e.g. TestClass
  on a method. (fixes #3014808) [c94ebcf](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=c94ebcf)
* Removed two lines added in master to the removed doccheck target [9d679fe](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=9d679fe)
* Merge branch 'cdk-1.2.x' [055f702](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=055f702)
* Improved javadoc generation using a link tag, so that references to java library
  classes are resolved properly [1f8bb2d](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=1f8bb2d)
* Update OpenJavaDocCheck to 0.5: fixing a few false positives [f0c7d0c](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=f0c7d0c)
* Removed use of the proprietary DocCheck utility [1523f66](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=1523f66)
* OpenJavaDocCheck errors are fixed for SMSD related modules Signed-off-by:
  Syed Asad Rahman <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=ac9384a">ac9384a</a>
* solved cdk-Bugs-3006773 : small JavaDoc errors in the smsd module [f66a779](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=f66a779)
* Fix for character spacing for "APO" line in RGFile output [ed510bf](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=ed510bf)
* Branch open for commits for the future 1.3.6 [1ab64ff](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=1ab64ff)
* Use the new tests in more situations [e8b13b2](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=e8b13b2)
