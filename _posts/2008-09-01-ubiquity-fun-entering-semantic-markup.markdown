---
layout: post
title:  "Ubiquity fun: entering semantic markup as easy as running a Ubiquity command"
date:   2008-09-01 00:10
modified_date: 2025-10-05
blogger-link: https://chem-bla-ics.blogspot.com/2008/09/ubiquity-fun-entering-semantic-markup.html
doi: 10.59350/s6bgg-e7a38
tags: rdf javascript web ubiquity rdfa
image: /assets/images/ubiSechemticStep1.5.png
---

Now, the [DOI ubiquity scripts <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/09/01/ubiquity-fun-resolving-dois.html) I just blogged about,
was just the beginning of things. Me exploring the environment and learning the JavaScript language.

I start to become really interesting when we use these technologies to improve things. I am still not sure people will like the
command line nature, but at least I will be a happy user. This is the setting: I'm blogging about some chemistry, like to add an
InChI (or InChIKey) and add that [cool sechemtic markup <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/12/10/including-smiles-cml-and-inchi-in.html)
people have been blogging about, but I do not know (or want to know) the HTML details for that.

Well, no worries, no more. Here comes *sechemtic-inchi* ([installer here](http://blueobelisk.sourceforge.net/people/egonw/sechemtic-inchi.html))!

## Step 1

I type in the InChI I want in my blog (example showing that of [methane](http://en.wikipedia.org/wiki/Methane)):

![](/assets/images/ubiSechemticStep1.png)

And, I select the InChI:

![](/assets/images/ubiSechemticStep1.5.png)

After which I hit the Ubiquity shortcut (ALT-SPACE on Linux) and I type *sechemtic-inchi*:

![](/assets/images/ubiSechemticStep2.png)

And, viola, there is my RDFa HTML code for chemistry:

![](/assets/images/ubiSechemticStep3.png)

Now, with only minor amounts of fantasy, you can imagine where this is going: SMILES, InChiKey, etc, etc. Hook it up with
[chemistry webservices](http://rguha.wordpress.com/2008/08/30/ubiquity-and-chemical-information/) to autoconvert
SMILES to InChIKeys, and Bob's your uncle.
