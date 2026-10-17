---
layout: post
title:  "CDK-Taverna paper published"
date:   2010-03-29
blogger-link: https://chem-bla-ics.blogspot.com/2010/03/cdk-taverna-paper-published.html
doi: 10.59350/n11jv-09b62
tags: cdk taverna doi:10.1186/1471-2105-11-159
modified_date: 2026-10-17
---

It took a while, but the [CDK-Taverna paper](http://www.cdk-taverna.de/) (doi:[10.1186/1471-2105-11-159](https://doi.org/10.1186/1471-2105-11-159))
which has been in preparation for a while [in the CDK subversion repository](http://cdk.svn.sf.net/viewvc/cdk/cdk-taverna-paper/trunk/cdk-taverna/),
is now published. Christoph already wrote up [a brief explanation in his blog](http://www.steinbeck-molecular.de/steinblog/index.php/2010/03/29/cdk-taverna-paper-published/):

> The workflow paradigm allows scientists to flexibly create generic workflows using different kinds of data sources, filters and algorithms,
> which can later be adapted to changing needs. In order to achieve this, library methods are encapsulated in Lego(TM)-like building blocks
> which can be manipulated with a mouse or any pointing device in a graphical environment, relieving the scientist from the need to learn a
> programming language. Building blocks, so-called workers, are connected by data pipelines to enable data flow between them, which is why
> pipelining is often used interchangeably for workflow.

[Taverna](http://taverna.sf.net/) is not the only open source workflow environment, but certainly gotten a lot of visibility in the eScience
communities in at least The Netherlands and the UK. There exists other workflow environments too with CDK nodes, including
[KNIME](http://knime.org/) which is [since version 2.1.0](http://knime.org/blog/knime-210-released) licensed GPL3.

[Thomas](http://cdktaverna.wordpress.com/) uploaded some [17 example workflows](http://www.myexperiment.org/search?query=cdk-taverna&type=workflows) to
[MyExperiment.org](http://myexperiment.org/), to give you further idea what the system can do. Development has gone down considerably, since Thomas
finished his thesis, and if you like to work on the CDK-Taverna project, and be [the next Dr Who <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/06/21/dr-whos-of-life-sciences.html),
please contact me, [Achim](http://www.fan.re.fh-gelsenkirchen.de/team/menschen/zielesny/zielesny.aspx) or Christoph. I started experimenting
with CDK nodes for Taverna in 2005 (see [CDK-Taverna fully recognized <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2005/10/18/cdk-taverna-fully-recognized.html)),
and would love to see it live on. Andreas and I made an attempt last December to port things to Taverna 2.1, and the code we worked on can be
found in [this GitHub repository](http://github.com/egonw/cdk-taverna).
