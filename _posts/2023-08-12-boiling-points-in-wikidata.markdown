---
layout: post
title:  "Boiling points in Wikidata"
date:   2023-08-12
blogger-link: https://chem-bla-ics.blogspot.com/2023/08/boiling-points-in-wikidata.html
tags: rdf wikidata chemistry
doi: 10.59350/xr6k8-z4480
---

Some days ago, I started added boiling points to [Wikidata](https://wikidata.org/), referenced from
[Basic Laboratory and Industrial Chemicals](https://scholia.toolforge.org/work/Q22236188) (wikidata:Q22236188),
[David R. Lide](https://scholia.toolforge.org/author/Q18609741)'s
'a CRC quick reference handbook' from 1993 (well, the edition I have). But Wikidata
[wants](https://www.wikidata.org/wiki/User_talk:Egon_Willighagen#Basic_laboratory_and_industrial_chemicals:_a_CRC_quick_reference_handbook_(Q22236188))
pressure (wikidata:P2077) info at which the boiling point (wikidata:P2102) was measured. Rightfully so. But I had not added those yet,
because it slows me and can be automated with [QuickStatements](https://quickstatements.toolforge.org/).

I just need a few SPARQL queries to list to which statements the qualifiers needs to be added. Basically, all boiling points which has the
book as a reference and that do not have the pressure info. First, there are values with 'unknown value', which results in blank nodes
(by the time you read this, they likely are already fixed):

```sparql
SELECT ?cmp ?bp ?pressure WHERE {
  ?cmp p:P2102 ?bpStatement .
  ?bpStatement prov:wasDerivedFrom/pr:P248 wd:Q22236188 ;
    ps:P2102 ?bp .
  ?bpStatement pq:P2077 ?pressure .
  FILTER (contains(str(?pressure), "http://"))
}
```

So, to get the list for which I want to write the QuickStatements which does not have any P2077 qualifier yet, I use
[this query](https://query.wikidata.org/#SELECT%20%3Fcmp%20WHERE%20%7B%0A%20%20%3Fcmp%20p%3AP2102%20%3FbpStatement%20.%0A%20%20%3FbpStatement%20prov%3AwasDerivedFrom%2Fpr%3AP248%20wd%3AQ22236188%20%3B%0A%20%20%20%20ps%3AP2102%20%3Fbp%20.%0A%20%20MINUS%20%7B%20%3FbpStatement%20pq%3AP2077%20%3Fpressure%20%7D%0A%7D):

```sparql
SELECT ?cmp WHERE {
  ?cmp p:P2102 ?bpStatement .
  ?bpStatement prov:wasDerivedFrom/pr:P248 wd:Q22236188 ;
    ps:P2102 ?bp .
  MINUS { ?bpStatement pq:P2077 ?pressure }
}
```

At the time of writing, this lists 54 boiling points.

I can the WDQS create CSV-styled QuickStatements with:

```sparql
SELECT (SUBSTR(STR(?cmp),32) AS ?qid) ?P2102 ?qal2077 WHERE {
  ?cmp p:P2102 ?bpStatement .
  ?bpStatement prov:wasDerivedFrom/pr:P248 wd:Q22236188 ;
    ps:P2102 ?P2102 .
  MINUS { ?bpStatement pq:P2077 ?pressure }
  BIND ("101.325U21064807" AS ?qal2077)
}
```

Here, the SPARQL variables double as QuickStatement instructions. Finally, note to use of "U21064807" which is the Wikidata item for
kilopascal (wikidata:Q21064807).

I also need to "add" the boiling point again, to make sure QuickStatements knows which statement to add the qualifier to. I think this
can be done better, but not sure how to target statements directly. This is not fool proof: I noted that this approach ignores the
situation where there are two statements with the (exact) same boiling point, but different error margins. But that I will monitor
and where needed correct manually.
