---
layout: post
title:  "Updating my bioclipse.qsar fork with Ola's main branch"
date:   2009-07-20
blogger-link: https://chem-bla-ics.blogspot.com/2009/07/updating-my-bioclipseqsar-fork-with.html
doi: 10.59350/5sxn7-4va27
tags: bioclipse git github
image: /assets/images/githubUpdatingMyFork.png
modified_date: 2026-09-27
---

[GitHub](http://github.com/) makes forking cheap, and I have a [fork](http://github.com/egonw/bioclipse.qsar/tree/master) of the
[bioclipse.qsar](http://github.com/olas/bioclipse.qsar/tree/master) repository (see
[Bioclipse moving to GitHub: CIA hooks enabled <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/07/15/bioclipse-moving-to-github-cia-hooks.html)),
so that I can easily share my patches with Ola for review. Ola can review them and apply them back into his main version.

I was wondering how I could bring my fork synchronized with Ola's version again, and found the answer in this guide on GitHub.
It turns out all I have to do is, though this is locally:

```shell
$ git remote add olas git://github.com/olas/bioclipse.qsar.git
$ git pull olas master
```

This gets me into the following state:

![](/assets/images/githubUpdatingMyFork.png)

This [gitk](http://www.kernel.org/pub/software/scm/git/docs/gitk.html) output show that my local *master* branch is
identical to Ola's master *branch* on GitHub, while both are three commits ahead of my current *master* branch at GitHub.

Right after this, I updated my fork at GitHub with a simple `git push`, resulting in this gitk output:

![](/assets/images/githubUpdatingMyFork1.png)
