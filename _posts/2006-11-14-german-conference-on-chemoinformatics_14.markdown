---
layout: post
title:  "German Conference on Chemoinformatics 2006: Day 3"
date:   2006-11-14
modified_date: 2024-08-24
blogger-link: https://chem-bla-ics.blogspot.com/2006/11/german-conference-on-chemoinformatics_14.html
tags: cheminf conference justdoi:10.1021/ci060139e semweb
---

Just some short quites note about the third day (see [day 1 and 2 <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/11/13/german-conference-on-chemoinformatics.html)).
Today's program of the [German Conference on Chemoinformatics](http://scholle.oc.uni-kiel.de/users/cic/tagungen/workshop06/index.html)
started with a presentation by Rzepa about his work on a semantic wiki (DOI:[10.1021/ci060139e](https://doi.org/10.1021/ci060139e)),
which might be [online here](http://www.ch.ic.ac.uk/wiki/). (He recorded a podcast, but I have not seen it online yet.) I wish I could
see the sources of those wiki pages, to see how that system integrates RDF, but at least [Jmol](http://www.jmol.org/) is running fine.
The presentation by Couch showed the status of the [Materials Grid project](http://www.materialsgrid.org/), and how a guy called AgentX
does all the hard work. Ihlenfeldt updated us about the status of [PubChem](http://pubchem.ncbi.nlm.nih.gov/), and mostly on what they
had to do to keep the system from dying from its own success, for example using something called minimol. Googling does not seem to
help, as that points to a number of things, but not any PubChem webpage. I am still waiting for a European organization to set up a mirror.

After the coffee break, Kuhn showed a coarse grained force field, approximating molecules by hacking them up in fragment of 3-10 heavy atoms.
I guess, a bit like some small molecules force fields do for methyls. Fragments within a molecule are tied together by springs, and intra-
and intermolecular force field parameters by running MD runs on fragment pairs. Varnek argued that QSPR for melting point prediction has
reached a fundamental limited, with an RMSE of around 30 to 40 degrees Celsius, which makes it quite unreasonable to decide whether a
compound with a predicted melting point of 40 degrees is solid or fluid at room temperature.

You have to forgive me for not reporting on the afternoon session; I was tied up talking with people at our booth, talking about the CDK,
Taverna, Bioclipse, Jmol, other opensource chemoinformatics tools, and chemoinformatics in general. Very nice, but exhausting. I might
advise the organization to set up a blog aggregator next year, though I am not sure whether there are others blogging about this conference.
