---
layout: post
title:  "A new CDK default fingerprinter?"
date:   2010-07-16
modified_date: 2011-05-22
blogger-link: https://chem-bla-ics.blogspot.com/2010/07/new-cdk-default-fingerprinter.html
doi: 10.59350/485a6-g8f87
tags: cdk fingerprint
image: /blog/assets/images/hybridFP.png
---

The current default fingerprinter in the [CDK](http://cdk.sf.net/) depends on aromaticity, but that concept is algorithmically difficult
to define, and even experimentally there are [multiple dimensions](http://chem-bla-ics.blogspot.com/2007/11/evidence-of-aromaticity.html)
to this concept. Moreover, calculating aromaticity is not cheap, as it requires detecting of ring systems. The purpose why aromaticity
is actually included is this: people expect a [ethenol](http://en.wikipedia.org/wiki/Vinyl_alcohol) moiety to match
[phenol](http://en.wikipedia.org/wiki/Phenol).

Now, an alternative is to not use aromaticity, but hybridization information instead: an aromatic bond is basically just a bond between
two sp2-hybridized atoms. Removes some algorithmic complexity and speeds up the calculation:

![](/blog/assets/images/hybridFP.png)

The definition of the fingerprint has changed, and a bond between two sp2-hybridized atoms may not be aromatic. We can therefore expect
that the fingerprint will give more false positives with substructure search. I'm hoping that Rajarshi can find some time to compare
this new fingerprint in his [excellent analysis](http://blog.rguha.net/?p=29) he did some time ago.

The source code can be found in [my GitHub repository](http://github.com/egonw/cdk/tree/165-sp2Fingerprinter), with the new class
[HybridOnlyFingerprinter](http://github.com/egonw/cdk/blob/165-sp2Fingerprinter/src/main/org/openscience/cdk/fingerprint/HybridOnlyFingerprinter.java).

*Update:* The fingerprinter has been renamed to HybridizationFingerprinter, and is part of the CDK 1.3.9 release.
