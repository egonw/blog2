---
layout: post
title:  "Wikidata script for SMILES, SMARTS, and CXSMILES depiction"
date:   2022-11-12
blogger-link: https://chem-bla-ics.blogspot.com/2022/11/wikidata-script-for-smiles-smarts-and.html
tags: wikidata cdk cxsmiles dagstuhl smiles vhp4safety
---

In August I reported about [2D depiction of (CX)SMILES in Wikidata via linkouts](https://chem-bla-ics.blogspot.com/2022/08/wikidata-now-escapes-smiles-and-cxsmiles.html)
([going back to 2017](https://chem-bla-ics.blogspot.com/2017/07/wikidata-visualizes-smiles-strings-with.html)). Based on a script by
[Magnus Manske](https://orcid.org/0000-0001-5916-0947), I wrote a [Wikidata gadget](https://www.wikidata.org/wiki/User:Egon_Willighagen/cdkdepict_gadget.js)
that uses the same [CDK Depict](https://www.simolecule.com/cdkdepict/depict.html)
([VHP4Safety mirror](https://cdkdepict.cloud.vhp4safety.nl/)) to depict the 2D structure in [Wikidata](https://wikidata.org/) itself:

![Depicting of part of a Wikidata page with 2D structures of a canonical SMILES and matching CXSMILES.](/assets/images/Screenshot_20221112_130346.png)

Note the depiction of the undefined (CIP) stereochemistry on two atoms. Thanks to
[Adriano](https://orcid.org/0000-0003-0443-9902) and [John](https://nextmovesoftware.com/blog/author/john/) for working that out.

More about CXSMILES in Wikidata in [this Dagstuhl meeting results write up](https://egonw.github.io/cdk-cxsmiles/).


