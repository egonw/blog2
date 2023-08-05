---
layout: post
title:  "UML diagram of CDK module dependencies"
date:   2005-12-06
blogger-link: https://chem-bla-ics.blogspot.com/2005/12/uml-diagram-of-cdk-module-dependencies.html
tags: cdk
---

The code clean up after [CDK](http://cdk.sf.net/)'s interfaces transition is in progress, and two
[CDK modules](http://almost.cubic.uni-koeln.de/cdk/cdk_top/devel/modules/) are now independent
of the *data* module. After [doing the *core* module](http://chem-bla-ics.blogspot.com/2005/10/more-cdkinterfaces-updates.html),
the standard was next, and I finished this yesterday. The dependencies in CVS now look like (click it to get a larger view):

IMAGE LOST

This UML diagram was made with [Umbrello](http://uml.sourceforge.net/), and the source is in
[XMI](http://www-128.ibm.com/developerworks/xml/library/x-xmi/) in CVS.

I cannot stress enough the advantages of these changes:

1. the code is cleaner
2. module dependencies are cleaner
3. impossible to use methods outside the interface
4. the algorithms are independent of the data classes

The last advantage is really important: it allows alternative implementations of the data classes. For example, we could make debug
data classes, which, unlike the normal classes, do all sorts of checks when using methods of these classes. For example, they can
explicitely check that parameters are not null, of the right class, and generally make sense. This makes them, possibly, slower,
but also more type save, and as such great for debugging and development sessions.

Another important application of making the CDK library independent of the data classes (and only depending on the
[interfaces](http://cdk.sourceforge.net/api/org/openscience/cdk/interfaces/package-frame.html)), is that we can have data classes
shared with other Java libraries, such as [JOElib](http://joelib.sf.net/), [Octet](http://octetsource.com/),
CML ([Jumbo 5.0 is out!](http://sourceforge.net/mailarchive/forum.php?thread_id=9146642&forum_id=8774)), and even proprietary libraries.
This approach is already used in the [CDK-Taverna](http://chem-bla-ics.blogspot.com/2005/10/cdk-taverna-fully-recognized.html)
library, and I anticipate much wider use with the arrival of [Bioclipse](http://www.bioclipse.net/).
