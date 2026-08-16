---
layout: post
title:  "XHTML+RDFa Template"
date:   2010-08-09
blogger-link: https://chem-bla-ics.blogspot.com/2010/08/xhtmlrdfa-template.html
doi: 10.59350/1w7m9-br231
tags: html rdf rdfa
---

There was some [more](http://jessykate.posterous.com/activity-streams-for-open-science) [discussion](http://jessykate.posterous.com/open-science-microformats-initial-thoughts)
on machine readability of notebooks again, something I have [blogged](http://chem-bla-ics.blogspot.com/search?q=RDFa&max-results=20)
[about](http://chem-bla-ics.blogspot.com/search?q=microformats&max-results=20) for a long time now.

One technical approach to implement the idea of adding semantic to text in HTML pages is [RDFa](http://www.w3.org/TR/xhtml-rdfa-primer/).
But with any technology, scientists seems to have an in-built deficiency of thinking clearly, and anything beyond being able to format
your bibliography with the correct **bold** and *italic* seems to be a bit much asked.

Anyway, for future reference, this is a basic HTML framework for embedding RDFa:

```html
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML+RDFa 1.0//EN"
    "http://www.w3.org/MarkUp/DTD/xhtml-rdfa-1.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
    version="XHTML+RDFa 1.0" xml:lang="en">
  <head>
    <title>ACS RDF Symposium, Boston, August 2010</title>
  </head>
  <body>
  </body>
</html>
```

Perhaps you prefer the [raw source](http://github.com/egonw/cheminformatics.classics/raw/master/xhtml+rdfa.template.html).
