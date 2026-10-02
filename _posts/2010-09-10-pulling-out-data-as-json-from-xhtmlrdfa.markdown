---
layout: post
title:  "Pulling out data as JSON from XHTML+RDFa"
date:   2010-09-10
modified_date: 2026-10-02
blogger-link: https://chem-bla-ics.blogspot.com/2010/09/pulling-out-data-as-json-from-xhtmlrdfa.html
doi: 10.59350/zjj1y-ave93
tags: chemistry html rdfa sparql json
---

I am keen on [RDFa](/blog/tag/rdfa) and [RDF <i class="fa-solid fa-recycle fa-xs"></i>](http://sv.wikipedia.org/wiki/Resource_Description_Framework) in general; that should not be a surprise.
RDFa is a serialization of RDF triples embedded in (X)HTML. I recently posted about [chemical examples of XHTML+RDFa](http://chem-bla-ics.blogspot.com/2010/08/xhtmlrdfa-chemical-examples.html).
Now, the reason for putting data in HTML as RDFa is that we can easily pull it out again, e.g. with [this distiller](http://www.w3.org/2007/08/pyRdfa/).
But the fun goes on, and we can actually also run SPARQL directly on it, for example with RDFaDev which I
[recently blogged about <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/07/19/scripts-logs-as-htmlrdfa-mix-free-text.html).

Now, consider we have all these nice visualization tools written in JavaScript which can visualize data from [JSON](http://www.json.org/) sources,
the mashup requires a JSON serialization of that data embedded in HTML pages. Now, I have no experience with the cool JavaScript tools, and hope
someone can help me out here, but the JSON bit I already [got help with before on SemanticOverflow](http://www.semanticoverflow.com/questions/587/is-there-a-web-service-that-allow-me-to-run-sparql-against-a-xhtmlrdfa-website)
(thanx to [Comment Bot](http://www.semanticoverflow.com/users/148/comment-bot)!). The service mentioned no longer works, but there are plenty of alternatives.

Now, Peter is creating this nice data set about [green solvents from patents](http://wwmm.ch.cam.ac.uk/blogs/murrayrust/?p=2596), and it would be great of that data ends up online as RDFa, so that we can easily visualize the trends in solvent use over the years. But as I do not have this data as XHTML+RDFa yet, you will have to do with another example: boiling points.

So, let's consider the data on [this page <i class="fa-solid fa-recycle fa-xs"></i>](https://egonw.github.io/cheminformatics.classics/classic1.html), relating paraffin molecules to boiling points, and we'll take a complexity descriptor (*w0*, Wiener descriptor) and the boilingpoint (*t0*). so we get this SPARQL query:

<pre>PREFIX cc: &lt;http://github.com/egonw/cheminformatics.classics/1/#&gt;

SELECT * {
    ?mol cc:w0 ?w ;
         cc:p0 ?p .
}
</pre>

Now, we want to run this query on the aforementioned page, so we add a FROM clause:

<pre>PREFIX cc: &lt;http://github.com/egonw/cheminformatics.classics/1/#&gt;

SELECT *
FROM &lt;http://www.w3.org/2007/08/pyRdfa/extract?uri=http%3A%2F%2Fegonw.github.com%2Fcheminformatics.classics%2Fclassic1.html&amp;format=pretty-xml&amp;warnings=false&amp;parser=lax&amp;space-preserve=true&gt;
{
    ?mol cc:w0 ?w ;
         cc:p0 ?p .
}
</pre>

Notice the use of the distiller here. This way, with a service like [that on sparql.org](http://sparql.org/sparql.html), we can get JSON returned. The result is a bit verbose, but that can perhaps be tuned:

<pre>{
  "head": {
    "vars": [ "w" , "p" ]
  } ,
  "results": {
    "bindings": [
      {
        "w": { "datatype": "http://www.w3.org/2001/XMLSchema#integer" , "type": "typed-literal" , "value": "56" } ,
        "p": { "datatype": "http://www.w3.org/2001/XMLSchema#integer" , "type": "typed-literal" , "value": "4" }
      } ,
      {
        "w": { "datatype": "http://www.w3.org/2001/XMLSchema#integer" , "type": "typed-literal" , "value": "35" } ,
        "p": { "datatype": "http://www.w3.org/2001/XMLSchema#integer" , "type": "typed-literal" , "value": "3" }
      }
    ]
  }
}
</pre>

The point is, I am sure at least one of my readers knows how to visualize the data in [this JSON](http://sparql.org/sparql?query=PREFIX+cc%3A+%3Chttp%3A%2F%2Fgithub.com%2Fegonw%2Fcheminformatics.classics%2F1%2F%23%3E%0D%0A%0D%0ASELECT+%3Fw+%3Fp%0D%0AFROM+%3Chttp%3A%2F%2Fwww.w3.org%2F2007%2F08%2FpyRdfa%2Fextract%3Furi%3Dhttp%253A%252F%252Fegonw.github.com%252Fcheminformatics.classics%252Fclassic1.html%26format%3Dpretty-xml%26warnings%3Dfalse%26parser%3Dlax%26space-preserve%3Dtrue%3E%0D%0A%7B%0D%0A++++%3Fmol+cc%3Aw0+%3Fw+%3B%0D%0A+++++++++cc%3Ap0+%3Fp+.%0D%0A%7D&default-graph-uri=&stylesheet=%2Fxml-to-html.xsl&output=json&force-accept=text%2Fplain) with, for example, [Google Chart](http://code.google.com/apis/chart/), particularly, because all the mashing up is embedded in the just linked-to, though obscure, URL. And, if it helps, you can otherwise use the [CSV](http://sparql.org/sparql?query=PREFIX+cc%3A+%3Chttp%3A%2F%2Fgithub.com%2Fegonw%2Fcheminformatics.classics%2F1%2F%23%3E%0D%0A%0D%0ASELECT+%3Fw+%3Fp%0D%0AFROM+%3Chttp%3A%2F%2Fwww.w3.org%2F2007%2F08%2FpyRdfa%2Fextract%3Furi%3Dhttp%253A%252F%252Fegonw.github.com%252Fcheminformatics.classics%252Fclassic1.html%26format%3Dpretty-xml%26warnings%3Dfalse%26parser%3Dlax%26space-preserve%3Dtrue%3E%0D%0A%7B%0D%0A++++%3Fmol+cc%3Aw0+%3Fw+%3B%0D%0A+++++++++cc%3Ap0+%3Fp+.%0D%0A%7D&default-graph-uri=&stylesheet=%2Fxml-to-html.xsl&output=csv&force-accept=text%2Fplain) or [TSV](http://sparql.org/sparql?query=PREFIX+cc%3A+%3Chttp%3A%2F%2Fgithub.com%2Fegonw%2Fcheminformatics.classics%2F1%2F%23%3E%0D%0A%0D%0ASELECT+%3Fw+%3Fp%0D%0AFROM+%3Chttp%3A%2F%2Fwww.w3.org%2F2007%2F08%2FpyRdfa%2Fextract%3Furi%3Dhttp%253A%252F%252Fegonw.github.com%252Fcheminformatics.classics%252Fclassic1.html%26format%3Dpretty-xml%26warnings%3Dfalse%26parser%3Dlax%26space-preserve%3Dtrue%3E%0D%0A%7B%0D%0A++++%3Fmol+cc%3Aw0+%3Fw+%3B%0D%0A+++++++++cc%3Ap0+%3Fp+.%0D%0A%7D&default-graph-uri=&stylesheet=%2Fxml-to-html.xsl&output=tsv&force-accept=text%2Fplain) output. The output of that is even more simple (CSV):

<pre>w,p
56,4
286,9
35,3
220,8
20,2
84,5
10,1
165,7
120,6
</pre>

The first one who can use one of the above URLs to extract the data from that XHTML+RDFa page to create a scatter plot in a HTML page with some JavaScript library, wins a free mention in my blog! ;)
