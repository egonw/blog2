---
layout: post
title:  "Bioclipse git experiences #1: Strip away unwanted plugins"
date: 2020-07-02
blogger-link: https://chem-bla-ics.blogspot.com/2020/07/bioclipse-git-experiences-1-strip-away.html
tags: bioclipse git
---

This is a series of two posts repeating some content I [wrote up back in the Bioclipse days](https://web.archive.org/web/20180821111520/http://wiki.bioclipse.net/index.php?title=Git_Development)
(see also [this Scholia page](https://scholia.toolforge.org/topic/Q1769726)). They both deal with something
we were facing: restructuring of version control repositories, while actually keeping the history. For
example, you may want to copy or move code from one repository to another. A second use case can be a file
that must be removed (there are valid reasons for that). Because these posts are based on Bioclipse work,
there will be some specific terminology, but the approach I regularly apply in other situations.

For this first post, think of a *plugin* as a subfolder, tho it even applies to files.

## Strip away unwanted plugins

In this case, you remove everything you do not want in your new git repository. Do:

```shell
git clone --bare --no-hardlinks old.local.clone/ new.local.clone/
```

Then use:

```shell
git filter-branch --index-filter 'git rm -r -q --cached --ignore-unmatch plugins/net.bioclipse.actionHistory plugins/net.bioclipse.analysis' HEAD
```

It often happens that you need to run the above command several times, in cases when there are many subdirectories to be removed.
When you removed all the bits you need removed, you can clean up the repository and reduce the size considerably with:

```shell
 git repack -ad; git prune
```
