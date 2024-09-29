---
layout: post
title:  "Creating nanopublications with Groovy"
date:   2018-12-27
modified-date: 2024-09-29
blogger-link: https://chem-bla-ics.blogspot.com/2018/12/creating-nanopublications-with-groovy.html
tags: nanopub wikidata groovy justdoi:10.1007/978-3-319-07443-6_27 justdoi:10.1002/JLAC.199619961005
image: /assets/images/Screenshot_20181227_075006.png
---

<img style="float: right" width="200" src="/assets/images/Screenshot_20181227_075006.png" />
Yesterday, I struggled some with creating [nanopublications](http://nanopub.org/) with [Groovy](https://en.wikipedia.org/wiki/Apache_Groovy).
My first attempt was an utter failure, but then I discovered [Thomas Kuhn](https://twitter.com/txkuhn)'s
[NanopubCreator](https://github.com/Nanopublication/nanopub-java/blob/master/src/main/java/org/nanopub/NanopubCreator.java)
and it was downhill from there.

On the right, a depiction is given of a compound found in Taphrorychus bicolor (doi:[10.1002/JLAC.199619961005](https://doi.org/10.1002/JLAC.199619961005)).
Published in *Liebigs Annalen*, see [this post](https://chem-bla-ics.blogspot.com/2018/12/from-annalen-der-pharmacie-to-european.html)
about the history of that journal.

There are two good things about this. First, I now have a [code base](https://github.com/egonw/wikidataNanopublications)
that I can easily repurpose to make *trusty nanopublications* (doi:[10.1007/978-3-319-07443-6_27](10.1007/978-3-319-07443-6_27))
about anything structured as a table (so can you).

Second, I now about almost 1200 CCZero nanopublications that tell you in which species a certain metabolite
has been found. Sourced from [Wikidata](https://wikidata.org/), using [their SPARQL end point](https://query.wikidata.org/).
This collection is a bit boring that this moment, and most of them are human metabolites, where the source is either
[Recon 2.2](https://tools.wmflabs.org/scholia/work/Q28601559) or [WikiPathways](https://wikipathways.org/).
But I expect (hope) to see more DOIs to show up. Think
*[We challenge you to reuse Additional Files](https://blogs.biomedcentral.com/bmcblog/2018/11/01/challenge-reuse-additional-files-supplementary-information/)*.

Finally, you are probably interested in learning what one of the created nanopublications looks like, to I put
[a Gist online](https://gist.github.com/egonw/5fb0994cac6f9e851f3857cd306f0890):

```trig
@prefix this: <http://www.bigcat.unimaas.nl/nanopubs/wikidata/tmp/np742.RAwXcetTykN6UPVzBOyatKm30mbT6endXfDrxnarRysL0> .
@prefix sub: <http://www.bigcat.unimaas.nl/nanopubs/wikidata/tmp/np742.RAwXcetTykN6UPVzBOyatKm30mbT6endXfDrxnarRysL0#> .
@prefix wd: <http://www.wikidata.org/entity/> .
@prefix np: <http://www.nanopub.org/nschema#> .
@prefix has-source: <http://semanticscience.org/resource/SIO_000253> .
@prefix has-inchikey: <http://semanticscience.org/resource/CHEMINF_000399> .
@prefix orcid: <http://orcid.org/> .
@prefix wdt: <http://www.wikidata.org/prop/direct/> .
@prefix owl: <http://www.w3.org/2002/07/owl#> .
@prefix pav: <http://purl.org/pav/> .
@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
@prefix skos: <http://www.w3.org/2004/02/skos/core#> .

sub:Head {
        this: np:hasAssertion sub:assertion ;
                np:hasProvenance sub:provenance ;
                np:hasPublicationInfo sub:pubinfo ;
                a np:Nanopublication .
}

sub:assertion {
        wd:Q15978631 rdfs:label "Homo sapiens"@en ;
                skos:exactMatch <http://purl.obolibrary.org/obo/NCBITaxon_9606> .

        wd:Q27125029 has-inchikey: "APJYDQYYACXCRM-UHFFFAOYSA-O" ;
                rdfs:label "tryptaminium"@en ;
                wdt:P703 wd:Q15978631 .
}

sub:provenance {
        sub:assertion has-source: wd:Q2013 , wd:Q28601559 .

        wd:Q28601559 rdfs:label "Recon 2.2: from reconstruction to model of human metabolism"@en ;
                owl:sameAs <https://doi.org/10.1007/S11306-016-1051-4> .
}

sub:pubinfo {
        this: pav:createdBy orcid:0000-0001-7542-0286 .
}
```
