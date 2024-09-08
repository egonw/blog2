---
layout: post
title:  "Chemistry in HTML: Greasemonkey again"
date:   2006-12-19
blogger-link: https://chem-bla-ics.blogspot.com/2006/12/chemistry-in-html-greasemonkey-again.html
tags: userscript html rdf doi:10.1021/CI034244P
---

Here's a quick update on my blog about [SMILES, CAS and InChI in blogs: Greasemonkey](http://chem-bla-ics.blogspot.com/2006/12/smiles-cas-and-inchi-in-blogs.html)
last sunday. The original download was messed up :( You can download a new version at [userscripts.org](http://userscripts.org/scripts/show/6807).

This new version also supports `chem:compound`, for any chemical. For example:

* <span class="chem:compound">isopropyl alcohol</span>

Remember that it only works for properly marked up content, as described in [Including SMILES, CML and InChI in blogs](http://chem-bla-ics.blogspot.com/2006/12/including-smiles-cml-and-inchi-in.html).
The HTML source code of the above example looks like (in RDFa):

```html
<ul><li>
<span xmlns:chem="http://www.blueobelisk.org/chemistryblogs/"
      class="chem:compound">isopropyl alcohol</span>
</li></ul>
```

The current script only adds search links to [PubChem](http://pubchem.ncbi.nlm.nih.gov/) and
[Google](http://google.com/), but the possibilities are endless, and potentially very powerfull.
Here are some future ideas.

## A link to predict NMR spectra using NMRShiftDB.org:

Making a link to the [NMRShiftDB.org](http://www.nmrshiftdb.org/) website to predict <sup>13</sup>C or
<sup>1</sup>H NMR from a SMILES, and InChI likely too, is easy, if the website provides a URL to do this.
(I will discuss this with Stefan.)

## A popup window with the 3D structure in Jmol:

This would involve some more work, but this most certainly possible too, given that we actually have
a website around which allows downloading 3D coordinates given a SMILES or InChI. While a simple approach
would be to make a popup with [Jmol](http://www.jmol.org/) that takes the URL to that 3D coordinate website,
it could be extended using Ajax to query the 3D structure first, and depending on success, show
Jmol or a message "Could not find 3D coordinates".

## Summarize molecular details hidden in CML:

This is likely the most exiting possibility. I blogged about CMLRSS [many times](http://search.blogger.com/?as_q=CMLRSS&ie=UTF-8&ui=blg&bl_url=chem-bla-ics.blogspot.com&x=0&y=0)
now (check the AVI, the [article](https://doi.org/10.1021/ci034244p), etc), and combining these two
technologies will take the semantic, chemistry internet to the next level. CMLRSS describes how CML
can be embedded in blog items (e.g. [Blogging chemistry on blogspot.com](http://chem-bla-ics.blogspot.com/2006/02/blogging-chemistry-on-blogspotcom.html)),
but really works for any [XHTML](http://www.w3.org/TR/xhtml1/).

Consider this mockup: add CML content to your blog item, containing molecular properties, such as its
NMR peaks, elemental analysis, etc. This will not show up in your blog item, so that the user is not
bothered with implementation details. Now, a userscript will now about the CML content, as it has access
to the whole content of the page. The visible text will mention the molecule for which CML contains
experimental or other details. Using the `<span class="chem:compound"/>` technology shown above, it is
possible to link that compound to this CML bit (details to follow in this blog in January 2007). The
userscript will then on the fly create a popup for the compound name in the visible text to show those
experimental details.

How about that? Comments and other ideas are more than welcome!

## Server side scripts:

Greasemonkey allows users to decide which scripts to run on a website, and which not. If you, as blogger
or XHTML editor, want to force a script like the above to be run, that should be possible too.
Greasemonkey scripts are written in JavaScript, so including them on the server side should be
possible too. I might explore this option soon too.
