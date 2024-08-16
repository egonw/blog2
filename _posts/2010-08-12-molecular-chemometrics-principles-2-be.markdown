---
layout: post
title:  "The Molecular Chemometrics Principles #2: be clear in what you mean"
date:   2010-08-12
modified_date: 2024-05-18
blogger-link: https://chem-bla-ics.blogspot.com/2010/08/molecular-chemometrics-principles-2-be.html
tags: mcprinciples chemometrics rdf cml semweb doi:10.1080/10408340600969601
doi: 10.59350/dzqvt-ynv20
---

I noted [earlier this week](https://chem-bla-ics.linkedchemistry.info/2010/08/09/molecular-chemometrics-principles-1.html)
that *[d]uring the week [in [Oxford <i class="fa-solid fa-recycle fa-xs"></i>](/2010/08/06/oxford-2.html)], someone (name and address is know at the
editorial office) commented on the fact that my blog posts are somewhat difficult to follow; that is, it's
often not clear why I am posting what I am posting*. This triggered the start of a series of principles in
the field I coined [Molecular Chemometrics](https://doi.org/10.1080/10408340600969601), and the promise
that I will try to indicate in each blog post to which of these principles it relates. Just to put things in a bit more
perspective; to make a bit more clear why I am blogging about that bit; just to be clear in what I mean.

Now, the first principle was about the need for access to data ([McPrinciple #1](https://chem-bla-ics.linkedchemistry.info/2010/08/09/molecular-chemometrics-principles-1.html)).
This principle goes without saying, one would think, but is not widely accepted yet. This is why Open Data promotion is still needed. For example, data in papers
still is not freely redistributable, as [Peter points out once again](https://chem-bla-ics.linkedchemistry.info/2010/08/09/molecular-chemometrics-principles-1.html).

Anyway, this post is not about McPrinciple #1, but about the second principle.

**Molecular Chemometrics Principles #2**: In order to reproduce cheminformatics studies you need to be able to understand the input data.

Readers of my blog will surely recognize this theme. Clearly this theme explains my past fetish for the
[Chemical Markup Language](http://chem-bla-ics.blogspot.com/search?q=CML), and my more recent work on the
[Resource Description Framework](http://chem-bla-ics.blogspot.com/search?q=RDF).

And it is so easy to jump to conclusions. Easy to make mistakes. And this is not just at the received side; the sending
person may have accidentally made a mistake, or left something accidentally unclear, causing incorrect assumptions, and
therefore errors in the cheminformatics computation. Now, if the data was semantically (clearly) annotated, and the
meaning was clear, it was also trivial to see when a mistake had sneaked in. Think of it as a check bit.

"Well, isn't this a bit exaggerated," you might say. Perhaps, perhaps not. An simple, recent example. We all know
[SMILES](http://www.opensmiles.org/), right? And we all know that lower case element symbols indicate aromaticity, right?
That is, c1ccccc1 is aromatic, right? So, what's the problem then?

Now, consider the SMILES string c1ccc1. Lower case carbon element symbols, so aromatic, right? Oh, wait...

Therefore, be clear in what you mean. It saves us from a lot of trouble.

Further reading:

* [The Molecular Chemometrics Principles #1: access to data](https://chem-bla-ics.linkedchemistry.info/2010/08/09/molecular-chemometrics-principles-1.html)
* Molecular Chemometrics, 2006 (doi:[10.1080/10408340600969601](https://doi.org/10.1080/10408340600969601))
