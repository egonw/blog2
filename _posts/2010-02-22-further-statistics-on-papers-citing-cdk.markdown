---
layout: post
title:  "Further statistics on the papers citing the CDK"
date:   2010-02-22
blogger-link: https://chem-bla-ics.blogspot.com/2010/02/further-statistics-on-papers-citing-cdk.html
doi: 10.59350/65fss-f1y18
tags: cdk doi:10.1021/CI025584Y
modified_date: 2026-09-27
---

I already gave a [wordle <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/02/21/wordle-of-titles-of-20-most-recent.html) of the titles of papers citing the
[first CDK paper](http://pubs.acs.org/doi/abs/10.1021/ci025584y). Below follows some additional statistics: the number of papers that use a particular
[CDK](http://cdk.sf.net/) package (51). Now, this numbers are a bit rough, and surely any paper that uses the CDK is bound to use the IO or
SMILES package too. Additionally, for 10 papers I was not sure what CDK functionality they used, so I assigned those to the root package.

```
org.openscience.cdk.qsar: 12 (~20%)
org.openscience.cdk: 10
org.openscience.cdk.fingerprint: 9
org.openscience.cdk.isomorphism: 6
org.openscience.cdk.similarity: 3
org.openscience.cdk.smiles: 2
org.openscience.cdk.io.cml: 2
org.openscience.cdk.model.builder3d: 2
org.openscience.cdk.ringsearch: 2
org.openscience.cdk.tools: 2
org.openscience.cdk.render: 1
org.openscience.cdk.structgen: 1
org.openscience.cdk.graph.matrix: 1
org.openscience.cdk.io: 1
```

From this we learn what parts of the CDK are used. From the various CDK Literature blogs ([#1](http://chem-bla-ics.blogspot.com/2007/01/cdk-literature-1.html),
[#2 <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/07/14/cdk-literature-2.html), [#3](http://chem-bla-ics.blogspot.com/2008/01/cdk-literature-3.html),
[#4 <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/01/06/cdk-literature-4.html), and [#5](http://chem-bla-ics.blogspot.com/2008/07/cdk-literature-5.html))
I already knew the the descriptor calculation was much used, as well as the fingerprinter and the isomorphism checker which also provide the
maximum-common substructure functionality. What I was not aware of, is the our 3D model builder had been used in published studies too,
which was a pleasant surprise.

These numbers are based on 51 papers where CDK functionality was used, but you may be aware that [Web-of-Science](http://isiwebofknowledge.com/products_tools/multidisciplinary/webofscience/)
has 84 papers citing the first CDK paper. Of these, only 78 are actually in their database (which I don't quite understand). Also, at least some
10 papers cite the CDK, but do not use it, and a few papers cite the CDK where they actually use [Jmol](http://www.jmol.org/). I also have to
say, that for a curated citation database, I too often have to send in bug reports, but I cannot estimate to what extend that affects these numbers.

What does effect these numbers, is that some papers do not explicitly cite the CDK through one of the two papers, but only the website, or not
at all (yes, that [happens](http://www.nature.com/nchembio/journal/v5/n8/full/nchembio.187.html), but it nicely balances out with papers citing
the CDK but using Jmol :).

Well, I'm curious what the statistics will say about the [second CDK paper](http://www.ingentaconnect.com/content/ben/cpd/2006/00000012/00000017/art00005),
and the [JChemPaint paper](http://www.mdpi.com/1420-3049/5/1/93/) which is based on the CDK too.
