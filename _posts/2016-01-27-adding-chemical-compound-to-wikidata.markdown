---
layout: post
title:  "Adding chemical compounds to Wikidata"
date:   2016-01-27
blogger-link: https://chem-bla-ics.blogspot.com/2016/01/adding-chemical-compound-to-wikidata.html
tags: wikidata chemistry bioclipse justdoi:10.1128/AAC.01148-08
---

Adding chemical compounds to [Wikidata](https://www.wikidata.org/) is not difficult. You can store the chemical formula
([P274](https://www.wikidata.org/wiki/Property:P274)), (canonical) [SMILES](http://chem-bla-ics.blogspot.nl/2015/12/the-quality-of-smiles-strings-in.html)
([P233](https://www.wikidata.org/wiki/Property:P233)), InChIKey ([P235](https://www.wikidata.org/wiki/Property:P235)) (and InChI
([P234](https://www.wikidata.org/wiki/Property:P233)), of course), as well various database identifiers (see what I wrote about that
[here(http://chem-bla-ics.blogspot.nl/2015/12/new-edition-getting-cas-registry.html)]). It also allows storing of the provenance, and has predicates
for that too.

So, to enter a new structure for a compound, you should enter the compound information to Wikidata. Of course, make sure to create the needed accounts,
particularly one for Wikidata ([create account](https://www.wikidata.org/w/index.php?title=Special:UserLogin&returnto=Wikidata%3AMain+Page&type=signup))
(not sure if the next steps needs a more general Wikimedia account too).

**Entering the research paper**: <br />
[Magnus Manske](https://twitter.com/MagnusManske) [pointed](https://twitter.com/MagnusManske/status/691664308523130880) me to
[this helper tool](http://tools.wmflabs.org/sourcemd/). If you have the DOI of the paper, it is easy to add a new paper. This is what the tool shows
for doi:[10.1128/AAC.01148-08](http://dx.doi.org/10.1128/AAC.01148-08) (but no longer when you try!):

![](/assets/images/smd.png)

You need permission to run this script and the tool will alert you about that, and give the instructions how to get permission. After
I clicked the Open in QuickStatements I get this output, showing me an entry in Wikidata was created for this paper:

![](/assets/images/smd1.png)

Later, I can use the new Q-code ([Q22309806](https://www.wikidata.org/wiki/Q22309806)) to use as source for statements about the compound (formula, etc).

**Draw your compound and get an InChIKey**: <br />
The next step is to draw a compound and get an InChIKey. This can be done with many tools, including
[Bioclipse](http://bioclipse.net/). Rajarshi opted for alternatives:

<ul>
<a href="https://twitter.com/collabchem">@collabchem</a> <a href="https://twitter.com/egonwillighagen">@egonwillighagen</a> OSRA or <a href="https://t.co/ZIQdgrYsmr">https://t.co/ZIQdgrYsmr</a>? <br />
— Rajarshi Guha (@rguha) <a href="https://twitter.com/rguha/status/692377715735949313">January 27, 2016</a>
</ul>

Then check if the compound is not already in Wikidata. You can use this SPARQL query for that using the InChIKey of the compound (it's for acetic acid, so it will be found):

![](/assets/images/smd3.png)

For convenience, here the copy/pastable SPARQL:

```sparql
PREFIX wdt:
SELECT ?compound WHERE {
  ?compound wdt:P235 "QTBSBXVTEAMEQO-UHFFFAOYSA-N" .
}
```

**Entering the compound**: <br />
So, the compound is not already in Wikidata, so time to add it. The minimal information you should provide is the following:

* mark the new entry as 'instance of' (P) 'chemical compound (Q)
* the chemical formula and SMILES (use as reference the paper)
  * add the reference to the paper you entered above
* add the InChIKey and/or InChI

The first step is to create a new Wikidat entry. The Create new item menu in the left side panel can be used, showing a page like this:

![](/assets/images/smd2.png)

As a label you can use the name used in the paper for the compound, even if a code, and as description 'chemical compound' will do for now; it can be changed later.

Feel free to add as much information about the compound as you can find. There are some chemically rich entries in Wikidata, such as that for acetic acid
([Q47512](https://www.wikidata.org/wiki/Q47512)).
