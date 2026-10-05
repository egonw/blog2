---
layout: post
title:  "Why you have not heard me much about chemometrics recently..."
date:   2010-11-20
blogger-link: https://chem-bla-ics.blogspot.com/2010/11/why-you-have-not-heard-me-much-about.html
doi: 10.59350/btban-6fp18
tags: cheminf chemometrics odosos opendata qsar doi:10.1080/10408340600969601
---

A casual reader my not know the background of the title of my blog. A bit over
five years ago, when I started this blog, [I defined chemblaics](http://chem-bla-ics.blogspot.com/2005/10/chem-bla-ics.html):

> Chemblaics (pronounced chem-bla-ics) is the science that uses computers to address and possibly
> solve problems in the area of chemistry, biochemistry and related fields. The general denomiter
> seems to be molecules, but I might be wrong there. The big difference between chemblaics and
> areas as cheminformatics, chemoinformatics, chemometrics, proteochemometrics, etc, is that
> chemblaic only uses open source software, making experimental results reproducable and validatable.
> And this is a big difference with how research in these areas is now often done.

Later, I also identified *molecular chemometrics* (doi:[10.1080/10408340600969601](http://dx.doi.org/10.1080/10408340600969601))
when I reviewed important innovation in the field, which has, IMHO, a strong
overlap with chemblaics. Any reader of my blog will understand that I see semantic
technologies play a very important role here, as Open Standard for communication
Open Data between the bench chemist and the data analyst using Open Source allowing
others to reproduce, validate, and extend that work. Some have identified the
possibilities the internet brings over 10 years ago, while the use of semantic
computing goes back even further.

And what have the big publishers done? Nothing much yet. Not the old, not the
new. There are project ongoing, and there is a tendency (BioMed Central starts
delivering Open Data, Beilstein Institute spits RDF for a few years now, Royal
Society of Chemistry has Project Prospect), but most publishers are too late,
and not investing enough with respect to their yearly turn over. This is particularly
clear if you realize that *citizen and hobby scientists* can innovate publishing
more effectively than those projects (really!). Anyway, I do not want to talk
about publishing now, but it is just so relevant: I am not a publisher, but
publications are the primary source of knowledge (not implying at all that I
think that is the best way; it is not).

Instead, I am a data analyst, a chemometrician, a statistician, a cheminformatics
dude, or a (pharmaceutical) bioinformatician, depending on your field of expertise.
Really, I am a chemblaics guy: I apply and develop informatics and statistics
methods to understand chemistry (and biology) better.

During my PhD it became painfully clear that current science is horribly failing,
in many ways:

* Firstly, we are hiring the wrong people because we care more about a co-authored
  pipetting paper in Nature, than ground-breaking work in the J. Chem. Inf.
  Mod. (what journal?! Exactly my point!).
* Secondly, we have our most bright scientists (the full time professors, assuming
  that some have been hired for the right reasons) spend most of their time
  on administrative work (like proposal writing, administrating big national/EU
  projects).
* Thirdly, we spent million (in whatever currency) on large projects which end
  in useless political discussions instead of getting science done.
* Finally, all knowledge from laborious, hard work is placed in PDF hamburgers
  and lost to society (unless you spend multibucks to extract it again).

There are likely several more, but these three are the most important to me
right now.

So, in the past years after finishing my PhD research which was on data mining
and modeling molecular data, I have spend much of my time on improving methods
in chem- and bioinformatics to handle. Hardly anyone else was doing it (several
Blue Obelisk community un-members as prominent exceptions), but someone has.

Why I have been doing this? Well, without good, curated data sources it is impossible
to decide why my (or others) predictive models are not working (as good as we
want them to be). Is this relevant? I would say so, yes! The field is riddled
with irreproducible studies of which one has no clue how useful they are. Trust
the authors who wrote the paper? No, thank you, but I rather verify: I am a
scientist and not a cleric. Weirdly, one would have expected this to be the
default in cheminformatics, where most stuff is electronic and reproducing results
should be cheap. Well, another fail for science, I guess.

So, that explains why I have not recently done so much in chemometrics. Will
I return? Surely! Right about now. There is already a paper *in press* where
we link the semantic web to (proteo)chemometrics, and more is to follow soon.

One example, interestingly, is pKa prediction, which has seen quite a few publications
recently, yet experimental pKa data is not available as Open Data. Why?? Let
me know if you have any clue. Yet, pKa prediction seems to be important to drug
discovery, as it gets an awful lot of attention (400+ papers in the past 10
year, of which 50+ in 2010!). But this is about to change. Samuel and I are
finishing a project that greatly simplifies knowledge aggregation and curation,
as input to statistical modeling. We now have the tools ready to do this fast
and efficiently. Right now, I am entering curated data at a speed of about 3
chemical structures a minute. That means, given I need a break now and then,
that I enter create a data set of reasonable size in a few days. Crowd-sourcing
this, the a small community can liberate data from literature in a few days.

This will have a huge impact on the cheminformatics and QSAR communities. They
will no longer have any excuse for making their data not available. There is
no argument anymore that curation is expensive. This will also have a huge impact
on cheminformatics and chemical data vendors. Where Open Source only had moderate
impact so far (several software vendors have already joined the Open Source
cheminformatics community), this will force them to rethink their business model.
Where they could hide behind curation where it came to text mining initiatives
(like Oscar, on which I am currently working), with cheap, expert curation knowledge
building at hand, they will be forced to rethink their added value.

The impact on the CDK should be clear too. We no longer depend on published
models for ALogP, XLogP, pKa, etc, predictions. Within a year, you can expect
the CDK project to release the tools to train your own models, and make choices
suitable for your user base. For example, you can make more precise models around
the structures your lab works on, or more generic models with large screening
projects. Importantly, the community will provide an Open Data knowledge base
to start from. Using our Open Standards, you can plug in your own confidential
data and make mixed, targeted models.

Is this possible with the cheminformatics of the past 30 years? No, and that's
the reason why I have been away from chemometrics for a while.
