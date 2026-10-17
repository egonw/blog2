---
layout: post
title:  "DBPedia: lookup and autocomplete of chemistry"
date:   2009-02-11
blogger-link: https://chem-bla-ics.blogspot.com/2009/02/dbpedia-lookup-and-autocomplete-of.html
doi: 10.59350/wbb63-gv107
tags: rdf dbpedia wikipedia smiles inchi
image: /assets/images/dbpediaAutocomplete.png
modified_date: 2026-10-17
---

On the [DBPedia](http://dbpedia.org/) [discussion mailing list](https://lists.sourceforge.net/lists/listinfo/dbpedia-discussion) there was a post on a
nice web page which allows you to look up things, and which features a autocomplete edit field. The below screenshot show lookup of molecular structures:

![](/assets/images/dbpediaAutocomplete.png)

If you are not ware of this, adding content to DBPedia is as easy as adding something to [WikiPedia](http://www.wikipedia.org/). Literally: DBPedia is
the [RDF](http://en.wikipedia.org/wiki/Resource_Description_Framework) flavour of WikiPedia. It extracts the information from the info boxes, as I
discussed before (see [Molecules in Wikipedia <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/08/02/molecules-in-wikipedia.html)).

BTW, one can take advantage of DBPedia to see what WikiPedia has to offer in terms of chemistry. For example, to list all molecules which have a SMILES, one can use this simple SPARQL query:

<script src="http://gist.github.com/57559.js"></script>

Or, to list those which have an InChI:

<script src="https://gist.github.com/57571.js"></script>

And this is actually quite useful, e.g. it can be used in quality control. Running the above queries will show up several broken SMILES and InChIs. I have not had time to fix those yet, so please go ahead and beat me to those fixes, and get some WikiPedia Fame :) Alternatively, invert the queries and add missing InChIs, PubChem CID or SMILES. When I have a bit more free time again, after the new stable CDK and Bioclipse releases, I'll runs these analyses again, and summarize them in a web page.
