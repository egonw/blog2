---
layout: post
title:  "Programming in the Life Sciences #1: a six day course"
date:   2013-10-05
blogger-link: https://chem-bla-ics.blogspot.com/2013/10/programming-in-life-sciences-1-six-day.html
tags: pra3006 javascript openphacts
---

Our [department](http://www.bigcat.unimaas.nl/) will soon start the course Programming in the Life Sciences for a group of some
10 students from the [Maastricht Science Programme](http://www.maastrichtuniversity.nl/web/Schools/MaastrichtScienceProgramme.htm).
This is the first time we give this course, and over the next weeks I will be blogging about this course. First, some information.
These are the goals, to use programming to:

* have the ability to recognize various classes of chemical entities in pharmacology and to understand the basic physical and chemical interactions.
* be familiar with technologies for web services in the life sciences.
* obtain experience in using such web services with a programming language.
* be able to select web services for a particular pharmacological question.
* have sufficient background for further, more advanced, bioinformatics data analyses.

So, this course will be a mix of things. I will likely start with a lecture or too about scientific programming, such as the
importance of reproducibility, licensing, documentation, and (unit) testing. To achieve these learning goals we have set a
problem. The description is:

<ul><i>
In the life sciences the interactions between chemical entities is of key interest. Not only do these play an important role
in the regulation of gene expression, and therefore all cellular processes, they are also one of the primary approaches in
drug discovery. Pharmacology is the science studies the action of drugs, and for many common drugs, this is studying the
interaction of small organic molecules and protein targets.

And with the increasing information in the life sciences, automation becomes increasingly important. Big data and small data
alike, provide challenges to integrate data from different experiments. The Open PHACTS platform provides web services to
support pharmacological research and in this course you will learn how to use such web services from programming languages,
allowing you to link data from such knowledge bases to other platforms, such as those for data analysis.
</i></ul>

So, it becomes pretty clear what the students will be doing. They only have six days, so it won't be much. It's just to learn
them the basic skills. The students are in their 3rd year at the university, and because of the nature of the programme they
follow, a mixed background in biology, mathematics, chemistry, and physics. So, I have a good hope they will surprise me in
what they will get done.

Pharmacology is the basic topic: drug-protein interaction, but the students are free to select a research question. In fact,
I will not care that much what they like to study, as long as they do it properly. They will start with
[Open PHACTS' Linked Data API](https://dev.openphacts.org/docs), but here too, they are free to complement data from the
OPS cache with additional information. I hope they do.

Now, regarding the technology they will use. The default will be JavaScript, and in the next week I will hack up demo code
showing the integration of [ops.js](https://github.com/openphacts/ops.js) and [d3.js](http://d3js.org/).
Let's see how hard it will be; it's new to me too. But, if the students
already are familiar with another programming language and prefer to use that, I won't stop them.

(For the Dutch readers, would #mscpils be a good tag?)
