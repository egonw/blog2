---
layout: post
title:  "Using PubChem to create CDK unit tests"
date:   2010-09-26
blogger-link: https://chem-bla-ics.blogspot.com/2010/09/using-pubchem-to-create-cdk-unit-tests.html
doi: 10.59350/9bw3h-3mr91
tags: cdk pubchem mcprinciples
---

In 2008 I posted about [Wicked chemistry and unit testing](http://chem-bla-ics.blogspot.com/2008/05/wicked-chemistry-and-unit-testing.html)
and was using [BeanShell](http://en.wikipedia.org/wiki/BeanShell) at the time
to convert a structure on [PubChem](http://pubchem.ncbi.nlm.nih.gov/) into [CDK](http://cdk.sf.net)
source code. But since I rather use [Groovy](http://en.wikipedia.org/wiki/Groovy_%28programming_language%29)
now, I have updated the code. I used [CDK 1.3.6](http://chem-bla-ics.blogspot.com/2010/09/cdk-137-changes-authors-and-reviewers.html)
and the PubChem XML format now.:

<pre>import org.openscience.cdk.Molecule;
import org.openscience.cdk.io.*;

if (args.length == 0 || args[0] == null) {
  System.out.println("Syntax: pc2ut.groovy [CID]\n");
  System.exit(0);
}

String cid = args[0];
String urlString =
  "http://pubchem.ncbi.nlm.nih.gov/summary/" +
  "summary.cgi?disopt=SaveXML&amp;cid=" + cid;

URL url = new URL(urlString);

PCCompoundXMLReader reader =
  new PCCompoundXMLReader(url.openStream());
Molecule mol = reader.read(new Molecule());

StringWriter stringWriter = new StringWriter();
CDKSourceCodeWriter writer =
  new CDKSourceCodeWriter(stringWriter);
writer.write(mol);
writer.close();

System.out.print(stringWriter.toString());
</pre>
