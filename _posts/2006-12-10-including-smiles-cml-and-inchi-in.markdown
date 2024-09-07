---
layout: post
title:  "Including SMILES, CML and InChI in blogs"
date:   2006-12-10
blogger-link: https://chem-bla-ics.blogspot.com/2006/12/including-smiles-cml-and-inchi-in.html
tags: cml inchi blog cb doi:10.1021/CI034244P microformat rdf html
---

The blogs [ChemBark](http://blog.chembark.com/) and [KinasePro](http://kinasepro.wordpress.com/) have been discussing
the use of SMILES, CML and InChI in [Chemical Blogspace](http://wiki.cubic.uni-koeln.de/pg/) (with 70 chemistry blogs now!).
Chemists seem to [prefer SMILES over InChI](http://kinasepro.wordpress.com/2006/12/05/monday-night-ot-2/), while there is
[interest in moving towards CML too](http://blog.chembark.com/2006/11/25/help-needed-how-do-we-use-cml-properly/).
[Peter commented](http://wwmm.ch.cam.ac.uk/blogs/murrayrust/).

Any incorporation of content other than images and free text requires some HTML knowledge, but this can be rather limited.
It is up to us chemoinformaticians to write good documentation on how to do things; so here is a first go.

## Including CML in blogs and other RSS feeds

I blogged about including [CML in blogs](http://chem-bla-ics.blogspot.com/2006/02/blogging-chemistry-on-blogspotcom.html)
last February, and can generally refer to this article published last year: *Chemical markup, XML, and the World Wide Web. 5.
Applications of chemical metadata in RSS aggregators* (PMID:[15032525](https://chem-bla-ics.blogspot.com/2006/12/including-smiles-cml-and-inchi-in.html),
DOI:[10.1021/ci034244p](https://doi.org/10.1021/ci034244p)). Basically, it just comes down to putting the CML code into
the HTML version of your blog content, though I appreciate the need for plugins.

## Including SMILES, CAS and InChI in blogs

Including SMILES is much easier as it is plain text, and has the advantage over InChI that it is much more readable.
[Chris](http://www.cambridgemedchemconsulting.com/) wondered in the KinasePro blog on how to tag SMILES, while Paul
did the same on ChemBark about CAS numbers.

Now, users of [PostGenomic.com](http://postgenomic.com/) know how to [add markup to their blogs](http://postgenomic.com/wiki/doku.php?id=markup)
to get PostGenomic index discussed literature, website and conferences. Something similar is easily done for chemistry
things too, as I showed in [Hacking InChI support into postgenomic.com](http://chem-bla-ics.blogspot.com/2006/02/hacking-inchi-support-into.html)
(which was put on lower priority because of finishing my PhD). PostGenomic.com basically uses microformats, which I
blogged about just a few days ago in [Chemo::Blogs #2](http://chem-bla-ics.blogspot.com/2006/12/chemoblogs-2.html),
where I suggested the use of `<span class="chemicalcompound">asperin</span>`.

And this is the way SMILES, CAS and InChI's can be tagged on blogs. The `<span>` element is HTML code to indicate
a bit of similar content in HTML, and can, among many other things, be formatted differently than other text. However,
this can also be used to add semantics in a relatively cheap, but accepted, way. [Microformats](http://microformats.org/
 are formalized just by use, so whatever we, as chemistry bloggers, use will become the de facto standard. Here are my suggestions:

* for SMILES: `<span class="smiles">CCO</span>`
* for CAS registry numbers: `<span class="casnumber">50-00-0</span>`
* for InChI: `<span class="inchi">InChI=1/CH4/h1H4</span>`

## The RDFa alternative

The future, however, might use RDFa over microformats, so here are the RDFa equivalents:

* for SMILES: `<span class="chem:smiles">CCO</span>`
* for CAS registry numbers: `<span class="chem:casnumber">50-00-0</span>`
* for InChI: `<span class="chem:inchi">InChI=1/CH4/h1H4</span>`

which requires you to register the namespace `xmlns:chem="http://www.blueobelisk.org/chemistryblogs/"` somewhere though.
Formally, the URN for this namespace needs to be formalized; Peter, would the [Blue Obelisk](http://www.blueobelisk.org/)
be the platform to do this? BTW, this is more advanced, and currently does not have practical advantages over the use of
microformats.
