---
layout: post
title:  "New paper: From papers to RDF-based integration of physicochemical data and adverse outcome pathways for nanomaterials"
date:   2024-05-20
tags: fair rdf doi:10.1186/S13321-024-00833-0 doi:10.14573/ALTEX.2102191 doi:10.3390/NANO10102068 erm
  doi:10.1186/S13321-022-00614-7 doi:10.3389/FPHY.2023.1271842 doi:10.3762/BJNANO.6.165
  doi:10.1089/AIVT.2021.0010
image: /assets/images/13321_2024_833_Fig1_HTML.png
doi: 10.59350/jdj8r-h6187
---

Making something FAIR is hard, particularly when you do more than making something findable. We've seen before that
making something usefully findable [requires deep indexing](https://chem-bla-ics.blogspot.com/2020/10/new-paper-semi-automated-workflow-for.html?q=serena),
and already that continues to be difficult, because we are not seeing it enough.
So, when I thought convert a [paper led by Hoet's lab in Leuven](https://chem-bla-ics.blogspot.com/2021/05/new-strategy-towards-generation-of.html)
into machine-actionable RDF to make it FAIR, I gravely underestimated the amount of work.
[Jeaphianne](https://scholia.toolforge.org/author/Q99306396) et al. did an awesome job on this work
(doi:[10.1186/s13321-024-00833-0](https://doi.org/10.1186/s13321-024-00833-0)).

The idea was simple: write up which nanomaterial (type) activates which molecular initiating event.
It would simply annotate each material with a unique identifier to link it to databases like
[eNanoMapper](https://enanomapper.adma.ai/) and [NanoCommons](https://doi.org/10.3389/fphy.2023.1271842)
and it would use unique identifiers for the
[Adverse Outcome Pathway](https://chem-bla-ics.blogspot.com/2022/05/new-providing-adverse-outcome-pathways.html)) (AOP) key events.
As such, it would make a direct link in the growing linked open data cloud between the AOPs
and the nanomaterial databases.

Unfortunately, it was quickly discovered that actually reusing this new datasets requires rich annotation (metadata!)
of the materials and the materials from the source paper were not yet in material databases.
And then the cumbersome start was started, resulting in a very rich data model describing the
key events, the materials, the assays used, and the original papers themselves:

![](/assets/images/13321_2024_833_Fig1_HTML.png)

But the work has not finished yet. The paper assigned [ERM identifiers](https://chem-bla-ics.blogspot.com/2022/09/nanomaterial-identifiers-erm-identifier.html)
to all included materials, and now these need to be added to new [ERM Identifier Database](https://nanocommons.github.io/erm-database/)
under development.
