---
layout: post
title:  "XHTML+RDFa: chemical examples"
date:   2010-08-10
blogger-link: https://chem-bla-ics.blogspot.com/2010/08/xhtmlrdfa-chemical-examples.html
doi: 10.59350/kkvt7-zpm64
tags: html rdf
---

Steffen [asked](http://chem-bla-ics.blogspot.com/2010/08/xhtmlrdfa-template.html?showComment=1281418346085#c5562162287116420044)
me if I could also provide a few examples on how to actually put RDF triples in the HTML, as the
[template](http://chem-bla-ics.blogspot.com/2010/08/xhtmlrdfa-template.html) I gave yesterday is a mere empty canvas to draw the
triples on. There are actually [various examples](http://chem-bla-ics.blogspot.com/search?q=rdfa&updated-max=200)
in my blog, which I will summarize here.

Before I start, I like to put some emphasize on the following [RDFa](http://www.w3.org/TR/xhtml-rdfa-primer/) pattern. An RDF
resource that serves as subject is always mapped to a HTML element. This can be a div element, but also other elements, as we
will see in the example.

### A molecule SMILES

The [oldest RDFa example](http://chem-bla-ics.blogspot.com/2006/12/including-smiles-cml-and-inchi-in.html) in my blog is from
2006. That was almost two years before the final [Recommendation](http://www.w3.org/TR/2008/REC-rdfa-syntax-20081014), and
is not quite accurate anymore. But here's the correct version:

<script src="https://gist.github.com/517826.js?file=gistfile1.html">
</script>

This example shows how to embed the SMILES string CCO semantically. This example shows that the outer most span element is
used to define the subject of the [RDF triple](http://www.w3.org/TR/rdf-concepts/#section-triples), using the @about
attribute to define the [URI of the resource](http://www.w3.org/TR/rdf-concepts/#section-URI-Vocabulary): *#ethanol*.
Note that this URI is relative to the URI of the HTML page in which it is embedded. Later we will see an example with a full URI.

### But I don't want to hack HTML!

Yeah, fair point. Just make a point with your publisher when you submit a new paper. It is the duty of the publisher and
your software vendor to do this right. In 2008 I wrote a small [Ubiquity](https://wiki.mozilla.org/Labs/Ubiquity) script
to automagically
[convert an InChI into semantified HTML content](http://chem-bla-ics.blogspot.com/2008/09/ubiquity-fun-entering-semantic-markup.html).
But I am not sure this script still works. If interesting, let me know, and I will revive the Firefox thingy.

### And why would I want to do it anyway??

Because software can more easily understand what you mean. This is why Google is now pushing
[rich snippets](http://googlewebmastercentral.blogspot.com/2009/05/introducing-rich-snippets.html).
[Chemical blogspace](http://cb.openmolecules.net/) understands them too, allowing you to see
[blog posts about molecules on other webpages](http://chem-bla-ics.blogspot.com/2007/05/cb-comments-for-inchis.html).
With a simple bit of JavaScript you can link from your webpages, you can
[enrich your HTML sites with semantic chemistry](http://chem-bla-ics.blogspot.com/2007/01/chemistry-in-html-javascript-from.html) yourself.
[Bioclipse](http://www.bioclipse.net/) also has no problem with extracting
[the RDF from HTML](http://chem-bla-ics.blogspot.com/2010/01/semantic-web-features-in-bioclipse-22.html).
Even [Firefox can understand it](http://chem-bla-ics.blogspot.com/2010/07/scripts-logs-as-htmlrdfa-mix-free-text.html).
Really, there is no end to it.

Of course, why you should do this comes basically down to Molecular Chemometrics Principle #2, but I have not written that
on up yet (see also [McPrinciple #1](http://chem-bla-ics.blogspot.com/2010/08/molecular-chemometrics-principles-1.html)).

### Reporting problems with molecular representations

More recently, I reported about using RDFa in human readable log file for computations I am doing (see
[Scripts logs as HTML+RDFa: mix free text reporting with CSV](http://chem-bla-ics.blogspot.com/2010/07/scripts-logs-as-htmlrdfa-mix-free-text.html)). 
That code looks like:

<script src="https://gist.github.com/517889.js?file=gistfile1.html"></script>

This example uses a *div* element to host the subject resource. Again, the resource URI is relative to the URI of
the document, e.g. [this one](http://rdf.farmbio.uu.se/uppmax-cdk/results.html). We can also note a new attribute,
*@typeof*, which is here used to define the [rdf:type](http://www.w3.org/TR/rdf-schema/#ch_type) of the *#200234* resource.

This code snippet does not define the *um* namespace, which was done elsewhere in the HTML. Moreover, this
code snippet does not actually reuse existing ontologies, which is highly recommended. The
[upcoming RDF symposium in Boston](http://chem-bla-ics.blogspot.com/2010/06/it-is-my-great-pleasure-to-present-full.html)
will tell you all about chemical ontologies in the RDF world (see [this detailed program](http://egonw.github.com/acsrdf2010/),
which itself is HTML+RDFa!). But, if you would just overlook the ad hoc namespaces used, you might appreciate the
nesting: besides the compound (*#200234*), a second resource is defined (#error0). In total, this example contains six triples.

Meanwhile, the output simply looks like:

<div about="#200234" typeof="um:Compound">CID <span property="um:cid" datatype="xsd:integer">200234</span>: <span rel="um:hasProblem"><span about="#error0" typeof="um:Problem"><span property="um:hasElement">Ti</span><span property="um:hasIndex" datatype="xsd:integer">1</span></span></span></div>

### A molecule table

This third, and for now last, example shows several other features. This HTML snippet show a one entry
molecule table, very much like those molecular spreadsheets in Excel, but than right here in your webbrowser.
(Can you imagine what happens if we mash this up with
[JavaScript molecular viewers](http://depth-first.com/articles/2010/08/10/building-chemwriter-2-javascript-all-the-way-down)?
Enjoying the idea already :)

<script src="https://gist.github.com/517927.js?file=gistfile1.html"></script>

First of all, the [rdf.openmolecules.net](http://chem-bla-ics.blogspot.com/search?q=rdf.openmolecules.net) project
is used to construct an absolute URI for the molecule. The table then gives some properties of the molecule:
its name (using [Dublin Core](http://dublincore.org/), though perhaps [rdfs:label](http://www.w3.org/TR/rdf-schema/#ch_label)
is better), the boiling point (nicely encoded as *t0* in this 1947 paper), two cheminformatics descriptors, and
the SMILES, using the same approach as the first example in this post.

The output of this table looks like:

<table xmlns="http://www.w3.org/1999/xhtml" xmlns:cc="http://github.com/egonw/cheminformatics.classics/1/#" xmlns:dc="http://purl.org/dc/terms/" xmlns:chem="http://www.blueobelisk.org/chemistryblogs/">
  <tbody><tr typeof="cc:molecule" about="http://rdf.openmolecules.net/?InChI=1/C4H10/c1-3-4-2/h3-4H2,1-2H3">
    <td><span property="dc:title">n-Butane</span></td>
    <td><span property="cc:t0">-0.5</span></td>
    <td><span property="cc:w0">10</span></td>
    <td><span property="cc:p0">1</span></td>
    <td><span property="chem:smiles">CCCC</span></td>
  </tr>
  </tbody>
</table>

I will shortly blog about the source of the above code snippet, but you are invited to go ahead and checkout
[my GitHub activity](http://github.com/egonw) ([RSS](http://github.com/egonw.atom)).

Steffen, I think these examples should get you pretty far, but please let me know if you have further questions!
