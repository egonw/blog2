---
layout: post
title:  "CDK 1.2.6: the changes and the authors"
date:   2010-07-28
blogger-link: https://chem-bla-ics.blogspot.com/2010/07/cdk-126-changes-and-authors.html
doi: 10.59350/89dx1-stx14
tags: cdk
---

Like all release in the 1.2 series after [CDK](http://cdk.sf.net/) 1.2.0, release [1.2.6](https://sourceforge.net/projects/cdk/files/cdk/1.2.6/)
is a bug fix release. Anyone running a CDK 1.2 version is advised to upgrade. New in this release is the availability of a
[torrent for the cdk-1.2.6.jar](http://www.biotorrents.net/details.php?id=95) (see
[BitTorrents for Science](http://chem-bla-ics.blogspot.com/2010/04/bittorrents-for-science.html)).
Please find below the changes and the authors that contributed to this release.

### The changes

<ul>
<li>Updated the DebugBond unit test too now: new DebugBond() has zero atoms <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=6ef1fb1b36">6ef1fb1b36</a></li>
<li>Backport patch, to make the patches compile with cdk-1.2.x <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=ce9b1bd9b3">ce9b1bd9b3</a></li>
<li>Additional patch to reduce atom count on setAtom(null, int) and unit tests for the setAtom(IAtom, int) behavior. <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=6cf95db428">6cf95db428</a></li>
<li>Also fix the new NNBond() == 0 atoms for the nonotify module <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=23d96855fa">23d96855fa</a></li>
<li>Fixed Bond() constructor to create a bond with zero atoms. Also fixed setAtom(IAtom, int) to increase the atom count if a null entry is filled with a non-null IAtom. <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=916ab96c4e">916ab96c4e</a></li>
<li>Updated test to assume new Bond() creates a bond with zero atoms <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=4ac711194a">4ac711194a</a></li>
<li>Exceptions when clone atomless ISingleElectron and ILonePair too <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=c5d4cd3b9e">c5d4cd3b9e</a></li>
<li>Unit test for ArrayIndexOutOfBoundsException occuring when trying to clone an IAtomContainer with an IBond with no IAtoms <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=d71c31caf8">d71c31caf8</a></li>
<li>Added unit tests for SMILES with failing atom typing, from email on the cdk-devel mailing list June 11 2010 <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=890d0f573c">890d0f573c</a></li>
<li>Added the N.oxide atom type, for structures like (CH3)N=O <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=bb431e3768">bb431e3768</a></li>
<li>Fixed reading of SD properties: keep the first line too <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=3133a18574">3133a18574</a></li>
<li>Added missing dependency <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=14003dce2f">14003dce2f</a></li>
<li>Fixed unit test: surely there is no atom with symbol 0... how long has this been failing?? <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=c888e4fd44">c888e4fd44</a></li>
<li>Added a test class to aromaticity of three compounds: the last incorrectly fails <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=a454ab84a7">a454ab84a7</a></li>
<li>Also except N.amide as part of an aromatic ring <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=3357113d0a">3357113d0a</a></li>
<li>Added a test class to repeat atom type perception and test consistency <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=0bd5b421d3">0bd5b421d3</a></li>
<li>Unit test fix: the molecules *is* aromatic, as we should assume it is. Fixes a big goof up <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=cd83236c3a">cd83236c3a</a></li>
<li>Replace special chars where spaces are supposed to occur, fixing the fail of the unit tests every now and then <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=483c856e3a">483c856e3a</a></li>
<li>Improved javadoc generation using a link tag, so that references to java library classes are resolved properly <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=1f8bb2d7a1">1f8bb2d7a1</a></li>
<li>Removed use of the proprietary DocCheck utility <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=1523f66152">1523f66152</a></li>
<li>Use the new tests in more situations <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=e8b13b27e2">e8b13b27e2</a></li>
<li>Introducing PMD test for CDK specific issues: <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=406930b292">406930b292</a></li>
<li>Added copyright and license header <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=d6b6c65f5a">d6b6c65f5a</a></li>
<li>Replaced outdated URL with entry in WikiPedia (fixes #3002741) <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=ad2bd3ed63">ad2bd3ed63</a></li>
<li>Fixed a ClassCastException in a unit test; I messed up (mea culpa) <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=b5fa3dca01">b5fa3dca01</a></li>
<li>Fixed NullPointerExceptions for LonePair's and SingleElectron's constructed with the no-argument constructors <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=5f34897eb8">5f34897eb8</a></li>
<li>Added missing cloning of single electrons <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=2d4c1220c3">2d4c1220c3</a></li>
<li>Do not try to clone the atom if it does not exist <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=9672df0df7">9672df0df7</a></li>
<li>converted uses of indexOf to startsWith/contains <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=7b9d84e44a">7b9d84e44a</a></li>
<li>Updated HIN reader to fix bug 2984581 <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=f95c6324a8">f95c6324a8</a></li>
<li>Added unit test to see of arrays are properly cloned, and that array entries of the original are not overwritten <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=38d5f8d191">38d5f8d191</a></li>
<li>Unit test that the IAtom[] array is properly cloned, and overwriting entries in the clone does not overwrite entries on the original <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=3c1b07e26f">3c1b07e26f</a></li>
<li>Removed duplication of cloning. <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=216c1600b9">216c1600b9</a></li>
<li>Apparently the super.clone() does not clone the pointer to the IAtomContainer[], causing a clone() followed by changing containers in the clone to overwrite the original IAtomContainer[]. Fixed by creating a new array. <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=4e5d6a120f">4e5d6a120f</a></li>
<li>Moved test from the specific class to the abstract tests, as the behavior should be the same for NNMoleculeSet and DebugMoleculeSet too <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=068fb3b9b2">068fb3b9b2</a></li>
<li>Two more tests for the issue: atom typing works fine; aromaticity detection fails: one ring is detected as aromatic (that with two nitrogesn), so that it does not consider the double ring, marking the other ring as non-aromatic <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=3be2367b36">3be2367b36</a></li>
<li>Fixed taking into account larger ring systems when one ring is in itself already aromatic (fixes #2976054) <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=891049f59a">891049f59a</a></li>
<li>Fixed cloning of properties with null values by always using HashMap (fixes #2975800) <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=2f722f09f8">2f722f09f8</a></li>
<li>Added four and six coordinate neutral platinum atom types. <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=407d79323e">407d79323e</a></li>
<li>Shortened the SMILES to only contain the aromatic atoms, allowing a foreach loop: replaced for-loop by a foreach-loop, solving also the not testing all atoms in the testAromaticty() test. <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=6fcc3d08a0">6fcc3d08a0</a></li>
<li>Added InChI, and link to existing pyrolle test, using a different SMILES <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=f088cd6a39">f088cd6a39</a></li>
<li>Added tests for two cases of aromatic rings <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=c26ae95649">c26ae95649</a></li>
<li>Added @cdk.bug annotation, and restricted testing to the bug <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=3b08f1a5dc">3b08f1a5dc</a></li>
<li>Removed try/catch to retain the stacktrace of where the NPE occurs <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=ce11b521e1">ce11b521e1</a></li>
<li>Test checking for NPE when cloning with property with null as value <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=0aa632a876">0aa632a876</a></li>
<li>Improved JavaDoc: <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=19a976c3fa">19a976c3fa</a></li>
<li>Loosened the perception of N.planar3 atom types: the Hueckel system consist of more than one ring, so looking just at the ring to which the atom belongs does not make sense <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=d651c2597a">d651c2597a</a></li>
<li>Added unit tests for atom type perception of more N.planar3 atom types <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=83423a7a30">83423a7a30</a></li>
<li>Removed unused import <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=e1c03fbff0">e1c03fbff0</a></li>
<li>Removed last bits of implementation details from the API: now uses List<> instead of ArrayList<> <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=7727b72d7f">7727b72d7f</a></li>
<li>Removed output to STDOUT <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=14e1d12d71">14e1d12d71</a></li>
<li>Fixed some spelling errors and added JavaDoc links <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=677b3f6336">677b3f6336</a></li>
<li>Synchronized behavior with the MDLV2000Reader (addressing bug #2942196) <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=2ceef95e74">2ceef95e74</a></li>
<li>Ant has a release 1.8 that should be accepted in build.xml <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=4398cc45a4">4398cc45a4</a></li>
<li>The IMapping interface had a class comment which probably was a copy&paste artefact. Changed this. <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=05c857cc4e">05c857cc4e</a></li>
<li>Fixed license info .meta file for JavaCC <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=d9e15bbca9">d9e15bbca9</a></li>
<li>Bumped version to differ form the 1.2.5 release <a href="http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=17a6f08a07">17a6f08a07</a></li>
</ul>

### The authors

The below numbers are based on the number of commits, but keep in mind that some developers, like myself, need more commits for the same number of changed lines.

```
49  Egon Willighagen
 3  Rajarshi Guha
 2  Stefan Kuhn
 1  Arvid Berg
 1  Mark Rynbeek
 1  maclean
```

### The reviewers

The below list is based on who signed off the patches. Anyone who reviews patches in the patch tracker can basically do this. Ask on cdk-devel on how to do this.

```
41  Rajarshi Guha
 3  Egon Willighagen
```
