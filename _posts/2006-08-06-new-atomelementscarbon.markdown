---
layout: post
title:  "new Atom(Elements.CARBON);"
date:   2006-08-06
blogger-link: https://chem-bla-ics.blogspot.com/2006/08/new-atomelementscarbon.html
ags: cdk
---

Something I have not completely comfortable with about the [CDK](http://cdk.sf.net/) in the past, is the way
[Atom](http://cdk.sourceforge.net/api/org/openscience/cdk/Atom.html)'s are constructed:

```java
  IAtom carbon = new Atom("C");
```

Not that it is horrible code, but the CDK has an [Element](http://cdk.sourceforge.net/api/org/openscience/cdk/Element.html)
too. Why not reuse that? However, until revision 6755 there were not constructors that allowed something like the following:

```java
  IAtom carbon = new Atom(new Element("C"));
aaa

This afternoon I have hacked in constructors for [ChemObject](http://cdk.sourceforge.net/api/org/openscience/cdk/ChemObject.html),
Element, [Isotope](http://cdk.sourceforge.net/api/org/openscience/cdk/Isotope.html), [AtomType](http://cdk.sourceforge.net/api/org/openscience/cdk/AtomType.html),
Atom and [PseudoAtom](http://cdk.sourceforge.net/api/org/openscience/cdk/PseudoAtom.html) that allow to be constructed from its
interface, or the interface of one of its superclasses.

Additionally, in revision 6753, I added [cdk.config.Elements](http://svn.sourceforge.net/viewvc/cdk/trunk/cdk/src/org/openscience/cdk/config/Elements.java) with
static IElements for all elements up to atomic number 116, taken from the [Blue Obelisk Data Repository](http://www.blueobelisk.org/).
Therefore, I can now also write:

```java
  IAtom carbon = new Atom(Elements.CARBON);
```
