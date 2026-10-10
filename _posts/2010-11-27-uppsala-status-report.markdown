---
layout: post
title:  "Uppsala Status Report"
date:   2010-11-27
blogger-link: https://chem-bla-ics.blogspot.com/2010/11/uppsala-status-report.html
doi: 10.59350/5drdq-rjz45
tags: bioclipse bioinfo cdk cheminf chemistry chemometrics postdoc uppsala
  doi:10.2174/138161206777585274 doi:10.1186/1471-2105-8-59 doi:10.1021/CI025584Y
  doi:10.3390/50100093 justdoi:10.1093/bioinformatics/btn397 justdoi:10.1093/bioinformatics/bth361
  doi:10.1080/10408340600969601 justdoi:10.1186/1471-2105-11-362 doi:10.1186/1471-2105-11-159
  doi:10.1093/BIOINFORMATICS/BTQ476
---

As you know, my post-doc in [Uppsala](http://www.farmbio.uu.se/) ended. It was
a good time, and it was great collaborating on Bioclipse with Ola, Jonathan,
Arvid, and Carl. I would have loved tighter integration with the work of Maris
and Martin, but that was limited to one joined paper (in press). I thank Professors
Jarl Wikberg and Eva Brittebo for allowing me to continue my research at their
department, and hope this is not the end of the collaboration yet.

Like with new year, the end of a contract is a good time to reflect on ones
accomplishments. It's been a bit delayed, but as you know, I already in my next
[project in Cambridge](http://chem-bla-ics.blogspot.com/2010/10/working-on-oscar-for-three-months.html),
and will start in January with yet a longer term position in predictive toxicology
(more on that soon). This makes this a really crowded period, on top of birthdays,
[Sinterklaas](http://sv.wikipedia.org/wiki/Sinterklaas), x-mas, and sorts.

**My Research**  
As you might know, my research interest lies in understanding molecular properties
and their applications in larger molecular systems. This can be how small molecules
pack in crystals, finding patterns in properties (QSAR-like work), etc. Because
the underlying methods are useful in many domains, you see applications in various
too, including drug discovery, metabolomics, etc. These methods involve statistics
and cheminformatics, primarily, which is clear from my publications on method
development in chemometrics and cheminformatics. You will also have seen that
visualization is a very important tool here, as our numerical validation can
easily mislead even a trained scientist.

**How Uppsala fits in**  
About 30 months ago, I got an offer to join the [Bioclipse](http://www.bioclipse.net/)
team to work on the cheminformatics features of the workbench. It was already
using the [CDK](http://cdk.sf.net/), so the project was a tight match with what
I did in the past. Additionally, there were plans to integrate [R](http://www.r-project.org/),
and while the latter is partially implemented, that part was unfortunately not
completed by the group yet. I believe this is a crucial aspect, and without
it the large-scale impact of Bioclipse will be severely reduced.

Bioclipse is positioned as a workbench to use third-party libraries, web services,
databases, etc, and has done so very successfully (doi:[10.1186/1471-2105-8-59](https://doi.org/10.1186/1471-2105-8-59)).
It speaks many Open Standards, and already incorporates various important Open
Source libraries for life sciences research, including the aforementioned CDK
(doi:[10.2174/138161206777585274](https://doi.org/10.2174/138161206777585274),
doi:[10.1021/ci025584y](https://doi.org/10.1021/ci025584y)), but also [Jmol](http://www.jmol.org/),
[JChemPaint](http://www.mdpi.org/molecules/html/50100093.htm), BioJava (doi:[10.1093/bioinformatics/btn397](https://doi.org/10.1093/bioinformatics/btn397)),
and others. Using these libraries it has rich visualization means for life sciences
data, including molecules and protein sequences. The latter, of course, is directly
related to the proteochemometrics research done in [Wikberg's group](http://www.proteochemometrics.org/index.php?option=com_content&task=view&id=23&Itemid=14).
Recently, Bioclipse adopted scripting functionality, making it a perfect tool
to share life sciences computation, just like Taverna (doi:[10.1093/bioinformatics/bth361](https://doi.org/10.1093/bioinformatics/bth361))
and KNIME.

Where I hoped to do some research in proteochemometrics, events lead me into
different areas, which I explained in [Why you have not heard me much about
chemometrics recently...](http://chem-bla-ics.blogspot.com/2010/11/why-you-have-not-heard-me-much-about.html).

But, Bioclipse provides me with the tools I need to take molecular chemometrics
(doi:[10.1080/10408340600969601](https://doi.org/10.1080/10408340600969601))
forward.

**Results**  
So, what has this resulted in, besides a number of [unsuccessful](http://chem-bla-ics.blogspot.com/2010/11/more-fails-aka-no-vr-grant-awarded.html)
grant applications? We're still counting, but two book chapters, a book on [pharmaceutical
bioinformatics](http://www.pharmbio.org/), one proceedings paper, five research
papers, seven oral presentations at international meetings, and a ACS conference
on [RDF in chemistry](http://egonw.github.com/acsrdf2010/). Oh, and tons of
Open Source code, of course. (I'm at the edge of collapsing; I did that as student,
lost a year, but learned a lot about myself ... these results I have worked
very hard for; I am not a [miracle worker](http://en.wikipedia.org/wiki/Montgomery_Scott).
And I have to disappoint people occasionally, as things do not work out how
I expected them to be. My apologies for that.)

I will not describe all in detail now, but focus on a few things around what
I made my research in Uppsala: semantic cheminformatics, which I believe to
be a key concept of where cheminformatics must be going. The first paper resulted
from a collaboration with Johannes, a medical researcher at the [Ludwig-Maximilians-Universität](http://en.wikipedia.org/wiki/Ludwig_Maximilian_University_of_Munich)
in Germany (full reference at the end of the post). This work provides an alternative
to SOAP, which has a better solution to asynchronous computing that the polling
approaches now commonly used. A XMPP-based service just reports back when it
is done, so that you do not have to ask all the time. Makes sense to me. We
made the platform available to Bioclipse and Taverna, and demonstrated the technology
with applications in life sciences, including (QSAR) descriptor calculation,
and susceptibility for seven known HIV protease inhibitors.

This work stresses that if we really want to, we can significantly improve scientific
computing. It's very much like what Peter [concluded this week](http://wwmm.ch.cam.ac.uk/blogs/murrayrust/?p=2772):
"None of this is rocket science - it’s purely a question of will". This is what
I have being trying to show in the past few years. The disuse of accurate scientific
computing is a deliberate choice. Making your cheminformatics research irreproducible
is a choice, and a bad one too. There can be acceptable reasons, but the choice
would be bad nevertheless (I hope that distinction is clear: you can have valid
reasons to do something intrinsically wrong. You will be forgiven, and be encouraged
to change your behavior.) Many people on the Blue Obelisk community are laying
out the foundations and show cases, hoping to make it easier for others to change
behavior. I think we have been quite successful there.

Anyways... on to the second paper. As said, Bioclipse is the platform that can
bring these new cheminformatics methods to the desktop. The new and improved
Bioclipse 2 (see citation below) adds one important new feature: scripting.
My work in this paper focuses on doing making sure the cheminformatics library
was properly integrated, continued development of JChemPaint (yet unpublished,
and in collaboration with the [EBI](http://www.ebi.ac.uk/steinbeck/), but see
for example [this blog post](http://chem-bla-ics.blogspot.com/2008/06/httpchem-bla-icsblogspotcom200805develo.html)),
and helping Ola and other to properly use the CDK in their applications (MetaPrint2D
(doi:[10.1186/1471-2105-11-362](https://doi.org/10.1186/1471-2105-11-362)),
etc.). The impact of this work goes far beyond the papers on which I am author,
though not every reviewer will understand that, unfortunately. This work is
really the plumbing, it's the development of the measuring machines to do the
job, the development of a STM device to actually get going.

The third paper, also listed at the end, is about defining a standard for detailed
exchange of QSAR data. It defines what information is needed to reproduce a
set of QSAR descriptors, including the input, and using a descriptor ontology
which we published about before (doi:[10.1021/ci050400b](https://doi.org/10.1021/ci050400b)).
This project can be the seed of a public repository of QSAR data, where it will
be clear what is meant, and how the data can be used. If you are interested
in setting up such a public repository, please contact me or Ola.

That leaves me to the work that I have initiated in the group: the use of [RDF
technologies](http://en.wikipedia.org/wiki/Resource_Description_Framework) (I
do hope all VR reviewers are listening). RDF provide a [lingua franca](http://en.wikipedia.org/wiki/Lingua_franca)
for data exchange in life sciences, and the meaning of words is provided by
sharing dictionaries (ontologies). Bioclipse has been extended to speak RDF,
and we developed various applications based on it. A [proceedings](http://www.citeulike.org/user/egonw/article/6582022)
previews the effort, while the paper is in print in the new Open Access [Journal
of Biomedical Semantics](http://www.jbiomedsem.com/). Of course, you can also
read much about this topic in this blog.

RDF is going to change bio- and cheminformatics in ways the XML has been unable
to do. Various papers are currently in preparation to provide detailed uses
case and related research. I am very excited about this technology which further
improved interoperability and reproducibility in cheminformatics. Should you
care about that? Yes, because by using these good practices, research will be
easier to interpret, conclusions judges, and as such, we can focus on the underlying
chemistry in much more details, instead of looking at noise which many current
cheminformatics literature is doing. (Ouch, that's a bold statement indeed.
True? Well, without reproducibility it is hard to tell. Let's all work towards
less magic, less black box, and more science in this field; we will all benefit
from that. Who knows, we might even convince the bench chemist that we are doing
something right ;)

So, where is the understanding of underlying patterns, you may wonder? That
is a fair question, but I have no grudge in admitting that after my PhD that
part has been underrepresented. That will change soon enough, though. Now I
can only hope it is on time go get me a Nature or Science paper, required to
get tenure (see [this discussion](http://friendfeed.com/mrgunn/1ea91bb9/payoffs-of-wasting-time)).

That's not all I did. I have not discussed the book chapters, the book, the
other publications to which I contributed in various ways (doi:[10.1186/1471-2105-11-159](https://doi.org/10.1186/1471-2105-11-159),
doi:[10.1093/bioinformatics/btq476](https://doi.org/10.1093/bioinformatics/btq476)).
That will come in a more detailed report later.

Finally, I link to thanx [Uppsala University](http://www.uu.se) for the [KoF
07 grant](http://usxs.fysik.uu.se/~kof) which funded my work in Uppsala.
