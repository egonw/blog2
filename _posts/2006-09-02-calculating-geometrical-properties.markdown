---
layout: post
title:  "Calculating geometrical properties with the CDK"
date:   2006-09-02
blogger-link: https://chem-bla-ics.blogspot.com/2006/09/calculating-geometrical-properties.html
tags: cdk
---

[ケムインフォマティクスに虚空投げ](http://cheminformatics.seesaa.net/) runs [a story on how to calculate geometrical
properties of a 3D structure](https://chem-bla-ics.blogspot.com/2006/09/calculating-geometrical-properties.html) using
CDK's [ForceFieldTools](http://cdk.sourceforge.net/api/org/openscience/cdk/modeling/forcefield/ForceFieldTools.html).
This class contains a few methods to calculate distances between atoms and angles between bonds.

This tools class is special as it uses vecmath GVector objects, which just contain atomic coordinates, likely suitable
for extensive computation, as expected in [CDK's force field implementation](http://cdk.sourceforge.net/api/org/openscience/cdk/modeling/forcefield/package-frame.html).
However, for just calculating the distance and angles, there are simpler alternatives.

The distance between two atoms can be calculated with:

```java
atom1 = molecule.getAtom(0);
atom2 = molecule.getAtom(1);
double dist = atom1.getPoint3d().distance(atom2.getPoint3d());
```

or, by constructing a vector for the bond first:

```java
Vector3d bond1to2 = new Vector3d(atom2.getPoint3d());
bond1to2.sub(atom1.getPoint3d());
double dist = bond1to2.length();
```

Using vectors to represent bond (with two atoms!), allows easily calculating angles too (assuming the bonds shard atom1):

```java
double angle = bond1to2.angle(bond1to3);
```

Vecmath does not seem to contain a convenience method for calculating torsion angles :(
