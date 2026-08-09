---
layout: post
title:  "Cleaner CDK Code #8: the Java Naming Conventions and Camel Casing"
date:   2010-08-09
blogger-link: https://chem-bla-ics.blogspot.com/2010/08/cleaner-cdk-code-8-java-naming.html
doi: 10.59350/bvf3b-aag58
tags: cdk java
---

Another simple approach to make your code more readable, is to adhere to the Java naming conventions. They prescribe that variables start with a
lower case characters, as do method names. Class and interfaces, however, start with upper case characters. By all using these same conventions,
we need to learn only one scheme and can more easily recognize what are variables, methods and classes. Have a look at these
[naming conventions by Oracle](http://www.oracle.com/technetwork/java/codeconventions-135099.html) and the concept of
[Camel Casing](http://en.wikipedia.org/wiki/CamelCase), heavily used in Java.

BTW, note that the CDK conventions deviate from the Oracle conventions just linked to with respect to variable names. We have not found a way
to have [PMD](http://pmd.sf.net/) to differentiate to where variables are used, and therefore require at least three characters per variable
name, to enforce some meaningful naming, which is required by Oracle's conventions too.

### Previous topics

* [Cleaner CDK Code #7: understand what the code is supposed to do](http://chem-bla-ics.blogspot.com/2010/08/cleaner-cdk-code-7-understand-what-code.html)
* [Cleaner CDK Code #6: set the CDKException's cause Exception](http://chem-bla-ics.blogspot.com/2010/05/cleaner-cdk-code-6-set-cdkexceptions.html)
* [Cleaner CDK Code #5: develop against interfaces](http://chem-bla-ics.blogspot.com/2010/05/cleaner-cdk-code-5-developer-against.html)
* [Cleaner CDK Code #4: inheriting JavaDoc from super classes and interfaces](http://chem-bla-ics.blogspot.com/2010/03/cleaner-cdk-code-4-inheriting-javadoc.html)
* [Cleaner CDK Code #3: run the PMD tests](http://chem-bla-ics.blogspot.com/2010/03/cleaner-cdk-code-3-run-pmd-tests.html)
* [Cleaner CDK Code #2: String.contains() and logger messages](http://chem-bla-ics.blogspot.com/2010/03/cleaner-cdk-code-2-stringcontains-and.html)
* [Cleaner CDK Code #1: List and the for-each loop](http://chem-bla-ics.blogspot.com/2010/03/cleaner-cdk-code-1-list-and-for-each.html)
