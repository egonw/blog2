---
layout: post
title:  "New paper: \"Wikidata subsetting: approaches, tools, and evaluation\""
date:   2024-02-13
tags: wikidata doi:10.3233/SW-233491 scholia doi:10.3897/RIO.5.E35820
doi: 10.59350/57rv7-5m756
image: /assets/images/wikidata_subsetting_features.png
---

Just before the end of the year, the *Wikidata subsetting: approaches, tools, and evaluation* paper
by Seyed Amir Hosseini Beghaeiraveri *et al.* got published (doi:[10.3233/SW-233491](https://doi.org/10.3233/SW-233491)).
I am really excited our group (i.e.
[Ammar](https://orcid.org/0000-0002-8399-8990) and [Denise](https://orcid.org/0000-0001-8449-1318))
has been able to contribute to this. I think it also is a great example
of the power of hackathons to bring together people.

To me, subsetting of Wikidata (or any large knowledge graph) is important for a couple of reasons.
First, there can be practical reasons. Scholia, for example, is computationally expensive, and the idea
we explore in the Alfred P. Sloan Foundation grant for Scholia (doi:[10.3897/rio.5.e35820](https://doi.org/10.3897/rio.5.e35820))
was that a subset of Wikidata would make it more performant and potentially
more environmental-friendly.

A second reason is more about the scientific process. When doing an analysis and when you want to make
the reasoning transparent, you want to share the analyzed data as part of the research output (basically, the "data").
For example, the data may have undergone some curation, or you combined data from two or more different
sources. And you will want to share this as part of the scientific process. Resharing a full dump
of the larger knowledge base would not be practical for at least two reasons: duplication of huge data,
and a lot of unrelated content makes it hard for peers to find the bits of interest to the study.

Subsetting may be useful here. This paper evaluates a number of different subsetting approaches.
Myself, I am particularly excited about the idea that we can take a shape expression (e.g. [ShEx](https://shex.io))
as input. I still love the idea that I take the SPARQL queries in my analyses, convert that into
shapes automatically, and then get a subet that returns the exact same results as the query would
on the full dataset.
