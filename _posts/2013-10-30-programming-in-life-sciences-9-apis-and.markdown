---
layout: post
title:  "Programming in the Life Sciences #9: APIs and Web Services"
date:   2013-10-30
blogger-link: https://chem-bla-ics.blogspot.com/2013/10/programming-in-life-sciences-9-apis-and.html
tags: pra3006 doi:10.1186/1471-2105-10-279
---

Continuing on the [theory](http://chem-bla-ics.blogspot.nl/2013/10/exercise-what-variable-type-would-you.html)
[covered](http://chem-bla-ics.blogspot.nl/2013/10/programming-in-life-sciences-8-coding.html) in this course,
this part will talk about [application programming interfaces](https://en.wikipedia.org/wiki/Application_programming_interface)
(APIs) and [web services](https://en.wikipedia.org/wiki/Web_service).

## Application Programming Interfaces

APIs define how programs can be used by other programs. An API defines how methods are called and what feedback
you can expect. It basically is the combination of documentation and the program itself. But, unlike any piece
of software, an API is aimed at users, rather than use in the same program. The API is how you communicate
between programs.

Now, in this course we will see two key types of APIs. The first are the APIs provided by the libraries that we
use. For example, we already indicated that we will be using at least the following two libraries,
[ops.js and d3.js](http://chem-bla-ics.blogspot.nl/2013/10/programming-in-life-sciences-8-coding.html).
These libraries are a collection of functional bits (e.g. classes and methods). For example, ops.js
defines an API which wraps closely the [Open PHACTS Linked Data API](https://dev.openphacts.org/docs)
(LDA) itself. The API requires as to do a few things: 1. create a wrapper for the LDA; 2. define a
call back function; 3. invoke the actual

```javascript
call.var searcher = new Openphacts.ConceptWikiSearch(
  "https://beta.openphacts.org", appID, appKey
);  
var callback=function(success, status, response){  
    searcher.parseResponse(response);
};  
searcher.findCompounds('Aspirin', '20', '4', callback);
```

## Web Services

Web services are a special kind of APIs: they expose an API over the web. That imposes some features of
these APIs: first, they are based on a web transport layer, commonly
[HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol), but
[XMPP](https://en.wikipedia.org/wiki/Xmpp) is possible too. HTTP is used by your web browser too. Secondly,
the web server needs a common communication language to serialize the method call. Here, two key standards
are used, [XML](https://en.wikipedia.org/wiki/XML) and [JSON](https://en.wikipedia.org/wiki/JSON).
We will cover these in more detail later. For now, it suffices to think of these as
envelopes in which are message is sent. Now, another aspect standardized is how to call the web services.
For that, [SOAP](https://en.wikipedia.org/wiki/SOAP) and [REST](https://en.wikipedia.org/wiki/REST) are
the most important standards for the life sciences (though I still think
[Wagener's XMPP approach](http://www.biomedcentral.com/1471-2105/10/279) is still
worthwhile checking out!). SOAP and REST use XML and JSON are underlying serialization format.

So, web services are theoretically complex. For this course, most of it is hidden by the client library that will take care of the HTTP and SOAP/REST layers. The students who wish to use Java instead of JavaScript, will face the problem that you first need to find a Java client library for the LDA. There is this library, but that needs exploring for use with the latest Open PHACTS LDA. Higher stakes, higher rewards.

## Take home message

Practically, you do not need to know much of the technologies behind web services, just like you do not need to know machine instructions CPUs follow to run your program. But, it is important to have seen these terms. You will run into them, and need enough context to know where and how to find answers to the questions that you will have.

There is one exception: JavaScript Object Notation, JSON. That is the format in which the data is returned by the service, and you will have to handle that. JSON will be the topic of the next post.
