---
layout: post
title:  "Algorithm or Model: OpenTox API quiz"
date:   2010-10-30
blogger-link: https://chem-bla-ics.blogspot.com/2010/10/algorithm-or-model-opentox-api-quiz.html
doi: 10.59350/2rzt0-k1a25
tags: chemistry ontologies justdoi:10.1021/ci8001815
---

[Nina](http://bg.linkedin.com/in/ninajeliazkova) (who still does not seem to blog) wrote up this
interesting question, triggered by the [OpenTox API ontology](http://www.opentox.org/dev/apis/api-1.1/):

> Given: A publication, describing specific method of property prediction (not a generic machine
> learning algorithm). An implementation of this publication.
>
> Example: [pKa](http://pubs.acs.org/doi/abs/10.1021/ci8001815). This is a decision tree with
> SMARTS in the nodes. There is a training set, which could be used in validation.
>
> - Should it be exposed by OpenTox services as ot:Algorithm or ot:Model ?
> - What is the right way to use / extend Blue Obelisk descriptors dictionary to describe
>   this implementation?
> - Would you classify this method as a descriptor calculation or as a predictive model?

I would say, a ot:Model is a ot:Algorithm, just a comlex one.

The question shows one of the virtues of ontologies: they require us to carefully
think about what we say. It is almost as like they put the scholar back into
science.

On a different note, can we please start making an [Open Data](http://pantonprinciples.org/)
pKa database?!?
