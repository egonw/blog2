---
layout: post
title:  "RDF-powered QSAR wizard: SPARQL end points providing wizard content"
date:   2010-03-15
blogger-link: https://chem-bla-ics.blogspot.com/2010/03/rdf-powered-qsar-wizard-sparql-end.html
doi: 10.59350/pdv58-fss83
tags: rdf chembl sparql bioclipse qsar
image: /assets/images/chemblQSARwizard.png
modified_date: 2026-09-27
---

As you [know <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/03/04/rdf-jena-bioclipse-eclipse-zest-2-icons.html) from my blog, one of
the things I am working on is to push RDF functionality in [Bioclipse](http://www.bioclipse.net/), as I believe it to be the
missing link between [molecular chemometrics <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/03/01/todo-april-2nd-defend-my-phd-work.html)
and literature, databases, and other non-numerical information sources.

As part of the submission for the [SWAT4LS <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/11/25/swat4ls-wrapping-up-1.html) special
issue in the new [Journal of Biomedical Semantics <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/03/01/todo-april-2nd-defend-my-phd-work.html),
[Ola](http://bioclipse.blogspot.com/) hacked up a cool wizard that sets up a new [QSAR Project](http://wiki.bioclipse.net/index.php?title=QSAR_Project_with_automated_builds)
by downloading data directly from our [RDF node for the chEMBL data using SPARQL <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/02/09/chembl-rdf-1sparql-end-point.html).
The paper is based on the [SWAT4LS talk <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/11/21/swat4ls-linking-open-drug-data-to.html) I
gave, and the [proceedings paper](http://www.citeulike.org/user/egonw/article/6582022) that recently appeared. But with more
cool stuff, such as this [cool RDF graph <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/03/04/rdf-jena-bioclipse-eclipse-zest-2-icons.html)
browser that allows you to open up molecules from the RDF graph in a JChemPaint editor.

Well, this really nice New QSAR Project wizard was cool enough to trigger a I-want-more reaction, so I just had to hack it
up with some additional SPARQL functionality. So, the next version does not only use RDF and SPARQL to aggregate the QSAR
data set, it also uses SPARQL to make the wizard interactive. While the user is typing a target ID, the wizard will check
the SPARQL end point in the background and download the target's type, title and organism, as well as update the list of
activities the user can select depending on what the chEMBL database has for that target:

![](/assets/images/chemblQSARwizard.png)

The actual code base is pretty small, and that's what happens when you mash up the right technologies :)
