---
layout: post
title:  "Bioclipse moving to GitHub: CIA hooks enabled"
date:   2009-07-15
blogger-link: https://chem-bla-ics.blogspot.com/2009/07/bioclipse-moving-to-github-cia-hooks.html
doi: 10.59350/6c3ha-gmy93
tags: git bioclipse github sourceforge justdoi:10.59350/ps1ms-z0e55
image: /assets/images/githubHooks.png
modified_date: 2026-08-16
---

Following the CDK and [JChemPaint Primary](http://chem-bla-ics.blogspot.com/2009/07/jchempaint-primary-moving-to-git.html),
[Bioclipe](http://www.bioclipse.net/) moved to Git just after the [2.0.0 release](http://bioclipse.blogspot.com/2009/07/biocipse-20-released.html).

We decided to split up the repositories, and have one [benevolent dictator](http://mndoci.com/blog/2009/05/07/benevolent-dicators-and-scientific-collaboration/),
or [dr. Who <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/06/21/dr-whos-of-life-sciences.html), for each repository who will maintain
the plugins defined in the repository and coordinate development:

* [bioclipse.core](http://github.com/olas/bioclipse.core/tree/master)
* [bioclipse.statistics](http://github.com/olas/bioclipse.statistics/tree/master)
* [bioclipse.ds](http://github.com/olas/bioclipse.ds/tree/master)
* [bioclipse.qsar](http://github.com/olas/bioclipse.qsar/tree/master)
* [bioclipse.cheminformatics](http://github.com/egonw/bioclipse.cheminformatics/tree/master)
* [bioclipse.rdf](http://github.com/egonw/bioclipse.rdf/tree/master)
* [bioclipse.bioinformatics](http://github.com/masak/bioclipse.bioinformatics/tree/master)

Several plugins are still in the SVN world, but a good deal is now Git-ready. BTW, this move also adds several new accounts
to watch on GitHub (see Rich' [17 GitHub accounts to watch on Cheminformatics <i class="fa-solid fa-recycle fa-xs"></i>](https://doi.org/10.59350/ps1ms-z0e55)).

[GitHub](http://www.github.com/) turns out to be our big friend here, not [SourceForge](http://www.sf.net/), which only supports one
Git repository. GitHub recently must have added hooks recently, but I am really happy to see those. The above Bioclipse repositories
have hooks turned on for [CIA](http://cia.vc/stats/project/bioclipse.core) (so that commit messages end up on our #bioclipse IRC
channel) and email (as indicated by the green color):

![](/assets/images/githubHooks.png)

The splitting up, was rather interesting indeed. We wanted to keep the complete commit history, but still reduce the git repositories
considerably. This means removing history of the plugins which should not end up in the repository. Git allows this! Git rules! This
time, [git filter-branch](http://www.kernel.org/pub/software/scm/git/docs/git-filter-branch.html) is our friend and there are
basically two options: constructive and destructive. The first copied bit by bit plugins from the old to the new repository.
The second one does the opposite, and removed bit by bit stuff you do not want. Depending on the ratio of plugins you want to
keep and those you want to remove, either solution is more appropriate. I have summarized the git commands I used in detail on
[this Bioclipse wiki page](http://wiki.bioclipse.net/index.php?title=Git_Development#Making_your_own_feature_Git_repository).
