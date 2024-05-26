---
layout: post
title:  "Getting Jmol's 'cartoon on' to work in Bioclipse"
date:   2006-04-10
modified_date: 2024-05-26
blogger-link: https://chem-bla-ics.blogspot.com/2006/04/getting-jmols-cartoon-on-to-work-in.html
tags: bioclipse jmol protein
---

[Bioclipse](https://web.archive.org/web/20060420034219/http://www.bioclipse.net/) 1.0 is to be released in May, and the cartoon on script command is
still not working in the [Jmol](http://www.jmol.org/) viewer. For those who do not know yet, [Bioclipse](http://www.eclipse.org/) is a cool Eclipse
RCP based Java chemo-and bioinformatics workbench. To have a better idea what goes on inside Bioclipse, I wrote a new BioPolymer tree to show me the
strands in the protein. After [Ola](http://bioclipse.blogspot.com/) wrote code to show properties for IChemObject's, I extended it with PDB properties
for the atoms, strands and monomers.

The contents of the ChemTree view in the middle and the Properties view below that look fine:

![](https://media.springernature.com/full/springer-static/image/art%3A10.1186%2F1471-2105-8-59/MediaObjects/12859_2006_Article_1431_Fig4_HTML.jpg?as=webp)

So I'll have to dig a bit further.
