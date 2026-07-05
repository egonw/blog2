---
layout: post
title:  "CDK-JChemPaint #3: rendering parameters"
date:   2010-04-05 02:00
blogger-link: https://chem-bla-ics.blogspot.com/2010/04/cdk-jchempaint-3-rendering-parameters.html
doi: 10.59350/10ng3-3eb14
tags: cdk jchempaint
modified_date: 2026-07-05
---

OK, one last CDK-JChemPaint tutorial for today (see [#1 <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/04/05/cdk-jchempaint-1-rendering-molecules.html) and
[#2 <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/04/05/cdk-jchempaint-2-rendering-reactions.html)). Rendering wasn't as much fun, if you could not tune it
to your needs. JChemPaint has long had many rendering parameters, and one by one we are converting them to the new API. The following code is an
modification to the first example, and adds some code to list all rendering parameters for the three used generators:

```java
// generators make the image elements
List generators = new ArrayList();
generators.add(new BasicSceneGenerator());
generators.add(new BasicBondGenerator());
generators.add(new BasicAtomGenerator());

// the renderer needs to have a toolkit-specific font manager
IRenderer renderer = new AtomContainerRenderer(
  generators, new AWTFontManager()
);

// dump all parameters
for (IGenerator generator : renderer.getGenerators()) {
  for (IGeneratorParameter parameter : generator.getParameters()) {
    println "parameter: " +
      parameter.getClass().getName().substring(40) +
      " -> " +
      parameter.getValue();
  }
}
```

The output will look something like:

```
parameter: BasicSceneGenerator$BackGroundColor -> java.awt.Color[r=255,g=255,b=255]
parameter: BasicSceneGenerator$Margin -> 10.0
parameter: BasicSceneGenerator$UseAntiAliasing -> true
parameter: BasicSceneGenerator$UsedFontStyle -> NORMAL
parameter: BasicSceneGenerator$FontName -> Arial
parameter: BasicBondGenerator$BondWidth -> 1.0
parameter: BasicBondGenerator$DefaultBondColor -> java.awt.Color[r=0,g=0,b=0]
parameter: BasicAtomGenerator$AtomColor -> java.awt.Color[r=0,g=0,b=0]
parameter: BasicAtomGenerator$AtomColorer -> org.openscience.cdk.renderer.color.CDK2DAtomColors@49aacd5f
parameter: BasicAtomGenerator$AtomRadius -> 8.0
parameter: BasicAtomGenerator$ColorByType -> true
parameter: BasicAtomGenerator$CompactShape -> SQUARE
parameter: BasicAtomGenerator$CompactAtom -> false
parameter: BasicAtomGenerator$KekuleStructure -> false
parameter: BasicAtomGenerator$ShowEndCarbons -> false
```
