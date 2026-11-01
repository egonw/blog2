---
layout: post
title:  "Adding a CDK atom type"
date:   2011-02-24
blogger-link: https://chem-bla-ics.blogspot.com/2011/02/adding-cdk-atom-type.html
doi: 10.59350/te8a1-4cv36
tags: cdk cheminf
---

A very quick, short post on [CDK](http://cdk.sf.net/) atom types. These atom
types are used by the CDK to decide how many missing hydrogens an atom has,
or how many lone pairs, and if the atom can be part of an aromatic ring system.
The CDK code basically consists of three parts: the atom type ontology, the
atom type perception code, and the rest of the code that uses information from
the ontology.

Most of you have already developed a love/hate relation with the [CDKAtomTypeMatcher](http://pele.farmbio.uu.se/nightly/api/org/openscience/cdk/atomtype/CDKAtomTypeMatcher.html).
This is the class that complains about atom types not being recognized. And
let me stress this one more time. When you get such a method, it means that
the CDK cannot add hydrogen, it cannot calculate QSAR descriptors, etc, etc.
I have had the comment that CDK 1.0 never complained about that. True. It just
ignored the fact that it did not know what to do with that atom, and calculated
(wrong) properties anyway.

The solution to such a missing atom type warning can be two-fold. First, the
input data was wrong, for example, because formal charges were lost at some
point. A typical example is a neutral four-coordinated nitrogen. Second, the
input data is correct and the CDK is wrong. This doesn't happen too often, but
it does.

This last is the topic of this post. The CDK can be 'wrong' in two ways. Either
it doesn't know the atom type (CDK 1.2 and 1.4 have more atom types than CDK 1.0
ever had; so), or the perception algorithm makes a mistake. The latter is not
uncommon, particularly for some elements, like nitrogen. The cause here is the
input data, or better, the lack of input data. Missing bond orders, missing
explicit hydrogens. Now, cheminformatics can make educated guesses, and so the
perception algorithm does. But it depends on its education.

Doing the needed education of the CDK basically looks like [this commit](https://github.com/cdk/cdk/commit/4ccb251ee0f94905071beeea2b1e56d968bda360).
It adds:

* a new atom type to the ontology,
* adds code to the CDKAtomTypeMatcher for the perception, and
* adds unit tests to make sure it does the right thing.

Mind you, that the ontology needs to provide the following properties of an
atom type:

1. the element (duh),
1. the formal charge,
1. the number of bound neighbors,
1. the number of double bond equivalents (*piBondCount*),
1. the number of lone pairs, and
1. the hybridization state (sp3, sp1, etc).

The current unit tests focus on the true positives, but I got a report about
a false positive this week, which I will add shortly. Also check these posts
on [atom typing](http://chem-bla-ics.blogspot.com/search/label/atom%20typing)
and [atom types](http://chem-bla-ics.blogspot.com/search/label/atom%20types).
