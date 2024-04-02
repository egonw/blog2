---
layout: post
title:  "Open Science Retreat #2: CiTO Nanopublications"
date:   2024-04-02
tags: osr24nl openscience cito nanopub justdoi:10.3233/ISU-2010-0613 doi:10.1109/ESCIENCE.2018.00024 doi:10.1186/s13321-023-00683-2 wikidata
image: /assets/images/citoPub.png
---

During the [Open Science Retreat](http://chem-bla-ics.linkedchemistry.info/2024/03/31/open-science-retreat-1.html) I organized
a short session where we looking into typing citation intentions using a new nanopublication template. First, let's describe
nanopublications (originally used in doi:[10.3233/ISU-2010-0613](https://doi.org/10.3233/ISU-2010-0613)) a bit.
Scholia gives [a nice overview of (macro?)publications on the topic](https://scholia.toolforge.org/topic/Q57814310).
The [nanopub.net](https://nanopub.net/)
website describes that *[a nanopublication is a small knowledge graph snippet with metadata that is treated as an
independent (scientific) publication.]*. The knowledge graph, it continues, can be anything from an opinion to the link
between a disease and a gene (doi:[10.1109/ESCIENCE.2018.00024](https://doi.org/10.1109/ESCIENCE.2018.00024)).

Now, in this post I will document an update of how we can use nanopublications for citation intention annotation, and
compare this to existing solutions. I have been collecting and indexing the CiTO intention annotations in Wikidata and
visualizing the corpus with Scholia at [scholia.toolforge.org/cito/](https://scholia.toolforge.org/cito/). There are
currently 22 journal articles with explicit CiTO annoation, largely thanks to a [Journal of Cheminformatics pilot](https://www.biomedcentral.com/collections/cito)
(e.g. see doi:[10.1186/s13321-023-00683-2](https://doi.org/10.1186/s13321-023-00683-2)). Recently,
the preprint/report server [BioHackrXiv](https://biohackrxiv.org/discover) started
[CiTO support](https://github.com/biohackrxiv/publication-template) too, also visible in the statistics
on Scholia with another 17 papers. A third source is data sets from bibliometric-like studies, as explained
in [this post](https://chem-bla-ics.blogspot.com/2023/04/cito-updates-4-annotations-in-datasets.html). Nanopublications
would be a fourth solution.

So, why another solutions? Like the datasets, assuming DataCite approaches, have clear provenance, but the overhead
of and needed time for creating a dataset with citation intent annotations can be limiting. And because nanopublications
can be linked to ORCID identifiers, we can even discover which citation intent annotations are created by the original
authors of articles. Another advantage is that nanopubs are basically RDF and we can query them easily, allowing
the citation intentions to migrate to Wikidata. Scholia already saw an update to recognize nanopublications as
a unique kind reference (see the new Wikidata property [Nanopublication identifier (P12545)](https://www.wikidata.org/wiki/Property:P12545)).

# NanoDash template

So, if we can make it easy for people to define nanopublications with CiTO citation intent annotations, than we can
start formalizing intent annotations from a much wider range of use cases. For example, we can annotate historically
important discussions. Anyone can retrospectively annotate all their own articles, making them more FAIR. And if we
use DOI links, then it no longer is limited to journal articles, but we can use of for software and data citations too.
This is where [a recent template](https://w3id.org/np/RAX_4tWTyjFpO6nz63s14ucuejd64t2mK3IBlkwZ7jjLo) comes in created by
[Tobias Kuhn](https://orcid.org/0000-0002-1267-0234), one of the main nanopub developers:

![](/assets/images/citoPub.png)

This nanopublication template defines the minimal needs of the assumptions, along with useful provenance and nanopub
info. Basically, the assertion defines that one DOI is a ScholarlyWork and using the CiTO, defines that it cites
one or more article works (with DOI). For each citations, one can select any of the known CiTO intent types,
e.g. 'extends' or 'uses method' in, as in [this nanopublication](https://w3id.org/np/RA6Rxk1sSOSWxM7A6gW4SjJZRVt4fbY6nShPTAbQ8kce8)
created with this template:

![](/assets/images/citoPub2.png)

## SPARQL-ing CiTO annotations

Besides the template, Tobias also started a SPARQL query to which I added restrictions that the citing and cited
resources needs to have a DOI, giving us [this query](https://query.np.trustyuri.net/tools/type/2c1cce3f3152738c1009d59251409392aaaa3b0324bcb5fdfb4b7b944b8f0c18/yasgui.html#query=prefix+rdfs%3A+%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%0Aprefix+np%3A+%3Chttp%3A%2F%2Fwww.nanopub.org%2Fnschema%23%3E%0Aprefix+npa%3A+%3Chttp%3A%2F%2Fpurl.org%2Fnanopub%2Fadmin%2F%3E%0Aprefix+npx%3A+%3Chttp%3A%2F%2Fpurl.org%2Fnanopub%2Fx%2F%3E%0Aprefix+xsd%3A+%3Chttp%3A%2F%2Fwww.w3.org%2F2001%2FXMLSchema%23%3E%0Aprefix+dct%3A+%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0A%0Aselect+%3Fnp+%3Flabel+%3Fsubj+%3Fcitationrel+%3Fobj+%3Fdate+where+%7B%0A++graph+npa%3Agraph+%7B%0A++++%3Fnp+npa%3AhasValidSignatureForPublicKey+%3Fpubkey+.%0A++++%3Fnp+dct%3Acreated+%3Fdate+.%0A++++%3Fnp+np%3AhasAssertion+%3Fassertion+.%0A++++optional+%7B+%3Fnp+rdfs%3Alabel+%3Flabel+.+%7D%0A++++filter+not+exists+%7B+%3Fnpx+npx%3Ainvalidates+%3Fnp+%3B+npa%3AhasValidSignatureForPublicKey+%3Fpubkey+.+%7D%0A++++filter+not+exists+%7B+%3Fnp+npx%3AhasNanopubType+npx%3AExampleNanopub+.+%7D%0A++%7D%0A++graph+%3Fassertion+%7B%0A++++%3Fsubj+%3Fcitationrel+%3Fobj+.%0A++++filter(regex(str(%3Fcitationrel)%2C+%22%5Ehttp%3A%2F%2Fpurl.org%2Fspar%2Fcito%2F.*%24%22))%0A++++filter(regex(str(%3Fsubj)%2C+%22doi.org%2F10%22))%0A++++filter(regex(str(%3Fobj)%2C+%22doi.org%2F10%22))%0A++%7D%0A%7D%0A++&contentTypeConstruct=text%2Fturtle&contentTypeSelect=application%2Fsparql-results%2Bjson&endpoint=%2Frepo%2Ftype%2F2c1cce3f3152738c1009d59251409392aaaa3b0324bcb5fdfb4b7b944b8f0c18&requestMethod=POST&tabTitle=Query&headers=%7B%7D&outputFormat=table):

```sparql
prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>
prefix np: <http://www.nanopub.org/nschema#>
prefix npa: <http://purl.org/nanopub/admin/>
prefix npx: <http://purl.org/nanopub/x/>
prefix xsd: <http://www.w3.org/2001/XMLSchema#>
prefix dct: <http://purl.org/dc/terms/>

select ?np ?label ?subj ?citationrel ?obj ?date where {
  graph npa:graph {
    ?np npa:hasValidSignatureForPublicKey ?pubkey .
    ?np dct:created ?date .
    ?np np:hasAssertion ?assertion .
    optional { ?np rdfs:label ?label . }
    filter not exists { ?npx npx:invalidates ?np ; npa:hasValidSignatureForPublicKey ?pubkey . }
    filter not exists { ?np npx:hasNanopubType npx:ExampleNanopub . }
  }
  graph ?assertion {
    ?subj ?citationrel ?obj .
    filter(regex(str(?citationrel), "^http://purl.org/spar/cito/.*$"))
    filter(regex(str(?subj), "doi.org/10"))
    filter(regex(str(?obj), "doi.org/10"))
  }
}
```

This includes 6 citation intentions defined by 4 nanopublications added during the Open Science Retreat:

* [RAUjZE1JMu](https://w3id.org/np/RAUjZE1JMu1GAvUQ_fZ4yc9-7sOSCT9xbeS0wYznkKtYk) by [me](https://nanodash.knowledgepixels.com/explore?id=https%3A%2F%2Forcid.org%2F0000-0002-7192-1486) for a paper by Marija Purgar
* [RAXgI--5gc](https://nanodash.knowledgepixels.com/explore?id=RAXgI--5gcKskgrnOI1XZoA4b3hu9RbNj3bcc2Zxeos7c) by [Christian Meesters](https://nanodash.knowledgepixels.com/explore?id=https%3A%2F%2Forcid.org%2F0000-0003-2408-7588)
* [RATZNhd3l_j](https://nanodash.knowledgepixels.com/explore?id=RATZNhd3l_jN0y8GEi8mLIqy-uVV8tiUZIq2RJtkq6G8A) by [Taichi Oichi](https://nanodash.knowledgepixels.com/explore?id=https%3A%2F%2Forcid.org%2F0000-0003-4285-690X)
* [RA6Q6wxSYy](https://nanodash.knowledgepixels.com/explore?id=RA6Q6wxSYyWfA3XwpOBqSNFKgQpM7ZgdVBoU2kSD-CFjw) by [Niklas Hohmann](https://nanodash.knowledgepixels.com/explore?id=https%3A%2F%2Forcid.org%2F0000-0003-1559-1838)

# From nanopublications to Wikidata

Now, this query also provides me with enough information to propagate the citation intent (a fact?) to Wikidata
and cite the original nanopublication as reference. With a variation of the above SPARQL query, I can get the
five most recent new nanopublications, convert them to QuickStatements, and then enjoy them in Wikidata. This
is written up in [this Bacting script](https://github.com/egonw/ons-wikidata/blob/main/Nanopubs/createQS.groovy).

The script needs to handle some situations. For example, it will not add items for DOIs not already in Wikidata.
So, if neither of the two DOIs are known in Wikidata, then nothing gets added. If they both are, then it will
add the citation intent. There are alternative solutions, but in practice that doesn't matter and the QuickStatements
is in all situations the same, and QuickStatements will only add the new information.

This is what it will [look like in Wikidata](https://www.wikidata.org/wiki/Q113312162#P2860):

![](/assets/images/citoPub3.png)

And this is [what it looks](https://scholia.toolforge.org/cito/#articles) (yellow) when we compare the contributions
from nanopublications now with the other sources:

![](/assets/images/citoPubs4.png)
