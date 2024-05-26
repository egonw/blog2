---
layout: post
title:  "Getting Jmol's 'cartoon on' to work in Bioclipse"
date:   2006-04-10
blogger-link: https://chem-bla-ics.blogspot.com/2006/04/getting-jmols-cartoon-on-to-work-in.html
tags: bioclipse jmol protein
---

[Bioclipse](https://web.archive.org/web/20060420034219/http://www.bioclipse.net/) 1.0 is to be released in May, and the cartoon on script command is
still not working in the [Jmol](http://www.jmol.org/) viewer. For those who do not know yet, [Bioclipse](http://www.eclipse.org/) is a cool Eclipse
RCP based Java chemo-and bioinformatics workbench. To have a better idea what goes on inside Bioclipse, I wrote a new BioPolymer tree to show me the
strands in the protein. After [Ola](http://bioclipse.blogspot.com/) wrote code to show properties for IChemObject's, I extended did with PDB properties
for the atoms, strands and monomers.

The contents of the BioPolymerTree view on the right and the Properties view below that look fine:

![](http://www.woc.science.ru.nl/devel/egonw/bioclipse_polymerSupport.png)

So I'll have to dig a bit further.
