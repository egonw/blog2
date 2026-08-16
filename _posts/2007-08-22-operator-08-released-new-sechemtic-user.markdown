---
layout: post
title:  "Operator 0.8 released: a new Sechemtic user script"
date:   2007-08-22
modified_date: 2025-03-30
doi: 10.59350/w3eex-30y69
blogger-link: https://chem-bla-ics.blogspot.com/2007/08/operator-08-released-new-sechemtic-user.html
tags: semweb chemistry rdfa
image: /assets/images/options1.png
---

[Mike](http://www.kaply.com/weblog/) released [Operator 0.8](http://www.kaply.com/weblog/2007/08/21/operator-08-is-available/),
which picks up RDF (RDFa en eRDF) from HTML pages, and adds actions to it. I [blogged earlier about the beta <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/06/27/chemical-rdfa-with-operator-in-firefox.html)
and wrote a script for it for [chemical RDFa <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/12/10/including-smiles-cml-and-inchi-in.html).
At this moment, [Chemical blogspace](http://cb.openmolecules.net/) and [RDF for Molecular Space](http://rdf.openmolecules.net/?InChI=1/CH4/h1H4)
(see [this blog <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/07/31/rdf-ing-molecular-space.html)) are using chemical RDFa to semantically markup molecular information.

The new Operator release ([download](https://addons.mozilla.org/en-US/firefox/addon/4106)) has one notable API change:
it now uses "RDF" as key for semantic information; the add-on now supports eRDF too. So, when installing or updating
to version 0.8, you also need to update the Sechemtic user script to [version 1.1](http://blueobelisk.svn.sf.net/svnroot/blueobelisk/operator/tags/1.1/sechemtic_rdfa_operator.js)
[or better](http://blueobelisk.svn.sf.net/svnroot/blueobelisk/operator/tags/).

Installing Operator scripts is a bit more work than Greasemonkey userscripts. Save the script to your home directory,
or any other place you can easily find on the hard disk. After installing the Operator add-on, click the *Options* button:

![](/assets/images/options.png)

For the RDFa script to work, you need to make sure that the *Display style* is set to *Data formats*:

![](/assets/images/options1.png)

Then you can go to the *User Scripts* tab, and use the *New* button to add the script you downloaded and saved to your hard disk earlier:

![](/assets/images/options2.png)

Then, after rebooting Firefox (looks like MS-Windows :(), you can go to Chemical blogspace and
[look up molecules](http://cb.openmolecules.net/inchis.php), and see output like that described in
[RDFa Operator in action on Cb](http://chemicalblogspace.blogspot.com/2007/06/rdfa-operator-in-action-on-cb.html).


