---
layout: post
title:  "More cdk.interfaces updates"
date:   2005-10-25
blogger-link: https://chem-bla-ics.blogspot.com/2005/10/more-cdkinterfaces-updates.html
tags: cdk
doi: 10.59350/y9z8g-s6k09
---

Yesterday I had some spare time before going to a meeting about the [Woordenboek Organische Chemie](http://www.woc.science.ru.nl/),
so I was boldly going where no one has went before: getting the CDK module core independent of the data module. Why, you might wonder...

Well, if the as many modules of CDK become independent of the classes implementing the data interfaces, i.e. those classes that
implement the [org.openscience.cdk.interfaces](http://cdk.sourceforge.net/api/org/openscience/cdk/interfaces/package-frame.html)
interfaces, then it becomes possible to make alternative implementations. For example, an implementation that also implement the
[Octet](http://octetsource.net/) interfaces, or an implementation that extends the [JOELib](http://joelib.sf.net/) classes. In that
way, combining these libraries becomes as easy as writing a blog :)

Anyway, today I finished the [AtomTypeFactory](http://cdk.sourceforge.net/api/org/openscience/cdk/config/AtomTypeFactory.html), and
only the [IstopeFactory](http://cdk.sourceforge.net/api/org/openscience/cdk/config/IsotopeFactory.html) remains to be updated.
Since many classes in the CDK library use these two classes, patches had to be applied throughout the library. And code outside the
CDK library might be broken now, so be aware...
