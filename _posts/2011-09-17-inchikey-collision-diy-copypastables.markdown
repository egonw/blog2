---
layout: post
title:  "InChIKey collision: the DIY copy/pastables"
date:   2011-09-17
blogger-link: https://chem-bla-ics.blogspot.com/2011/09/inchikey-collision-diy-copypastables.html
tags: inchi inchikey:OCPAUTFLLNMYSX-UHFFFAOYSA-N opsin smiles bioclipse iupac
doi: 10.59350/eg94z-9dg88
---

About two weeks ago, the ChemConnector blog [reported an InChIKey collosion](http://www.chemconnector.com/2011/09/01/an-inchikey-collision-is-discovered-and-not-based-on-stereochemistry/)
detected by [Prof. Goodman](http://www-ucc.ch.cam.ac.uk/researchgroups/goodman_group). Unlike the previous collision, this one was based solely on the graph and not on stereochemistry.
The two molecules both have the InChIKey `OCPAUTFLLNMYSX-UHFFFAOYSA-N`:

<img src="/assets/images/inchikey1.png" style="height:400px">
<img src="/assets/images/inchikey2.png" style="height:400px">

The compounds are really different, the molecular formulas are C<sub>50</sub>H<sub>102</sub>O and C<sub>57</sub>H<sub>114</sub>O respectively.
The SMILESes are `OC(C)C(C)CC(C)C(C)CCC(C)C(C)CCCC(C)C(C)CC(C)C(C)CCCC(C)C(C)CCC(C)C(C)CC(C)CCCCCCC` and
`O=C(C)CC(C)C(C)CCC(C)CCC(C)C(C)C(C)C(C)C(C)C(C)C(C)C(C)CC(C)C(C)C(C)CC(C)C(C)C(C)CCCCC(C)C(C)CC(C)C(C)C`.
The IUPAC names are useful to have as copy/pastables too (e.g. with the
[OPSIN](http://opsin.ch.cam.ac.uk/)-based '[Molecule from IUPAC name](http://chem-bla-ics.blogspot.com/2011/02/opsin-used-for-bioclipse-wizard.html)'-wizard
in [Bioclipse](http://bioclipse.net/) 2.5, which has been updated to the latest OPSIN version this week):
3,5,6,9,10,14,15,17,18,22,23,26,27,29-tetradecamethylhexatriacontan-2-ol and
4,5,8,11,12,13,14,15,16,17,18,20,21,22,24,25,26,31,32,34,35-henicosamethylhexatriacontan-2-one.

I am adding these structures to the [pharmbio.org course book](http://chem-bla-ics.blogspot.com/2011/03/pharmaceutical-bioinformatics.html)
and the matching Bioclipse plugin this weekend.
