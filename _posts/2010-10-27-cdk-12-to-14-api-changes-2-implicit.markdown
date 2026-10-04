---
layout: post
title:  "CDK 1.2 to 1.4 API changes #2: implicit hydrogens"
date:   2010-10-27
modified_date: 2026-10-04
blogger-link: https://chem-bla-ics.blogspot.com/2010/10/cdk-12-to-14-api-changes-2-implicit.html
doi: 10.59350/49k5k-5d465
tags: cdk cheminf java
---

A second API change lies deep in the [IAtom <i class="fa-solid fa-recycle fa-xs"></i>](https://cdk.github.io/cdk/latest/docs/api/org/openscience/cdk/interfaces/IAtom.html)
interface. To reflect more accurately the meaning of the method, the *IAtomType.getHydrogenCount()*
has been renamed to *IAtomType.getImplicitHydrogenCount()*, and likewise the
setter methods.

**CDK 1.2 code**

```java
carbon.setHydrogenCount(4);
```

**CDK 1.4 code**

```java
carbon.setImplicitHydrogenCount(4);
```

Yeah, that's a simple one. Just to make clear, in both versions the count reflected
the number of implicit hydrogens. The *getHydrogenCount()* suggested, however,
to return the number of all hydrogens attached to that atom, that is, the sum
of implicit and explicit hydrogens.
