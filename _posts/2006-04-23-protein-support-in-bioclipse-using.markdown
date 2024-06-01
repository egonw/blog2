---
layout: post
title:  "Protein support in Bioclipse using Jmol and the CDK"
date:   2006-04-23
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

The latter involves getting the [CdkJmolAdapter](http://svn.sourceforge.net/viewcvs.cgi/bioclipse/trunk/bc_jmol/src/net/bioclipse/plugins/adapter/cdk/CdkJmolAdapter.java?view=log),
the interface between the CDK and Jmol, [updated for changes](http://wiki.cubic.uni-koeln.de/cdkwiki/doku.php?id=cdknewsartjmolandcdk)
since the [Jmol as 3D viewer for CDK](http://almost.cubic.uni-koeln.de/cdk/cdk_top/cdk_news/archive/cdknews2.1.article13.pdf)
article in [CDK News](http://almost.cubic.uni-koeln.de/cdk/cdk_top/cdk_news/), the open access journal for CDK related projects.

The screenshot is not showing the actual status: the CdkJmolAdapter does not propagate all information to Jmol correctly; as you
can see in the screenshot in the BioPolymerTree and Property views, the CDK now reads the structure information from the PDB file,
and I verified that Jmol really extracts this using the StructureIterator, but the secundairy structure does not show up yet.
I believe the problem is in the `AtomIterator`: issueing the 'select protein' script, selects zero atoms.

The above screenshot is using a workaround, and was made by using Jmol's own IO instead of the CdkJmolAdapter. But
I'm very close and think I will be able to fix this soon.
