---
layout: post
title:  "NMRShiftDB enters rdf.openmolecules.net #2: SPARQL end point with Virtuoso"
date:   2009-09-04
blogger-link: https://chem-bla-ics.blogspot.com/2009/09/nmrshiftdb-enters-rdfopenmoleculesnet-2.html
doi: 10.59350/nv925-tje87
tags: rdf sparql nmrshiftdb cheminf
modified_date: 2026-08-01
---

About 6 months ago I [reported](http://chem-bla-ics.blogspot.com/2009/03/nmrshiftdb-enters-rdfopenmoleculesnet.html) about my efforts to RDF-ize the data from the
[NMRShiftDB](http://www.nmrshiftdb.org/). Since then, time was consumed by many other things, but now that [Bioclipse](http://www.bioclipse.net/) can query
[SPARQL](http://en.wikipedia.org/wiki/SPARQL) end points, that I want to contribute the triple set (it is [GNU FDL](http://www.gnu.org/copyleft/fdl.html)-licensed)
to [Bio2RDF](http://www.bio2rdf.org/), that a student started working in my group (now larger than just me :) on reasoning on life sciences data, and that I
recently contributed my [1000th NMR spectrum](http://egonw.posterous.com/nmrshiftdb-1006-contributions-and-counting) to the database, I thought it was time to
finally reinstall [Virtuoso](http://www.openlinksw.com/wiki/main/Main/VOSDownload).

There are precompiled binaries for [Ubuntu](https://launchpad.net/~wdaniels/+archive/ppa) and [Debian](http://bugs.debian.org/cgi-bin/bugreport.cgi?bug=508048),
but Michel encouraged me to use version 6 when [he visited us <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/06/26/michel-dumontier-at-uppsala-university.html).
And so I compiled and install [6.0.0.TP1](https://sourceforge.net/projects/virtuoso/files/virtuoso-devel/6.0.0-TP1/) on the public server, while I do have the
binary debs for 5.0.12 on my laptop. With some basic Apache magic, I hooked up the SPARQL end point of the server to the web:

```xml
<Proxy /nmrshiftdb/sparql>
  RewriteEngine On
  Allow from all
  ProxyPass        http://localhost:8890/sparql
  ProxyPassReverse http://localhost:8890/sparql
</Proxy>
```

Nice thing about this is, that I can set up multiple servers, allowing me to keep incompatibly licensed data sets apart (see
[Open Data: license, rights, aggregation, clean interfaces? <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/05/18/open-data-license-rights-aggregation.html)), which is
the same approach Bio2RDF is taking.

The [end point](http://pele.farmbio.uu.se/nmrshiftdb/sparql) now offers about [278887](http://pele.farmbio.uu.se/nmrshiftdb/sparql?default-graph-uri=&query=SELECT+count%28*%29+WHERE+{\%0D%0A++%3Fs+%3Fp+%3Fo+.%0D%0A}&format=text%2Fhtml&debug=on)
triples, but this will soon rise as I make more content from the database available in the original SQL database. The data is from the
[1.3.3 release](https://sourceforge.net/projects/nmrshiftdb/files/nmrshiftdb/1.3.3/) by [Chris](http://www.steinbeck-molecular.de/steinblog/)'
team, and does not include my 1000th spectrum.

Getting the data into the database was not trivial either. The documentation suggests WebDAV, and that indeed worked for me once, after
using the [curl approach suggested here](http://www.snee.com/bobdc.blog/2009/02/getting-started-using-virtuoso.html). But upon a second upload, it
did again not enter the store. The ultimate solution was to use the iSQL interface, with the following SQL

```
DB.DBA.RDF_LOAD_RDFXML_MT(
  file_to_string_output('/tmp/nmrshiftdb.rdf'), '',
  'http://pele.farmbio.uu.se/nmrshiftdb'
);
```

Scientifically, this progress is not overly interesting, although it makes it very clear that you really should not have to be happy with proprietary
and non-semantic formats for anything. But, to me, this is mostly a technological success of great importance: I can now share really large sets of
RDF data.

Querying this data is a simple with SPARQL, and the results are available in various formats, such as JSON, which makes it easy to integrate in
third-party applications or [Google Wave robots <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/09/02/google-wave-robot-for-cdk-functionality.html)
(did I hear someone say [NMRShifty](http://nmrshifty.appspot.com/)?). As I have [blogged before](http://chem-bla-ics.blogspot.com/search?q=sparql),
SPARQL is an excellent tool to aggregate scientific data prior to data analysis. And I will demo more interesting queries later this month.
