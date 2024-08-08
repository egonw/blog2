---
layout: post
title:  "New Paper: \"The ChEMBL database as linked open data\""
date:   2013-05-09
blogger-link: https://chem-bla-ics.blogspot.com/2013/05/new-paper-chembl-database-as-linked.html
tags: chembl rdf cito cheminf doi:10.1186/1758-2946-5-23 doi:10.1186/1758-2946-3-15 ontology
  doi:10.1371/JOURNAL.PONE.0025513 justdoi:10.1186/2041-1480-1-S1-S6 chemspider openphacts
image: /assets/images/mondecaUptime.png
---

<script src="https://d1bxh8uas1mnw7.cloudfront.net/assets/embed.js" type="text/javascript"></script>
<div class="altmetric-embed" data-badge-details="right" data-badge-type="donut" data-doi="10.1186/1758-2946-5-23" style="float: right;"></div>

Yesterday, the paper "The ChEMBL database as linked open data" (doi:[10.1186/1758-2946-5-23](https://doi.org/10.1186/1758-2946-5-23)) by
Andra Waagmeester ([@andrawaag](https://twitter.com/andrawaag)), Ola Spjuth ([@ola_spjuth](https://twitter.com/ola_spjuth)), Peter Ansell
([@p_ansell](http://twitter.com/p_ansell)), Antony Williams ([@chemconnector](https://twitter.com/chemconnector)), Valery Tkachenko,
Janna Hastings, Bin Chen ([@binchenindiana](http://twitter.com/binchenindiana)), David J Wild ([@davidjohnwild](http://twitter.com/davidjohnwild)),
and me appeared in the OA [JChemInf](http://en.wikipedia.org/wiki/Journal_of_Cheminformatics) journal.

I am also indebted to the [ChEMBL](https://www.ebi.ac.uk/chembl/) team ([@chembl](http://twitter.com/chembl)) for both providing such
valuable data under a liberal Open Access license and their critical reading of the manuscript! **Additionally, I would like to stress
that the ChEMBL team will create their own RDF version of ChEMBL and that this paper is not describing the version they will release.**

BTW, the [source of the paper](https://github.com/egonw/chembl-rdf-paper/) is available from GitHub. And the
[(original) scripts to create RDF from the MySQL dump of ChEMBL](https://github.com/egonw/chembl.rdf) are also on GitHub.

![](http://www.jcheminf.com/content/figures/1758-2946-5-23-graphical-abstract.gif)

This paper outlines the [RDF](http://www.jcheminf.com/content/3/1/15) as it has evolved from various earlier projects. The above
diagram visualizes the basic structure (red), various Linked Data resources linked too (blue) and illustrates how various ontologies are used,
such as the [CHEMINF](http://www.plosone.org/article/info:doi/10.1371/journal.pone.0025513), [BIBO](http://bibliontology.com/),
and [CiTO](http://www.jbiomedsem.com/content/1/S1/S6) ontologies.

Additionally, various applications and links are described developed by various co-authors. For example, Peter worked on the use in
[Bio2RDF](http://bio2rdf.org/) and Bin and David on [Chem2Bio2RDF](http://cheminfov.informatics.indiana.edu:8080/). Andra developed
an extension for his (#altmetric) [CitedIn](http://citedin.org/) resource, giving credit to a paper when data in it is extracted into
ChEMBL. Ola, Valery, and Anthony developed a [Bioclipse Decision Support](http://www.bioclipse.net/decision-support) extension,
which supports a nearest neighbor search in ChEMBL using [ChemSpider](http://chemspider.com/). Of course, Ola also hosts
[the SPARQL end point](http://rdf.farmbio.uu.se/chembl/snorql/) of which you can monitor the uptime at the also cool
[mondeca.com service](http://labs.mondeca.com/sparqlEndpointsStatus/details/farmbio-chembl.html):

![](/assets/images/mondecaUptime.png)

(Yes, I think I have all the cool buzzwords covered in this paper. Sadly, marketing is needed nowadays as a scientist. Where is the
time that you could rant on page after page in all your domain specific jargon, not having to worry if your reader would understand
it immediately, or without a university degree...)

What this paper does not describe, is all the things I did with ChEMBL-RDF in the [Open PHACTS](http://www.openphacts.org/) project
([@Open_PHACTS](https://twitter.com/open_phacts)), which includes the use of [QUDT](http://qudt.org/) and the
[jQUDT](https://github.com/egonw/jqudt) library for unit normalization outlined in [this document](http://www.bigcat.unimaas.nl/~egonw/units/)
and the use of VoID for link sets as described in [this document](http://www.openphacts.org/specs/2012/WD-datadesc-20121019/).
