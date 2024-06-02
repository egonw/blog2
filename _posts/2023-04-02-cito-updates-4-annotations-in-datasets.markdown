---
layout: post
title:  "CiTO updates #4: annotations in datasets"
date:   2023-04-02
modified_date: 2024-06-02
blogger-link: https://chem-bla-ics.blogspot.com/2023/04/cito-updates-4-annotations-in-datasets.html
tags: cito data scholia doi:10.1186/s13321-023-00683-2 justdoi:10.1186/s13321-023-00684-1 justdoi:10.1186/s13321-022-00656-x
  justdoi:10.1186/s13321-022-00673-w justdoi:10.1186/s13321-022-00677-6 doi:10.1186/s13321-023-00701-3
  justdoi:10.1162/QSS_A_00222 justdoi:10.5281/zenodo.5155219 doi:10.21105/joss.02558 doi:10.5281/ZENODO.7368209
image: /assets/images/Screenshot_20230402_085317.png
---

Okay, [the Pilot](https://jcheminf.biomedcentral.com/articles/10.1186/s13321-023-00683-2)
[is over](https://jcheminf.biomedcentral.com/articles/10.1186/s13321-023-00684-1) ending with 17 papers, 16 of which have CiTO
annotations (and so far 4 J.Cheminform. [papers](https://doi.org/10.1186/s13321-022-00656-x)
[after](https://doi.org/10.1186/s13321-022-00673-w) [the](https://doi.org/10.1186/s13321-022-00677-6)
[pilot](https://doi.org/10.1186/s13321-023-00701-3)), but my interest in the
[Citation Typing Ontology](http://purl.org/spar/cito) continues and we just need
[more adoption](https://chem-bla-ics.blogspot.com/2023/02/citation-typing-progress-but-we-need.html).

**Datasets as source of annotations**

So, here's a quick [Wikidata](https://wikidata.org/) update. I have been using Wikidata as infrastructure to collect and share CiTO
annotations (see also the below "Scholia patch" posts). Some time ago I recovered my CiteULike CiTO annotations and made this
[available on Zenodo](https://scholia.toolforge.org/work/Q115470140) (doi:[10.5281/zenodo.7368209](https://doi.org/10.5281/ZENODO.7368209)).

And while thinking about datasets with CiTO annotations, I found two other datasets. One was from an article in Portuguese and one from an
[article by Peroni et al.](https://scholia.toolforge.org/work/Q117369886) with
[this data file](https://zenodo.org/record/6885109). That data file is actually a zip, but inside the zip file is a CSV file with three
interesting columns: `cited_doi`, `citing_doi`, and `intext_citation.intent`. There are many more columns and I can highly recommend browsing
them. But these are the three I need to add data to Wikidata. The third column is free text, but using the CiTO for labels, making it
relatively easy to convert to [citation intentions from Wikidata](https://w.wiki/62sR)
(PS, thanks to [Fvtvr3r](https://www.wikidata.org/wiki/User:Fvtvr3r) for adding more!).

So, I had a cleaned file and started writing a Groovy Bioclipse script using [Bacting](https://doi.org/10.21105/joss.02558).
It basically does a few things: extract all DOIs, check which ones are in Wikidata, analyze the `intext_citation.intent` column content,
and then generate QuickStatements (see [this gist](https://gist.github.com/egonw/f74fd3bc1f6361434b042a4cac2a8089)). Out of the 600
lines from the input, it creates some 200 new CiTO-annotated citations in Wikidata between
[some 150 article pairs](https://scholia.toolforge.org/work/Q117357537#statements):

![](/assets/images/Screenshot_20230402_084711.png)

The ability to include CiTO annotations from datasets is another welcome boost for the CiTO statistics in Wikidata.
[This SPARQL query](https://w.wiki/6XQf) shows an overview of sources that support the CiTO intention annotation, but note that
a claim with a CiTO intention may also have CrossRef, PubMed, and COCI as reference. In those cases, they are primarily for
the citations and not the intention.

There are [now](https://scholar.social/@egonw/110124747053293502) (the [latest stats are here](https://scholia.toolforge.org/cito/#statistics))
**1202 citation intention** annotations in Wikidata for 992 citations from **405 articles in 199 venues**. Of these 27 articles have
explicit annotations in the article itself and are found in 4 venues, two journals and two preprint servers). These annotated citations
are to 510 articles in 190 different venues. [This Scholia patch](https://github.com/WDscholia/scholia/pull/2271) will add a new
statistics, the number of datasets providing citation intentions, of which there are (as discussed)
[currently](https://scholia.toolforge.org/topic/Q115470140) [two](https://scholia.toolforge.org/work/Q117357537) in Wikidata.
The latter two provide intentions for the majority of articles and are depicted in yellow in the below overview.

![](/assets/images/Screenshot_20230402_085317.png)

With an annotation in [an 1938 article by Alan Turing](https://www.wikidata.org/wiki/Q27638524)! I ran into this article in November 2011
noting an apparent duplicate title in his article list. I turned out an earlier article had a correction with the same name.
I added [this clarification](https://www.wikidata.org/w/index.php?title=Q27638524&diff=1527020358&oldid=984628387&diffmode=source):

![](/assets/images/Screenshot_20230402_090600.png)

This is very trivial citation intention data that publishers could provide as open data.

Okay, that will do for today. There are actually some really interesting things in the pipeline, but I will have to write about that later. I have some deadlines I should start looking at. Below is some extra reading.
Some more history

* 2021: [BioHackathon Europe 2021 #1: CiTO annotations in BioHackrXiv <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2021/11/15/biohackathon-europe-2021-1-cito.html)
* 2021: [Markdown template for the Journal of Cheminformatics with CiTO support](https://chem-bla-ics.blogspot.com/2021/03/markdown-template-for-journal-of.html)
* 2020: [CiTO updates #3: third paper in the collection and updated Scholia patch](https://chem-bla-ics.blogspot.com/2020/11/cito-updates-3-third-paper-in.html)
* 2020: [CiTO updates #2: annotation migration to Wikidata and first Scholia patch](https://chem-bla-ics.blogspot.com/2020/11/cito-updates-2-annotation-migration-to.html)
* 2020: [CiTO updates #1: first research paper in the Journal of Cheminformatics with CiTO annotation published](https://chem-bla-ics.blogspot.com/2020/11/cito-updates-1-first-research-paper-in.html)
* July 2020: [New Editorial: "Adoption of the Citation Typing Ontology by the Journal of Cheminformatics"](https://chem-bla-ics.blogspot.com/2020/07/new-editorial-adoption-of-citation.html)
* 2015: ["What You're Doing Is Rather Desperate"](https://chem-bla-ics.blogspot.com/2015/03/what-youre-doing-is-rather-desperate.html)
* 2012: [CiTO / CiteULike: publishing innovation <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2012/02/23/cito-citeulike-publishing-innovation.html)
* 2010: [CiteULike CiTO Use Case #1: Wordles <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/10/31/citeulike-cito-use-case-1-wordles.html)
* September 2010: [A list of things I miss in CiteULike <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/09/17/list-of-things-i-miss-in-citeulike.html)


