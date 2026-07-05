---
layout: post
title:  "BitTorrents for Science"
date:   2010-04-18
blogger-link: https://chem-bla-ics.blogspot.com/2010/04/bittorrents-for-science.html
doi: 10.59350/0z9nh-6ed21
tags: opendata justdoi:10.1371/journal.pone.0010071
modified_date: 2026-07-05
---

The idea has been lingering in the air for a long time now: sharing large science data sets using [bittorrent](http://en.wikipedia.org/wiki/BitTorrent_%28protocol%29).
Over the past couple of years I have seen a lot of science related software being distributed over torrents, and the use in open source in general is abundant.
Given a good network of so-called seeders, download times go down dramatically, and the overall energy consumption goes down too, as data has to follow a much
shorter path.

It could very well be that the uptake of this technology for sharing data is only now coming about because only recently we started caring about Open Data
licenses, which formally take care of rights of redistribution, which is obviously crucial to setting up a torrent network. Initiatives like the
[Panton Principles <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/02/19/open-data-panton-principles.html) are changing this, even though we had a good deal of
Open Source-licensed data for many years already.

So, with an increasing amount of Open Data, the time was now right, according to the authors [Morgan](http://betascience.blogspot.com/) and
[Jonathan](http://phylogenomics.blogspot.com/), to set up BioTorrents, and publish a paper in PLoS ONE: *BioTorrents: A File Sharing Service for Scientific Data*
(doi:[10.1371/journal.pone.0010071](http://dx.doi.org/10.1371/journal.pone.0010071)). I have to admit, that I do not particularly like the design of
the website, and I think it could do with more social web integration, but importantly, they provide a *tracker*. Trackers are key parts (well, they
are being made obsolete, though I am not up-to-date with the state of that evolution), and work as a service discovery hub. Additionally, the
website gives means to find data, and allow categorising torrents.

It is worth nothing that the uptake has been minimal so far, since the [idea was posted last October](http://betascience.blogspot.com/2009/10/biotorrents-file-sharing-resource-for.html).
But it is slowly being picked up, or at least [blogged](http://secretmicrobe.org/biotorrents-is-born)
[about](http://blogs.nature.com/news/thegreatbeyond/2010/04/improving_the_portability_of_d_1.html).

## How to make BioTorrent work?

The success of BioTorrent will very much depend on the user base. This is common to social web applications, and a recent accidental loss of
torrents is unforgivable; well, personally, I was happy to upload [my torrent](http://www.biotorrents.net/details.php?id=50) once more, but would
not have done that if I had many torrents uploaded already. Torrent content is distributed, but the tracker information is not. Backup, backup,
backup. Oh, and backup :) It happens to the best of us. Additionally, it is worth realising that the service needs to give something back to the
user. Traditionally, I always thought this had the be of actual use, but a recent post by Rich actually suggested that even a
[game mechanic](http://depth-first.com/articles/2010/03/26/game-mechanics-in-science-your-soaking-in-them) may be enough. Indeed, websites like
[ChemPedia.com](http://chempedia.com/substances) and [Blue Obelisk eXchange](http://blueobelisk.shapado.com/) implement this by means of
personal karma, allowing people to compete in high score lists. Also, APIs to integrate with other tools are crucial, such as personal RSS
feeds to allow posting my new torrents to, for example, [FriendFeed](http://friendfeed.com/egonw) and [Identica](http://identi.ca/chemblaics).

But, the by far most important feature for BioTorrents will be to set up a reliable network of seeders. I already
[mentioned this on FriendFeed](http://friendfeed.com/betascience/3d17a069/biotorrents-manuscript-accepted) where I suggested university libraries
to get involved. Ideally, every library will act as seeder in torrent networks, so that typically, you will download the data directly from your
local library, instead of the other end of the world. For data sets of GB size or larger, this is going to have an important environmental impact,
on top of the much higher download speed.
