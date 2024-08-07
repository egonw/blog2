---
layout: post
title:  "CiTO updates: Wakefield and WikiPathways"
date:   2024-08-07
tags: cito wikipathways wikidata justdoi:10.1016/S0140-6736(97)11096-0 doi:10.21105/JOSS.02558
  doi:10.1007/978-3-319-70407-4_36 justdoi:10.5281/ZENODO.13166142 doi:10.1093/NAR/GKAD960
image: /assets/images/wakefieldCitations.png
---

This summer I am trying to finish up some smaller projects that I did not have time for to finish, with
mixed successes. I am combing this with a nice Dutch staycation, and I already cycled in
[Overijssel](https://en.wikipedia.org/wiki/Overijssel) and in south-west [Friesland](https://en.wikipedia.org/wiki/Friesland)
and learning about their histories.
But this post is about an update on my Citation Typing Ontology use cases. And I have to say,
a [mention by Silvio Peroni](https://www.youtube.com/watch?v=1kD7jkyDr3s) is pretty awesome, thanks!

First, the bad news. I still did not get around to the following to tasks I have. First, I need to write up a
step-by-step guide how to create [CiTO nanopublications](https://chem-bla-ics.linkedchemistry.info/2024/04/02/open-science-retreat-2.html)
and matching draft article. Second, I still need to work out how to update the JATS workflow for
[CiTO annotation in BioHackrXiv](https://chem-bla-ics.linkedchemistry.info/2021/11/15/biohackathon-europe-2021-1-cito.html).

## Wakefield

Let's first start with a dataset. Peroni mentioned a study they did into why the famous Wakefield paper
(doi:[10.1016/S0140-6736(97)11096-0](https://doi.org/10.1016/S0140-6736(97)11096-0)) is cited. They published
their data set on Zenodo (doi:[10.5281/zenodo.13166142](https://doi.org/10.5281/zenodo.13166142)) with CCZero,
so I imported it into [Wikidata](https://wikidata.org/). Well, at least the citations
of articles already in Wikidata. I used a Bacting (doi:[10.21105/joss.02558](https://doi.org/10.21105/joss.02558))
[script](https://gist.github.com/egonw/379c72a49517716712b70bdee0d845ce) and it actually was quite short.
In the end, this added some 500 new citation intentions to Wikidata, now at almost [2000](https://scholia.toolforge.org/cito/).
This is also the third dataset with explicit CiTO intention annotations (see also
[this post](https://chem-bla-ics.linkedchemistry.info/2023/04/02/cito-updates-4-annotations-in-datasets.html)).

This is what the [CiTO section of the Wakefield paper](https://scholia.toolforge.org/work/Q28264479#cito-incoming)
in [Scholia](https://scholia.toolforge.org/) (doi:[10.1007/978-3-319-70407-4_36](https://doi.org/10.1007/978-3-319-70407-4_36))
now looks like:

![](/assets/images/wakefieldCitations.png)

## WikiPathways

A second thing I want to show is a potentional CiTO intention annotation dataset. Almost two years ago
[Alex Pico](https://qoto.org/@xanderpico) started a new [WikiPathways](https://wikipathways.org/)
feature as part of the new website (doi:[10.1093/NAR/GKAD960](https://doi.org/10.1093/NAR/GKAD960))):
[a list of citations to specific pathways](https://github.com/wikipathways/wikipathways-database/commit/97f7df0057d312f0c332a9ff290c11684bf252d5)
(in WikiPathways). Alex' setup is fully automated and using [PubMed Central](https://www.ncbi.nlm.nih.gov/pmc/)
and find mentions in figure captions:

*Beyond citations to previous WikiPathways journal articles, we have identified 1228 mentions of a total of 582
unique WikiPathways pathway model identifiers, e.g. WP4846, in PubMedCentral articles over the past 13 years.*

The file format is a pretty basic YAML file:

![](/assets/images/citedin_yaml.png)

Additional mentions are found in the main text and tables in the article. These are not always picked up.
These can be added manually. Over the past months and the past two weeks particularly, I have been adding
additional mentions, not listed yet. We now passed 1500 mentions but I cannot easily give the other
statistics.

So, in the next few days I plan to do two things: 1. generate RDF for the YAML file and make that part of the
[monthly WikiPathways RDF release](https://data.wikipathways.org/current/rdf/); 2. extract citations and
offer this back to [the OpenCitations project](https://opencitations.net/); and, 3. add the citations
into Wikidata. Of course, all with `cito:usesDataFrom` :)

There is a fourth things that I am still thinking about. I can also use the above data the annotation
citations to the WikiPathways papers if they also mention a WikiPathways identifier as `cito:usesDataFrom`,
but I cannot fully oversee the implications of that. What do you think?
