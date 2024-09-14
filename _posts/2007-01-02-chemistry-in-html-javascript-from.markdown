---
layout: post
title:  "Chemistry in HTML: JavaScript from the server"
date:   2007-01-02
blogger-link: https://chem-bla-ics.blogspot.com/2007/01/chemistry-in-html-javascript-from.html
tags: html javascript userscript
image: /blog/assets/images/sechemticJSOutput.png
---

Recently I blogged about [a Greasemonkey script](http://chem-bla-ics.blogspot.com/2006/12/smiles-cas-and-inchi-in-blogs.html)
to take advantage of [semantic markup of chemistry in blogs](http://chem-bla-ics.blogspot.com/2006/12/including-smiles-cml-and-inchi-in.html)
(and HTML in general), and later made [some plans how this can be
extended](http://chem-bla-ics.blogspot.com/2006/12/chemistry-in-html-greasemonkey-again.html).
One of the ideas was to make this userscript available from the server, instead
of having people need to install [Greasemonkey](http://greasemonkey.mozdev.org/)
and the script separately. So, here it is.

## sechemtic.js

Consider this (X)HTML:

```html
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:chem="http://www.blueobelisk.org/chemistryblogs/">

<head>
 <title>m1</title>
 <script type="text/javascript" src="sechemtic.js" />
</head>

<body onload="addGoogleAndPubChemLinks(1,1)">
  <h1>The Output</h1>
  <p>This article is about <span class="chem:compound">m1</span> 
  (SMILES:<span class="chem:smiles">CCCOC</span>).</p>

</body>

</html>
```

![](/blog/assets/images/sechemticJSOutput.png)

I think the above example shows the simple setup of the Sechemtic Web script (please
forgive me my habit to use bad linguistic mashups ;). Just load the script in the
HTML `<head>`, and add in the `onload="addGoogleAndPubChemLinks(1,1)"` attribute to
the `<body>` element. With blogs these bits would be part of the template, and,
therefore, need to be installed once. From then on, just use the [semantic markup as
explained earlier](http://chem-bla-ics.blogspot.com/2006/12/including-smiles-cml-and-inchi-in.html).
Both the microformat and the RDFa method are supported. In
case of the latter, I recommend to define the chem namespace in the template of
webpages too, instead of in the `<span>` elements.

Currently, the Sechemtic Web script only has one functionality: to add links to
[PubChem](http://pubchem.ncbi.nlm.nih.gov/) and [Google](http://www.google.com/),
with the `addGoogleAndPubChemLinks(int, int)` method. The
first parameter determines (0 or 1) if links to Google should be made, and the
second parameter does the same for links to PubChem.

## Download

For now, the script can be downloaded [here](http://wiki.cubic.uni-koeln.de/cb/sechemtic.js).
It is licensed with the GPL version 2.0.

## Microformats

Here's the same example using [microformats](http://microformats.org/)
instead of RDFa:

```html
<html>

<head>
 <title>m1</title>
 <script type="text/javascript" src="sechemtic.js" />
</head>

<body onload="addGoogleAndPubChemLinks(1,1)">
  <h1>The Output</h1>
  <p>This article is about <span class="compound">m1</span> 
  (SMILES:<span class="smiles">CCCOC</span>).</p>

</body>

</html>
```
