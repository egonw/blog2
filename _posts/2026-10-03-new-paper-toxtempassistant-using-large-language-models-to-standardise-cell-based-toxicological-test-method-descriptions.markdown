---
layout: post
title:  "New paper: \"ToxTempAssistant: using large language models to standardise cell-based toxicological test method descriptions\""
date:   2026-10-03
doi: 10.59350/v5ehk-42y77
tags: fair llm vhp4safety mycito:discusses:10.1080/2833373X.2026.2638036 cito:citesForInformation:10.14573/altex.1909271
  openscience cito:citesAsEvidence:10.5281/zenodo.17278785 cito:citesAsEvidence:10.5281/zenodo.17192970
  cito:discusses:10.1038/s41591-024-03425-5
image: /assets/images/ebt_preprint_tta_acceptance.png
comments:
  host: social.edu.nl
  username: egonw
  id: 117376077138627798
---

[Jente Houweling](https://orcid.org/0009-0005-3680-0645) published her first PhD thesis chapter earlier this year:
"ToxTempAssistant: using large language models to standardise cell-based toxicological test method descriptions"
(doi:[10.1080/2833373X.2026.2638036](https://doi.org/10.1080/2833373X.2026.2638036)). So far, I have been blogging about
many of the articles on which I am (co-)author. To put it in context. To reflect on the work. I have been postponing
writing about this paper because there is a lot to reflect on. I will pick out two things. First, I look at the use
of AI. The second is the unique, innovative publishing model of the journal where the article was published.
If you want to just see it in action, ToxTempAssistant is [running](https://toxtempassistant.vhp4safety.nl/)
on the Virtual Human Platform for safety assessment.

Before we go there, just a quick note on what ToxTemps are and ToxTempAssistent actually is:

> The ToxTemp template, based on OECD Guidance Document 211, standardises reporting for cell-based NAMs. However,
> completing its 77 questions constitutes a substantial bottleneck. The aim of this study is to introduce ToxTempAssistant,
> a Large Language Model (LLM)-assisted web tool that supports toxicologists in drafting ToxTemp documents based on
> user-supplied context documents. This study quantifies the tool’s baseline performance under controlled conditions.
> ToxTempAssistant uses grounded, per-question prompting with mandatory source attribution.

## The LLM aspects

AI is very old. Arguably, [my PhD thesis](https://chem-bla-ics.linkedchemistry.info/2009/05/04/thesis-and-copyright-transfer.html)
had this as key topic, though I preferred to use to term chemometric or machine learning.
Critical thinking has been essential to this field for a long time, and much of the PhD thesis is actually
about critically assessing the performance of the methods used in the thesis. There is decades of research
how you do this. Sadly, when it comes to Large Language Models (LLMs), these are not routinely used.

LLMs are indeed something new. I have seen [natural language processing](https://en.wikipedia.org/wiki/Natural_language_processing)
research when I was Cambridge with Peter Murray-Rust. The current LLMs are different, less deterministic, more probabilistic.
From a chemometrics perspective, that makes sense. Language is complex, and not so deterministic in itself. Moreover,
when representing words, sentences as numbers, you can integrate any resource (think data tables, images, etc). Even more,
digital representation was even more the central theme of my PhD thesis.

But because of the nature of the method, the nature of how the commercial, better known models are trained (and the
impact on the notion of copyright), the impact on the [climate emergency](https://en.wikipedia.org/wiki/Climate_crisis),
the black box that these LLMs often are, there are so many technical, scientific, and ethical reasons to stay away from them.

You can write books about that. Literally (I did not read them yet):

* [The Nerd Reich](https://en.wikipedia.org/wiki/The_Nerd_Reich)
* [The AI Con](https://en.wikipedia.org/wiki/The_AI_Con)

(I have the feeling I am missing one title I wanted to highlight. If I remember, I will add it.)

And more [here](https://www.goodreads.com/shelf/show/ai-critique) and [here](https://womeninaiethics.org/ai-ethics-book-list-for-2024/).
And I am looking forward to reading *Deep Unlearning: The Rise of AI and the Radicalization of a Tech Idealist*.
Also, I recommend at least following [Timnit Gebru](http://dair-community.social/@timnitGebru) and
[Emily Bender](https://dair-community.social/@emilymbender).

A year ago, I signed the [Open Letter: Stop the Uncritical Adoption of AI Technologies in Academia](https://chem-bla-ics.linkedchemistry.info/2025/08/18/ai-technologies-in-academia.html),
now signed by more than 2,000 people (it is [not too late](https://openletter.earth/open-letter-stop-the-uncritical-adoption-of-ai-technologies-in-academia-b65bba1e)).

So, with all these things mind, I am happy that Jente did critically adopt LLMs in her work. The paper includes
various experiments to explore the impact of various model parameters on generating nonsense. She also explored
to use of alternative LLMs platforms, opening the option that some day it runs on other, more ethical platforms.
ToxTempAssistant, moreover, limits the material it takes information from, from a limited set of sources, provided
by the users. Of course, the model itself is still training on resources with questionable provenance.

Jente's paper describes the use of positive and negative controls to put the performance in perspective.
In doing so, the paper formalizes how to evaluate the use of LLMs in situations where the LLM is used
to summarize other reports, a common thing to do. This allows us to monitor the impact of, for example,
new LLM releases.

The results are promising and various independent projects have shown interest in adoption. The ToxTemp
reports are important for safety assessment: they provide essential context to experimental results and
as such essential to the FAIR-ness of toxicology data.

## Open Peer Review

The ToxTempAssistant paper is published in the relatively new journal [Evidence-Based Toxicology](https://www.tandfonline.com/journals/tebt20) (EBT):

> Evidence-Based Toxicology is a broad-focus, gold open-access journal, created to support the use of open science practices and
> evidence-based methods in toxicology and environmental health.

So, CC-BY license (gold open access) and support for Open Science. And Open Peer Review, as we will see. Also,
I understand it is not a diamond open access journal, so expect APCs.

The journal has [a community on Zenodo](https://zenodo.org/communities/ebt/records) for preprints and peer-reviews.
I think this is a really nice choice. Of course, a journal specific preprint server has downsides too. For example,
if it gets rejected from EBT, do you use the EBT preprint server when submitting to another journal? Do you upload
a new version (after all, you should address some of the comments why it was rejected) to another preprint server?

The EBT preprint gets a record and revisions are uploaded as new versions to the same Zenodo record
(doi[10.5281/zenodo.17192970](https://doi.org/10.5281/zenodo.17192970)):

![](/assets/images/ebt_preprint_tta.png)

Because EBT uses open peer review, there is a parallel Zenodo entry with the reviews
(doi[10.5281/zenodo.17278785](https://doi.org/10.5281/zenodo.17278785)):

![](/assets/images/ebt_preprint_tta_reviews.png)

The last version here is the acceptance notice:

![](/assets/images/ebt_preprint_tta_acceptance.png)

One of the reviewer suggestions was to use the TRIPOD-LLM template
(doi:[10.1038/s41591-024-03425-5](https://doi.org/10.1038/s41591-024-03425-5)), which was included in a
later revision. That made a lot of sense and is a nice example how the journal actively works
on applying open science ideas. The journal webpage writes:

> We define “open science” as the set of practices aimed at improving the transparency, validity,
> reproducibility, and accessibility of scientific research, while promoting equality of
> opportunity to participate in and benefit from the products of said research.

One comment here is that the template asks on what page that point of the checklist is discussed
in the article. That is nice, but links it directly to the revision of the manuscript that
form applies too, but that is not reported in the template. Not ideal. Then again, the point
is the checking, so maybe not a big deal.

Another comment is that it seems the journal website's page for the article does not seem to actually
link to the preprints nor the peer-review reports (or acceptance note). So, in time, these
open science aspects of this article will likely get lost in time. Who will find those reports
if the article does not cite them? This will require Taylor&Francis to modernize the publishing
model, and I sincerely doubt that that will ever happen.

Prof. [Anne Kienhuis](https://orcid.org/0000-0002-6465-4498), one of the co-authors, suggested
this journal lead by Prof. [Paul Whaley](https://orcid.org/0000-0003-4021-0785).
And I am happy to have seen this new approach in action and like to thank Paul for pushing for
these innovations. I recommend trying it yourself for your next toxicology work.
