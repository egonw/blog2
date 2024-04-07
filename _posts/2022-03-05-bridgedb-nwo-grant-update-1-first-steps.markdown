---
layout: post
title:  "BridgeDb NWO grant update #1: first steps"
date:   2022-03-05
blogger-link: https://chem-bla-ics.blogspot.com/2022/03/bridgedb-nwo-grant-update-1-first-steps.html
tags: grant bridgedb openscience justdoi:10.1186/1471-2105-11-5
images: /assets/images/bridgedbWebserviceScratch.png
---

Last year, Denise, Tina, Marvin, and I received an [NWO Open Science](https://www.nwo.nl/en/researchprogrammes/open-science/open-science-fund)
grant ([203.001.121](https://www.nwo.nl/en/projects/203001121)) to improve the long running BridgeDb project, originally developed by Martijn van Iersel
(see doi:[10.1186/1471-2105-11-5](https://doi.org/10.1186/1471-2105-11-5)). Helena joined our group as research software engineer and will work
part-time on this grant. We started two weeks ago, so time for an update of results:

* the project started after writing our data management and software sustainability plans (mostly, GitHub+Zenodo)
* the project proposal has been submitted to [RIO Journal](https://riojournal.com/)
* created a private project in the [Maastricht University GitLab](https://gitlab.maastrichtuniversity.nl/) instance (with all tasks as issues, so that we can monitor progress)
* first patches by Helena to the [BridgeDb Java library](https://github.com/bridgedb/bridgedb)
* factored out the [BridgeDb Webservice](https://github.com/bridgedb/bridgedb-webservice) into a separate (unpretty, see topright screenshot) repository, so that the BridgeDb Java library compiles again
* Marvin update the [BridgeDb Docker](https://hub.docker.com/layers/bigcatum/bridgedb/3.0.13.20220304/images/sha256-ad373eae152806d0935b751bcd06216732c7e26d3c34efba5e6a388d48c37087?context=explore) with the latest BridgeDb 3.0.13 and the latest mapping files

It should be noted that FAIRplus has funded Chris's team to work on identifier mapping too. Luc, Lucas, and now Tooba in our team have been working
on Ensembl-based gene/protein identifier mappings and [FAIRplus Cookbook](https://fairplus.github.io/the-fair-cookbook/) recipes.

Not bad this progress in the first two weeks. We are ready now to start writing unit tests for much of the BridgeDb code. There were some, but a lot of code is used in production, but not formally tested. So far, the number of regressions due to updated libraries (dependencies) has been quite manageable. But with the work planned in this grant, we need more sustainable software, and therefore more unit testing. With the BridgeDb Webservice factored out, the code is compiling again and so is the code coverage testing.

The BridgeDb Webservice itself needs a rewrite from scratch. At least the mapping between underlying code (which we can reuse) and the REST calls. The library we used here has never been updated and I spent last weekend figuring out how to change the code, but gave up after two days. Rewriting is faster.
