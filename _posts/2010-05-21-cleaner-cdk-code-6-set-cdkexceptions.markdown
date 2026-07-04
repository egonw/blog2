---
layout: post
title:  "Cleaner CDK Code #6: set the CDKException's cause Exception"
date:   2010-05-21 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2010/05/cleaner-cdk-code-6-set-cdkexceptions.html
doi: 10.59350/mdt9c-fkc91
tags: cdk java
---

For about two weeks now, I am working on fixing a bug in the *nonotify* module: the classes were still sending around change events.
I decided to finally do it the proper way: sending around change events is extra functionality, so the data module should extend the
nonotify module and not the other way around, as in [CDK](http://cdk.sf.net/) 1.2 and CDK 1.3 up to now. There was a dirty hack in
place, introducing a boolean indicating it should send events or not, but that turned out to be insufficient.

Anyway, while working on a major refactoring like this one, you run into many, many small code issues. Clearly. the one I mostly run
into is that a lot of code is not [written against the interfaces yet](http://chem-bla-ics.blogspot.com/2010/05/cleaner-cdk-code-5-developer-against.html).
However, I just ran into another bit of code that can be improved.

### Set the cause Exception when throwing a CDKException

This is the particular bit of code I ran into:

```java
try {
  molecule = (IMolecule) container.clone();
} catch (CloneNotSupportedException e) {
  throw new CDKException(
    "Error occured during clone " + e
  )
}
```

However, there are two small improvements that can be applied to this code. The first is that the the error message passed to
the CDKException constructor can reuse the *message* of the cause Exception. The second improvement is that we can actually
pass the cause exception is cause to the CDKException. Therefore, the CDKException can be constructed as (also fixing the typo :):

```java
new CDKException(
  "Error occurred during clone " + e.getMessage(),
  e
);
```

Oh, and, of course, CDK code should use variables of at least three characters. Now, the original CDKException construction was
on one line, in total having ***four*** points of improvement :)
