---
layout: post
title:  "Rogue Scholar keeps challenging the functionality of my blog"
date:   2026-08-23
doi: 10.59350/ezrsn-psn52
tags: cito:citesAsRecommendedReading:10.63517/kshzw-ay335 blog cito:citesAsRecommendedReading:10.53731/zyg15-qv911 cito
  cito:citesAsRecommendedReading:10.53731/1jbsg-kqm79 cito:citesAsRecommendedReading:10.53731/1xbh4-mnt50
  mycito:discusses:10.1186/1471-2105-8-487 cito:usesMethodIn:10.7717/peerj-cs.214 cito:citesAsRecommendedReading:10.7717/peerj-cs.86
  cito:citesAsRecommendedReading:10.1045/january2015-brase json
image: /assets/images/blogs_citedin.png
comments:
  host: mastodon.social
  username: egonw
  id: 117145585022498858
---

[Rogue Scholar](https://rogue-scholar.org/) continues to offer [awesome features](https://chem-bla-ics.linkedchemistry.info/2024/07/21/rogue-scholar-and-more.html).
It seems the recent move to InvenioRDM ([14.0 was just released](https://doi.org/10.63517/kshzw-ay335)) was a good one. It does require rewrites, but make
things more scalable. One thing that did exist in the InvenioRDM-based Rogue Scholar last year was [citations to blog posts](https://doi.org/10.53731/zyg15-qv911).
But even that was [redeveloped and relaunched](https://doi.org/10.53731/1jbsg-kqm79) a few days ago. It does not have yet the same amount of citations to
blog posts as before, but [more than 1200 can be found again](https://rogue-scholar.org/search?q=citations%3A%2A&l=list&p=1&s=10&sort=newest).

Platforms are getting more better at precisely capturing how we communicate science. Rogue Scholar is a great example of that, like the
no longer existing [CiteULike](https://chem-bla-ics.linkedchemistry.info/tag/citeulike) before. And Rogue Scholar has been challenging
my Markdown-based blog post to support its functionality. For example, I had to [add a JSON Feed](https://chem-bla-ics.linkedchemistry.info/2025/01/19/blog-updates.html),
but also was happy that [Rogue Scholar added CiTO Support](https://doi.org/10.53731/1xbh4-mnt50).

But capturing all citations between things remains an issue. Platforms like Google Scholar and Web of Science do their best, but their
best is not Open or nor FAIR or neither. Generally, it has taken way too long for
[DataCite](https://doi.org/10.1045/january2015-brase) and [Software Citations](https://doi.org/10.7717/peerj-cs.86) to be picked up.
However, we can [take control ourselves](https://chem-bla-ics.linkedchemistry.info/2024/12/30/fair-blog-to-blog-citations.html) when
solutions do not exist.

And because I want journal-to-blog citations are FAIR too, I hacked up another extension of my blog today. I can now add lines like this
to the metadata of blog post:

```yaml
cited-in: cito:discusses:10.1186/1471-2105-8-487
```

What is encodes is that the article with doi:[10.1186/1471-2105-8-487](https://doi.org/10.1186/1471-2105-8-487) (one of my own)
discusses [one of the posts in my blog](https://chem-bla-ics.linkedchemistry.info/2006/12/17/counting-stereoisomers-from-molecular_17.html).

Online, this is rendered with [citation.js](https://doi.org/10.7717/peerj-cs.214) like this:

![](/assets/images/blogs_citedin.png)

Here, the *References* are the things I cite in my blog post, and the *Cited in* are things citing this blog post.

### How blog posts are cited

Now, DOIs for blog posts are a new thing: they did not exist when I started blogging. And for the 12 citations I found so far,
they are not using a DOI. I doubt that these citations are easily found in CrossRef or DataCite. Here are two examples, of increasing
complexity. The first one is how many citation styles would do it:

![](/assets/images/blogs_citing1.png)

But they can also look like this:

![](/assets/images/blogs_citing2.png)

And scientific journals sometimes even use URL shorteners and then it may look like this:

![](/assets/images/blogs_citing3.png)

This makes it a challenge for any platform to pick up these citations!

### How about the JSON Feed

That leaves me with how I make this information avaiable, a bit towards FAIR, but at least machine readable.
This is done with a [JSON Feed extension](https://egonw.github.io/JSONFeed-extensions/) (at the time of writing, I did
not add this proposal yet). My `archive.json` feed now contains 12 fragments like this:

```json
"_citations": [
  {
    "url": "https://doi.org/10.1038/nchem.2187",
    "doi": "10.1038/nchem.2187",
    "cito": [
      "citesForInformation"
    ]
  }
]
```

It matches the structure of the [_references extension](https://egonw.github.io/JSONFeed-extensions/references.html).

Let's see where this goes :)
