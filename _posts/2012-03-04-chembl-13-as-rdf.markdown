---
layout: post
title:  "ChEMBL 13 as RDF"
date:   2012-03-04
modified_date: 2013-05-09
blogger-link: https://chem-bla-ics.blogspot.com/2012/03/chembl-13-as-rdf.html
tags: chembl rdf semweb ontology cheminf doi:10.1371/JOURNAL.PONE.0025513 cito
  justdoi:10.1186/2041-1480-1-S1-S6 doi:10.1186/2041-1480-2-S1-S6
image: /assets/images/relations.png
---

**Update**: this work is now described in [this paper](https://chem-bla-ics.blogspot.com/2013/05/new-paper-chembl-database-as-linked.html).

Last week, ChEMBL 13 was [released](http://chembl.blogspot.com/2012/02/chembl-13-released.html), with even more data, data fixes,
[etc](ftp://ftp.ebi.ac.uk/pub/databases/chembl/ChEMBLdb/releases/chembl_13/chembl_13_release_notes.txt). Since my RDF for
[ChEMBL 09](http://chem-bla-ics.blogspot.com/2011/04/chembl-09-as-rdf.html) my workflow has become
[more solid](https://github.com/egonw/chembl.rdf/commits/master) and uses more common ontologies, started using more common ontologies
and ontologies I just like, such as [CHEMINF](http://www.plosone.org/article/info:doi/10.1371/journal.pone.0025513) and
[CiTO](http://www.jbiomedsem.com/content/1/S1/S6). Below is an overview of the resource types present in the RDF:
activities (almost 7M now), chemical entities, assays, targets, and documents.

![](/assets/images/relations.png)

The [data on Kasabi](http://chem-bla-ics.blogspot.com/2011/10/chembl-rdf-uploading-data-to-kasabi.html) will be updated soon,
and the [SPARQL end point](http://rdf.farmbio.uu.se/chembl/sparql) hosted by Uppsala University was updated yesterday, including the
[SNORQL frontend](http://rdf.farmbio.uu.se/chembl/snorql/):

![](/assets/images/chemblRDF13.png)

The new data is not fully backwards compatible. The changes to the RDF include the use of `cito:citesAsDataSource`, more typing
using existing ontologies, e.g. with `cheminf:CHEMINF_000000` and `pro:PR_000000001` from the
[PRotein Ontology](http://pir.georgetown.edu/pro/).

A paper dedicated to the ChEMBL-RDF is in preparation. Existing use cases can be found
[here](http://www.jbiomedsem.com/content/2/S1/S6).
