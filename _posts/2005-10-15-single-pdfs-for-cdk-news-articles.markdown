---
layout: post
title:  "Single PDFs for CDK News articles"
date:   2005-10-15
modified_date: 2023-07-27
blogger-link: https://chem-bla-ics.blogspot.com/2005/10/single-pdfs-for-cdk-news-articles.html
tags: cdk
doi: 10.59350/rgdzb-bfe36
---

This week was the [CDK5AW <i class="fa-solid fa-box-archive fa-xs"></i>](https://web.archive.org/web/20080208101002/http://almost.cubic.uni-koeln.de/cdk/cdk_top/events/cdk5yearworkshop/) event, a workshop for users and
developers of the [Chemistry Development Kit](http://cdk.sf.net/) (CDK). After talking with other developers we agreed on
creating PDF and HTML versions of single articles that appeared in the
[CDK News <i class="fa-solid fa-recycle fa-xs"></i>](https://sourceforge.net/projects/cdk/files/CDK%20News/) newsletter. Well, I haven't figured out how to create nice HTML
(the latex2html does not give nice results, anyone ideas?), but for the PDF version I now have a pipeline.

For each article, a split.config file determines which pages from the CDK News issue PDF should be extracted. To do this, I used the
[PDF ToolKit](http://www.accesspdf.com/pdftk/), or pdftk for short (comes with Debian/Unbuntu by default). And using a Perl script to read this config files,
the pipeline creates PDF files for each article. Currently, I'll only have it do the features articles; that is, not the
ChangeLog, Editorial, Literature and FAQ. For those you'll need to download the full issue. If you don't like that, let me know :)

Ok, you will probably have noticed that the almost server is down
([Googling for 'CDK News'](http://www.google.com/search?q=CDK+News) allows you read the cache!), and
I the PDF's will be uploaded there asap. For those not familiar with CDK News, the articles are FDL, so feel free to
copy and distribute them. If you reuse the text and update it, which is allowed too, please let us know.
