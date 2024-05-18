---
layout: post
title:  "Biology, ACPs, lipids, cheminformatics, and Dagstuhl"
date:   2022-08-01
blogger-link: https://chem-bla-ics.blogspot.com/2022/08/biology-acps-lipids-cheminformatics-and.html
tags: cdk chebi dagstuhl epilipidnet kegg wikipathways lipidmaps metabolomics smiles wikidata doi:10.7554/ELIFE.52614
  doi:10.7554/ELIFE.70780 doi:10.1186/S13321-017-0220-4
---

Already 3 months ago I visited [Dagstuhl](https://www.dagstuhl.de/) for the second time. The weather was much better than in the January right before
the start of the pandemic. The first I attended the Computational Metabolomics meeting, with the focus From Cheminformatics to Machine Learning, one
of the things we concerned ourselves with was how to do computation with compound classes (see
[Section 3.6](https://drops.dagstuhl.de/opus/volltexte/2020/12403/pdf/dagrep_v010_i001_p144_20051.pdf) and
[this online book](https://egonw.github.io/cdk-cxsmiles/)). We know how to handle
SMILES and we know how to the substructure searching with SMARTS, but what if you have compound classes or lipid classes? Biology is a greasy business.

From a [WikiPathways](https://wikipathways.org/) there is additional complexity, with modified proteins involved in lipid metabolism, the acyl-carrier
proteins. They look like this, and the R group is a protein:

![](/assets/images/Screenshot_20220801_180944.png)

We have quite a few of them in WikiPathway and they also show up in [ChEBI](https://www.ebi.ac.uk/chebi/searchId.do?chebiId=CHEBI:5697) (and likely
Reactome), [LIPID MAPS](https://www.lipidmaps.org/databases/lmsd/LMFA07060040?LMID=LMFA07060040), and
[KEGG](https://www.kegg.jp/entry/C05764).

During this years Dagstuhl we used up one session to continue working on it (report pending). Part of the results is that
[Wikidata](https://www.wikidata.org/) (see doi:[10.7554/eLife.52614](https://doi.org/10.7554/eLife.52614) and
doi:[10.7554/eLife.70780](https://doi.org/10.7554/eLife.70780)) now has [a property for CXSMILES](https://www.wikidata.org/wiki/Property:P10718).
CDK 2.0 (doi:[10.1186/s13321-017-0220-4](https://doi.org/10.1186/s13321-017-0220-4)) already supported CXSMILES and the above image is actually created with
[CDK Depict](https://github.com/cdk/depict) (thx to John!).

So, that means I can now start adding all those ACPs to Wikidata :) Here's [hexadecanoyl-[acp]](https://www.wikidata.org/wiki/Q113377202)
(or this [Scholia page](https://scholia.toolforge.org/chemical-class/Q113377202)):

![](/assets/images/Screenshot_20220801_182345.png)
