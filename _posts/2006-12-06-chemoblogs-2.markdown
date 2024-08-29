---
layout: post
title:  "Chemo::Blogs #2"
date:   2006-12-06
blogger-link: https://chem-bla-ics.blogspot.com/2006/12/chemoblogs-2.html
tags: blog rdf textmining cb justdoi:10.1371/journal.pcbi.0020121 justdoi:10.1186/1751-0473-1-1
  justdoi:10.1371/journal.pcbi.0020087
---

Because no one picked up my [Chemo::Blogs](http://chem-bla-ics.blogspot.com/2006/09/chemoblogs-1.html) suggestion, I will now
officially claim the blog series title. However, unlike the original [Bio::Blogs](http://bioblogs.wordpress.com/) series,
I will not summarize interesting blogs, but just spam you with websites I recently marked as
[toblog on del.icio.us](http://del.icio.us/egonw/toblog).

## Semantics and Text Mining

[Evan Prodromou](http://evan.prodromou.name/) wrote about [RDFa vs microformats](http://evan.prodromou.name/RDFa_vs_microformats).
The latter are commonly used in [enhancing blog semantics](http://chem-bla-ics.blogspot.com/2006/02/tagging-blog-items.html), and
for example used by [PostGenomic.com](http://postgenomic.com/wiki/doku.php?id=markup). While RDFa is more explicit, e.g. by using
namespaced markup, we have to wait until XHTML2 to see it working. I do not think chemists are using tags a log yet, but let me
propose the following microformats: <span class="inchi">[1/CH4/h1H4](http://google.com/search?q=1/CH4/h1H4)</span> and
<span class="chemicalcompound">methane<span>. Standard JavaScripts and CSS scripts will then do the rest. (Think: addressing newlines,
auto [googling-for-inchi](http://wwmm-svc.ch.cam.ac.uk/wwmm/html/googleinchiserver.html), etc).

The reason why using microformats is interesting, is text mining, of various kinds. Whether it is setting up a molecule-article
link database, or [find hot molecules in blogspace](http://chem-bla-ics.blogspot.com/2006/02/hacking-inchi-support-into.html),
adding semantics will help tools like [OSCAR3 to mine chemistry](http://chem-bla-ics.blogspot.com/2006/09/chemical-archeology-oscar3-to.html).
Some time ago [OTMI was proposed by Nature](http://chem-bla-ics.blogspot.com/2006/05/open-text-mining-interface-and.html),
and they now set up a [dedicated web site](http://www.opentextmining.org/wiki/Main_Page) to explain there view on text mining.
[Zack Rosen](http://www.zacker.com/) has a good idea why [RDF Semantic web research isn't working](http://www.zacker.org/semantic-web-research-isnt-working).

## Blogspace

There are a few new chemistry blogs I want to mention (and already added to [Chemical blogspace](http://chem-bla-ics.blogspot.com/2006/08/chemical-blogspace.html)):
[ChemBark](http://blog.chembark.com/), [lirico](http://www.lirico.co.uk/wp/) which has an interesting
[chemoinformatics section](http://www.lirico.co.uk/wp/?cat=8), and [The Curious Wavefunction](http://ashutoshchemist.blogspot.com/).
Worth reading indeed.

[Pierre's YOKOFAKUN](http://plindenbaum.blogspot.com/) deserves a paragraph of his own. He recently blogged about
[bio2rdf](http://plindenbaum.blogspot.com/2006/11/bio2rdf.html) which provides an [RDF interface to biochemical knowledge](http://bio2rdf.org/)
via [Life Science Identifiers](http://lsid.sourceforge.net/) (LSID), [OBOEdit](http://plindenbaum.blogspot.com/2006/11/wwwoboeditorg.html)
which is a Java-based ontology editor, and [Amadea](http://plindenbaum.blogspot.com/2006/12/visual-unix-pipeline.html)
which is a [Taverna](http://taverna.sf.net/)- and [KNIME](http://www.knime.org/)-like tool for setting up UNIX pipes.

## Online EMBL Symposium

A few EMBL PhD students are having the [First Online EMBL PhD Symposium](http://virtualsymposium.predocs.org/) (catchy name, or ... ;)
Anyway, discussions are held on IRC, and it has a rather interesting Web2.0 session. All
[media is available on the website](http://virtualsymposium.predocs.org/media) but requires registration right now.
After the conference it will become open access to all. [Jean-Claude](http://www.blogger.com/profile/6833158) contributed
*The UsefulChem Project: Open Source Chemistry Research using Blogs and Wikis* to the
[Participants' Contributions section](http://virtualsymposium.predocs.org/media/participants-contributions/), and I had
a poster on *Distributing molecular information over the Internet*, discussing CMLRSS, blog aggregators, CML and other things.
The IRC session was logged and is [available here](http://virtualsymposium.predocs.org/chat/discussion-about-the-influence-of-web-2-0-on-science-tuesday-december-6-2006-16-00-cet/).

## Literature

Finally, I want to mention three recent articles. First one is a recent write up by Bourne and Friedberg about
*Ten Simple Rules for Selecting a Postdoctoral Position* (DOI: [10.1371/journal.pcbi.0020121](https://doi.org/10.1371/journal.pcbi.0020121)).
With the end of my current postdoc position nearing, rather useful reading. Some time ago I blogged about a
[New open access journal Source Code for Biology and Medicine](http://chem-bla-ics.blogspot.com/2006/05/new-open-access-journal-source-code.html),
and the journal is now up and running. Details can be read in the first editorial (DOI: [10.1186/1751-0473-1-1](https://doi.org/10.1186/1751-0473-1-1)).
The third article I would like to mention is *Scientific Software Development Is Not an Oxymoron* by Baxter
(DOI: [10.1371/journal.pcbi.0020087](https://doi.org/10.1371/journal.pcbi.0020087)), though I do not think it has new insights.

OK, this was a rather lengthy write up, but really needed to clean up my toblog section :)
