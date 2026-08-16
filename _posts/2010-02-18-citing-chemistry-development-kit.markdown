---
layout: post
title:  "Citing the Chemistry Development Kit"
date:   2010-02-18
blogger-link: https://chem-bla-ics.blogspot.com/2010/02/citing-chemistry-development-kit.html
doi: 10.59350/y34jk-2ds64
tags: cdk cito bioclipse jchempaint jmol rdf owl justdoi:10.1186/1758-2946-2-1 doi:10.1021/CI025584Y
  doi:10.1021/CI025584Y rdfa
---

Two weeks ago, a paper by Peter Ertl was published about [Molecular structure input on the web](http://www.jcheminf.com/content/2/1/1)
(doi:[10.1186/1758-2946-2-1](https://doi.org/10.1186/1758-2946-2-1)). In this paper, he discusses the state of things and describes his
contribution to this field, the [JME Molecule Editor](http://www.molinspiration.com/jme/). The article also cites the CDK, but only
the website and not one of the two papers (doi:[10.1021/ci025584y](https://doi.org/10.1021/ci025584y), or
doi:[10.2174/138161206777585274](10.2174/138161206777585274)). This is not an isolated case, but a common pattern. In principle, the
proper work is cited, and nothing is wrong. Practically it means, that a citation to the [CDK website](http://cdk.sf.net/)
does not show up in the citation network. This is ***not*** a problem caused by these papers, but merely by the nature current citation
databases work: they only count citations between journal articles, and only sometimes extend to books or conference abstracts.

Now, addressing the limitations of the current citation databases is technically simple, and purely blocked by social and commercial
aspects. The Citation Typing Ontology by [David Shotton](http://www.zoo.ox.ac.uk/staff/academics/shotton_dm.htm) defines the framework
to define citation types, independent from any existing database. The semantic web technologies will take it from there, and allow
aggregation etc.

There are some things to think about on how to use such citation networks, though. If we calculate the impact of the CDK project,
we should combine citation counts to the website(s), papers, etc, after removal of duplicates, etc. The
[cito:cites](http://imageweb.zoo.ox.ac.uk/pub/2009/citobase/cito-20090311/cito-content/owldoc/objectproperties/cites.html) does
link to resources, and the CDK paper resources is not the same as the CDK website resource. But, we could define a Project Class,
where both are foo:partOf. Then, we could define that *the triple chain the:citingWork cito:cites the:CDKArticle foo:partOf the:CDKProject*
would imply *the triple the:citingWork cito:cites the:CDKProject*.

## Typed Citations

Now, while writing up this blog, I realize that my fork of this morning, [A BIBO Citation Typing Ontology](http://github.com/egonw/bibo-cto),
might actually be counter-productive in the long run, as I was only working out a solution to a simpler, but different problem, which the
CiTO also addresses: a citation is not typed. When a paper does cite the CDK paper, we still do not know if it *uses* the CDK, or
merely mentioned it as *related-but-unused*, or even *refuted* work.

Now, as I am leaning towards the Biobliography Ontology as RDF-based system for my references, and been using this already in the
[RDF store hosting the ChEMBL data](http://rdf.farmbio.uu.se/chembl/snorql/),
I forked the CiTO to define rdfs:domain and rdfs:range on [bibo:Document](http://bibotools.googlecode.com/svn/bibo-ontology/trunk/doc/classes/Document___-538479979.html).
The CiTO 1.5 actually defines a large set of document types too, and I rather see BIBO reused.

This indeed has the downside that the bibocto:cites cannot be used for the above chaining, and this might bite me seriously later.
Well, nothing wrong with a failing experiment, right? For now, it will serve my purpose: setting up a citation database for the CDK
project papers.

## The CDK citation database

So, here goes (it's [RDFa-enabled](http://www.w3.org/TR/xhtml-rdfa-primer/); check this
[RDF pulled out](http://www.w3.org/2007/08/pyRdfa/extract?uri=http://chem-bla-ics.blogspot.com/2010/02/citing-chemistry-development-kit.html)): <!-- keep link -->

<pre xmlns:bibo="http://purl.org/ontology/bibo/" xmlns:bibocto="http://github.com/egonw/bibo-cto/" about="urn:doi:10.1021/ci025584y"
     rel="bibocto:cites" typeof="bibo:Article">@prefix bibo: &lt;http://purl.org/ontology/bibo/&gt;.
@prefix bibocto: &lt;http://github.com/egonw/bibo-cto/&gt;.

&lt;urn:doi:10.1186/1758-2946-2-1&gt; a bibo:Article ;
  bibocto:cites <span about="urn:doi:10.1021/ci025584y">&lt;urn:doi:10.1021/ci025584y&gt;</span> .
</pre>

I am not entirely happy about the error-prone XHTML+RDFa of the above example, and
[filed a question of better solution](http://www.semanticoverflow.com/questions/573/how-to-create-rdfa-powered-n3-in-the-html-output) on
[SemanticOverflow](http://www.semanticoverflow.com/).

While the above example merely defines the citation of Peter Ertl's article to the CDK (whether that is valid or not... would
he have cited the other paper perhaps?), the citation typing allows me to state how the CDK paper is cited. Now, Peter states:

> It is also gratifying to see the advent of open source movement in cheminformatics on the Internet, as advocated for example
by the Blue Obelisk Group ([40](http://blueobelisk.sourceforge.net/wiki/Main_Page)) and witnessed by collaborative projects
like Chemistry Development Kit CDK ([41](http://sourceforge.net/apps/mediawiki/cdk/index.php?title=Main_Page)),
Jmol ([42](http://jmol.sourceforge.net/)), Bioclipse ([43](http://www.bioclipse.net/)) and several others.

So, I think it is fair to state that:

<pre xmlns:bibo="http://purl.org/ontology/bibo/" xmlns:bibocto="http://github.com/egonw/bibo-cto/" about="urn:doi:10.1021/ci025584y"
     rel="bibocto:credits">&lt;urn:doi:10.1186/1758-2946-2-1&gt; bibocto:credits <span about="urn:doi:10.1021/ci025584y">&lt;urn:doi:10.1021/ci025584y&gt;</span> .
</pre>

which is very much appreciated!
