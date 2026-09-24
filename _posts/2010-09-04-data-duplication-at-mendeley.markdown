---
layout: post
title:  "Data duplication at Mendeley"
date:   2010-09-04 00:00
blogger-link: https://chem-bla-ics.blogspot.com/2010/09/data-duplication-at-mendeley.html
doi: 10.59350/v88dk-dxc88
tags: opendata publishing
image: /blog/assets/images/readermeter.png
---

Earlier this year I gave [Mendeley](http://www.mendeley.com/) a try, after having been a happy
[JabRef](http://jabref.sourceforge.net/) user, unhappy [Connotea user](http://www.connotea.org/user/egonwillighagen)
(main problem was that any URI can be bookmarked, not just papers, so very noisy), happy
[CiteULike user](http://www.citeulike.org/user/egonw) (and still am). But the client did not bring me
what I needed, and I canceled my account again.

Since then, Mendeley has undergone a transformation, and there is talk about
[OpenSourcing the client](http://blindscientist.genedrift.org/2010/08/28/mendeley-open-source-possible-revenue-streams/)
(or not), [Open Data](http://iphylo.blogspot.com/2010/08/on-being-open-mendeley-and-open-data.html),
and an [Open Standard API](http://www.slideshare.net/bendowling/mendeley-open-api). But, importantly,
I no longer need the client and can do everything in the browser.

Moreover, Mendeley has momentum and is starting to provide interesting apps around the API, such as
[readermeter.org](http://readermeter.org/willighagen.egon_l/refresh). And since being a scientist is
playing the publishing game, one just must add once papers to these systems, just advertise them:

![](/blog/assets/images/readermeter.png)

This brings us to problem #1: author identity, which is a general problem and addressed by projects
like [ORCID](http://blogs.nature.com/mfenner/2010/01/03/orcid-or-how-to-build-a-unique-identifier-for-scientists-in-10-easy-steps).
So, besides the page shown above, I have a second page under an entry with just
[my first name](http://readermeter.org/willighagen.egon/refresh).

But, as the title of the post suggests, Mendeley suffers from a second problem, which was recently
brought up by [Duncan](http://duncan.hull.name/) in his
[How many unique papers are there in Mendeley?](http://duncan.hull.name/2010/09/01/mendeley/) post.
Mendeley, apparently, claims 36M papers, but the number of unique papers is much smaller, as detailedly outline by Duncan. [Mr. Gunn](http://synthesis.williamgunn.org/) replied that *[d]uplicates are understandably
enriched among the popular papers, such as yours, and it’s harder to go from 6 duplicates to 1
canonical document than from 2 to one, because the variability is higher*
(see [this comment](http://duncan.hull.name/2010/09/01/mendeley/#comment-4681)), but I do not buy that.

I replied in the blog about that claim and also made a suggestion: this dereplication should really be a
crowd-sourcing event, but I found it impossible to find a place to report duplication, so I had to use a
*message to support* form and a uninformative category *Other*. If I was working in Mendeley, I would
make this reporting a key technology behind [their dereplication efforts](http://feedback.mendeley.com/forums/4941-mendeley-feedback/suggestions/142951-check-for-duplicates?ref=title).

Anyway, the duplication goes deep, very deep into the long tail. And really, my papers are fairly
well received in general (many of my papers in BMC journals are 'Highly Accessed'; I did request
some distinction there, using the StackOverflow gold, silver, bronze system), but incomparable with
the highly bookmarked papers in Mendeley. I know this is probably not something Mendeley likes to
hear, but the paper duplication goes deep, very deep too: a majority of my papers show duplicates.
A semi-exhaustive scan showed me duplication for the XMPP paper ([here](http://www.mendeley.com/research/xmpp-cloud-computing-bioinformatics-supporting-discovery-invocation-asynchronous-web-services/)
and [here](http://www.mendeley.com/research/xmpp-for-cloud-computing-in-bioinformatics-supporting-discovery-and-invocation-of-asynchronous-web-services/)),
the Blue Obelisk paper ([here](http://www.mendeley.com/research/the-blue-obeliskinteroperability-in-chemical-informatics/),
[here](http://www.mendeley.com/research/the-blue-obelisk-interoperability-in-chemical-informatics/), and
[here](http://www.mendeley.com/research/the-blue-obelisk-interoperability-in-chemical-informatics-1/);
yes, three copies), the CDK-Taverna paper ([here](http://www.mendeley.com/research/cdktaverna-open-workflow-environment-cheminformatics-1/)
and [here](http://www.mendeley.com/research/cdktaverna-open-workflow-environment-cheminformatics/)),
the Bioclipse 2 paper ([here](http://www.mendeley.com/research/bioclipse-2-scriptable-integration-platform-life-sciences/)
and [here](http://www.mendeley.com/research/bioclipse-2-scriptable-integration-platform-life-sciences-1/)),
the userscripts paper ([here](http://www.mendeley.com/research/userscripts-for-the-life-sciences/)
and [here](http://www.mendeley.com/research/userscripts-life-sciences/)), the CDK I paper
([here](http://www.mendeley.com/research/the-chemistry-development-kit-cdk-an-opensource-java-library-for-chemo-and-bioinformatics/) and
[here](http://www.mendeley.com/research/the-chemistry-development-kit-cdk-an-opensource-java-library-for-chemoand-bioinformatics/)), and the CDK II paper
([here](http://www.mendeley.com/research/recent-developments-of-the-chemistry-development-kit-cdk-an-opensource-java-library-for-chemo-and-bioinformatics/) and
[here](http://www.mendeley.com/research/recent-developments-chemistry-development-kit-cdkan-opensource-java-library-chemoand-bioinformatics/)).

Hopefully, by the time you read this post, at least some above the above links no longer work. In that respect, I would also like to request URIs based on the DOI instead.


