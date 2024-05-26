---
layout: post
title:  "Mining the KEGG pathway database with self-organizing maps"
date:   2006-04-04
blogger-link: https://chem-bla-ics.blogspot.com/2006/04/mining-kegg-pathway-database-with-self.html
tags: kegg chemometrics justdoi:10.1002/ANIE.200503833 justdoi:10.1021/CI0502707
---

The [Self-organizing map](https://en.wikipedia.org/wiki/Self_organizing_map) (SOM) is a popular (again) and intuitive non-linear mapping
method: it transforms a multidimensional space into two dimensions (normally: they are so easy to visualize). Latino and
[Aires-de-Sousa](http://www.dq.fct.unl.pt/staff/jas/) published a paper that uses this method to analyze the whole
[KEGG pathway database](http://www.genome.jp/kegg/pathway.html): *Genome-Scale Classification of Metabolic Reactions: A Chemoinformatics
Approach* (DOI: [anie.200503833](https://doi.org/10.1002/anie.200503833)).

The method is based on earlier work by Zhang and Aires-de-Sousa: *Structure-Based Classification of Chemical Reactions without Assignment
of Reaction Centers* (DOI: [10.1021/ci0502707](https://doi.org/10.1021/ci0502707)). A non-trivial feature of the suggested method is the
use of two SOMs. The first maps the reaction onto a fixed-length vector (coined MOLMAP), which is used as input vector for the second map.
This later map is used to cluster the KEGG reactions on a purely chemical basis. The resemblence with the
[EC numbering system](https://en.wikipedia.org/wiki/EC_number) is striking.
