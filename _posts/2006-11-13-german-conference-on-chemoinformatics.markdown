---
layout: post
title:  "German Conference on Chemoinformatics 2006: Day 1 and 2"
date:   2006-11-13
modified_date: 2024-08-24
blogger-link: https://chem-bla-ics.blogspot.com/2006/11/german-conference-on-chemoinformatics.html
tags: cheminf conference openscience bioclipse cdk taverna java
---

The [2nd German Conference on Chemoinformatics](http://scholle.oc.uni-kiel.de/users/cic/tagungen/workshop06/index.html)
started yesterday, with two chemoinformatics tutorials: one on industrial chemoinformatics (I saw this presentation
before... not sure when), with a good overview on integrating different information sources; the second one was about
opensource chemoinformatics by [Christoph Steinbeck](http://wiki.cubic.uni-koeln.de/blog/index.php) (being involved
in opensource chemoinformatics for almost 10 years now!), which included a [Bioclipse](http://www.bioclipse.net/)
demo (by me) and a demo by Thomas Kuhn on the [CDK](http://cdk.sf.net/) based chemoinformatics plugin to
[Taverna](http://taverna.sf.net/). Other opensource projects of the [Blue Obelisk](http://www.blueobelisk.org/)
movement were mentioned and a few outside it too.

The conference is in honor of the life work by [Prof. Gasteiger](http://www2.chemie.uni-erlangen.de/), who gave an
overview of chemoinformatics in his group, Germany and Europe. He stressed the need of education in chemoinformatics,
like in [Obernai](http://wiki.cubic.uni-koeln.de/blog/pivot/entry.php?id=12). He also highlighted that we, today,
are still solving the same problem as 30 years ago. Which is true, which is why this channel is called
[Chem-bla-ics <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/), trying to solve that problem. When asked if opensource chemoinformatics
form the start would have addressed this, he replied that he requires people to cooperatively do research with his
group; opensource clearly cannot enforce that.

# Day 2

Todays program had a number of interesting presentations (I, unfortunately, missed the first presentation, so
have to visit that group soon now, to make up for that.) [Prof. Aires-de-Sousa](http://www.dq.fct.unl.pt/staff/jas/introduction.htm)
showed his work on MOLMAP for mapping metabolic networks ([KEGG](http://www.genome.jp/kegg/) really, see my
[earlier blog <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/04/04/mining-kegg-pathway-database-with-self.html)), and showed,
just as proof of principle, classification of organisms based on this.

J. Weisser talked about docking, still an obligatory topic. This work really showed two new approaches: the use
of QM partial charges (the example showed an improvement in RMSD of a factor 10, not very statistical, but
promising indeed); the second was the fact that water does not like to be in tight spots, because of reduced
possibilities for hydrogen bonding. A concept common in understand supramolecular phenomenon, but I have not
seen this applied to docking before. But I am no expert in that field. M. Wagner showed work on using KEGG
data to estimate likely metabolites, and the use in reducing effects of metabolic degradation. T. Schroeter
introduced me to [gaussian processes](http://www.gaussianprocess.org/), a new data modeling method. Quite
embarrassing to get introduced to such, as being specialized in modeling methods for chemical problems.

The poster session was, as normally, really exhausting, talking to a lot of people. Having a booth at the exhibition
on opensource chemoinformatics added a nice twist to this. I therefore skipped the FIZ-award winner lectures, so I
hope someone else will blog about those.

One last note: [Sun started releasing their Java platform under the GPL license](http://www.sun.com/software/opensource/java/).
[Jim](http://wwmm.ch.cam.ac.uk/blogs/downing/), seems that they [proved me wrong <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/10/25/being-good-opensource-user.html).
The class library is still not GPL, but is expected to become licensed such somewhere in the first half of next year.
