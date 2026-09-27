---
layout: post
title:  "Oscar text mining in Taverna"
date:   2010-10-21
modified_date: 2026-09-27
doi: 10.59350/7njvw-s6q24
blogger-link: https://chem-bla-ics.blogspot.com/2010/10/oscar-text-mining-in-taverna.html
tags: oscar taverna inchikey:OKKJLVBELUTLKV-UHFFFAOYSA-N inchikey:LFQSCWFLJHTTHZ-UHFFFAOYSA-N inchikey:SPSSULHKWOKEEL-UHFFFAOYSA-N
image: /assets/images/oscarTaverna.png
---

One of the goals of my [project in Cambridge <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/10/15/working-on-oscar-for-three-months.html)
is to make [Oscar](http://oscar3-chem.sourceforge.net/) available as [Taverna](http://taverna.sf.net/) plugin
([source code](https://bitbucket.org/egonw/oscar4-taverna), [Hudson build](https://hudson.ch.cam.ac.uk/job/oscar4-taverna/)).
I have progressed somewhat, but still struggling with getting the update site working. The plugin actually installs into
[Taverna 2.2.0](http://www.mygrid.org.uk/2010/07/taverna-220-workbench-and-command-line-tool-are-released/), but the
activities do not show up. While this is work in progress, and the other project goal is refactoring, a current demo
workflow looks like:

![](/assets/images/oscarTaverna.png)

Example input would be: *This is a list of ethanol, methanol, and 2,4,6-trinitrotoluene.*

The plain text input can be linked to the pdf2text [SADI service](http://www.slideshare.net/markmoby/sadi-in-taverna-tutorial),
and the CML is suitable for the [CDK-Taverna plugin <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/03/29/cdk-taverna-paper-published.html),
which is currently being updated by Andreas, Achim, and [Christoph](http://www.steinbeck-molecular.de/steinblog/) for
Taverna 2.2. As soon as the update site is properly working, I will upload a demo workflow to
[MyExperiment.org](http://www.myexperiment.org/).

I guess the first next activity (node in the workflow) will be around the dictionaries, as the
[OPSIN](http://opsin.ch.cam.ac.uk/) activity converts only IUPAC names into connection tables. I was told OPSIN parses 97%
of the IUPAC names it finds, and when it does, it does almost 100% correct. Want to challenge the code?
Use [this web service](http://opsin.ch.cam.ac.uk/).
