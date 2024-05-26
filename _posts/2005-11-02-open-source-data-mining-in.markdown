---
layout: post
title:  "Open Source data mining in chemoinformatics"
date:   2005-11-02
blogger-link: https://chem-bla-ics.blogspot.com/2005/11/open-source-data-mining-in.html
tags: iccs cheminf
doi: 10.59350/gc4hw-5k265
---

On the [7th International Conference on Chemical Structures](http://www.int-conf-chem-structures.org/)
[Jeroen Kazius](http://www.medchem.leidenuniv.nl/people/jeroen_kazius.htm) has a
[poster](http://www.liacs.nl/~snijssen/gaston/iccs.html) on finding discriminative substructures, that is, molecular fragments
which can be discriminate between two acitivity classes. The software is released as
[Gaston](http://www.liacs.nl/~snijssen/gaston/), is written in C++ and has the GPL license.

Later I encountered [MoSS](http://fuzzy.cs.uni-magdeburg.de/~borgelt/moss.html) which has the same goal, but uses a different algorithm.
MoSS is written in Java and uses the LGPL license. MoSS reads STN and SMILES as input, which might not be optimal for all users,
so a CDK port comes to mind.
