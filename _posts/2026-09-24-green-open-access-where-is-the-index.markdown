---
layout: post
title:  "Green Open Access: where is the index?"
date:   2026-09-24
doi: 10.59350/1qayb-w6z38
tags: publishing openaccess
image: /assets/images/greenOA_URLs.png
#comments:
#  host: social.edu.nl
#  username: egonw
#  id: ...
---

[Gold Open Access](https://legacy.earlham.edu/~peters/fos/overview.htm) is literature that has an explicit open license, like CC-BY.
It optionally has an article processing charge (APC). It optionally charges APC to make profit or to fund other activities, like
some societies do.
[Green Open Access](https://legacy.earlham.edu/~peters/fos/overview.htm) is literature that has been made available by
repositories. It optionally has an open license. It optionally has a standardized license, like CC-BY. But it can also
be that no clear license is given or the "license" refers to some (local) law.

Many universities have green Open Access repositories, like [Maastricht University](https://cris.maastrichtuniversity.nl/)
and [Radboud University](https://repository.ubn.ru.nl/). These repositories are scattered and contrary to FAIR principles,
metadata is not shared widely.
Of course, prominently, scholarly publishers could provide that information. Any paywalled journal article could have a link to
a legal green open access version. It could. It would make total sense if spreading scientific knowledge is your goal.
But we live in an alternate universe.

We are relying on third-party indexes. I here briefly describe two options, but love to read blog posts about other
alternatives! I am not looking for routes like [PubMed Central](https://pmc.ncbi.nlm.nih.gov/) or
[Europe PMC](https://europepmc.org/) that come with huge collections of open-licensed content, including
[in the FAIR JATS format](https://chem-bla-ics.linkedchemistry.info/2024/09/16/publishing.html)

It's really the non-OA-licensed green Open Access that we need to get indexed better.

Oh, and, of course, [all Dutch literature must become green Open Access](https://chem-bla-ics.linkedchemistry.info/2026/08/07/scientias-oudheidkunde-wetenschap-hoe-dan.html).

## OpenAlex

[Unpaywall](https://unpaywall.org/) (see also [this post](https://chem-bla-ics.linkedchemistry.info/2025/01/04/isaac-browser-extension.html))
has been collecting open access versions but is [now including in OpenAlex](https://help.openalex.org/access/unpaywall/#unpaywall-and-openalex).
The [annotation is quite rich](https://help.openalex.org/data/works/open-access/) and here the question is more,
how can the open science community enrich this OpenAlex content.

## Wikidata and WikiCite

[Wikidata](https://www.wikidata.org/) and [WikiCite](https://www.wikidata.org/wiki/Wikidata:WikiCite) are projects aligned with
Wikipedia, and *[citation needed]* is an
essential part of that. We have [used it in our research](https://chem-bla-ics.linkedchemistry.info/tag/wikidata)
in multiple occassions. The curation process is transparent, providing the essential provenance
needed for scientific research.

It provides the [work available at URL](https://www.wikidata.org/wiki/Property:P953) property and it
has been used to link to green Open Access versions. The extend, however, is less clear (to me). But another
problem is that Wikidata does not have the ambition to be a generic solution. That said, all extra links
help.

## Schema.org and web search indexes?

That leaves me, for now, with the role of generic web searching. Doesn't that help? I can just search for
the article title, right? Well, yes. But the process of how to get your green open access article indexed
is not clear. There are many metadata standards that your repository needs to support (e.g.
[OpenAlex lists 8](https://help.openalex.org/access/unpaywall/#unpaywall-and-openalex) and that does not include schema.org)
and that does not guarantee you get indexed. Worse, commercial companies are know to remove content in a opague
process, like with [this video about the Meta gluurbril](https://mastodon.social/@Roelmaalderink/117319021973126519).
We cannot trust that green open access metadata gets preserved.

Maybe [open web indexes](https://motherduck.com/blog/querying-the-entire-internet-100-billion-rows-with-motherduck/)
will make a difference, but then we still need a simple API to integrate into our tools that just
returns the information. I had a go at this last weekend. It would look
[something like this](https://mastodon.social/@egonw/117302574373386172):

![](/assets/images/greenOA_URLs.png)

But things go slowly, and FAIR metadata most certainly. But if we consistently take steps, things do change.
For example, after 20+ years, CrossRef now supports [blog as research output type](https://www.crossref.org/blog/schema-5.5-now-available-adding-credit-new-record-types-for-blogs-and-posters-and-more/).

I like to stress, metadata is being shared by repositories, but we should support this a bit more. We should
reuse that data, support that, curate that, etc. Let's support our fellow open science community members!
And that starts by sharing our knowledge on how all this works, does not work, could work, and
what small steps we can take today and tomorrow. Looking foward to your ideas!
