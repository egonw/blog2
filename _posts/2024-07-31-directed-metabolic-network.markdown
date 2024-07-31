---
layout: post
title:  "New paper: \"Discovering life's directed metabolic (sub)paths to interpret human biochemical markers using the DSMN tool\""
date:   2024-07-31
tags: wikipathways doi:10.1039/D3DD00069A metabolomics
image: /assets/images/d3dd00069a-f12_hi-res.png
---

I am still catching up with a lot of work, and found out I actually had forgotten to blog about this cool article
by [Denise Slenter](https://scholar.google.com/citations?user=Le-4tuQAAAAJ&hl): "Discovering life's directed metabolic (sub)paths to
interpret human biochemical markers using the DSMN tool" (doi:[10.1039/D3DD00069A](https://doi.org/10.1039/D3DD00069A)).
This paper explains how various open science resources ([Wikidata](https://www.wikidata.org/),
[Reactome](https://reactome.org/), [WikiPathways](https://www.wikipathways.org/)) are used to visualize
the biological story of the data from two metabolomics experiments archived in MetaboLights.

Using [Neo4J](https://neo4j.com/) and [Cytoscape](https://cytoscape.org/) she visualizes the data onto a network created with
RDF, [SPARQL](https://en.wikipedia.org/wiki/SPARQL) from the above resources:

![](/assets/images/d3dd00069a-f12_hi-res.png)

The whole approach uses open science, making the work very reproducible. This is essential, as our knowledge
about metabolic processes continues to grow, if not only for the human lipids, but also from molecular
imaging technologies. Moreover, a lot of biological detail is yet to be encoded on pathway databases,
such as cellular location of proteins and metabolites, which proteins are expressed in which tissue, or
the kinetics of metabolic reactions. All knowledge that can be pulled it via knowledge graphs becomes
immediately available by using this [FAIR](https://en.wikipedia.org/wiki/FAIR_data) approach.

One last note, the reader may notice a focus on the shortest path. Of course, the biological relevant
path may not be the "shortest" path. But from a network analysis perspective that question is purely
academic. Neo4J, like other tools, support finding all paths. But validation which paths (the shorter
or any of the longer) is biologically most relevant first depends on actually more biological
knowledge to become FAIR. After this, it is just push button.
