---
layout: post
title:  "JChemPaint-Primary moving to Git"
date:   2009-07-08
blogger-link: https://chem-bla-ics.blogspot.com/2009/07/jchempaint-primary-moving-to-git.html
doi: 10.59350/vrevg-x5008
tags: jchempaint git cdk
image: /assets/images/jcpGit.png
modified_date: 2026-09-27
---

I knew it was going to be painful, but making the [jchempaint-primary branch](http://cdk.svn.sourceforge.net/viewvc/cdk/cdk/branches/jchempaint-primary/)
a proper patch to the CDK master branch **is** painful. I am working my way towards setting up [a git repository](http://pele.farmbio.uu.se/cgi-bin/gitweb.cgi?p=jchempaint-primary.git;a=summary)
(**IMPORTANT**: these patches are **not** final yet, and their history **will** change, as I am *rebasing* regularly to make cleaner patches! Making
copies is save, but please hold of any forking and/or branching on top of it until it is final. Thanx.) for the patch, with split ups of the various
parts into reviewable blobs:

![](/assets/images/jcpGit.png)

As you can see (when you click on the image to enlarge it), I have more or less finished the first drafts of the patch sets (see
[this wiki page](https://sourceforge.net/apps/mediawiki/cdk/index.php?title=JChemPaint_Primary_Patches)) 0-other, 1-render, 2-renderbasic,
9-rendercontrol, and 6-control. The last one does not actually compile properly yet, as I need to abstract an IRenderer interface first.

There are several patch sets that I am still porting, but I hope to finish that this week, after which I'll continue working on the new
`IEdit` framework in the controller modules recently set up by Arvid.

It will take some time before these patches actually get submitted for review, as there is quite some PMD, DocCheck and unit testing
work to be done, as is clear from the [Nightly running on the SVN branch](http://pele.farmbio.uu.se/nightly-jcp/).

Finally, I like to note that this git repository collapses a lot of work done by developers at both Uppsala University (Arvid, Ola and me)
and the EBI ([Gilleain](http://gilleain.blogspot.com/), Stefan and now Mark). While the above git history will not reflect those contributions,
you can recover this information from the [copyright headers <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/06/30/making-patches-attribution-copyright.html).
I also like to thank Lars and Sam for their valuable testing!
