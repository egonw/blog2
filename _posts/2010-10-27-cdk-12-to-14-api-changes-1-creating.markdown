---
layout: post
title:  "CDK 1.2 to 1.4 API changes #1: creating objects with an IChemObjectBuilder"
date:   2010-10-27
blogger-link: https://chem-bla-ics.blogspot.com/2010/10/cdk-12-to-14-api-changes-1-creating.html
doi: 10.59350/rvgrt-8b910
tags: cdk cheminf java
---

Later this year (planned) a new stable branch of the CDK library will be released.
Time to look at some API changes, to ease migration. In this first post of the
series, I will show how the IChemObjectBuilder functionality has changed.

**CDK 1.2 code**

```java
IChemObjectBuilder builder =
  DefaultChemObjectBuilder.getInstance();
IMolecule molecule = builder.newMolecule();
molecule.addAtom(builder.newAtom("C"));
```

**CDK 1.4 code**

```java
IChemObjectBuilder builder =
  DefaultChemObjectBuilder.getInstance();
IMolecule molecule = builder.newInstance(
  IMolecule.class
);
molecule.addAtom(
  builder.newInstance(IAtom.class, "C")
);
```

Now, please note that the *builder.newInstance()* method may actually return
null. This is not the case for the [DefaultChemObjectBuilder](http://pele.farmbio.uu.se/nightly-1.4.x/cdk-javadoc-1.3.6.git/org/openscience/cdk/DefaultChemObjectBuilder.html),
or the [NoNotifiationChemObjectBuilder](http://pele.farmbio.uu.se/nightly-1.4.x/cdk-javadoc-1.3.6.git/org/openscience/cdk/nonotify/NoNotificationChemObjectBuilder.html),
but future releases may have dedicated builders that do have such functionality.
However, these builder would not supposed to be used for building molecules
anyway.

The general patterns of *newInstance()* calls is that the first argument is
the interface for which you want an instance. All further parameters are passed
as parameters for the object's constructor. The builder maps the input to appropriate
class constructors. To know what parameters you can pass when instantiating
an IAtom with the DefaultChemObjectBuilder, you would look at the constructor
of [Atom](http://pele.farmbio.uu.se/nightly-1.4.x/cdk-javadoc-1.3.6.git/org/openscience/cdk/Atom.html).
Therefore, we can also call:

```java
IAtom atom = builder.newInstance(
  IAtom.class, "C", new Point2d(0,0)
);
```
