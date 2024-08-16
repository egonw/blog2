---
layout: post
title:  "CiteULike CiTO Use Case #1: Wordles"
date:   2010-10-31
blogger-link: https://chem-bla-ics.blogspot.com/2010/10/citeulike-cito-use-case-1-wordles.html
tags: justdoi:10.1186/2041-1480-1-S1-S6 cito citeulike cdk wordle doi:10.1021/CI025584Y
doi: 10.59350/npbqm-gfa49
---

Last month I reported a [few things I missed](http://chem-bla-ics.blogspot.com/2010/09/list-of-things-i-miss-in-citeulike.html)
in [CiteULike](http://www.citeulike.org/). One of them was support for CiTO (see
doi:[https://doi.org/10.1186/2041-1480-1-S1-S6](10.1186/2041-1480-1-S1-S6)), a great Citation Typing Ontology.

I promised the CiTO author, [David](http://www.zoo.ox.ac.uk/staff/academics/shotton_dm.htm), my use cases, but have been horribly
busy in the past few weeks with my new position, wrapping up my past position, and thinking on my position after Cambridge. But finally, here it is. Based on source code I
[wrote and released earlier](http://github.com/egonw/groovy-citeulike), the first use case I represent is the
[Wordle](http://www.wordle.net/) one, which I [showed with manual work in February](http://chem-bla-ics.blogspot.com/2010/02/wordle-of-titles-of-20-most-recent.html).

Now that all the data is semantically marked up in CiteULike, I can easily extract all paper titles (or whatever is available in CiteULike) for all papers that cite the first
[CDK](http://cdk.sf.net/) paper (doi:[10.1021/ci025584y](http://dx.doi.org/10.1021/ci025584y)). Using the JSON interface, I have
[this Groovy script](http://github.com/egonw/groovy-citeulike/blob/master/cul2wordleInput.groovy) to extract all titles:

```groovy
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.Method
import static groovyx.net.http.ContentType.JSON

culUrl = "http://www.citeulike.org/";

citotags = [
  "cito--cites",
  "cito--usesMethodIn",
  "cito--discusses",
  "cito--extends"
// there are more, but these are all
// I use right now
]

papers = [
  "1073448",
  "423382"
]

http = new HTTPBuilder(culUrl)

papers.each { paper ->
  println "# Processing $paper..."
  citotags.each { tag ->
    citation = "$tag--$paper".toLowerCase()
    http.request(Method.valueOf("GET"), JSON) {
      uri.path = "/json/user/egonw/tag/$citation"

      response.success = { resp,json ->
        json.each { article ->
          tripleCount = 0;
          article.tags.each { artTag ->
            if (artTag.startsWith(tag)) tripleCount++
          }
          if (tripleCount > 0) {
            title = article.title
            title = title.replaceAll("\\{","")
            title = title.replaceAll("\\}","")
            println "$title"
          }
        }
      }
    }
  }
}
```

The output is two blocks which I can easily copy/paste into Wordle. Now, I think I heard one can actually download the java code, so I am tempted to integrate it later,
but for now copy/paste will do fine, after the data handling is mostly automated: with a few lines extra I can make such visualizations for any paper
I annotated in CiteULike with CiTO.

**The CDK I paper**

![](/assets/images/wordleCDK1.png)

**The CDK II paper**

![](/assets/images/wordleCDK2.png)

Interesting differences... more statistics will soon follow. See [Further statistics on the papers citing the CDK](http://chem-bla-ics.blogspot.com/2010/02/further-statistics-on-papers-citing-cdk.html)
for the kind of analyses I have in mind.
