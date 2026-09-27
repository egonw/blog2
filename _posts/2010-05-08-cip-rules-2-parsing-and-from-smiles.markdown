---
layout: post
title:  "CIP rules #2: parsing @ and @@ from SMILES"
date:   2010-05-08
blogger-link: https://chem-bla-ics.blogspot.com/2010/05/cip-rules-2-parsing-and-from-smiles.html
doi: 10.59350/n8f2y-adq94
tags: cdk iupac justdoi:10.1351/pac200678101897
image: /blog//assets/images/wedgeChirality.png
modified_date: 2026-09-27
---

I [recently wrote <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/04/22/cip-rules-for-stereochemistry.html) about a project for a (partial) CIP implementation.
This implementation is in place, and we are working towards setting up an extensive test suite. The data set we had in mind was available as SMILES
and as MDL molfile. Now, the latter does not really specify the stereochemistry of the tetrahedral centers, and relies on wedge bonding. Actually,
a few years ago Jonathan Brecher wrote up the IUPAC recommendation for the use of the wedge bond for chirality specification
(doi:[10.1351/pac200678101897](https://doi.org/10.1351/pac200678101897)), with 74 pages of rules and examples, like the following (copyright by
authors or journal; I'm claiming fair use):

![](/assets/images/wedgeChirality.png)

So, using wedges leaves plenty of room for incorrectly specifying the stereochemistry. Therefore, we decided to go for SMILES, even though Noel
[recently showed](http://baoilleach.blogspot.com/2009/03/clockwisdom-of-smiles-part-ii.html) that processing stereochemistry in SMILES is not trivial
either. The SMILES I am currently using:

* `Br[C@@H](Cl)I`
* `Br[C@H](Cl)I`
* `Br[C@@]([H])(Cl)I`
* `Br[C@]([H])(Cl)I`
* `[C@]12(OC1)NCN2`
* `C[C@H](O)[C@H](O)C`
* `NC([C@H](O)C)Cl`
* `I1.Cl2.Br3.[C@]123CCC`

I'm looking for more corner cases... please leave them as comments.
