---
layout: post
title:  "Calculating molecular descriptors with OpenTox"
date:   2010-10-30 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2010/10/calculating-molecular-descriptors-with.html
doi: 10.59350/7pbp8-f6q28
tags: bioclipse cdk opentox qsar
---

While working during *office hours* on [Oscar](http://chem-bla-ics.blogspot.com/2010/10/oscar4-java-api-chemical-name.html),
I am also trying to finish up some work left from Uppsala. One such thing is
the Bioclipse-OpenTox project (see [Using Bioclipse to upload data to an OpenTox
server](http://chem-bla-ics.blogspot.com/2010/08/using-bioclipse-to-upload-data-to.html)
and [Oxford, August 2010: eCheminfo Predictive ADME & Toxicology 2010 Workshop](http://chem-bla-ics.blogspot.com/2010/03/oxford-august-2010-echeminfo-predictive.html)).
Today I finished calculating molecular descriptor values with OpenTox servers:

```javascript
// requires an unspecified Bioclipse
// development version
bioclipse.requireVersion("2.6")

service =
  "http://apps.ideaconsult.net:8080/ambit2/";
serviceSPARQL =
  "http://apps.ideaconsult.net:8080/ontology/";

stringMat = opentox.listDescriptors(serviceSPARQL);
stringMat.getColumn("algo");
stringMat.getColumn("desc");

// pick any descriptor
descriptor = stringMat.get(1,1);

opentox.calculateDescriptor(
  service, descriptor,
  cdk.fromSMILES("CCC")
)
```

The first descriptor happens to be a model for predicting the pKa (see [Algorithm
or Model: OpenTox API quiz](http://chem-bla-ics.blogspot.com/2010/10/algorithm-or-model-opentox-api-quiz.html)).
