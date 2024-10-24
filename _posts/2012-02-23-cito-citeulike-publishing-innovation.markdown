---
layout: post
title:  "CiTO / CiteULike: publishing innovation"
date:   2012-02-23
blogger-link: https://chem-bla-ics.blogspot.com/2012/02/cito-citeulike-publishing-innovation.html
tags: citeulike cito justdoi:10.1186/2041-1480-1-S1-S6 rdf
image: /assets/images/culcito1.png
doi: 10.59350/25dgb-j2y93
---

Readers of my blog know I have been using the Citation Typing Ontology, CiTO (doi:[10.1186/2041-1480-1-S1-S6](http://dx.doi.org/10.1186/2041-1480-1-S1-S6)).
I allows me to see [how the CDK](http://chem-bla-ics.blogspot.com/2010/02/citing-chemistry-development-kit.html) is
[cited and used](http://chem-bla-ics.blogspot.com/2010/10/citeulike-cito-use-case-1-wordles.html). CiteULike is currently adding more CiTO more functionality,
which they [started](http://chem-bla-ics.blogspot.com/2010/09/list-of-things-i-miss-in-citeulike.html) doing almost one and a half years ago.

One of the things, is that the CiTO data added via a certain account, can be downloaded as triples:

![](/assets/images/culcito2.png)

The second is that they are improving the graphics of how it is visualized. E.g. they added an 'Expand' link, which I found when they
[tweeted](https://twitter.com/#!/citeulike/status/172446830666321921) they had hidden drag-n-drop, which I haven't found yet, though.
Clicking that action, will show you the following:

![](/assets/images/culcito.png)

Because CiteULike takes advantage of the [inverse function](http://www.w3.org/TR/owl-ref/#InverseFunctionalProperty-def) of the CiTO predictates,
they show up with the cited paper too, which is less suitable for the top-down flow graphics:

![](/assets/images/culcito1.png)

To make this advertorial a bit balanced, not all [my wishes](http://chem-bla-ics.blogspot.com/2010/09/list-of-things-i-miss-in-citeulike.html) have been
implemented yet, and the next up from my perspective should be Linked Data. There is some Linked Data embedded as RDFa, but the latter is not turning out
to be the killer I had hoped, and regular RDF entry points should be used.

Each CiteULike entry (post) should get a unique [IRI](http://en.wikipedia.org/wiki/Internationalized_Resource_Identifier) (or
[URI](http://en.wikipedia.org/wiki/Uniform_resource_identifier)) and opening that link should give RDF about that post
([wish #10](http://www.citeulike.org/groupforum/2191)). That's is [dereferencibility](http://en.wikipedia.org/wiki/Dereferenceable_Uniform_Resource_Identifier).
The RDF can be, for example, in [BIBO](http://bibliontology.com/) but there are many alternatives, and I have not been keeping up with which is the best
(please leave a comment, if you have an opinion on that).

But I like where this is going! Thanx, CiteIReallyLikeThis!
