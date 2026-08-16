---
layout: post
title:  "Chemical RDFa with Operator in the Firefox toolbar"
date:   2007-06-27 00:10
modified_date: 2025-07-30
doi: 10.59350/8hkrb-cb907
blogger-link: https://chem-bla-ics.blogspot.com/2007/06/chemical-rdfa-with-operator-in-firefox.html
tags: pubchem rdf userscript inchi rdfa
image: /assets/images/pubchemRDFa.png
---

December last year [I proposed the use of microformats and RDFa <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/12/10/including-smiles-cml-and-inchi-in.html)
for simple semantic markup of molecular information. I linked that with the [InChI extension for the Postgenomic.com software <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/02/25/hacking-inchi-support-into.html)
for [Chemical blogspace](http://cb.openmolecules.net/) and wrote these tools to work with the markup:

* [wrote a Greasemonkey script to automatically link to webservices <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/12/17/smiles-cas-and-inchi-in-blogs.html),
* [explained how that script can be used on the server <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/01/02/chemistry-in-html-javascript-from.html), and
* [adapted a Greasemonkey script to show blog items related to molecules <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/05/05/cb-comments-for-inchis.html).

All using the new semantic markup.

Of the two, I think RDFa has the best future. Then I [discovered Operator <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/05/11/added-my-hcard-to-my-blog.html),
written by [Mike](http://www.kaply.com/weblog/). While the Greasemonkey scripts already allow me to link to, for example, PubChem and eMolecules,
the [Operator Firefox Addon](https://addons.mozilla.org/en-US/firefox/addon/4106) allowed me to open vCards incorporated in HTML pages directly
to my address book client. Thus, I could open chemistry directly in [Bioclipse](http://bioclipse.net/) too!

That was the idea, at least. I contacted Mike, and he asked me to wait until the first 0.8 releases, which he
[announced earlier this month](http://www.kaply.com/weblog/2007/06/04/operator-08a-is-available/).
This version allows user scripts to be written, which define how RDFa should be handled. And with his patience and help, this was the result:

![](/assets/images/pubchemRDFa.png)

The HTML is almost [as explained before <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/12/17/smiles-cas-and-inchi-in-blogs.html), and looks like:

```html
<html xmlns="http://www.w3.org/2002/06/xhtml2/">

<h1>Chemical RDFa with Operator</h1>

<div about="#chem_123" xmlns:chem="http://www.blueobelisk.org/chemistryblogs/">
  Methane has the following identifier: <span property="chem:inchi">InChI=1/CH4/h1H4</span>
</div>

</html>
```

It is important here to wrap the statement in a `<div>` element and to add the `@about` attribute to it, defining the Subject. Moreover,
you need to use the `@property` attributes instead of `@class`. The content of this attribute defined the Predicate, and the content of the
`<span>` element is the Object, completing the RDF triple.

Operator detects these RDFa statements from the HTML, and creates a new menu item *Search in Pubchem* using this piece of code:

```javascript
var pubchem_inchi = {
  description: "Search in PubChem",
  short: "PubChem",
  scope: {
    semantic: {
      "RDFa" :  {
        property : "http://www.blueobelisk.org/chemistryblogs/inchi",
        defaultNS : "http://www.blueobelisk.org/chemistryblogs/"
      }
    }
  },
  doAction: function(semanticObject, semanticObjectType) {
    if (semanticObjectType == "RDFa") {
      return "http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?CMD=search&DB=pccompound&term=%22" + semanticObject.inchi + "%22[InChI]";
    }
  }
};

SemanticActions.add("pubchem_inchi", pubchem_inchi);
```

You can reproduce this by installing Operator 0.8a in Firefox, saving the script to a file in your home directory, and
reading it via the Operator "Options" dialog. Make sure to also set the *Display Style* in the *General* tab of the dialog to
*Data formats*. Only then will the RDFa magic kick in.

Adding support for eMolecules, ChemSpider and whatever else we like is easy now. What I still need to explore (or ask Mike),
is how I can trigger the *Open With/Save As* dialog of Firefox.
