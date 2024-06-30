---
layout: post
title:  "XML validation on Eclipse with Web Tools Platform"
date:   2006-05-24
blogger-link: https://chem-bla-ics.blogspot.com/2006/05/xml-validation-on-eclipse-with-web.html
tags: xml bioclipse cml
---

Yesterday I installed the [Eclipse Web Tools Platform](http://www.eclipse.org/webtools/) again, and now
succesfully, using the Eclipse update mechanism, on my [Kubuntu dapper](http://www.kubuntu.org/) eclipse
install. Because it has a validating XML editor, the one last thing I still needed
[jEdit](http://www.jedit.org/) for. (I do miss the vertical selection feature of jEdit, though.) It
signals me of errors, and allows autocompletion.

Now I can validate all [Chemical Markup Langauge](http://www.xml-cml.org/) files I have around, which is
very useful for those I use to make sure [CDK](http://cdk.sf.net/) and [Bioclipse](http://www.bioclipse.net/)
is working properly. I just need to make sure I use the `http://www.w3.org/2001/XMLSchema-instance namespace`,
for example as in this example from CDK SVN:

```xml
<cml title="Regression tests for valid XML Schema documents for CML 2.3"

  xmlns="http://www.xml-cml.org/schema"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://www.xml-cml.org/schema ../../../io/cml/data/cml23.xsd">
```

Now, I do have some questions. Firstly, does WTP allow recycling of the XML editor? That is, can I use their validating XML editor in, for example, Bioclipse? Would I just depend on the right plugin jars from WTP, or is it more complicated? Alternatively, since in RCP all is a plugin, can WTP be installed as plugin in Bioclipse directly??

Secondly, does Kubuntu or Debian sid have binary packages for WTP? I think to remember having read something about this, in relation with splitting up the WTP into smaller, more specific plugins. Anyone?
