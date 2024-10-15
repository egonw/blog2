---
layout: post
title:  "CDK Workshop - Days #3 and #4"
date:   2007-02-03
blogger-link: https://chem-bla-ics.blogspot.com/2007/02/cdk-workshop-days-3-and-4.html
tags: cdk smiles
---

Days #3 and #4 of the [CDK Workshop](http://wiki.cubic.uni-koeln.de/cdkwiki/doku.php?id=spring2007workshop) have been
quite busy indeed, and I have not been able to summarize them so far. After [a rather interesting day #2](http://chem-bla-ics.blogspot.com/2007/01/cdk-workshop-day-2.html),
the third day was the last one with scheduled presentations. Kai Hartmann showed how he used the CDK in his systems
biology research, and contributed the code he wrote to predict Gibbs energies based on fragment contributions.
Miguel Rojas showed his MS prediction work, which is based on the CDK too.

Much of the rest of day and Thursday continued on the work started yesterday: making the 3D structure builder a
singleton class, and applying and testing an optimization for the AllRingsFinder to address
[molecules like Choloyl-CoA](http://chem-bla-ics.blogspot.com/2007/01/cdk-workshop-day-2.html). The trick
basically consists of applying the all rings finding algorithm to isolated systems only. The effect is
considerable: the total computation time for Choloyl-CoA decreases by a 93 fold! We found that the
fingerprints used in the template library for the 3D structure builder are outdated, and Christoph worked
on updating that, which required searching into old archives to find the tool to do just this.

Because the above performance fix did not fix the current slow SMILES parsing, Kai looked at the
`DeduceBondOrderTool` which is the slow component, and optimized the used algorithm by reusing determined
molecular ring systems. Nevertheless, on users requests, a time out mechanism is now available for SMILES
parsing. Additionally, several of the bugs found on the second workshop day have been fixed. Meanwhile,
I was distracted by other things. For example, fixing [Bioclipse](http://www.bioclipse.net/) bugs for
[the version 1.0.1 released yesterday](http://bioclipse.blogspot.com/2007/02/bioclipse-101-released.html).
The SENECA tool is not forgotten too, and last weekend I made some good progress with it,
[which Christoph blogged about](http://wiki.cubic.uni-koeln.de/blog/pivot/entry.php?id=15).
