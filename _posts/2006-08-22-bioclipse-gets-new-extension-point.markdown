---
layout: post
title:  "Bioclipse gets a new extension point"
date:   2006-08-22
blogger-link: https://chem-bla-ics.blogspot.com/2006/08/bioclipse-gets-new-extension-point.html
tags: bioclipse feeds cml
---

I hacked in a new extension point for [Bioclipse](http://www.bioclipse.net/) yesterday, based on a [proposal](http://wiki.bioclipse.net/index.php?title=ChildCreator_extension_point)
I made earlier. The new extension point (EP) is called `ChildResourceCreator` and allows creating child resources for a given IBioResource. One application where this is very useful is the
[CMLRSS application](http://dx.doi.org/10.1021/ci034244p) ([earlier blog](http://chem-bla-ics.blogspot.com/2006/07/avi-movies-of-cmlrss-howto-in.html)), or any
[RSS](http://en.wikipedia.org/wiki/RSS_(file_format)) or [Atom](http://www.atomenabled.org/) enriched with any other XML language. Here, child resources are
created for each feed entry resource with as content the foreign XML, e.g. the CML bits in the blog.

Other applications involve complex documents, which is basically most existing documents. Take, for example, the
[PDB format](http://www.rcsb.org/pdb/static.do?p=file_formats/pdb/index.html) from the [PDB database](http://www.rcsb.org/pdb/). These PDB files contain a pletory
of information including one or more protein structures, sequences and bibliographic information. Bioclipse supports each of those using the
[CDK](http://cdk.sf.net/), [BioJava](http://biojava.org/) and [JabRef](http://jabref.sf.net/) libraries.

By making extension for the `ChildResourceCreator` EP, I am able to setup a general PDBResource (with Bioclipse's syntax highlighted PDB editor),
and child resources for the different bits of information. [Bioclipse 1.0](http://sourceforge.net/project/showfiles.php?group_id=150681), however,
only allow looking at the molecular structure(s) in the file, not at the sequence, nor the references. Will post the obligatory screenshot asap.
