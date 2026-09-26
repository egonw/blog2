---
layout: post
title:  "Where do the WikiPathways come from?"
date:   2026-02-22
modified_date: 2026-09-26
doi: 10.59350/6smn2-ah530
tags: "wikipathways rdf justdoi:10.1093/database/bar032 sparql justdoi:10.1093/nar/gkt1063 justdoi:10.1093/nar/gkad896
  doi:10.1007/978-3-030-67727-5_73 justdoi:10.1007/s12263-010-0192-8 justdoi:10.1371/journal.pcbi.1004941
  justdoi:10.1007/s12263-010-0192-8 justdoi:10.37044/osf.io/m37f2_v1
image: /assets/images/wikipathways_authorList.png
comments:
  host: social.edu.nl
  username: egonw
  id: 116115859493978092
---

[WikiPathways](https://en.wikipedia.org/wiki/WikiPathways) was [founded in 2008](https://qlever.scholia.wiki/topic/Q7999828#earliest-published-works),
in the year I left Wageningen (and we Nijmegen) and moved to Uppsala, Sweden. When we dediced to move back to The Netherlands in 2012, I got to opportunity
to join the Department of Bioinformatics (BiGCaT) and work on Open PHACTS. I had visited the group in March 2011 because I had a COST action
workshop near Maastricht (about nanoQSAR) and the bioinformatics group did [WikiPathways](https://wikipathways.org/).

When I joined, there were already hundreds of pathways, originating from various collaborations (see below).
Around the winter break, the question came up who are the people who have drawn all these pathways. And on the new website
this is not actually that easy to see. You can [browse all pathways](https://www.wikipathways.org/browse/table.html), or look up
[author profiles](https://www.wikipathways.org/browse/authors.html), but not all authors have done the same amount of work.
Moreover, at various points of time, batches of pathways from those collaborators were added. Often, these were added
by the `MaintBot` account, which is routinely hidden, and then the author who shows up as first author, is not even
the original author. And then we still have a lot of homology-converted pathways. These are pathways translated to
some species from a model species. You can find them in [this repository](https://github.com/wikipathways/wikipathways-homology).

But nowadays I do a lot in the WikiPathways project, among other things generate the RDF and maintain the code that does so.
And I realized that we have author information in the RDF too (created by [Alex Pico](https://orcid.org/0000-0001-5706-2163).
So, the idea came up to see who the "first authors" are of the WikiPathways (mind the *MaintBot* issue), and what we know
about them. Many already had their ORCID profiles linked from their profile pages, making it easy to look up their
expertises.

Now, that was in January. But it turned out that the author information in the RDF worked fine in the `.ttl` file
of a single pathway, but that the *series ordinal* (e.g. 1 for being first author) was bound to the author, and
a SPARQL query would not be able to figure out on which pathways someone was first author. I fixed this somewhere
in January, so in the [February 10 release](https://github.com/wikipathways/wikipathways-help/discussions/221) the
improved data model was available.

Allow me to show what is now possible, with a few SPARQL queries. First, list the authors of a pathway, use
[this template](https://edu.nl/q9txc) for `WP10`:

```sparql
PREFIX dc:    <http://purl.org/dc/elements/1.1/>
PREFIX foaf:  <http://xmlns.com/foaf/0.1/>
PREFIX wpq:   <http://www.wikidata.org/prop/qualifier/>
PREFIX pav:   <http://purl.org/pav/>

SELECT ?pathway ?version ?ordinal ?author_ ?name ?orcid ?page WHERE {
  VALUES ?pathway { <https://identifiers.org/wikipathways/WP10> }
  ?author_ a foaf:Person ;
    wp:hasAuthorship ?authorship .
  ?authorship ^wp:hasAuthorship ?pathway ;
    wpq:series_ordinal ?ordinal .
  ?pathway pav:hasVersion ?pathway_ .
  ?pathway_ a wp:Pathway ; wp:isAbout / gpml:version ?version .
  OPTIONAL { ?author_ foaf:homepage ?page }
  OPTIONAL { ?author_ foaf:name ?name }
  OPTIONAL { ?author_ dc:identifier ?orcid }
} ORDER BY ASC(?pathway) ASC(?ordinal)
```

We can see who the 8 people are who contributed to this pathway (we cannot actually see here what they contributed), and many
authors are member of the WikiPathways review team who focus more on technical quality than the biology. The first author,
however, often is the person who contributed most of the biological knowledge in the pathway, in this case
[Akhilesh Pandey](https://www.wikipathways.org/authors/A.Pandey) from the NetSlim collaboration
(see doi:[10.1093/database/bar032](https://doi.org/10.1093/database/bar032)):

![](/assets/images/wikipathways_authorList.png)

## Collaborations

Over time, multiple collaborations have taken place, like the one with NetSlim from the above query. In these collaborations,
the knowledge may not be digitized in WikiPathways as GPML by the biological experts. That encoding regularly is done
by others, but with those experts ensuring the quality. The following collaborations are examples, and
[a fuller list is found online](https://www.wikipathways.org/browse/communities.html):

* [WormBase](https://www.wikipathways.org/communities/wormbase_approved.html) (doi:[10.1093/nar/gkt1063](https://doi.org/10.1093/nar/gkt1063))
* [LIPID MAPS](https://www.wikipathways.org/communities/lipids.html) (doi:[10.1093/nar/gkad896](https://doi.org/10.1093/nar/gkad896))
* [Inherited Metabolic Disorders](https://www.wikipathways.org/communities/imd.html) (doi:[10.1007/978-3-030-67727-5_73](https://doi.org/10.1007/978-3-030-67727-5_73))
* [Micronutrients](https://www.wikipathways.org/communities/micronutrients.html) (doi:[10.1007/s12263-010-0192-8](https://doi.org/10.1007/s12263-010-0192-8))

We have collaborated with Reactome on various occassions (e.g. see doi:[10.1371/journal.pcbi.1004941](https://doi.org/10.1371/journal.pcbi.1004941) and
doi:[10.1007/s12263-010-0192-8](https://doi.org/10.1007/s12263-010-0192-8)), around plants (e.g. see doi:[10.1186/1939-8433-6-14](https://doi.org/10.1186/1939-8433-6-14)),
around rare diseases in projects like [EJP-RD](https://www.ejprarediseases.org/) and [ERDERA](https://erdera.org/), and around SARS-CoV-2.
For that, see these communities:

* [Reactome](https://www.wikipathways.org/communities/reactome.html)
* [Plants](https://www.wikipathways.org/communities/plants.html) (see also [this DBCLS BioHackathon 2025 paper](https://doi.org/10.37044/osf.io/m37f2_v1))
* [Rare Diseases](https://www.wikipathways.org/communities/rarediseases.html)
* [COVID-19](https://www.wikipathways.org/communities/covid19.html)

And then there are pathways in WikiPathways supported by a full paper, but I will leave that for a later moment.

## Author statistics

Back to the authors, because the new RDF model allows a few more nice queries. For example, we can check the number
of pathways with a certain number of authors, and then we find with the following query that there are two pathways
with up to 18 authors ([try here](https://edu.nl/mhjbw)):

```sparql
PREFIX dc:    <http://purl.org/dc/elements/1.1/>
PREFIX wpq:   <http://www.wikidata.org/prop/qualifier/>

SELECT ?atLeast (COUNT(DISTINCT ?pathway) AS ?count) WHERE {
  ?author_ a foaf:Person ;
    wp:hasAuthorship ?authorship .
  ?authorship ^wp:hasAuthorship ?pathway ;
    wpq:series_ordinal ?atLeast .
} GROUP BY ?atLeast
  ORDER BY ASC(xsd:integer(?atLeast))
```

We can also look at the [list of authors](https://edu.nl/fkwy9), sorted by the number of pathways they are noted as first author on.
allong with their profile page on ORCID number:

```sparql
PREFIX dc:    <http://purl.org/dc/elements/1.1/>
PREFIX foaf:  <http://xmlns.com/foaf/0.1/>
PREFIX wpq:   <http://www.wikidata.org/prop/qualifier/>
PREFIX pav:   <http://purl.org/pav/>

SELECT (COUNT(DISTINCT ?pathway) AS ?count) ?name ?orcid ?page WHERE {
  VALUES ?ordinal { "1" }
  ?author_ a foaf:Person ;
    wp:hasAuthorship ?authorship .
  ?authorship ^wp:hasAuthorship ?pathway ;
    wpq:series_ordinal ?ordinal .
  ?pathway pav:hasVersion ?pathway_ .
  ?pathway_ a wp:Pathway ; dcterms:identifier ?version .
  OPTIONAL { ?author_ foaf:homepage ?page }
  OPTIONAL { ?author_ foaf:name ?name }
  OPTIONAL { ?author_ dc:identifier ?orcid }
} GROUP BY ?ordinal ?name ?orcid ?page
  ORDER BY DESC(?count)
```

Is this the full story? No, of course not. There are so much details yet uncovered, but it gives a bit more
insight of where the biological knowledge in WikiPathways is coming from.

Want more peer review of the content? Then why not help setup a new community? Just ping me or
[Martina](https://www.wikipathways.org/authors/Mkutmon).
