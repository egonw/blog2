---
layout: post
title:  "Status update on BJOC analysis with Oscar and ChemicalTagger #2"
date:   2010-12-11 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2010/12/status-update-on-bjoc-analysis-with_11.html
doi: 10.59350/dq7h7-42x56
tags: beilstein oscar inchi
image: /assets/images/bjoc1.png
modified_date: 2026-09-27
---

![](/assets/images/bjoc1.png)

A quick update on the [post of this morning <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/12/11/status-update-on-bjoc-analysis-with.html). The above screenshot
shows the progress of the reporting of text mining results using [Oscar](http://oscar3-chem.sf.net/) on the [BJOC literature](http://www.beilstein-journals.org/bjoc/).
I think I am almost ready to analyze the full corpus, with a blacklist put in place for [large papers <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/12/11/supramolecular-chemistry.html),
What you see is the same kind of JQuery-enabled sortable list in the HTML view, and a [SPARQL query](http://en.wikipedia.org/wiki/SPARQL)
in [RDFaDev <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/07/16/rdfadev-htmlrdfa-development-with.html), to list all papers that mention
[DHMO](http://www.dhmo.org/facts.html) (in the first 10 of all 350 BJOC papers) by its [InChI](http://en.wikipedia.org/wiki/International_Chemical_Identifier).

Importantly, IMHO, it is using the [CHEMINF ontology](http://code.google.com/p/semanticchemistry/).
