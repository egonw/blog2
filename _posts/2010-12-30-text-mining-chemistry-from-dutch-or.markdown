---
layout: post
title:  "Text mining chemistry from Dutch or Swedish texts"
date:   2010-12-30
modified_date: 2026-10-17
doi: 10.59350/k1tea-hnb50
blogger-link: https://chem-bla-ics.blogspot.com/2010/12/text-mining-chemistry-from-dutch-or.html
tags: oscar textmining justdoi:10.59350/vtadn-tdt17 justdoi:10.59350/nbtxd-kdz73
  justdoi:10.59350/bbrwt-e5n35
image: /assets/images/c2w.png
---

[Oscar](http://oscar3-chem.sf.net/) is a text miner. It mines in text for chemistry.
[Oscar4](https://bitbucket.org/wwmm/oscar4/) is the next iteration of Oscar
code that I worked on in the past three months, with Lezan, Sam, and David. I blogged about
aspects of Oscar4 at several occasions:

* [Working on Oscar for three months <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/10/15/working-on-oscar-for-three-months.html)
* [Oscar text mining in Taverna <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/10/21/oscar-text-mining-in-taverna.html)
* [Multiple unit test inheritance with JExample <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/10/26/multiple-unit-test-inheritance-with.html)
* [Oscar4 Java API: chemical name dictionaries <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/10/28/oscar4-java-api-chemical-name.html)
* [Oscar4 command line utilities <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/11/18/oscar4-command-line-utilities.html)
* [Installing Oscar <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/11/22/installing-oscar.html)
* [Adding a new dictionary to Oscar <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/11/29/adding-new-dictionary-to-oscar.html)
* [Status update on BJOC analysis with Oscar and ChemicalTagger <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/12/11/status-update-on-bjoc-analysis-with.html)
* [Status update on BJOC analysis with Oscar and ChemicalTagger #2 <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/12/11/status-update-on-bjoc-analysis-with_11.html)
* [Supramolecular chemistry <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/12/11/supramolecular-chemistry.html)
* [Status update on BJOC analysis with Oscar and ChemicalTagger #3 <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/12/23/status-update-on-bjoc-analysis-with_23.html)
* [Oscar: training data, models, etc <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/12/26/oscar-training-data-models-etc.html)

These posts will server is a some initial critical mass for a draft report I plan to finish
today. I might have to blog some further posts with diagrams, here and there. This post is
actually one of them, and discusses something where Oscar can be expected to go next, now
that the design is cleaned up (though this effort is not halted now) and it has become
possible again to extend it. The over [250 unit tests](https://hudson.ch.cam.ac.uk/job/oscar4/lastBuild/testReport/)
make this a lot easier too.

One aspect where I expect Oscar to go in 2011 is the support for other languages. To a very
large extend this is based on multi-language support in the dictionaries, as well as having
training data in a particular language. This also provides some context to my earlier post
about the [need for a Oscar training data repository <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/12/26/oscar-training-data-models-etc.html).

This extension opens a number of options: analysis of patent literature in other languages,
monitoring of press releases in other languages, and news items in local news papers, etc.
For example, it could analyse [this C2W news item](http://www.c2w.nl/energierijke-gistcel.119621.lynkx)
on [yeast](http://en.wikipedia.org/wiki/Yeast) cells:

![](/assets/images/c2w.png)

There are many use cases for such localized text mining. And it surely matters for determining
the impact of research.

Oscar has various places where language specifics are found. For example, in tokenization of a
text. One step here is the detection of sentence ends. This is done in most western languages
with a period, exclamation mark, question mark, etc. But periods (dots) are also used in
abbreviations. Similarly, colons can be used in chemical names. But the every language comes in
with different abbreviations that need to be recognized.

Currently, some abbreviations are found in [NonSentenceEndings](https://bitbucket.org/wwmm/oscar4/src/005ffa00a69d/oscar4-core/src/main/java/uk/ac/cam/ch/wwmm/oscar/document/NonSentenceEndings.java).
In the past three months, we have been cleaning up the code, and restructured the source code,
making it easier to detect such places. This class will likely undergo further refactoring, to
making the list of such non-sentence-endings configurable via files or so. What I expect to see,
is that we you initiate Oscar like this:

```java
Oscar oscar = new Oscar(Locale.US);
```

This might actually even make a nice student summer project. The biggest challenge will be in making a good
corpus of training data, like the SciBorg training data that was used for training Oscar3.

But the whole normalization is tainted with English language specifics too. For example, the normalizer
will have to 'normalize' the question marks, for which there exist several
[unicode variations](http://en.wikipedia.org/wiki/Question_mark#Stylistic_variants).
But the normalized variant is language dependent. For example, greek and armenian have different characters
(see [this page](http://en.wikipedia.org/wiki/Question_mark#Opening_and_closing_question_marks)),
and then we have not even started talking about the right to left.

Besides localized dictionaries, this Oscar will also benefit from a localized [OPSIN](http://opsin.ch.cam.ac.uk/).
It seem to recognize the Dutch [propaan](https://opsin.ch.cam.ac.uk/opsin/propaan.png), but not
[benzeen](https://opsin.ch.cam.ac.uk/opsin/benzeen.png). I am not going to look at that soon, but if you are
interested, I recommend checking out Rich'
[posts <i class="fa-solid fa-recycle fa-xs"></i>](https://doi.org/10.59350/bbrwt-e5n35)
[about <i class="fa-solid fa-recycle fa-xs"></i>](https://doi.org/10.59350/vtadn-tdt17)
[forking <i class="fa-solid fa-recycle fa-xs"></i>](https://doi.org/10.59350/nbtxd-kdz73)
OPSIN and writing patches.

Getting Oscar going for other languages is a challenge, but also offers new opportunities. Just email the
[oscar mailing list](http://sourceforge.net/mailarchive/forum.php?forum_name=oscar3-chem-developers)
if you are interested and need help.
