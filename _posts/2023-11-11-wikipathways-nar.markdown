---
layout: post
title:  "New paper: \"WikiPathways 2024: next generation pathway database\""
date:   2023-11-11
tags: wikipathways doi:10.1093/NAR/GKAD960 git
image: /assets/images/wp-gpml-change-workflow.png
---

This week the next [WikiPathways](https://wikipathways.org/) [NAR Database](https://academic.oup.com/nar/search-results?f_TocHeadingTitle=Database+Issue)
issue paper was published (doi:[10.1093/nar/gkad960](https://doi.org/10.1093/nar/gkad960)). It is the next
paper in a series of papers about the evolution of the Open Science project for
making biological pathways available in a Open and FAIR way. This year, it described
that significant move away from [MediaWiki](https://en.wikipedia.org/wiki/MediaWiki).
It simply was too costly to keep up with the upstream code base (think: more than 200
thousand euro costly). This paper describes a transition to a modular system with
[Jekyll](https://en.wikipedia.org/wiki/Jekyll_(software)) and Markdown as
new platform technologies. The full details are available as open notebook science:
everything is basically a git repository.

The is the workflow of what the new platform does when a new pathway (version) gets
added to WikiPathways:

![Workflow that is triggered by an added or changed GPML file, eventually triggering an update of the website.](/assets/images/wp-gpml-change-workflow.png)

The upgrade of the whole stack is, however, in full swing. Not everything has
migrated yet and the RDF generation is not for example.

