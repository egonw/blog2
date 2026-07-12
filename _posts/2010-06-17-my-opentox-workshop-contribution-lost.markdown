---
layout: post
title:  "My OpenTox Workshop contribution: The Lost Slides"
date:   2010-06-17
blogger-link: https://chem-bla-ics.blogspot.com/2010/06/my-opentox-workshop-contribution-lost.html
doi: 10.59350/wpk6t-snh54
tags: opentox bioclipse justdoi:10.1016/j.mrrev.2008.05.003
image: /blog/assets/images/metaprint2d.png
---

During the nice presentations at the recent [OpenTox Workshop](http://www.opentox.org/data/blogentries/public/opentoxworkshoppotsdam2010), I noted that
[My OpenTox Workshop contribution: Linking explicit and implicit knowledge](http://chem-bla-ics.blogspot.com/2010/05/my-opentox-workshop-contribution.html)
was lacking two slides. The slides should have had screenshot of the excellent [Bioclipse](http://www.bioclipse.net/) applications
[Ola Spjuth](http://se.linkedin.com/in/olaspjuth) has written in the area of computational toxicology. But here they are.

## Metabolic Fate

The metabolic fate of molecules can be predicted with the [MetaPrint2D](http://wiki.bioclipse.net/index.php?title=MetaPrint2D) feature (see also the
[main MetaPrint2D page](http://www-metaprint2d.ch.cam.ac.uk/metaprint2d/)). The feature currently uses one specific method, but the immediate feedback
you get while drawing molecules, can basically use any model. The currently used model is developed in a collaboration of Ola with Sam Adams (whom we
all know for his [JNI-InChI](http://jni-inchi.sourceforge.net/) library) at Cambridge University and Lars Carlsson at Astra-Zeneca.

![](/blog/assets/images/metaprint2d.png)

This screenshots shows the visual feedback in the (new) [JChemPaint](http://chem-bla-ics.blogspot.com/search?q=cdk-jchempaint) editor in Bioclipse, and
on the right we see one interesting Bioclipse feature in action: the [cheat sheets](http://www.ibm.com/developerworks/opensource/library/os-ecl-cheatsheets/).
These cheat sheets are inline help documentation which guides the reader through the functionality. But, unlike mere help, cheat sheets can be very
interactive and perform some tasks itself, making it easier for the reader to see what was supposed to happen.

*L. Carlsson, O. Spjuth, S.E. Adams, R.C. Glen, S. Boyer, Use of Historic Metabolic Biotransformation Data as a Means of Anticipating Metabolic Sites
Using MetaPrint2D and Bioclipse, accepted in BMC Bioinformatics.*

## Structural Alerts, etc

Structural alerts are one method to signal the scientist that the molecule under study needs some more attention (see for example
doi:[10.1016/j.mrrev.2008.05.003](https://doi.org/10.1016/j.mrrev.2008.05.003)). It helps him decide to continue to look at that particular
structure, or to move on. Ola also developed a decision support plugin.

![](/blog/assets/images/ds.png)

One of the cool features is that, in good Bioclipse habits, deliver a pluggable architecture. This practically means, that anyone can add their own
decision rules; those can be added as local software, or as services on a central, institute specific server. The results in this screenshot show
that a Bursi AMES data-based model estimates that this molecule is mutagenetic.

*O. Spjuth, L. Carlsson, M. Eklund, E.A. Helgee, S. Boyer, Integrated decision support for assessing chemical liabilities, In preparation*
