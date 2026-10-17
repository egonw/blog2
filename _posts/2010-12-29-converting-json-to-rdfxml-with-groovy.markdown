---
layout: post
title:  "Converting JSON to RDF/XML with Groovy"
date:   2010-12-29
modified_date: 2026-10-17
doi: 10.59350/2repm-7m232
blogger-link: https://chem-bla-ics.blogspot.com/2010/12/converting-json-to-rdfxml-with-groovy.html
tags: groovy chemistry rdf json
---

Mark's new [CCO/RDF hosting functionality](http://www.science3point0.com/blog/2010/12/29/cc0-rdf-hosting-for-scientists/)
(see also [my post two days ago <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/12/27/what-should-free-cc0-rdf-hosting-for.html))
requires [RDF/XML format](http://www.w3.org/TR/REC-rdf-syntax/), so I updated my code to convert the
[Chempedia Substances](http://chempedia.com/substances) data into RDF/XML instead of N3 (I have asked
[Rich](http://depth-first.com/) to put a new download link online). This is the
[Groovy](http://groovy.codehaus.org/) code I used:

```groovy
import groovy.xml.MarkupBuilder
import groovy.util.IndentPrinter

input = new File("substances.json")
json = new JsonSlurper().parse(input);

def writer = new StringWriter()
def xml = new MarkupBuilder(
  new IndentPrinter(new PrintWriter(writer))
)
xml.'rdf:RDF'(
  'xmlns:rdf':
    'http://www.w3.org/1999/02/22-rdf-syntax-ns#',
  'xmlns:dc' :
    'http://purl.org/dc/elements/1.1/',
  'xmlns:iupac' :
    'http://www.iupac.org/',
  'xmlns:cp' :
    'http://rdf.openmolecules.net/chempedia/onto#',
  'xmlns:owl' :
    'http://www.w3.org/2002/07/owl#'
) {
  json.each { substance ->
    xml.'rdf:Description'(
      'rdf:about': substance.uri
    ) {
      xml.'dc:identifier'(substance.gsid)
      xml.'owl:sameAs'(
        'rdf:resource' :
        'http://rdf.openmolecules.net/?' +
        substance.inchi
      )
      xml.'iupac:inchi'(
        'http://rdf.openmolecules.net/?' +
        substance.inchi
      )
      for (int i = 0; i<substance.namings.size(); i++)
      {
        naming = substance.namings.get(i);
        namingURI = substance.uri + "/naming" + i;
        xml.'cp:hasNaming' {
          xml.'rdf:Description' {
            xml.'cp:hasName'(naming.name)
            xml.'cp:hasStatus'(naming.status)
            xml.'cp:hasScore'(naming.score)
          }
        }
      }
    }
  }
}
println writer.toString();
```
