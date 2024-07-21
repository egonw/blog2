---
layout: post
title:  "Matrix support in Bioclipse"
date:   2006-07-11
blogger-link: https://chem-bla-ics.blogspot.com/2006/07/matrix-support-in-bioclipse.html
tags: bioclipse chemometrics qsar cdk
image: /blog/assets/images/bioclipseMatrixSupport.png
---

With [chemometrics](http://en.wikipedia.org/wiki/Chemometrics) in mind (QSAR, data mining, ...), I have started working on matrix support in
[Bioclipse](http://www.bioclipse.net/), because the matrix is the important step between (bio-)molecular content and statistical analysis.
I implemented this such that the actual matrix implementation can be freely chosen, that is,
[bc_statistical](http://svn.sourceforge.net/viewcvs.cgi/bioclipse/trunk/bc_statistical/) provides a `IMatrixImplementation` extension point.
The plugin [bc_jama](http://svn.sourceforge.net/viewcvs.cgi/bioclipse/trunk/bc_jama/) provides a [JAMA](http://math.nist.gov/javanumerics/jama/)
based extension for this, but other implementations are possible, and possibly useful.

The second component provided by the new statistics plugin, is the MatrixResource, a [BioResource](http://wiki.bioclipse.net/index.php?title=Bioclipse_object_model)
for documents (e.g. files on the harddisk) that represent a matrix. However, Bioclipse can create such matrices on the fly too, and these do not necessarily have
to be stored on disk, as is general for BioResource's. This makes it possible for other plugins to create matrices from other resources: for example, the
[CDK](http://cdk.sf.net/) plugin can now have an action that converts a SDF file into a QSAR data matrix.

The MatrixResource can be edited using a plain text editor, and a more visually attractive graphical editor based on the
[KTable](http://sourceforge.net/projects/ktable) SWT widget:

![](/blog/assets/images/bioclipseMatrixSupport.png)

The next step is to work on column and row names, and replace those uninformative X's. As you can see in the Properties View, I also need to tweak adding and
removing advanced properties a bit. And then it is time to have the CDK plugin create a QSAR data matrix.
