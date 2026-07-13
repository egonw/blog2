---
layout: post
title:  "Carbon beats gold: Diamond Open Access is the future #2"
date:   2026-07-13
doi: 10.59350/gfrxs-bxn43
tags: openaccess mycito:citesAsRecommendedReading:10.5281/ZENODO.4926030 cito:includesQuotationFrom:10.1038/d41586-026-02167-3
  cito:citesAsDatasource:10.64898/2026.06.30.735556 cito:citesForInformation:10.15291/libellarium.4569
image: wikidata_diamondOA_journals.png
comments:
  host: social.edu.nl
  username: egonw
  id: 116914558496819636
---

We need a lot more than [diamond open access](https://chem-bla-ics.linkedchemistry.info/2026/07/13/carbon-beats-gold-diamond-open-access-is-the-future.html)
to really improve the publishing models. That said, but there are [examples that](https://chem-bla-ics.linkedchemistry.info/2024/09/16/publishing.html)
[diamond open access publishers](https://chem-bla-ics.linkedchemistry.info/2025/02/13/beiltein-journal-has-bioschemas.html) actually want to
improve more just the access to the knowledge dissemination infrastructure.
But infrastructure is not only technologies; it also includes the many social aspects that are involved in adoption.
And we saw [enough of that in the open access transition](https://chem-bla-ics.linkedchemistry.info/2026/07/13/carbon-beats-gold-diamond-open-access-is-the-future.html).

One aspect that limits the uptake of diamond open access models is that the scholarly community needs to change
their trust model. We have seen a transition from societal publishers to commercial publishers, from scholarly-led
to publisher-led. And commercial publishers certainly [breached my trust](https://chem-bla-ics.linkedchemistry.info/2021/06/11/conflict-of-interest-or-why-i-am.html)
(see also doi:[10.5281/zenodo.4926030](http://doi.org/10.5281/ZENODO.4926030)).

Many scholars prefer the certainty of a scholarly journal where they can trust that the editorial board and
their reviewers take their job seriously. This matters. The notion that peer reviewers may reject your work is an
extrinsic motivation for at least some researchers to do a better job (personal communication). And that feature
works well: there are indications that research published as preprint sees limited change after the formal
peer review process (doi:[10.1038/d41586-026-02167-3](https://doi.org/10.1038/d41586-026-02167-3) and
doi:[10.64898/2026.06.30.735556](https://doi.org/10.64898/2026.06.30.735556)):

> “For most scientists, reputation is important, and they would not upload something they would not be comfortable
> with publishing in a journal later.”

In an ideal situation, reputation would not be part of the whole equation: researchers never submit anything they think
is not scientifically sound. Journals would never desk-reject an article that is scientifically sound. The question
is mostly how to reach that. Everyone is busy, and it has not been so long ago that the journal impact factor was
by many as indicator of scientific quality. The reality is far more complex than that.

## Finding Diamond Open Access journals

So, let's assume you are interested in the idea, and want to know what diamond open access journals exist in your
research field, before you can even consider the quality of that journal, you need to know which journal is diamond
open access. Therefore, I [asked yesterday on Mastodon](https://mastodon.social/@egonw/116906626546588093) about databases that list
which journal are diamond.

It actually turns out that the [Directory of Open Access Journals](https://doaj.org/) (DOAJ) does not indicate
if a journal is diamond. You can filter on zero APC, but that is not the same. In fact, zero APC is routinely used
by big publishers to launch new journals. One they have critical mass, they will start charging non-zero APCs.

I already received some replies about possible options:

1. [Diamond Discovery Hub](https://ddh.edch.eu/en): lists just over 4,000 diamond journals, but seems closed data (thx [Najko](https://bsky.app/profile/najko.bsky.social/post/3mqh25otvvk2z)! see also doi:[10.15291/libellarium.4569](https://doi.org/10.15291/libellarium.4569))
2. [wheretopublish.github.io](https://wheretopublish.github.io/): open data, accepts additions, but lists only 9 diamond journals (thx [Anne](https://bsky.app/profile/annecmg.bsky.social/post/3mqj4envqns24)!)
3. [B!SON](https://service.tib.eu/bison/): a recommender that depends on DOAJ, so also without clear diamond indication (thx [Jon](https://degrowth.social/@yala/116906904947384383)!)

All pieces of the puzzle.

When I grew up as a scholar, I learned to publish in journals where you respect the research, where you see important
research in your field get published. Nowadays, this is changing. In fact, young researchers (tho many older scholars alike)
fear to publish in predatory journal by accident (really! `[citation_pending]`). The big publishers and the new
publishers have been adding so many new journals, and academia has really pushed the "publish as many articles
as you can" model, that it kind of makes sense why things are different now.

And, a central database with trustworthy information about the quality of diamond open access journals
is just needed.

A final note, while I have not been able to create a list of diamond open access journals with OpenAlex,
already in February 2025 I found a way to list [articles tagged with a *diamond status*](https://edu.nl/q3uf3).
This query lists over three thousand of such annoated articles for Maastricht University:

![](/assets/images/openalex_diamondOA_UM_articles.png)

(Interestingly, the journal where the three most cited articles were published turned diamond already in 2004
and was discontinued about half a year go "Due to recent changes in operational resources",
[according to Wikipedia](https://en.wikipedia.org/wiki/Environmental_Health_Perspectives).)

## Building trust

So, while the above solution do allow you to increase your success rate or finding a diamond open access journal
in your field, the next question is: what can you learn about this journal. For example, what does Wikipedia
say about the journal (if anything)? Do you know people that have published in that journal? The OpenAlex
screenshot shows

That make me wonder what [Wikidata](https://www.wikidata.org/) has to offer. After all, as one of the largest
linked open data sources, they must have some information.

I am not disappointed. The *type* [diamond open-access journal](https://www.wikidata.org/wiki/Q108440863) is actively
used, and there is plenty of other of useful fields for these journals. I came up with
[this SPARQL query](https://edu.nl/xh7h9) (with some QLever sugar for labels):

```sparql
PREFIX wdt: <http://www.wikidata.org/prop/direct/>
PREFIX wd: <http://www.wikidata.org/entity/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
SELECT DISTINCT ?diamondJournal ?diamondjournalLabel
      # (SAMPLE(?url_) AS ?website)
      (SAMPLE(?issnl_) AS ?issnl)
      (GROUP_CONCAT(DISTINCT STR(?issn_)) AS ?issn)
      (SAMPLE(?lang_) AS ?language)
      (SAMPLE(?doaj_) AS ?doaj)
      (GROUP_CONCAT(DISTINCT STR(?subject);separator=", ") AS ?subjects)
WHERE {
  ?diamondJournal wdt:P31 wd:Q108440863 .
  OPTIONAL { ?diamondJournal wdt:P236 ?issn_ }
  OPTIONAL { ?diamondJournal wdt:P7363 ?issnl_ }
  OPTIONAL { ?diamondJournal wdt:P856 ?url_ }
  OPTIONAL { ?diamondJournal wdt:P407 / @en@rdfs:label ?lang_ }
  OPTIONAL { ?diamondJournal wdt:P5115 ?doaj_ }
  OPTIONAL { ?diamondJournal wdt:P921 / @en@rdfs:label ?subject }
  ?diamondJournal @en@rdfs:label ?diamondjournalLabel .
} GROUP BY ?diamondJournal ?diamondjournalLabel
```

This lists more than 1,500 diamond open access journals:

![](/assets/images/wikidata_diamondOA_journals.png)

With Wikidata we can then [list UM authors that published in diamond journals](https://edu.nl/ekbq9).
That list is remarkably short, however, if you compare it with the earlier results from OpenAlex. That is because
Wikidata only contains a subset of scientific literature and not all articles are correctly linked to the items
about their authors. But I also spotted journals in the OpenAlex list that are not really diamond.

## What is next?

Clearly, we need better metadata, but things are not looking that bad either! We have something to work with.
What is your favorite diamond open access journal?
