---
layout: post
title:  "CDK Book in progress"
date:   2010-10-08
blogger-link: https://chem-bla-ics.blogspot.com/2010/10/cdk-book-in-progress.html
doi: 10.59350/x7ddh-98k05
image: /blog/assets/images/cdkBook.png
tags: cdk groovy latex publishing cdkbook
---

Very much overdue, but still in progress, is my book on CDK programming. I am
in love with the writing environment, a mix of [make](http://en.wikipedia.org/wiki/Make_%28software%29),
[Groovy](http://en.wikipedia.org/wiki/Groovy_%28programming_language%29) and
[LaTeX](http://en.wikipedia.org/wiki/LaTeX), where the code snippets are written
in Groovy and embedded into LaTeX (see [CDK - The Documentation](http://chem-bla-ics.blogspot.com/2009/04/cdk-documentation.html)).
The Groovy script is actually run by the build system, allowing me to embed
the output too.

In the LaTeX source code I, therefore, have something like:

```latex
The list of supported hybridization types can be listed with:

\codeverb{HybridizationTypes}

listing these types:

\codeout{HybridizationTypes}
```

refering to a groovy script that looks like:

```
#import org.openscience.cdk.interfaces.*;
#
IAtomType.Hybridization.each {
  println it
}
```

Actually, the above is preprocessed to give the LaTeX view as well as the actual
Groovy script run.

Since last year, I have pimped the output a bit, and the above now looks like:

![](/blog/assets/images/cdkBook.png)
