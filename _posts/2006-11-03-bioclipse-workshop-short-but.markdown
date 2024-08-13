---
layout: post
title:  "Bioclipse Workshop: short but productive"
date:   2006-11-03
blogger-link: https://chem-bla-ics.blogspot.com/2006/11/bioclipse-workshop-short-but.html
tags: bioclipse qsar javascript
---

The [Bioclipse](http://www.bioclipse.net/) [Workshop](http://wiki.bioclipse.net/index.php?title=Bioclipse_Workshop_Oct/Nov_2006)
has ended and, for just three days, turned out [quite productive](http://wiki.bioclipse.net/index.php?title=Outcome_of_the_Bioclipse_autumn_workshop_2006).
We have first bits of scripting support for JavaScript using [Rhino](http://www.mozilla.org/rhino/). At this moment the
scripting plugin needs to explicit depend on plugins to be able to access their classpath, but we plan to solve that.
An example script:

```javascript
// to have short identifiers
Array = Packages.java.lang.reflect.Array;
String = Packages.java.lang.String;
msgBox = Packages.net.bioclipse.plugins.bc_rhino.ShowBcMsgBox;
DbfetchServiceServiceLocator =
  Packages.uk.ac.ebi.www.ws.services.urn.Dbfetch.DbfetchServiceServiceLocator;

// get data
service = new DbfetchServiceServiceLocator();
strarray = service.getUrnDbfetch().fetchData("refseq:NM_210721", "refseq", "raw");

// make readable
str = new String();
for (i = 0; i < Array.getLength(strarray); i++) {
  if (i != 0)
  str = str + ("\n");
  str = str + strarray[i];
}

// show
msgBox.ShowStatic(str);
```

It's just a short example that uses webservice technology in Bioclipse to fetch a sequence.

# QSAR support

QSAR support is getting along too, with a new DescriptorProvider extension point in [trunk/](http://svn.sourceforge.net/viewvc/bioclipse/trunk/)
and work is progressing on a wizard that allows selecting descriptors and a CDK backend. The output of the wizard is a matrix resource, for
which we already have a rich editor. A [JOELib](http://www-ra.informatik.uni-tuebingen.de/software/joelib/) plugin has been suggested,
as it has a good deal of QSAR descriptors too; [Jörg](http://miningdrugs.blogspot.com/), interested in doing a tiny bit of Bioclipse hacking?

A full proceedings is available [online](http://wiki.bioclipse.net/index.php?title=Outcome_of_the_Bioclipse_autumn_workshop_2006).
