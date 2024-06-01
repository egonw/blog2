---
layout: post
title:  "Protein support in Bioclipse using Jmol and the CDK"
date:   2006-04-23
modified_date: 2024-06-01
blogger-link: https://chem-bla-ics.blogspot.com/2006/04/protein-support-in-bioclipse-using.html
tags: bioclipse jmol cdk
image: /blog/assets/images/cdkpdbsupport800.png
---

I have not blogged for about a week now, and been too busy with other things, like finishing my PhD articles/manuscript,
[my new job at the CUBIC](http://chem-bla-ics.blogspot.com/2006/03/cologne-university-bioinformatics.html) where I
[continued the work](http://chem-bla-ics.blogspot.com/2006/04/getting-jmols-cartoon-on-to-work-in.html) on proper protein support in
[Bioclipse](http://www.bioclipse.net/) using the [CDK](http://cdk.sf.net/) and
[Jmol](http://www.jmol.org/):

![Screenshot of Bioclipse with a protein visualized with Jmol in the middle.](/blog/assets/images/cdkpdbsupport800.png)

The latter involves getting the [CdkJmolAdapter <i class="fa-solid fa-recycle fa-xs"></i>](https://sourceforge.net/p/bioclipse/code/11760/log/?path=/bioclipse/trunk/plugins/net.bioclipse.jmol/src/net/bioclipse/plugins/adapter/cdk/CdkJmolAdapter.java),
the interface between the CDK and Jmol, [updated for changes <i class="fa-solid fa-box-archive fa-xs"></i>](https://web.archive.org/web/20060508024648/http://wiki.cubic.uni-koeln.de/cdkwiki/doku.php?id=cdknewsartjmolandcdk)
since the [Jmol as 3D viewer for CDK <i class="fa-solid fa-recycle fa-xs"></i>](https://sourceforge.net/projects/cdk/files/CDK%20News/2_1/)
article in [CDK News <i class="fa-solid fa-recycle fa-xs"></i>](https://sourceforge.net/projects/cdk/files/CDK%20News/), the open access journal for CDK related projects.

The screenshot is not showing the actual status: the `CdkJmolAdapter` does not propagate all information to Jmol correctly; as you
can see in the screenshot in the `BioPolymerTree` and `Property` views, the CDK now reads the structure information from the PDB file,
and I verified that Jmol really extracts this using the `StructureIterator`, but the secundairy structure does not show up yet.
I believe the problem is in the `AtomIterator`: issueing the `select protein` script, selects zero atoms.

The above screenshot is using a workaround, and was made by using Jmol's own IO instead of the `CdkJmolAdapter`. But
I'm very close and think I will be able to fix this soon.
