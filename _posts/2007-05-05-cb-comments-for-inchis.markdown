---
layout: post
title:  "Cb comments for InChI's"
date:   2007-05-05
modified_date: 2025-04-12
doi: 10.59350/z1vb6-w9v12
blogger-link: https://chem-bla-ics.blogspot.com/2007/05/cb-comments-for-inchis.html
tags: cb inchi userscript rdf rdfa
image: /assets/images/cb_inchi_greasemonkey1.png
---

About a year ago [Pedro wrote a Greasemonkey script](http://pbeltrao.blogspot.com/2006/05/postgenomics-script-for-firefox-i-am.html)
to add comments from [PostGenomic.com](http://www.postgenomic.com/) to table of contents of scientific journals.
[Noel extended](http://baoilleach.blogspot.com/2007/04/add-quotes-from-postgenomic-and.html) it with support for
[Chemical blogspace](http://wiki.cubic.uni-koeln.de/cb/) (see also [this earlier item](http://chemicalblogspace.blogspot.com/2007/03/jacs-toc-featuring-your-review.html)).
Now, the later website is maintained by me, and I
[extended the aggregator software with molecule support](http://chemicalblogspace.blogspot.com/2006/12/hacking-inchi-support-into-cb.html),
for example to show *hot* [molecules on the frontpage](http://chemicalblogspace.blogspot.com/2007/02/latest-blogged-molecules-on-front-page.html)
(at some point [my patches will be backported into mainstream](http://www.ghastlyfop.com/blog/2007/05/quick-notices.html).
Euan, why not invite me to London HQ in, say, June?).

So, when we can show comments from blogosphere for journal articles, why can't we do that for molecules too? Sure we can.
Just needs some hacking. Right, and done that today. The scripts works for [PubChem](http://pubchem.ncbi.nlm.nih.gov/):

![](/assets/images/cb_inchi_greasemonkey1.png)

Works for any `<a href>` element with an URL to PubChem like *http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?CMD=search&DB=pccompound&term=%22InChI=1/CH4/h1H4%22[InChI]*.
BTW, while the URL is not very readable, this might actually be a good way to [hide InChIs <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/02/20/invisible-inchis.html),
though I am sure Google will not index this InChI either.

And it also works for [semantically marked up InChI's (using either microformats or RDFa) <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/12/10/including-smiles-cml-and-inchi-in.html):

![](/assets/images/cb_inchi_greasemonkey.png)

You'll notice here that it is friendly with my
[Sechemtic script to make links to Google and PubChem <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/12/17/smiles-cas-and-inchi-in-blogs.html).

The tools to make this happen involves a new Greasemonkey script (based on Noels code), and a few patches to the Postgenomic.com software.
The user script can be downloaded [here](http://userscripts.org/scripts/show/9002). An entry on the
[Blue Obelisk userscript page](http://wiki.cubic.uni-koeln.de/bowiki/index.php/Using_Javascript_and_Greasemonkey_for_Chemistry)
will follow; check that page for more goodies.
