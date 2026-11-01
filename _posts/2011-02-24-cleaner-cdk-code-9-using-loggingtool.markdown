---
layout: post
title:  "Cleaner CDK Code #9: using the LoggingTool"
date:   2011-02-24 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2011/02/cleaner-cdk-code-9-using-loggingtool.html
doi: 10.59350/vd2z8-prh71
tags: cdk cheminf java
---

A trick I used from Miguel Howard (of [Jmol](http://www.jmol.org/) fame) is
to not concatenate String until really needed. String concatenation will allocate
new Strings, and thus burden the garbage collector (yeah, you lucky Fortran
users who think twice before allocating memory :). Some time ago, he suggested
this trick for the logger. I think in Jmol, but the [CDK](http://cdk.sf.net/)
inherited that idea.

## Don't concatenate Strings when calling the LoggingTool

Logging in the CDK can be turned off, and in production use, I often do. Therefore,
we can make it speed up by concatenating debug message String only when debugging
is turned on. The CDK [LoggingTool](http://pele.farmbio.uu.se/nightly/api/org/openscience/cdk/tools/ILoggingTool.html)
can take care of this, so you should pass the Strings are individual parameters
to the logger call. Instead of:

```java
logger.debug("the current atom is " + atom);
```

you should write:

```java
logger.debug("the current atom is ", atom);
```

And this works for any arbitrary number of Strings and objects, because the
logging tool debug method has this signature: `public void debug(Object object,
Object... objects)`. So, you can also just do:

```java
logger.debug("The ", i, "th object is connected to the ", j, "th");
```

Actually, looking at the `debug()` method's signature, I am not sure why we still
have the first Object separately... mmm.
