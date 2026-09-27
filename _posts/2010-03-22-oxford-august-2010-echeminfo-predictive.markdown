---
layout: post
title:  "Oxford, August 2010: eCheminfo Predictive ADME & Toxicology 2010 Workshop"
date:   2010-03-22
blogger-link: https://chem-bla-ics.blogspot.com/2010/03/oxford-august-2010-echeminfo-predictive.html
doi: 10.59350/46jj1-62e14
tags: bioclipse qsar toxicology opentox ambit
image: /assets/images/bioclipseOpenTox.png
modified_date: 2026-09-27
---

The first week of August I will attend the [eCheminfo Predictive ADME & Toxicology Workshop](http://echeminfo.com/COMTY_oxfordadmet10)
([LinkedIn Event](http://events.linkedin.com/eCheminfo-Predictive-ADME-Toxicology/pub/271590)) for which I received a
[Bursary Award](http://barryhardy.blogs.com/cheminfostream/2010/02/bursary-award-applications-echeminfo-oxford-2010-workshops.html).
It will be my first time in Oxford, and I am very much looking forward to it!

The meeting is also bound to be fun. I have not done much in the area of toxicology other than the more general QSAR/QSPR model
building with chemometrics. But I have been recently taking to Nina and other of the [OpenTox](http://www.opentox.org/) community,
and started to play a bit with the data and computation API they are developing.

![](/assets/images/bioclipseOpenTox.png)

I started a Bioclipse plugin recently (see screenshot), and placed the source code in [this bioclipse-opentox](http://gitorious.org/bioclipse-opentox/bioclipse-opentox)
Git repository on [Gitorious](http://gitorious.org/) ([my GitHub account](http://github.com/egonw) is already over the formal limit).
The functionality is still quite limited, and the manager currently only provides methods to download data sets
([myexperiment:1192](http://www.myexperiment.org/workflows/1192)):

```javascript
// query a service using the OpenTox API 1.1
// See: http://www.opentox.org/dev/apis/api-1.1

var service = "http://apps.ideaconsult.net:8180/ambit2/";

var datasets = opentox.listDataSets(service);
for (set=0; set<datasets.size(); set++) {
  var dataset = datasets.get(set);
  js.say("Downloading set: " + dataset);
  ui.open(
    opentox.downloadDataSetAsMDLSDfile(
       service, dataset, "/OpenTox/ambit" + dataset + ".sdf"
    )
  )
}
```

Behind this plugin is again the RDF plugin, as OpenTox uses RDF too, a few simple SPARQL queries was all that needed to be defined.
And [again <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/03/15/rdf-powered-qsar-wizard-sparql-end.html), the Bioclipse pluigin
code base is pretty small.
