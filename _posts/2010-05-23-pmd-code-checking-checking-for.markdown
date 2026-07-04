---
layout: post
title:  "PMD code checking: checking for programming against CDK interfaces"
date:   2010-05-23
blogger-link: https://chem-bla-ics.blogspot.com/2010/05/pmd-code-checking-checking-for.html
doi: 10.59350/9wby7-sdm26
tags: cdk java pmd
---

I wrote recently about [programming against interfaces](http://chem-bla-ics.blogspot.com/2010/05/cleaner-cdk-code-5-developer-against.html),
which led to some discussion. [Rajarshi](http://blog.rguha.net/) [commented](http://sourceforge.net/tracker/?func=detail&aid=3005355&group_id=20024&atid=320024):

> patch 2 seems to replace usage of Molecule with Molecule, rather than IMolecule

Now, this particularly problem was [Eclipse](http://www.eclipse.org/) being overly active cleaning up the imports, but we reached the
point that it is actually interesting to have [PMD](http://pmd.sf.net/) warn about these issues. PMD is a cool piece of software used
by the CDK project for a long time one. One particular cool thing is that you can write *code warnings* as
[XPath](http://www.w3schools.com/xpath/default.asp) queries.

So, I promised Rajarshi to have a look at a custom rule to look at using IMolecule instead of Molecule. The code is actually pretty simple, using the aforementioned XPath feature:

```xml
<rule name="ReplaceMoleculeWithIMolecule"
      language="java"
      message="Use the IMolecule interfaces instead of the Molecule implementation"
      class="net.sourceforge.pmd.rules.XPathRule">
  <description>
      Programming against the CDK interfaces allows users to pick their favorite
      implementation (nonotify, datadebug).
  </description>
  <priority>3</priority>
  <properties>
    <property name="xpath">
      <value>
 <![CDATA[
   //Type/ReferenceType/ClassOrInterfaceType[@Image='Molecule']
 ]]>
      </value>
    </property>
  </properties>
    <example>
    <![CDATA[
      Molecule mol = builder.newInstance(IMolecule.class);
    ]]>
  </example>
</rule>
```

Patch pending...
