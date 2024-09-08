---
layout: post
title:  "SMILES, CAS and InChI in blogs: Greasemonkey"
date:   2006-12-17
blogger-link: https://chem-bla-ics.blogspot.com/2006/12/smiles-cas-and-inchi-in-blogs.html
tags: chemistry userscript smiles pubchem inchi
image: /blog/assets/images/sechemticWebScript.png
---

As follow up on my [Including SMILES, CML and InChI in blogs](http://chem-bla-ics.blogspot.com/2006/12/including-smiles-cml-and-inchi-in.html)
blog last week, I had a go at [Greasemonkey](http://en.wikipedia.org/wiki/Greasemonkey). Some time ago already,
[Flags and Lollipops](http://www.ghastlyfop.com/blog/2006/09/postgenomic-pubmed-mashup.html) and
[Nodalpoint](http://www.nodalpoint.org/2006/05/16/postgenomic_greasemonkey_script) showed with two cool mashups (one Connotea/Postgenomic
and one Pubmed/Postgenomic) that userscripts are rather useful in science too. I can very much recommend the PubMed/Postgenomic mashup,
as PubMed has several organic chemistry journals indexed too!

So, how does this relate to my blog of last week? Well, would it not be nice that if your blog uses the markup as suggested in that
[blog](http://chem-bla-ics.blogspot.com/2006/12/including-smiles-cml-and-inchi-in.html), that you automatically get links to
[PubChem](http://pubchem.ncbi.nlm.nih.gov/) and [Google](http://google.com/)? That is now possible with a small GPL-ed Greasemonkey script
called [blogchemistry.user.js](http://www.woc.science.ru.nl/devel/egonw/blogchemistry.user.js).

The [Greasemonkey plugin](http://greasemonkey.mozdev.org/) requires [Firefox](http://getfirefox.com/) to be installed. If ready, install
the script by cli·cking this link earlier, and the Greasemonkey will ask you if you want to install the script. After, check the output
for this RDFa markup content:

* a SMILES: <span xmlns:chem="http://www.blueobelisk.org/chemistryblogs/" class="chem:smiles">CCO</span>
* a CAS registry number: <span xmlns:chem="http://www.blueobelisk.org/chemistryblogs/" class="chem:casnumber">50-00-0</span>
* and an InChI: <span xmlns:chem="http://www.blueobelisk.org/chemistryblogs/" class="chem:inchi">InChI=1/CH4/h1H4</span>

It should look like the output for this blog item:

![](/blog/assets/images/sechemticWebScript.png)

Note the superscript PubChem and Google links.
