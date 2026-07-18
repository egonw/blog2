---
layout: post
title:  "Critical mass for Open Notebook Science wikis by prepopulation with RDF data"
date:   2010-06-26
blogger-link: https://chem-bla-ics.blogspot.com/2010/06/critical-mass-for-open-notebook-science.html
doi: 10.59350/bbxyy-j5334
tags: openscience opendata sparql wiki gsoc
---

One of the problems with Open Data, - Source, and Standards ([ODOSOS](http://chem-bla-ics.blogspot.com/2007/10/why-odosos-is-important.html)) is
to get critical mass: for the project to move forward, you need both a good user community and an active developers community. The first is the
crucial reward for the latter: people using your work is the incentive. Sometimes, a project does not succeed in doing that; Rich was
[questioning](http://depth-first.com/) if his [ChemPedia](http://chempedia.com/) project [built up enough mass](http://depth-first.com/articles/2010/06/22/what-about-chempedia).

This also applies to wikis. [WikiPedia](http://wikipedia.org/) clearly has enough critical mass, but is struggling with scaling, which is another
problem you can encounter. Building a dedicated, domain specific wiki allows you to do things the way you like. For example, the can be used to
build up the knowledge base around a specific problem. For example, HIV drugs (see [HIVdb](http://hivdb.stanford.edu/) as an example knowledge base).
The wiki could contain information you need for your data analysis. The developers team will likely be small, but the data will be highly curated.
You are basically both the developer and the user community. Hopefully, in good [Open Notebook Science](http://en.wikipedia.org/wiki/Open_Notebook_Science)
manner, things will grow, and others will join in on building the knowledge base.

[Semantic MediaWiki](http://semantic-mediawiki.org/wiki/Semantic_MediaWiki) bridges the human readable wiki content, with machine readable RDF
content. This wiki does require some additional annotation, but at the same time makes important facts machine readable. The
[Bioclipse Wiki](http://wiki.bioclipse.net/) is using it, though we are not yet taking advantage of the RDF exposure.

Now, returning to the critical mass aspect we started with. Samuel, who did a project with me on reasoning with
[Prolog in Bioclipse](http://saml.rilspace.org/content/3rd-project-update-integrating-swi-prolog-for-semantic-reasoning-in-bioclipse), is now
doing a [Google Summer of Code](http://en.wikipedia.org/wiki/Google_Summer_of_Code) [project](http://saml.rilspace.org/tags/gsoc2010)
(is there any significance in the fact that three [Bioclipse](http://www.bioclipse.net/) developers are student or have been mentor in the GSoC? :)
within the Semantic MediaWiki project. In particular, one of the things he was just working on, is the
[import of RDF into a wiki](http://saml.rilspace.org/populating-smw-from-rdfxml-first-test).

Oh goodies! That is pretty cool, don't you think? Just pull together RDF from your field of interest, drop it on the wiki, and you have your
initial wiki the experts can continue to curate, add facts, etc. He already told me about his plans to add a
[SPARQL](http://en.wikipedia.org/wiki/SPARQL) end point for the Semantic MediaWiki software.
