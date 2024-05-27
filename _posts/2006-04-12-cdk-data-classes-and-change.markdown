---
layout: post
title:  "The CDK data classes and change notifications"
date:   2006-04-12
blogger-link: https://chem-bla-ics.blogspot.com/2006/04/cdk-data-classes-and-change.html
tags: cdk cheminf jchempaint
---

The data classes of the [Chemistry Development Kit](http://cdk.sf.net/) are mutable, unlike those of
[Octet](http://sourceforge.net/projects/octet). This means that other classes may need to respond when
the content updates. For example, a render class. CDK's [ChemObject](http://cdk.sourceforge.net/api/org/openscience/cdk/ChemObject.html)
provides a `notifyChanged()` and `addListener()` methods for this. However, as was
[recently](http://sourceforge.net/mailarchive/forum.php?thread_id=10001141&forum_id=2178) pointed out,
while this is useful in editors, such as [JChemPaint](http://jchempaint.sf.net/), this is a performance killer in high-throughput
sitations, such as descriptor calculation, or structure diagram generation runs.

To address this, the [IChemObject](http://svn.sourceforge.net/viewcvs.cgi/cdk/trunk/cdk/src/org/openscience/cdk/interfaces/IChemObject.java?view=log)
interface has been extended with the methods `setNotification(boolean)` and `getNotification()`, which allow to temporarily
disable change notifications. There are no helper methods yet to disable it for a complete data structure, like
`ChemModelManipulator.setNotification(ChemModel, boolean)`, but I expect these to be written soon.

Alternatively, special data classes may be used if notification is never needed for a special setup, for example, in case the QSAR descriptor calculation. In such cases, the new [NoNotificationChemObjectBuilder](http://svn.sourceforge.net/viewcvs.cgi/cdk/trunk/cdk/src/org/openscience/cdk/nonotify/NoNotificationChemObjectBuilder.java?view=log)
can be used:

```java
IChemObjectReader reader = new MDLReader(new FileInputStream(new File("some.mol")));
IChemObjectBuilder builder = NoNotificationChemObjectBuilder.getInstance();
IMolecule molecule = reader.read(builder.newMolecule());
// then perform some operation in which the molecule changes a lot
```

The advantage is that you do not have to manually disable notification for each class you instantiate. This should give a considerable speed up, and I hope soon to give some statistics.
