---
layout: post
title:  "Open Data: the Panton Principles"
date:   2010-02-19
blogger-link: https://chem-bla-ics.blogspot.com/2010/02/open-data-panton-principles.html
tags: opendata
image: /assets/images/panton_is_it_open_data.png
---

The [announcement](http://blog.okfn.org/2010/02/19/launch-of-the-panton-principles-for-open-data-in-science/) of the
[Panton Principles](http://pantonprinciples.org/) [is](http://opendotdotdot.blogspot.com/2010/02/open-data-question-of-panton-principles.html)
[the](http://scienceblogs.com/commonknowledge/2010/02/reaching_agreement_on_the_publ.php)
[big](http://usefulchem.blogspot.com/2010/02/support-open-data-by-endorsing-panton.html)
[news](http://www.sennoma.net/main/archives/2010/02/panton_principles_for_open_dat.php)
[today](http://www.nextgenerationscience.com/open-access/the-panton-principles-for-open-data-in-science/),
though Peter already spoke about them
[in May last year](http://wwmm.ch.cam.ac.uk/blogs/murrayrust/?p=1939) (see coverage on
[FriendFeed](http://friendfeed.com/search?q=panton+principles) and
[Twitter](http://search.twitter.com/search?q=panton+principles)). The four principles list in their short versions:

* When publishing data make an explicit and robust statement of your wishes.
* Use a recognized waiver or license that is appropriate for data.
* If you want your data to be effectively used and added to by others it should be open as defined by the Open Knowledge/Data Definition – in particular non-commercial and other restrictive clauses should not be used.
* Explicit dedication of data underlying published science into the public domain via PDDL or CCZero is strongly recommended and ensures compliance with both the Science Commons Protocol for Implementing Open Access Data and the Open Knowledge/Data Definition.

I think these are very workable next steps in Open Date, perhaps even worthy end goals.
[I endorse them](http://pantonprinciples.org/endorse/).

![Sort of logo for the Panton Principles, showing this name and the text "Principles for Open Data in Science".](/assets/images/panton.png)

**Principle 1: an explicit and robust statement** <br />
This is in my opinion the most important principle. Too often you find a database with really useful data, but without
any clue about what you are allowed to do with this data. Of course, I can contact the authors, get their permission, etc.
They probably like it that way, and I can even understand that. However, it does not scale, and it is slow. Even worse is
the situation when the original composer gets missing in action. Both are equally valid, but explicit statements just make
things easier.

**Principle 2: use a waiver or license appropriate for data** <br />
This principle is debatable. Very much like the BSD-vs-GPL flamewars, some like copylefting, others do not. There is an
important difference though. Software has the concept of interfaces, allowing to more easily share incompatible licenses
cleanly separated by these interfaces. This, for example, allows you to run proprietary software on a Linux kernel.
However, data sets do not have such a concept. There is not such thing as an interface between two numbers.

This makes the concept of mixing data sets different: because there is no such interface, any mixing can only happen
between compatible licenses. This is one reason behind the choice of very liberal licenses like
[CC0](http://creativecommons.org/license/zero). This license, or waiver really, allows you to do anything, and most
certainly, mix data sets.

And that makes things a lot easier. But then again, while these are nobel goals, I rather see people use a copylefting
licenses than no license at all.

**Principle 3: non-commercial and other restrictive clauses should not be used** <br />
I think again making things easier is the goal. The non-commercial clause is interesting, and actually likely an important
one. Consider course material, a course book. Those are commercial. Some even argued that many universities themselves are
actually commercial entities.

**Principle 4: the public domain via PDDL or CCZero is strongly recommended** <br />
I second these choices over a mere claim claim that the data is public domain. The PD concept has many meanings and not
the same in every jurisdiction. In particular, differences between USA and EU law. Waiving these right, which is just
the same as claiming public domain, works in any jurisdiction, again, making things a lot easier.

**Open Data, Open Source, Open Standards are not goals** <br />
The underlying pattern of my comments must be clear: the principles make life easier. This is all what Open Source and Open Standards
([whatever](http://blueobelisk.stackexchange.com/questions/231/what-formats-fall-into-open-specification)
[those](http://blueobelisk.stackexchange.com/questions/106/which-formats-fall-into-open-data-open-source-and-open-standards)
[are](http://sourceforge.net/mailarchive/forum.php?thread_name=6aeb064b1002162228qcc0603eo8f363a13f7d46805@mail.gmail.com&forum_name=blueobelisk-discuss)).

<ul>
<i><b>The three pillars of the ODOSOS mantra is not goals, but merely the means of making life easier.</b></i>
</ul>

The Panton Principles certainly make life easier in Open Data, and initiative like the
[Linking Open Drug Data](http://esw.w3.org/topic/HCLSIG/LODD/) in which I participate will greatly benefit
from people adopting them.

The Principles do not solve all problems. There is still a lot of 'Open Data' licensed with unrecommended licenses.
For example, the [NMRShiftDB](http://chem-bla-ics.blogspot.com/2009/09/open-chemical-data-1-nmrshiftdb.html) uses a
GNU FDL license, and data from supplementary material of Open Access journal articles is like Creative Commons.

![Screenshot of the "Is it Open Data?" website, showing starting points like the "How Does It Work?" button.](/assets/images/panton_is_it_open_data.png)

Another related initiative should certainly not go unnoticed either: [Is it Open Data?](http://www.isitopendata.org/)
is a service where you can try to resolve what the license is for one of those databases which is not quite
Panton Principles compatible yet.

OK, one last thing. The [Dutch government is bursting](http://www.volkskrant.nl/binnenland/article1351058.ece/Krachtmeting_in_kabinet_om_Uruzgan),
and I want to listen to the music. With permission, I have been hacking the Panton Principles endorsement page,
and injected some extra span elements, to make it easier to machine process (again, to make things easier), so
you can use the following one-liner to calculate the number of people endorsing the principles:

```shell
$ wget -O endorsed.html http://pantonprinciples.org/endorsed.html ; xpath -q -e "//span[@class='signature']/span[@class='Country']/text()" endorsed.html | sort | uniq -c
```

The current count is [hitting 44 now](http://pantonprinciples.org/endorse/), and has not quite reached the
[500 I had hoped for](http://friendfeed.com/openchemicaldata/e6236e5a/panton-principles-endorse-open-data-go-visit) yet:

```
1 Australia
1 Canada
1 Catalonia
2 Espana
2 France
6 Germany
1 Greece
1 Italy
1 Netherlands
1 New Zealand
1 Norway
1 Poland
1 Slovenia
1 Sweden
1 Switzerland
1 The Netherlands
9 UK
1 U.K.
1 United Kingdom
1 United States of America
9 USA
```

Anyone knows how we can convert this into some nice world map graphics with a few lines of code?

Now, I am looking for a bar in Uppsala to write up some ideas about what specifications are :)
