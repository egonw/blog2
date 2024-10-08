---
layout: post
title:  "CDK Literature #1"
date:   2007-01-14
blogger-link: https://chem-bla-ics.blogspot.com/2007/01/cdk-literature-1.html
tags: cdk justdoi:10.1093/bioinformatics/btl535 justdoi:10.1016/j.jmb.2006.09.041
---

For each [CDK News](http://www.cdknews.org/) I try to write up what CDK related literature has been published
recently, but I failed to do so for the last two issues. In order to not postpone writing it up until close to
the deadline, I will write up things here, so that I can copy-paste it later for CDK News.

## Oxidoreductase-catalyzed reactions

Mu *et al.* analyzed about 2000 oxidation/reduction reactions from [KEGG](https://chem-bla-ics.blogspot.com/2007/01/cdk-literature-1.html)
using the [CDK](http://cdk.sf.net/) and [JOELib](http://joelib.sf.net/) for the chemoinformatics bits. The reactions were grouped into
12 subclasses, and SVM was used to train models to distinguish reactants from non-reactants. It seems that there were not independent
test sets used, but cross-validation indicates that there approach is possible. The works uses CDK's HydrogenAdder,
UniversalIsomorphismTester, and unnamed QSAR descriptors. It would be interesting to see how it compares to
[the work of Aires-de-Sousa](http://chem-bla-ics.blogspot.com/2006/04/mining-kegg-pathway-database-with-self.html).

## Cognate ligands

Bashton *et al.* took a different approach in analyzing the metabolome. They looked at the correlation of ligand structure with enzyme
domains, and propose a method to identify cognate ligands, that is, ligands that are present in vivo and are required for a functional
metobolome. The CDK is used for calculating fingerprints and used for calculating maximal common substructures (MCSS). The paper notes
that the MCSS is not necessarily of biochemical relevance, indicating that there is room for pharmacophore like concept in the CDK.
