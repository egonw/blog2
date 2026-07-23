---
layout: post
title:  "Dereferencable InChIs: OpenMolecules RDF"
date:   2012-04-15
modified_date: 2026-07-23
blogger-link: https://chem-bla-ics.blogspot.com/2012/04/dereferencable-inchis-openmolecules-rdf.html
doi: 10.59350/eg04s-efd96
tags: chemistry rdf inchi opendata doi:10.1038/NPRE.2010.4918.1 doi:10.1002/9781118026038.CH24
  doi:10.1186/2041-1480-2-S1-S6
---

About four and a half years ago, I started [OpenMolecules RDF](http://rdf.openmolecules.net/), a spin off from
[Chemical blogspace](http://cb.openmolecules.net/) (Cb, which is still up and running thanks to Peter Maas!) where
I started [using InChIs in URIs](http://chem-bla-ics.blogspot.com/2007/07/rdf-ing-molecular-space.html). My
interest came from the dereferencability, the ability to take an InChI and find information about the chemical
structure representated by it. Because information about anything is scattered around the internet, and we need
something [decentralized](http://chem-bla-ics.blogspot.com/2007/08/centralized-or-decentralized.html). Moreover,
at the time searching of InChIs with search engines like Google did not work well at all: InChIs were tokenized
in inconvenient ways.

Originally, these URIs for InChIs were provided (and still are) by Cb, this July five years ago:

```
http://cb.openmolecules.net/rdf/?InChI=1/CH4/h1H4
```

for which soon after a separate domain was instantiated (thanx to Geoff!):

```
http://rdf.openmolecules.net/?InChI=1/CH4/h1H4
```

Mind you, **OpenMolecules RDF** is a decent citizen of the Linked Open Data network, though not much linked to.
The [ChEMBL-RDF](https://github.com/egonw/chembl.rdf) data is, and love to hear if there are other link sets
pointing there. On the outlinking side, it points to [ChEBI](http://www.ebi.ac.uk/chebi/) (via
[Bio2RDF](http://www.bio2rdf.org/)), [DBPedia](http://dbpedia.org/), [ChemSpider](http://www.chemspider.com/)
(for 10k structures), the [NMRShiftDB](http://chem-bla-ics.blogspot.com/2009/03/nmrshiftdb-enters-rdfopenmoleculesnet.html),
and Cb itself. This post describes the adding of the [link to DBPedia](http://chem-bla-ics.blogspot.com/2009/02/dbpedia-enters-rdfopenmoleculesnet.html).

In the past few years, I have written up bits on OpenMolecules RDF. The main reference is our chapter in *Beautiful Data* (Willighagen, 2010),
where I used the [URIs for the solubility data](http://chem-bla-ics.blogspot.com/2009/02/solubility-data-in-bioclipse-3-finding.html).
It was later also described in the *Linking the Resource Description Framework to cheminformatics and proteochemometrics paper* (Willighagen, 2011),
and another book chapter (Guha, 2011).

This blog features a few more use cases, such as the ability to use these URIs to bookmark molecules or to
[annotate them with tags with Connotea](http://chem-bla-ics.blogspot.com/2007/09/tagging-molecules-mashup-of-connotea.html)
(which resulted in a nice [lunch with the Nature people at the time](http://chem-bla-ics.blogspot.com/2007/10/lunch-at-nature-hq-with-euan-joanna-ian.html)).
The link to Connotea is disabled at the moment, though.

At this moment the system still holds, though there is problem in that browsers can put practical limits on
URIs length, which limits the maximum size of the InChI. Virtuoso does this too.
