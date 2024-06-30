---
layout: post
title:  "Recent Developments of the Chemistry Development Kit"
date:   2006-06-05
blogger-link: https://chem-bla-ics.blogspot.com/2006/06/recent-developments-of-chemistry.html
tags: cdk cheminf qsar doi:10.2174/138161206777585274
image: /blog/assets/images/DescriptorOverview.png
---

*[Recent Developments of the Chemistry Development Kit (CDK)](http://www.bentham.org/cpd/contabs/cpd12-17.htm#5) -
An Open-Source Java Library for Chemo- and Bioinformatics* discusses (reasonably) recent additions to the
[CDK](http://cdk.sf.net/). It appeared in issue 17 of this years [Current Pharmaceutical Design](http://www.bentham.org/cpd/)
volume, after being too long in the queue after being accepted; but I am happy that it is out now.

The article discusses CDK's QSAR capabilities (the class designs and an overview of provided descriptors), the 3D model builder
(see also [C. Hoppe, CDK News, 1(2):4-5](https://chem-bla-ics.blogspot.com/2006/06/recent-developments-of-chemistry.html))
and and the interface to the statistical software [R](http://www.r-project.org/) (see also
[CDK News, vol.2, issue 1](http://sourceforge.net/project/showfiles.php?group_id=20024&package_id=124796&release_id=310462)).
The article is part of a small special issue on Computational Applications in Medicinal Chemistry.

CDK's QSAR package comes with one main requirement: **the outcome of QSAR descriptor calculations must be reproducable**.
*"Science must be reproducable"*; I'm sure someone once said this :) Therefore, each QSAR descriptor has a specification
pointing the a unique algorithm found in an ontology (see diagram below). This QSAR descriptor ontology is maintained by
the [qsar.sf.net](http://qsar.sf.net/) project, which is project independent, and even welcomes proprietary programs to
discuss interoperability.

![](/blog/assets/images/DescriptorOverview.png)

And calculated descriptors are explicitely linked to this specification again, though it is up to the user to do with
this what he wants:

![](/blog/assets/images/DescriptorResultOverview.png)

Note that code has evolved since this publication, so class, interface and method names may have changed a bit.
