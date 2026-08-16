---
layout: post
title:  "CDK Molecules in RDF"
date:   2009-10-06
blogger-link: https://chem-bla-ics.blogspot.com/2009/10/cdk-molecules-in-rdf.html
doi: 10.59350/r6xmq-16f84
tags: cdk rdf rdfa
---

Yesterday, I finally got around to starting a [branch](http://github.com/egonw/cdk/tree/73-rdf) on adding RDF support to the
[CDK](http://cdk.sf.net/); in particular, write the CDK data model ontology in [OWL](http://en.wikipedia.org/wiki/Web_Ontology_Language)
and serialization to and from RDF using the ontology. The framework is now set up, but I have yet to formalize all bits and pieces
of the CDK data model in classes and properties. Just as a preview, here is what a very basic bit of CDK model in RDF looks like
([N3 format](http://en.wikipedia.org/wiki/Notation3)):

```notation3
@prefix cdk:     <http://cdk.sourceforge.net/model.owl#> .

<http://cdk.sf.net/model/atom/1>
      a       cdk:Atom ;
      cdk:symbol "C" .

<http://cdk.sf.net/model/molecule/1>
      a       cdk:Molecule ;
      cdk:hasAtom  .
```

Still rather verbose, but very flexible. I have even been thinking of an XHTML+RDFa writer...
