---
layout: post
title:  "Google Wave robot for CDK functionality"
date:   2009-09-02
blogger-link: https://chem-bla-ics.blogspot.com/2009/09/google-wave-robot-for-cdk-functionality.html
doi: 10.59350/stdr4-6rm16
tags: cdk cheminf google wave
image: /assets/images/cdkitty.png
modified_date: 2026-10-17
---

I was really happy to hear early last week that I was invited to take part in the [Google Wave <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/08/17/social-web-does-not-wait-for-bioclipse.html) beta,
and received my account details this Monday, while at attending (and [speaking at <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/09/02/open-knowledge-reproducibility-in.html)) the GDCh
Wissenschaftsforum Chemie 2009. Yesterday was a travel day, and while working on course material for the [Pharmaceutical Bioinformatics](http://www.pharmbio.org/) course that
uses [Bioclipse](http://www.bioclipse.net/), I set up an Eclipse environment for development of a wave robot. [Documentation](http://code.google.com/apis/wave/extensions/robots/java-tutorial.html)
was very clear, and deployment on [Appspot](http://www.appspot.com/) one click on the appropriate button. Great work from the people from Google! It was all so easy, I could not
resist pushing things a bit further, and looked carefully at other robots, like [ChemSpidey](http://www.chemspider.com/blog/chemspidey-rides-the-wave-courtesy-of-cameron-neylon.html)
by [Cameron](http://blog.openwetware.org/scienceintheopen/2009/08/27/writing-a-wave-robot-some-thoughts-on-good-practice-for-research-robots/) and
[Igor](http://blogs.nature.com/wp/nascent/2009/07/igor_a_google_wave_robot_to_ma.html) by [Euan](http://www.ghastlyfop.com/blog/), to see how text replacement is done,
and wrote my first functional robot, *CDKitty (**chemdevelkit@appspot.com**)*:

![](/assets/images/cdkitty.png)

It seems that it is a policy that wave robot names end with `-y`, so CDKitty sounded somewhat appropriate. Anyways, the robot is not overly functional yet, but it has
a *profile* (which took some extra googling) and one function ***mwOf***. Add the robot to your wave and prefix a molecular formula with `mwOf:`,
and CDKitty will calculate the molecular formula on the fly. Clearly, this opens up a whole new application world for the [CDK](http://cdk.sf.net/),
and you can leave feature requests at the [issue tracker](http://github.com/egonw/CDKitty/issues) of the [project home at GitHub](http://github.com/egonw/CDKitty).
Patches are most welcome too! :)

BTW, it seems I messed up the regular expression, which seems not to be including the last digit (filed as [issue 1](http://github.com/egonw/CDKitty/issues/#issue/1)).

Almost forgot to add that: many thanx to [Cameron](http://blog.openwetware.org/scienceintheopen/) for the insightful discussions we had over applecider,
Weisse and German dinner on Monday evening!
