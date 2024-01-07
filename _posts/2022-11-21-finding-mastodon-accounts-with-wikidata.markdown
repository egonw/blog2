---
layout: post
title:  "Finding Mastodon accounts with Wikidata (a few SPARQL queries)"
date:   2022-11-21
blogger-link: https://chem-bla-ics.blogspot.com/2022/11/finding-mastodon-accounts-with-wikidata.html
tags: mastodon sparql wikidata rdf orcid
image: /assets/images/Screenshot_20221121_075015.png
---

There are multiple initiatives to support the migration from Twitter to Mastodon (see also
[this blog post <i class="fa-solid fa-recycle fa-xs"></i>](2022-11-12-stwittermastodong.markdown)). But
[Wikidata](https://wikidata.org/)
should not be forgotten here which has been tracking Mastodon accounts of things in their database:

![Screenshot of a Wikidata query showing the growth in number of Mastodon accounts listed in Wikidata.](/assets/images/Screenshot_20221121_075015.png)

So, here are some [Wikidata SPARQL](https://query.wikidata.org/) queries to see the uptake:

* [Universities with Mastodon](https://w.wiki/5$3w)
* [All Mastodon accounts in Wikidata](https://w.wiki/5$42) (or [subset with also a Twitter account](https://w.wiki/5$4S))
* [Nobel Prize winners with Mastodon](https://w.wiki/6zFm)
* [Academic journals with Mastodon](https://w.wiki/5$4V)
* [People with Mastodon that published in a PLOS journal](https://w.wiki/5$4a) (you can pick another publisher)
* [Find your co-authors with your ORCID](https://w.wiki/5$4e) (just replace my ORCID with yours)

If you find yourself missing, back in April I [tweeted](https://threadreaderapp.com/thread/1519193166188007424.html) (sorry)
how you can find yourself and others in Wikidata and how to add your or their Mastodon account.
