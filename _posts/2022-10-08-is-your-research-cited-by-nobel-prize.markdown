---
layout: post
title:  "Is your research cited by a Nobel prize winner?"
date:   2022-10-08
blogger-link: https://chem-bla-ics.blogspot.com/2022/10/is-your-research-cited-by-nobel-prize.html
tags: wikidata sparql
---

Forget the journal impact factor and the H-index. You want your research being used. A first approximation of that is getting cited,
sure. So, with the Nobel Prize week over (congrats to all winners! the [Neanderthaler prize](https://www.sciencelink.net/news/nobel-prize-in-physiology-awarded-to-sequencing-of-ancient-genomes/20811.article)
actually helped my work in Maastricht this week), let's figure out of you are cited by a Nobel Prize winner.
Wikidata allows us to figure this out with a SPARQL query
([created together with Adriano](https://twitter.com/Adafede/status/1577642035011534850)):

```sparql
#title: Are you cited by Nobel Prize winners?

SELECT (MIN(?dates) AS ?date) ?work ?workLabel
  (GROUP_CONCAT(DISTINCT ?winnerLabel; SEPARATOR = ", ") AS ?winners)
  (COUNT(DISTINCT(?winnerLabel)) AS ?count)
WHERE {
  VALUES ?nobel {
    wd:Q7191
    wd:Q80061
    wd:Q44585
    wd:Q38104
  }
  ?work wdt:P50/wdt:P496 "0000-0002-2627-833X" ; # REPLACE WITH YOUR ORCID id
    wdt:P577 ?datetimes.
  [] wdt:P2860 ?work;
    wdt:P50 ?winner.
  ?winner wdt:P166 ?nobel.
  BIND(xsd:date(?datetimes) AS ?dates)
  SERVICE wikibase:label {
    bd:serviceParam wikibase:language "en".
    ?winner rdfs:label ?winnerLabel.
    ?work rdfs:label ?workLabel.
  }
}
GROUP BY ?work ?workLabel
ORDER BY DESC (?count)
```

Run this query [here](https://w.wiki/5nBX). Notice the ORCID given in the middle: change that to your own ORCID identifier.

Please keep in mind that [Wikidata](https://www.wikidata.org/) does not contain all literature (neither do Google Scholar,
Web of Science, PubMed) and not all citations.
