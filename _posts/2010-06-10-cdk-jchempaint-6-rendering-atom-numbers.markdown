---
layout: post
title:  "CDK-JChemPaint #6: rendering atom numbers"
date:   2010-06-10
modified_date: 2010-06-10
blogger-link: https://chem-bla-ics.blogspot.com/2010/06/cdk-jchempaint-6-rendering-atom-numbers.html
doi: 10.59350/5cfpy-kym94
tags: cdk chemistry
image: /blog/assets/images/triazole.atomno_2.png
---

I have made a few new [CDK](http://cdk.sf.net/)-JChemPaint patches in the past two days, the latest being
[patch 15](https://sourceforge.net/projects/cdk/files/CDK-JChemPaint/15/). With the help from
[Gilleain](http://gilleain.blogspot.com/), all rendering parameters are now using the new API, as explained
[earlier](http://chem-bla-ics.blogspot.com/2010/04/cdk-jchempaint-3-rendering-parameters.html) in
[this series](http://chem-bla-ics.blogspot.com/search?q=%22cdk-jchempaint+%23%22).

Additionally, the API to work with rendering parameters is now much simpler. The previous posts did not
really explain how to tune parameters, so here goes. One important thing to realize, is that a rendering
parameter can only be changed if the generator that defines it has been registered. To see what parameters
belongs to what generator, for which you can use the script discussed in
[post #3](http://chem-bla-ics.blogspot.com/2010/04/cdk-jchempaint-3-rendering-parameters.html).

## Atom Numbers

In some situations you like to draw atom numbers. This can be done by replacing the BasicAtomGenerator by an
AtomNumberGenerator in the script given in [post #1](http://chem-bla-ics.blogspot.com/2010/04/cdk-jchempaint-1-rendering-molecules.html):

```java
List generators = new ArrayList();
generators.add(new BasicSceneGenerator());
generators.add(new BasicBondGenerator());
generators.add(new AtomNumberGenerator());
```

This would result in an image like this:

![](/blog/assets/images/triazole.atomno.png)

Now, we also might want to give those numbers a color, to make them stand out a bit. Orange, perhaps :)
This is where rendering parameters come in. To the code from
[post #1](http://chem-bla-ics.blogspot.com/2010/04/cdk-jchempaint-1-rendering-molecules.html),
after the instantiation of the renderer, we add:

```java
// tune parameters
model = renderer.getRenderer2DModel();
model.set(
  AtomNumberGenerator.AtomNumberTextColor.class,
  Color.orange
);
```

The output then looks like:

![](/blog/assets/images/triazole.atomno_2.png)

## Atom Numbers and Symbols

But you can also render both element symbols and numbers. Then, clearly, you just add both generators:

```java
List generators = new ArrayList();
generators.add(new BasicSceneGenerator());
generators.add(new BasicAtomGenerator());
generators.add(new BasicBondGenerator());
generators.add(new AtomNumberGenerator());
```

But, in order to have the label and the symbol not overlap, we define an offset (Thanx to
[Sebastian](http://github.com/s-wolf), of [MetFrag](http://www.biomedcentral.com/1471-2105/11/148/abstract)
fame, for the feature request!):

```java
model.set(
  AtomNumberGenerator.Offset.class,
  new javax.vecmath.Vector2d(10,10)
);
```

Then it gets to look like:

![](/blog/assets/images/triazole.atomno_3.png)

This last full example will be available from GitHub shortly.

**Update** Steffen asked in the comments if it is possible to just color the atoms by element type. CDK-JChemPaint
patch 15 does not allow that, but adding that feature is easy enough, and the patch will be part of the next
release. Use this configuration:

```java
generators.add(new BasicSceneGenerator());
generators.add(new BasicBondGenerator());
generators.add(new AtomNumberGenerator());
```

And these parameter settings:

```java
model = renderer.getRenderer2DModel();
model.set(
  AtomNumberGenerator.ColorByType.class,
  true
);
```

This give you for [triazole](http://en.wikipedia.org/wiki/Triazole):

![](/blog/assets/images/triazole.atomno_4.png)
