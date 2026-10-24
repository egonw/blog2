---
layout: post
title:  "Chemical data curation: yes, it is that bad."
date:   2011-02-09
blogger-link: https://chem-bla-ics.blogspot.com/2011/02/chemical-data-curation-yes-it-is-that.html
doi: 10.59350/1k4qd-9tc04
tags: chemistry chemspider inchi opendata qsar justdoi:10.1007/s10822-010-9335-7
---

The readers of [Antony's blog](http://www.chemconnector.com/chemunicating/)
know enough about the problem. And many in the QSAR community know it too (and
many other do not). Chemical structure data is noisy. I haven't recently created
a new local data set for analysis, so I have not taken time to blog about it
much, but the ambiguity in chemical databases is enormous. Just yesterday, Antony
and I had a [good](http://www.chemconnector.com/chemunicating/different-approaches-to-storing-structures-and-inchis-on-chemspider.html)
[discussion](http://blueobelisk.shapado.com/questions/where-can-i-get-inchis-with-a-fixed-hydrogen-layer)
about tautomers and in particular how things are linked together.

If we are in the field of property prediction, knowing what tautomer to calculate
descriptors for is crucial. Not that we actually have easy access to experimental
data showing what the important tautomer is for our end-point (predicted property),
but at least we can track what tautomer we modeled with. Has everyone ever asked
you to add units to experimental values? Like "*the temperarature was 279 degrees;
Celsius or Kelvin??*" Well, this is the exact same thing. If your QSAR model
training report does not include that information, you are doing it wrong. (/me
ducks)

So, why does it in fact matter? It matter simply because calculated properties
are different. Backing up to the ChemSpider example in my [question about InChIs
with the fixed-hydrogen layer](http://blueobelisk.shapado.com/questions/where-can-i-get-inchis-with-a-fixed-hydrogen-layer)
I noted that (like in many other databases) the synonyms seems to include IUPAC
names for at least two tautomers. However, while the ChemSpider is, in fact,
for the tautomer-independent structure (using the InChI mobile hydrogen layer;
and keep in mind that the InChI uses only a limited amount of heuristic rules
for identifying tautomers, making it not detect all 40 tautomers of [warfarin](http://en.wikipedia.org/wiki/Warfarin)),
the 2D diagram, the 3D model, and the calculated properties reflect only *one*
tautomer.

And calculated properties are exactly the input in QSAR's statistical modeling.
It is interesting to realize that the differences in calculated molecular descriptors
can vary both minimally, or not at all, as drastically. Very drastically, in
fact. The recent paper by Porter (doi:[10.1007/s10822-010-9335-7](https://doi.org/10.1007/s10822-010-9335-7))
shows the 40 warfarin tautomers, and discusses a few properties, such as the
pKa. The experimental pKa of warfarin is around 5. Now, the paper reports calculated
pKa values for a variety of software products ([AMBIT](http://ambit.sf.net)
is unfortunately missing). First of all, it shows that the various tools differ,
which is to be expected. But that variance is neglectable when compared by the
effect of picking the wrong tautomer. I was impressed by the range of predicted
values for the various tautomers. I ranged from about 5 to 12, throughout all
tools. That means warfarin is predicted to be mildly acidic (some tools predict
pKa's down to 2.5) to very basic! No way your statistical modeling will understand
that!

And this is why Open Data is so important in chemistry. So, the next time Joe
(Organic) Chemist bitches about computers and cheminformatics, tell him it is
his own fault: he should have released his data out in the Open.

Anyway. Tautomerism was a curation issue in the first(!!!) entry I was curating.
The sixth had the more well-known problem, I think. I may be blind, but I would
say [this drug](http://www.chemspider.com/Chemical-Structure.2060.html) has
a stereocenter:

[![](http://www.chemspider.com/ImagesHandler.ashx?id=2060&w=200&h=200)](http://www.chemspider.com/Chemical-Structure.2060.html)

But none of the databases I checked so far (including ChemSpider) defines the
stereochemistry! I thought we settled that some decades ago? Stereochemistry
of drugs matter. What is going on here? I guess I have to browse some primary
literature and access some experimental data today then. If I can afford it.
