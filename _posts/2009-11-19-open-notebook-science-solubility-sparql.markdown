---
layout: post
title:  "Open Notebook Science Solubility: the SPARQL end point"
date:   2009-11-19
blogger-link: https://chem-bla-ics.blogspot.com/2009/11/open-notebook-science-solubility-sparql.html
doi: 10.59350/tezva-0ty37
tags: chemistry rdf sparql
modified_date: 2026-10-17
---

The [Open Notebook Science Solubility](http://onschallenge.wikispaces.com/) challenge is an project crowd sourcing solubility
of organic compounds in non-aqueous solvents. I have been working on RDF-ing this data:

* [Solubility Data in Bioclipse #1 <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/11/18/solubility-data-in-bioclipse-1.html)
* [Solubility Data in Bioclipse #2: handling RDF <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/02/22/solubility-data-in-bioclipse-2-handling.html)
* [Solubility Data in Bioclipse #3: Finding ChEBI IDs <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/02/27/solubility-data-in-bioclipse-3-finding.html)
* [Solubility Data in Bioclipse #4: Finding ChEBI IDs (Again, but better) <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/03/01/solubility-data-in-bioclipse-4-finding.html)

And this resulted in a joint chapter in the nice [Beatiful Data](http://oreilly.com/catalog/9780596157128) book.

What I had not done so far, is set up a SPARQL end point for this data, like I did for the
[NMRShiftDB data <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/09/05/nmrshiftdb-rdf-2-some-statistics.html).

Now, however, a Virtuoso-powered [SPARQL end point](http://pele.farmbio.uu.se/cc0/sparql) is available, and I hope this
will seen get picked up by the other nodes on the ONS Solubility project. It is not a auto-synchronized link, though.

Possible advantages include that the client can perform any query and get these results in various formats,
including JSON. For example, follow this link to get all
<a href="http://pele.farmbio.uu.se/cc0/sparql?default-graph-uri=&query=prefix+dc%3A+%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0D%0A%0D%0Aselect+distinct+%3Fs+%3Ftitle+where+\{\%0D%0A++%3Fs+a+%3Chttp%3A%2F%2Fspreadsheet.google.com%2Fplwwufp30hfq0udnEmRD1aQ%2Fonto%23Solute%3E+%3B%0D%0A+++++dc%3Atitle+%3Ftitle+.%0D%0A\}\%0D%0A%0D%0A&format=application%2Fjson&debug=on&timeout=">solutes in JSON format</a>.

The matching SPARQL looks like:

```sparql
prefix dc: <http://purl.org/dc/elements/1.1/>
prefix ons: <http://spreadsheet.google.com/plwwufp30hfq0udnEmRD1aQ/onto#>

select distinct ?s ?title where {
  ?s a ons:Solute ;
     dc:title ?title .
}
```
