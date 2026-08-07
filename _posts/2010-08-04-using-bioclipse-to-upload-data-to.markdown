---
layout: post
title:  "Using Bioclipse to upload data to an OpenTox server"
date:   2010-08-04 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2010/08/using-bioclipse-to-upload-data-to.html
doi: 10.59350/f0s4t-znm21
tags: bioclipse opentox cheminf myexperiment
---

As part of a continuing mashup of [Bioclipse](http://www.bioclipse.net/) and [OpenTox](http://www.opentox.org/), I sat down with Nina in
[Oxford](http://chem-bla-ics.blogspot.com/2010/08/oxford.html) to implement uploading molecules from within Bioclipse with JavaScript to
OpenTox servers. This opens the route to calculate QSAR descriptors using the
[OpenTox API](http://opentox.org/dev/apis/api-1.1/).

As, a result, you can (with the code at my laptop) now do (see this [BSL script at MyExperiment](http://www.myexperiment.org/workflows/1468)):

```javascript
// requires an unspecified Bioclipse development version

ds = opentox.createDataset("http://apps.ideaconsult.net:8080/ambit2/");

opentox.addMolecule(ds, cdk.fromSMILES("CCCCC[N+](C)(C)C"))
opentox.addMolecule(ds, cdk.fromSMILES("ClC(I)Br"))

opentox.deletaDataset(ds);
```

Make sure to check out the other stuff [I have been doing with respect to OpenTox](http://chem-bla-ics.blogspot.com/search?q=opentox).
