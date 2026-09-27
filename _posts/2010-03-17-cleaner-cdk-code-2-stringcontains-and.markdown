---
layout: post
title:  "Cleaner CDK Code #2: String.contains() and logger messages"
date:   2010-03-17
blogger-link: https://chem-bla-ics.blogspot.com/2010/03/cleaner-cdk-code-2-stringcontains-and.html
doi: 10.59350/kf1jt-xmf65
tags: cdk java
modified_date: 2026-09-27
---

Second in the series (see [#1 <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/03/07/cleaner-cdk-code-1-list-and-for-each.html)),
with two rather small tips.

## Use String.contains() instead of String.indexOf("foo") != -1

Java 5 introduced the method [public boolean contains(CharSequence s)](http://java.sun.com/j2se/1.5.0/docs/api/java/lang/String.html#contains(java.lang.CharSequence)),
which can replace the more cryptic use of *indexOf() != -1*.

Instead of:

```java
System.getProperty("java.version").indexOf("1.6") != -1
```

you can write:

```java
System.getProperty("java.version").contains("1.6")
```

## More efficient use of the LoggingTool

Quite a long time ago, [Jmol](http://www.jmol.org/) developer Miguel introduced me to a nice performance hint with respect to using
logging tools. Each debug(), info(), warn(), etc method should take more than one parameter, so that only when debugging (or the debug
level) is turned on, the objects are concatenated. It indeed gave a considerable performance boost to things. The CDK supports this
too, and you should not concatenate Strings and other objects, but let the LoggingTool do that.

Instead of:

```java
logger.debug(
  "\n" + paths.size() + " paths and " +
  ac.getAtomCount() + " atoms left."
);
```

you can write:

```java
logger.debug(
  "\n", paths.size(), " paths and ",
  ac.getAtomCount(), " atoms left."
);
```
