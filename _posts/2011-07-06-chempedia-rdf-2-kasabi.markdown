---
layout: post
title:  "ChemPedia-RDF #2: Kasabi"
date:   2011-07-06
blogger-link: https://chem-bla-ics.blogspot.com/2011/07/chempedia-rdf-2-kasabi.html
tags: semweb kasabi chemistry
image: /assets/images/kasabi.png
doi: 10.59350/f95v6-r1630
---

<img style="float: right;" src="/assets/images/kasabi.png" width="200" />
[Kasabi](http://beta.kasabi.com/) is a new, RDF hosting service by [Talis](http://www.talis.com/). It's still in beta, and I have been testing
their beta service with the [RDF version](http://chem-bla-ics.blogspot.com/2009/11/chempedia-rdf-1-sparql-end-point.html) I created of
[ChemPedia Substances](http://metamolecular.com/chempedia/) (the now no longer existing cool web service from
[MetaMolecular](http://metamolecular.com/) to draw and name organic molecules).

Kasabi makes the RDF data available via a few APIs, depending on the APIs selected by the uploader. I picked all five of them, just to see how
things work. Of direct interest are the SPARQL end point, but also the option to host the data as dereferencable resources. Cool! That was just
what was missing for me.

Now, using the API requires you to get an account. This will allow Kasabi to control the traffic, and as such creates a business model around
providing services around Open Data. I think this approach will work. But just to make clear, this does mean you need to get an account first,
if you like to play with this data. Once you got an account, you get an API key, and you can append that to any URI with `?apikey=XXXX` to
authenticate yourself. I think this does mean Kasabi will have to go to a https connection, which is not yet the case. Moreover, you will need
to subscribe to the data set too. That, in fact, with #altmetrics in mind, sounds really interesting :)

The ChemPedia RDF data is available at: [http://beta.kasabi.com/dataset/chempedia-rdf](http://beta.kasabi.com/dataset/chempedia-rdf)

This web page will give the five APIs, of which the augmentation one is really interesting, but I have not played with that yet to say much
about it. The idea of that API is to augment RDF you post with data from the data set. Like in a [augmented reality](http://en.wikipedia.org/wiki/Augmented_reality).
That should be cool for mashups.

Now, the APIs I do understand include this SPARQL end point (remember to add your API key!):

[http://labs.kasabi.com/explorer/sparql/sparql-endpoint-chempedia-rdf](http://labs.kasabi.com/explorer/sparql/sparql-endpoint-chempedia-rdf)

And the Linked Data feature. In the [next post](http://chem-bla-ics.blogspot.com/2011/07/chempedia-rdf-3-uploading-data-to.html), I will
explain how I tweaked the original data, how I uploaded it, and how this resulted in the dereferencable resources, like:

[http://data.kasabi.com/dataset/chempedia-rdf/substances/2-2595-7562-8125.html](http://data.kasabi.com/dataset/chempedia-rdf/substances/2-2595-7562-8125.html)

Note the links for RDF/XML, RDF/JSON, and Turtle, directly accessible by replacing the .html extension with .rdf, .json, and .ttl respectively.
An API key does not seem required for this, which makes perfect sense.

It took me some chatting with the people from Talis, who have been very helpful, as the whole platform was a bit overwhelming. But, for the first
time ever, I actually got Linked Open Data online, in a Linked Data manner.
