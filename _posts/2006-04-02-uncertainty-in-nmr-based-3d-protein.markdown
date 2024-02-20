---
layout: post
title:  "Uncertainty in NMR based 3D protein models"
date:   2006-04-02
blogger-link: https://chem-bla-ics.blogspot.com/2006/04/uncertainty-in-nmr-based-3d-protein.html
tags: pdb crystal pdb cif justdoi:10.1371/JOURNAL.PCBI.0020009
---

While I was working on implementing proper author-given chain IDs in [PDB](http://www.pdb.org/) structures for
[Jmol](http://www.jmol.org/)'s mmCIF reader today, I thought it was interesting to mention the recent article
*Traditional Biomolecular Structure Determination by NMR Spectroscopy Allows for Major Errors by Nabuurs*
(DOI:[10.1371/journal.pcbi.0020009](http://dx.doi.org/10.1371/journal.pcbi.0020009), open access), working at the
[CMBI](http://www.cmbi.ru.nl/), two floors away from my former working location at the
[Radboud University Nijmegen](https://www.ru.nl/).

Nabuurs discusses in this article the uncertainties that come with NMR derived 3D molecular structures of proteins.
These studies do not give factual data on atomic coordinates, but generally give facts about interatomic distances.
Solving the 3D geometry is then an optimization problem where the task is to find the 3D geometry that best
reproduces the factual interatomic distances.

Now, this optimization has many closeby, i.e. in terms of matching the experimental data, minima, corresponding,
possibly, to quite different structures.

This is nicely demonstrated in the article, by comparing the folds of [1Y4O](http://www.pdb.org/pdb/explore.do?structureId=1Y4O)
and [1TGQ](http://www.pdb.org/pdb/explore.do?structureId=1TGQ), as shown in the figure below
([CCAL](http://www.plos.org/oa/index.html) license):

![Figure 1 from the article: Sequence and Structure Ensembles of Two DLC2A Structures.](/assets/images/pcbi.0020009.g001.png)

It is interesting to note that 1TGQ got replaced by [2B95](http://www.pdb.org/pdb/explore.do?structureId=2B95) about the same
time the article by Nabuurs was published, which shows a 3D model that is homologous with that of 1Y4O, and different from
that in the Nabuurs article.
