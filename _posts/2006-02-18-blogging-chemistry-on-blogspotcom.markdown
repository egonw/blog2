---
layout: post
title:  "Blogging chemistry on blogspot.com"
date:   2006-02-18
blogger-link: https://chem-bla-ics.blogspot.com/2006/02/blogging-chemistry-on-blogspotcom.html
tags: cml semweb inchikey:QTBSBXVTEAMEQO-UHFFFAOYSA-N doi:10.1021/CI034244P
---

You might have read earlier posts in this blog on [CMLRSS](https://doi.org/10.1021/ci034244p), and received a question today on how to integrate
CMLRSS with blogs on blogspot.com. Now, [current CMLRSS feeds](http://www.ch.ic.ac.uk/rzepa/cmlrss_distrib/) are normally generated with customized
scripts, often directly from a database.

So, here's my attempt to include CML in a blogspot.com blog. [OpenBabel 2.0](http://openbabel.sf.net/) can create good CML, for example for acetic acid:

<cml:molecule xmlns:cml="http://www.xml-cml.org/schema/cml2/core">
<cml:atomArray atomID="a1 a2 a3 a4" elementType="C C O O" formalCharge="0 0 0 0"/>
<cml:bondArray atomRef1="a1 a2 a2" atomRef2="a2 a3 a4" order="1 2 1"/>
</cml:molecule>

Nothing much to see, right? Well, that's good, because it's inserted as CML, not as anything readable, like this equivalent:

```xml
<cml:molecule xmlns:cml="http://www.xml-cml.org/schema/cml2/core">
<cml:atomArray atomID="a1 a2 a3 a4" elementType="C C O O" formalCharge="0 0 0 0"/>
<cml:bondArray atomRef1="a1 a2 a2" atomRef2="a2 a3 a4" order="1 2 1"/>
</cml:molecule>
```

I am curious how this will come out in the RSS feed. Maybe it is usefull; please read the comments for additional notes.
