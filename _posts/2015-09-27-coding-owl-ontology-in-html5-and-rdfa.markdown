---
layout: post
title:  "Coding an OWL ontology in HTML5 and RDFa"
date:   2015-09-27
blogger-link: https://chem-bla-ics.blogspot.com/2015/09/coding-owl-ontology-in-html5-and-rdfa.html
doi: 10.59350/4k55a-8c261
tags: ontology bridgedb web rdf owl justdoi:10.1186/1471-2105-11-5 rdfa
image: /assets/images/bdbOnto.png
---


<img src="/assets/images/bdbOnto.png" style="width: 30%; display: block; margin-left: auto; margin-right: auto; float: right" />
There are many fancy tools to edit ontologies. I like simple editors, like [nano](https://en.wikipedia.org/wiki/GNU_nano). And like any hacker, I can hack
[OWL](https://en.wikipedia.org/wiki/Web_Ontology_Language) ontologies in nano. The hacking implies OWL was never meant to be hacked on a simple text editor;
I am not sure that is really true. Anyways, [HTML5](https://en.wikipedia.org/wiki/HTML5) and [RDFa](https://en.wikipedia.org/wiki/RDFa) will do fine, and
here is a brief write up. This post will not cover the basics of RDFa and does assume you already know how triples work. If not, read this
[RDFa primer](http://www.w3.org/TR/xhtml-rdfa-primer/) first.

## The BridgeDb DataSource Ontology
This example uses the [BridgeDb](http://www.bridgedb.org/) DataSource Ontology, created by BridgeDb developers from Manchester University (Christian,
Stian, and Alasdair). The ontology covers describing data sources of identifiers, a technology outlined in the BridgeDb paper by Martijn (see below)
as well as terms from the Open PHACTS [Dataset Descriptions for the Open Pharmacological Space](http://www.openphacts.org/specs/datadesc/)
by Alasdair et al.

Because I needed to put this online for [Open PHACTS](https://www.openphacts.org/) (BTW,
[the project won a big award](https://www.openphacts.org/news-and-events/news-archive/2015/398-open-phacts-wins-the-european-linked-data-contest)!)
and our previous solution did not work well enough anymore. You may also see the HTML of the result first. You may also want to verify it really is
[HTML](http://vocabularies.bridgedb.org/ops): here is the [HTML5 validation report](https://validator.w3.org/nu/?doc=http://vocabularies.bridgedb.org/ops).
Also, you may be interested in what the ontology in RDF looks like: here is
[the extracted RDF for the ontology](http://www.w3.org/2012/pyRdfa/extract?uri=http://vocabularies.bridgedb.org/ops#).
Now follow the HTML+RDFa snippets. First, the ontology details (actually, I have it split up):

<pre>&lt;div <span style="color: red;">about="</span><span style="background-color: #76a5af; color: white;">http://vocabularies.bridgedb.org/ops#</span><span style="color: red;">"
     typeof="</span><span style="background-color: #76a5af; color: white;">owl:Ontology</span><span style="color: red;">"</span>&gt;
  &lt;h1&gt;The &lt;span <span style="color: red;">property="rdfs:label"</span>&gt;<span style="background-color: #6fa8dc;"><span style="color: white;">BridgeDb DataSource Ontology</span></span>&lt;/span&gt;
    (version &lt;span <span style="color: red;">property="owl:versionInfo"</span>&gt;<span style="background-color: #6fa8dc; color: white;">2.1.0</span>&lt;/span&gt;)&lt;/h1&gt;
  &lt;p&gt;
    This page describes the BridgeDb ontology. Make sure to visit our
    &lt;a <span style="color: red;">property="rdfs:seeAlso"</span> href="<span style="background-color: #76a5af;"><span style="color: white;">http://www.bridgedb.org/</span></span>"&gt;homepage&lt;/a&gt; too!
  &lt;/p&gt;
&lt;/div&gt;
&lt;p <span style="color: red;">about="</span><span style="background-color: #76a5af; color: white;">http://vocabularies.bridgedb.org/ops#</span><span style="color: red;">"</span>&gt;
  The OWL ontology can be extracted
  &lt;a <span style="color: red;">property="owl:versionIRI"</span>
     href="<span style="background-color: #76a5af; color: white;">http://www.w3.org/2012/pyRdfa/extract?uri=http://vocabularies.bridgedb.org/ops#</span>"&gt;here&lt;/a&gt;.
  The Open PHACTS specification on
  &lt;a <span style="color: red;">property="rdf:seeAlso"</span>
    href="<span style="background-color: #76a5af;"><span style="color: white;">http://www.openphacts.org/specs/2013/WD-datadesc-20130912/#bridgedb</span></span>"
  &gt;Dataset Descriptions&lt;/a&gt; is also useful.
&lt;/p&gt;
</pre>

This is the last time I show the custom color coding, but for a first time it is useful. In red are basically the predicates, where `@about`
indicates a new resource is started, `@typeof` defines the `rdf:type`, and `@property` indicates all other predicates. The blue and
green blobs are literals and object resources, respectively. If you work this out, you get this OWL code (more or less):

```turtle
bridgedb: a owl:Ontology;
  rdfs:label "BridgeDb DataSource Ontology"@en;
  rdf:seeAlso
    <http://www.openphacts.org/specs/2013/WD-datadesc-20130912/#bridgedb>;
  rdfs:seeAlso <http://www.bridgedb.org/>;
  owl:versionIRI
    <http://www.w3.org/2012/pyRdfa/extract?uri=http://vocabularies.bridgedb.org/ops#>;
  owl:versionInfo "2.1.0"@en .
```

## An OWL class
Defining OWL classes are using the same approach: define the resource it is `@about`, define the `@typeOf` and giving is properties.
BTW, note that I added a `@id` so that ontology terms can be looked up using the HTML # functionality. For example:

```xml
<div id="DataSource"
  about="http://vocabularies.bridgedb.org/ops#DataSource"
  typeof="owl:Class">
  <h3 property="rdfs:label">Data Source</h3>
  <p property="dc:description">A resource that defines
    identifiers for some biological entity, like a gene,
    protein, or metabolite.</p>
</div>
```

## An OWL object property
Defining an OWL data property is pretty much the same, but note that we can arbitrary add additional things, making use of `<span>`,
`<div>`, and `<p>` elements. The following example also defines the `rdfs:domain` and `rdfs:range`:

```xml
<div id="aboutOrganism"
  about="http://vocabularies.bridgedb.org/ops#aboutOrganism"
  typeof="owl:ObjectProperty">
  <h3 property="rdfs:label">About Organism</h3>
  <p><span property="dc:description">Organism for all entities
    with identifiers from this datasource.</span>
    This property has
    <a property="rdfs:domain"
      href="http://vocabularies.bridgedb.org/ops#DataSource">DataSource</a>
    as domain and
    <a property="rdfs:range"
      href="http://vocabularies.bridgedb.org/ops#Organism">Organism</a>
    as range.</p>
</div>
```

So, now anyone can host an OWL ontology with dereferencable terms: to remove confusion, I have used the full URLs of the terms in `@about` attributes.
