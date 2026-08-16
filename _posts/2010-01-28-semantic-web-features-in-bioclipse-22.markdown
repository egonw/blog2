---
layout: post
title:  "Semantic Web features in Bioclipse 2.2"
date:   2010-01-28
modified_date: 2026-04-19
blogger-link: https://chem-bla-ics.blogspot.com/2010/01/semantic-web-features-in-bioclipse-22.html
doi: 10.59350/6m8qd-xed40
tags: java bioclipse rdf sparql rdfa
image: /assets/images/dbPediaMolTable.png
---

[Ola](http://www.blogger.com/profile/10379047094508592338) is releasing [Bioclipse <i class="fa-solid fa-box-archive fa-xs"></i>](http://web.archive.org/web/20100111032721/https://bioclipse.net/)
[2.2.0](http://sourceforge.net/projects/bioclipse/files/bioclipse2/bioclipse2.2.0/)
today, and asked me to show case the semantic web functionality in Bioclipse. I realized that I do not have a nice page showing the semantic web overview. But I did blog a lot about RDF functionality, so here's a list of pointers:

* [Bioclipse Manager for MyExperiment.org <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/11/04/bioclipse-manager-for-myexperimentorg.html)
* [Bioclipse, RDF and defeasible reasoning](http://chem-bla-ics.blogspot.com/2009/09/bioclipse-rdf-and-defeasible-reasoning.html) (see also [Samuel's blog](http://saml.rilspace.com/))
* [Bioclipse and SPARQL end points #2: MyExperiment <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/08/21/bioclipse-and-sparql-end-points-2.html)
* [Bioclipse and SPARQL end points <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/08/16/bioclipse-and-sparql-end-points.html)
* [Solubility Data in Bioclipse #2: handling RDF <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/02/22/solubility-data-in-bioclipse-2-handling.html)
* [Solubility Data in Bioclipse #3: Finding ChEBI IDs <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/02/27/solubility-data-in-bioclipse-3-finding.html)
* [Solubility Data in Bioclipse #4: Finding ChEBI IDs (Again, but better)](http://chem-bla-ics.blogspot.com/2009/03/solubility-data-in-bioclipse-4-finding.html)
* [/me is having Bioclipse/XMPP/RDF fun](http://chem-bla-ics.blogspot.com/2009/05/me-is-having-bioclipsexmpprdf-fun.html)

Or check this screenshot from [a Posterous post about a MyExperiment workflow
<i class="fa-solid fa-box-archive fa-xs"></i>](http://web.archive.org/web/20130310013833/http://egonw.posterous.com/molecules-in-dbpedia-visualized-with-bioclips):

![](/assets/images/dbPediaMolTable.png)

One thing I have not blogged about yet (I think), is that the Bioclipse RDF manager also understands RDFa now. Well, sort of... it relies on a webservice, but this is what the script looks like:

```javascript
model = rdf.createStore()
rdf.importRDFa(model, "http://egonw.github.com/")
rdf.saveRDFN3(model, "/Virtual/egonw.n3")
```

With support of SPARQL end points, and reading RDF from web resources directly (RDF/XML, N3, RDFa), Bioclipse is ready for the chemical semantic web.
