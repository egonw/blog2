---
layout: post
title:  "Bioclipse upgraded to CDK 1.3.8 and CDK-JChemPaint 17: builds broken"
date:   2011-02-13
blogger-link: https://chem-bla-ics.blogspot.com/2011/02/bioclipse-upgraded-to-cdk-138-and-cdk.html
doi: 10.59350/126mb-ar353
tags: bioclipse cdk jchempaint
---

Yesterday I did some boring plumbing: I upgraded our GC/MS machines with new
hardware. Well, the cheminformatics equivalent of it anyway. I upgraded the
[Bioclipse](http://bioclipse.net) bundles in org.openscience.cdk for [CDK 1.3.8](https://sourceforge.net/projects/cdk/files/cdk%20%28development%29/1.3.8/)
and [CDK-JChemPaint 17](https://sourceforge.net/projects/cdk/files/CDK-JChemPaint/17/).
This is typically a painful process, and now even more because a lot is changing
with how Bioclipse is build, which is with [Buckminster](http://www.eclipse.org/buckminster/)
on [Bioclipse' Hudson server](http://hudson.bioclipse.net). I am happy that
Arvid is doing the digging into Buckminster, as automatic building of Eclipse-RCP
tools is straightforward. Each part is describes by, seemingly, at least five
configurations files. For each plugin we have plugin dependencies, plugins are
wrapped into features, where you can get dependencies wrong too, and update
sites, which need to be in shape too. And on the Buckminster-side there are
.rmap and .cquery files pointing to the right git repositories, each of which
you can get wrong too.

Well, and I got them wrong. A few things had to happen. First of all, I had
to revert the [JNI-InChI](jni-inchi.sf.net) library to a plugin, as I have no
experience with making [OSGi bundles](http://en.wikipedia.org/wiki/OSGi) out
of random jars (there is this [bnd](http://www.aqute.biz/Code/Bnd) tool which
exists for that task, but never used it before). But, the upgrade brought in
version 0.7 which should solve the InChI library loading issue, as well as bring
InChI to various more platforms. So, the JNI-InChI jar was pulled from the target
platform, and the rebuild worked out of the box.

The second thing I did was upgrade the [org.openscience.cdk](https://github.com/bioclipse/org.openscience.cdk/)
bundles. This repository had three branches, [one](https://github.com/goglepox/org.openscience.cdk)
for pure CDK, now updated to CDK 1.3.8, a [CDK-JChemPaint branch](https://github.com/goglepox/org.openscience.cdk/tree/cdk-jchempaint)
updated to version 17, and a [bioclipse2.4](https://github.com/goglepox/org.openscience.cdk/tree/bioclipse2.4)
branch for Bioclipse 2.x (we now and then patch things to make it work, so that
we do not have to wait for them to be applied upstream, with the CDK itself).
I thought it would be good to create a separate bioclipse2.6 branch for Bioclipse
master, but that was a mistake. This branch information is scattered over the
.rmap and .cquery files, and they are not all in one single git repository,
and those that are, are not synchronized with the versions on Hudson either.
It's normal in prototyping, but not helping me. After a couple of hours fiddling,
I got [this one compiling too](http://pele.farmbio.uu.se/hudson/job/org.openscience.cdk/).

Right now, I'm stuck with getting [bioclipse.cheminformatics](http://pele.farmbio.uu.se/hudson/job/Bioclipse.chemoinformatics/)
compiling again, and looking for ERRORs in an [enormous log file](http://pele.farmbio.uu.se/hudson/job/Bioclipse.chemoinformatics/41/consoleText).
If only ERROR messages were a bit more descriptive, something like "Hej, you
said to look for org.openscience.cdk.sinchi in file foo.bar, but I cannot find
it anywhere.", then I'd have some clue where to look.

That makes me wonder if anyone actually ever wrote up best practices for error
messages...

BTW, I also still have another, independent dependency issue to solve: the one
for [Google's Guava](http://code.google.com/p/guava-libraries/), so that everyone
can play with the [Bioclipse-Google interaction](http://chem-bla-ics.blogspot.com/2011/02/accessing-google-spreadsheets-from.html).
