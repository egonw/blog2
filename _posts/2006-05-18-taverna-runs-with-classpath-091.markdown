---
layout: post
title:  "Taverna runs with Classpath 0.91"
date:   2006-05-18
blogger-link: https://chem-bla-ics.blogspot.com/2006/05/taverna-runs-with-classpath-091.html
tags: java workflow jchempaint
---

Classpath 0.91 [is released](http://www.gnu.org/software/classpath/announce/20060515.html) with
[1.45 million](http://jroller.com/page/dgilbert?entry=1_45_million_lines_of) lines of code and with
[98.96%](http://www.kaffe.org/~stuart/japi/htmlout/h-jdk14-classpath.html) coverage of Java 1.4.2,
and 99.82% of java.swing. Or, as [Dave calls it](http://jroller.com/page/dgilbert?entry=gnu_classpath_0_91):
0.91 rocks! [JChemPaint runs again](http://chem-bla-ics.blogspot.com/2005/11/open-source-swing-jchempaint-runs.html)
(they fixed the XML parsing problem), and [Jmol still runs](http://chem-bla-ics.blogspot.com/2005/11/open-source-swing-jmol-renderer-runs.html),
[but slow](http://developer.classpath.org/mediation/FreeSwingTestApps). I also tested
[Taverna](http://taverna.sourceforge.net/) which now also starts up, but has an XML parsing error too:

```
Exception occured whilst loading RDFS! Error on line 2: required string: "?>"
org.jdom.input.JDOMParseException: Error on line 2: required string: "?>"
   at org.jdom.input.SAXBuilder.build(SAXBuilder.java:468)
   at org.jdom.input.SAXBuilder.build(SAXBuilder.java:851)
   at org.embl.ebi.escience.scufl.semantics.RDFSParser.loadRDFSDocument(RDFSParser.java:70)
   at org.embl.ebi.escience.scuflui.workbench.Workbench.main(Workbench.java:128)
   at java.lang.reflect.Method.invokeNative(Native Method)
   at java.lang.reflect.Method.invoke(Method.java:355)
   at org.embl.ebi.escience.scuflui.workbench.WorkbenchLauncher.main(WorkbenchLauncher.java:40)
```

Oh, and rumours go that [gcjwebplugin](http://www.nongnu.org/gcjwebplugin/) can run the Jmol applet now,
except for the JavaScript interaction, that is.
