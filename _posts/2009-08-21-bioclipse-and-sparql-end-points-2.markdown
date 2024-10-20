---
layout: post
title:  "Bioclipse and SPARQL end points #2: MyExperiment"
date:   2009-08-21
blogger-link: https://chem-bla-ics.blogspot.com/2009/08/bioclipse-and-sparql-end-points-2.html
tags: bioclipse rdf foaf myexperiment rdf sparql
image: /assets/images/myExp890.png
---

[RDF](http://en.wikipedia.org/wiki/Resource_Description_Framework) and [SPARQL](http://en.wikipedia.org/wiki/SPARQL)
are two really useful Open Standards. [Bioclipse-RDF](http://github.com/egonw/bioclipse.rdf/tree/master) is a
plugin for [Bioclipse](http://www.bioclipse.net/) that provide RDF functionality, among which using remote SPARQL end points.

The [MyExperiment](http://www.myexperiment.org/) team has set up an excellent [RDF front end](http://rdf.myexperiment.org/).
For example, this is [my MyExperiment account in RDF](http://rdf.myexperiment.org/User/286). The storage gets updated
once every day (at this moment), but I'm sure that will become more often in the future. The SPARQL end point
allows us to make any query against the database that [their ontologies](http://rdf.myexperiment.org/ontologies/)
support. The above query showed up 132 workflows when I ran it today.

## Gists

Now, so far I have been using [Gist](http://gist.github.com/) to share Bioclipse scripts and I wrote
some [Bioclipse GUI elements for downloading such gists](http://chem-bla-ics.blogspot.com/2009/01/bioclipse-and-gist-integration.html).
To annotate these gists, [Delicious](http://delicious.com/) has been used, and a listing of Bioclipse scripts can be found under the
tags [bioclipse and gist](http://delicious.com/tag/bioclipse+gist).

MyExperiment also allows to share workflows, but originally only for [Taverna](http://taverna.sf.net/).
A recent change, however, made it possible to share other *types* of workflows too. And, MyExperiment
itself also allows all the annotation which we may want to do.

Now, using the Bioclipse-RDF functionality, I can query the MyExperiment database and use that information
do to stuff. If this stuff is a Bioclipse script, then I can just download it, as the download link of a
workflow is part of the RDF too, as we will see.

## Querying a SPARQL end point

As we have seen in the [first article of this series](http://chem-bla-ics.blogspot.com/2009/08/bioclipse-and-sparql-end-points.html),
the RDF manager his a method to query a remote SPARQL end point. The complexity is mostly in formulating the SPARQL (and this one
happens to be available as [workflow on MyExperiment too](http://www.myexperiment.org/workflows/890):

![](/assets/images/myExp890.png)

This is worsened by the fact that JavaScript does not have a type of multiline Strings, so the backslashes at
the end of the lines are JavaScript syntax and not part of the SPARQL. To simplify the SPARQL, I will show
below the SPARQL only, and not the Bioclipse script wrapping as is done in the above code snippet.

## List all Taverna 2 workflows

Listing all Taverna 2 workflows, as shown in that earlier snippet, is done with the SPARQL:

<script src="https://gist.github.com/egonw/172138.js"></script>

This query asks for a `?workflow` and its `?title`, and the workflow `?type` must be of Class `ContentType` as defined in the
`mebase` namespace, and we want to know the `?typetitle` of that content type, because we are filtering that using a
[regular expression](http://en.wikipedia.org/wiki/Regular_expression) to contain "Taverna 2". Well, if you cannot
follow this, just [google for SPARQL](http://www.bing.com/search?q=sparql+tutorial&go=&form=QBLH&filt=all),
and run one of those tutorials which are abundantly present on the web.

## Finding tags used to annotate workflows

To list all tags which have likely to do with metabolomics, I can do:

<script src="https://gist.github.com/egonw/172277.js"></script>

And I can also list all workflows that are tagged like this. Because I could not get string matching to work, I used the tag's URI instead:

<script src="https://gist.github.com/egonw/172685.js"></script>

## All MyExperiments Users in Sweden

I was also interested in all MyExperiment Users in Sweden, and again, a simple SPARQL tells me where they live:

<script src="https://gist.github.com/egonw/172129.js"></script>

## Finding Duncan and Pierre

Very easy to find users, such as [Duncan](http://duncan.hull.name/):

<script src="https://gist.github.com/egonw/172686.js"></script>

Or [Pierre](http://plindenbaum.blogspot.com/), who has not listed where he lives:

<script src="https://gist.github.com/egonw/172687.js"></script>

## My workflows

Given a user, it is also easy to get the workflows he *owns*. Again, I am using my URI instead of combining with a search
for my account, because the MyExperiment SPARQL end point is not particularly fast:

<script src="https://gist.github.com/egonw/172691.js"></script>

Earlier in this series:

1. [Bioclipse and SPARQL end points #1: DBPedia](http://chem-bla-ics.blogspot.com/2009/08/bioclipse-and-sparql-end-points.html)
