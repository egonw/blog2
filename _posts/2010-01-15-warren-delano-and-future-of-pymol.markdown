---
layout: post
title:  "Warren DeLano and the future of PyMOL"
date:   2010-01-15
blogger-link: https://chem-bla-ics.blogspot.com/2010/01/warren-delano-and-future-of-pymol.html
doi: 10.59350/dskgb-hdz03
tags: odosos chemistry justdoi:10.59350/rj9fv-7mf71
image: /assets/images/pymol2.png
modified_date: 2026-08-16
---

This blog is old and new news. The old news is that [Warren passed away](http://warrendelano.blogspot.com/2009/11/warren-delano-passes-away.html) at the
end of last year, after having successfully shown how OpenSource cheminformatics (and/or bioinformatics) software can be developed in a commercial setting
([DeLano Scientific](http://delanoscientific.com/)), and [PyMol](http://pymol.org/) was a huge success. Warren had a SourceForge account
([wdelano](http://sourceforge.net/users/wdelano)) for almost 10 years:

![](/assets/images/pymol1.png)

I had not blogged about it before as the news hit me hard. Surely, Warren knew a lot of people and I only was only one of many, but Warren's memory sticked well.
I know Warren from the [Jmol](http://www.jmol.org/) project, where we talked in the past of coming to an Open Specification for exchanging scenes between
Jmol and PyMol. Around the end of my PhD contract we even briefly, but seriously, explored doing a post-doc in his group.

Anyway, lot's of people wrote up blogs (in arbitrary order: [Rich <i class="fa-solid fa-recycle fa-xs"></i>](https://doi.org/10.59350/rj9fv-7mf71),
[P212121](http://www.p212121.com/2009/11/05/passing-of-warren-delano/), [MacResearch](http://www.macresearch.org/memoriam-warren-l-delano),
[Jörg](http://miningdrugs.blogspot.com/2009/11/warren-delano-in-memoriam.html), [MMB](http://rosettadesigngroup.com/blog/464/reports-of-warren-delano-passing-away-terrible-tragedy-if-true/),
[Shirley](http://shirleywho.wordpress.com/2009/11/07/in-memoriam-warren-delano/), [Derek](http://pipeline.corante.com/archives/2009/11/17/warren_delano.php),
[Wavefunction](http://wavefunction.fieldofscience.com/2009/11/warren-delano.html), [Dan](http://www.openscience.org/blog/?p=300),
[Barry](http://barryhardy.blogs.com/cheminfostream/2009/11/warren-delano-rip.html), and probably many more).
They have set up a memorial fund which will focus on promoting the Open Source ideas of Warren, including
an [Award](http://www.wldmemorialfund.org/WLDMemorialFund/Warren_L._DeLano_Memorial_Fund.html).

## Schrödinger
Yesterday, I was [pinged](http://rosettadesigngroup.com/blog/545/pymol-schrodinger/) about
[Schrödinger acquiring PyMol](http://www.schrodinger.com/news/47/). The press release is, as usual, short on details, but those have
become clearer during the day. Schrödinger is not new to Open Source cheminformatics, and has an
[product based on KNIME](http://www.schrodinger.com/products/14/8/), which is now GPL, but also has a proprietary license
for those who wish to license so.

But, unless I missed any other Open Source (-oriented) product, the acquisition of PyMol significantly changes the game for them:
PyMol is a major Open Source product, bigger than KNIME at the moment, I'd guess. My immediate response to the acquisition is whether
they acquired copyrights, and they did, according to [this commit](http://pymol.svn.sf.net/viewvc/pymol/branches/b099/pymol/layer0/Base.h?r1=3886&r2=3885&pathrev=3886):

![](/assets/images/pymol2.png)

This is important as it puts Schrödinger in charge of license changes. Fortunately, they seem rather serious about the Open Source thing, and
hired an active PyMol developer (Jason), and kept the existing Open Source license:

![](/assets/images/pymol.png)

Therefore, congratulations to Schrödinger for getting seriously into the Open Source community, making them the next
[Dr Who of PyMol](http://wwmm.ch.cam.ac.uk/blogs/murrayrust/?p=2059), and
congratulations to the family of Warren in ensuring continued development of the PyMol project! It's hearth-warming to see that despite
the bad times they are going through, and all they options they had with the PyMol code base, they find time for and strength in
supporting Warren's ideas about the future of cheminformatics. My thoughts are with them!
