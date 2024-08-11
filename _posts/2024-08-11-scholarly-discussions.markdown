---
layout: post
title:  "Scholarly discussions through they eyes of CiTO (and Wikidata)"
date:   2024-08-11
tags: cito wikidata justdoi:10.1016/S0140-6736(02)96038-1 justdoi:10.1016/S0140-6736(02)96066-6 justdoi:10.1016/S0140-6736(02)83966-6
  doi:10.1007/978-3-319-70407-4_36
image: /assets/images/clannyNetwork.png
---

Diabetes was already discussed in literature back in 1838-1839 (doi:[10.1016/S0140-6736(02)96038-1](https://doi.org/10.1016/S0140-6736(02)96038-1),
doi:[10.1016/S0140-6736(02)96066-6](10.1016/S0140-6736(02)96066-6), and doi:[10.1016/S0140-6736(02)83966-6](https://doi.org/10.1016/S0140-6736(02)83966-6)).
These three papers show a short discussion. Papers were a lot shorter back in the days, and the discussion actually shows why papers are longer now
(tho I am not sure they really got sufficiently more reproducible, but that's another discussion).

Traditional citation counts do not make this discussion obvious, but if we make our publishing sufficiently FAIR (it's far from that, right now),
then we can get a step closer. For example, with the [Citation Typing Ontology](https://purl.org/spar/cito)
we can show how the papers relate to each other:

![](/assets/images/clannyNetwork.png)

This network is based on public knowledge in [Wikidata](https://wikidata.org/) and actually can be easily reproduced by anyone
with [this query](https://w.wiki/AtV9):

```sparql
#defaultView:Graph
SELECT DISTINCT ?focus1 ?focus1Label ?focus2 ?focus2Label ?edgeLabel WHERE {
  VALUES ?focus1 { wd:Q124174475 wd:Q124174776 wd:Q124174815 }
  VALUES ?focus2 { wd:Q124174475 wd:Q124174776 wd:Q124174815 }
  ?focus1 p:P2860 ?citation .
  ?citation ps:P2860 ?focus2 ; pq:P3712 ?edge .
  ?edge rdfs:label ?edgeLabel . FILTER(LANG(?edgeLabel) = "en")
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],mul,en". }
}
```

The two "focus" values are an identical list of the articles I want to see. To make sure to get citations between all of them,
I have to give them twice.

In the above example I have used `VALUES` for this, but I can also generate the controlled list of items between the citations
I want to visualize with any SPARQL fragment too. [This query](https://edu.nl/y38rg) does that (or here as
[GitHub Gist](https://gist.github.com/egonw/b5fb7ae550c1597ff247f70cee8063c8), but something else too: it uses a trick I learned
from [Finn Nielsen](https://scholia.toolforge.org/author/Q20980928) from [this patch](https://github.com/WDscholia/scholia/commit/d34dee85bc12575e0f1891c4e663ef8e2c450083)
from the [Scholia](https://scholia.toolforge.org/) project (doi:[10.1007/978-3-319-70407-4_36](https://doi.org/10.1007/978-3-319-70407-4_36))).

Here, I select the articles by replacing the above `VALUES` lines with this fragment (`P50` is 'author' and `Q20895241` is me in Wikidata):

```SPARQL
  ?focus1 wdt:P50 wd:Q20895241 .
  ?focus2 wdt:P50 wd:Q20895241 .
```

And, to be honest, then I get this network which is much richer than I expected:

![](/assets/images/willighagen_cito.png)

I wonder how far we can push this. Can we also do this for the [Journal of Cheminformatics](https://scholia.toolforge.org/venue/Q6294930)?
After all, this journal had a [CiTO Pilot](https://www.biomedcentral.com/collections/cito) and, indeed,
[the results do not disappoint](https://edu.nl/hk8xy)! All I had to do was replace the focus section:

```SPARQL
  ?focus1 wdt:P1433 wd:Q6294930 .
  ?focus2 wdt:P1433 wd:Q6294930 .
```
