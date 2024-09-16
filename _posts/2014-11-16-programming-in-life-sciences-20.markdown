---
layout: post
title:  "Programming in the Life Sciences #20: extracting data from JSON"
date:   2014-11-16
blogger-link: https://chem-bla-ics.blogspot.com/2014/11/programming-in-life-sciences-20.html
tags: pra3006 inchikey:MUMGGOZAMZWBJJ-DYKIIFRCSA-N
image: /assets/images/debug3.png
---

I previously wrote about the [JavaScript Object Notation](http://chem-bla-ics.blogspot.nl/2013/10/programming-in-life-sciences-10.html)
(JSON) which has become a de facto standard for sharing data by web services. I personally
still prefer something using the [Resource Description Framework](https://en.wikipedia.org/wiki/Resource_Description_Framework)
(RDF) because of its clear link to ontologies, but perhaps
[JSON-LD](https://en.wikipedia.org/wiki/JSON-LD) combines the best of both worlds.

The [Open PHACTS API](https://dev.openphacts.org/) support various formats and this
JSON is the default format used by the [ops.js](https://github.com/openphacts/ops.js)
library. However, the amount of information returned by the Open PHACTS cache is complex,
and generally includes more than you want to use in the next step. Therefore, it is
needed to extract data from the JSON document, which was not covered in the
[post #10](http://chem-bla-ics.blogspot.nl/2013/10/programming-in-life-sciences-10.html)
[or #11](http://chem-bla-ics.blogspot.nl/2013/10/programming-in-life-sciences-11-html.html).

Let's start with the example JSON given in that post, and let's consider this is the
value of a variable with the name jsonData:

```json
{
    "id": 1,
    "name": "Foo",
    "price": 123,
    "tags": [ "Bar", "Eek" ],
    "stock": {
        "warehouse": 300,
        "retail": 20
    }
}
```

We can see that this JSON value starts with a map-like structure. We can also see that
there is a list embedded, and another map. I guess that one of the reasons why JSON
has taken such a flight is how well it integrates with the JavaScript language: selecting
content can be done in terms of core language features, different from, for example,
[XPath](https://en.wikipedia.org/wiki/XPath) statements needed for
[XML](https://en.wikipedia.org/wiki/XML) or [SPARQL](https://en.wikipedia.org/wiki/SPARQL)
for RDF content. This is because the notation just follows core data types of JavaScript
and data is stored as native data types and objects.

For example, to get the price value from the above JSON code, we use:

```javascript
var price = jsonData.price;
```

Or, if we want to get the first value in the Bar-Eek list, we use:

```javascript
var tag = jsonData.tags[0];
```

Or, if we want to inspect the warehouse stock:

```javascript
var inStock = jsonData.stock.warehouse;
```

Now, the JSON returned by the Open PHACTS API has a lot more information. This is why the
online, interactive documentation is so helpful: it shows the JSON. In fact, given that
JSON is so much used, there are many tools online that help you, such as
[jsoneditoronline.org](http://jsoneditoronline.org/) (yes, it will show error messages
if the syntax is wrong):

![](/assets/images/debug3.png)

BTW, I also recommend installing a JSON viewer extension for
[Chrome](https://chrome.google.com/webstore/detail/jsonview/chklaanhfefbnpoihckbnefhakgolnmc?hl=en#sthash.vsIhyalK.dpuf)
or for [Firefox](https://addons.mozilla.org/en-US/firefox/addon/jsonview/). Once you
have installed this plugin, you can not just read the JSON on Open PHACTS'
interactive documentation page, but also open the Request URL into a separate browser
window. Just copy/paste the URL from this output:

![](/assets/images/json.png)

And with a JSON viewing extension, opening this *https://beta.openphacts.org/1.3/pathways/...*
URL in your browser window will look something like:

![](/assets/images/json1.png)

And because these extensions typically use syntax highlighting, it is easier to understand
how to access information from within your JavaScript code. For example, if we want the
number of pathways in which the compound [testosterone](http://www.conceptwiki.org/concept/index/7e0a4dd4-8160-4906-9db1-fdb300e888ea)
(the link is the [ConceptWiki](http://scholar.google.com/scholar?hl=nl&q=ConceptWiki)
URL in the above example) is found, we can use this code:

```javascript
var pathwayCount = jsonData.result.primaryTopic.pathway_count;
```
