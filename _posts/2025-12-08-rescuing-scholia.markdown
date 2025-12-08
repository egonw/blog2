---
layout: post
title:  "Rescuing Scholia: will we make it in time?"
date:   2025-12-08
doi: 10.59350/yh369-rr787
tags: scholia wikidata rdf sparql
comments:
  host: social.edu.nl
  username: egonw
  id: 115682764032261299
---

What [started out in 2016 on Twitter](https://chem-bla-ics.linkedchemistry.info/2023/01/27/scholia-timeline.html) became a
[(small) award winning](https://meta.wikimedia.org/wiki/Coolest_Tool_Award/Full_history)
[decade long collaborative project](https://chem-bla-ics.linkedchemistry.info/tag/scholia).
Unfortunately, the future is not clear. We are at odds if it will survice the growth of Wikidata
and in particularly the [SPARQL graph split](https://www.wikidata.org/wiki/Wikidata:SPARQL_query_service/WDQS_graph_split).
To be clear, the choice for Blazegraph initially worked great, but after it was bought by a big
company, developed halted. Very unfortunate for Wikidata. Unlike earlier, we no longer have funding, and rewriting Scholia
at this scale takes a good bit of effort. We already
[held a few hackathons](https://chem-bla-ics.linkedchemistry.info/2025/04/20/the-april-2025-scholia-hackathon.html).

So far, we have been able to continue to use a *legacy* SPARQL endpoint with all the data, but in exactly one month
that endpoint will be sunset. And we are **not** ready.

## Rescuing Scholia
Daniel and Lane have been leading an effort to rescue Scholia. The hackathons were part of this effort. It seems
that [QLever](https://en.wikipedia.org/wiki/QLever) is the only route left. Earlier efforts to rewrite the more
than 350 Scholia SPARQL queries to support the graph split have basically failed. The complexity is far too high.
QLever, however, provides the full graph and since recently full SPARQL 1.1 support. That is also not enough to
reproduce the full Scholia functionality, but it seems to get us far.
Importantly, the data may not update as frequently as the [WDQS](https://www.mediawiki.org/wiki/Wikidata_Query_Service),
and that is another complexity to take into account. Particularly, all the 404 pages.

So, in the next weeks, we have to complete rewriting all those queries as queries that QLever can handle. A team
of people have done great work already, [including Konrad](https://github.com/ad-freiburg/scholia/issues?q=is%3Aissue%20author%3AKonradLinden).

I hope we make it in time.
