---
layout: post
title:  "How many hydrogen-bond acceptor groups does triazole have?"
date:   2010-12-10
blogger-link: https://chem-bla-ics.blogspot.com/2010/12/how-many-hydrogen-bond-acceptor-groups.html
doi: 10.59350/em56e-x5385
tags: beilstein cdk cheminf chemistry chemspider pubchem inchikey:NSPMIYGKQJPBQR-UHFFFAOYSA-N
image: /blog/assets/images/1,2,4-triazole.png
---

[Andrew](http://en.wikipedia.org/wiki/Andrew_S.I.D._Lang) asked me about the
H-bond donor capabilities of [1,2,4-triazole](http://en.wikipedia.org/wiki/1,2,4-Triazole):

![](/blog/assets/images/1,2,4-triazole.png)

Apparently, the way he uses the [CDK](http://cdk.sf.net) library, it returns
[zero H-bond donor groups](https://sourceforge.net/tracker/index.php?func=detail&aid=3133610&group_id=20024&atid=120024),
as is visible in [his application](http://showme.physics.drexel.edu/onsc/models/AbrahamDescriptorsModel001.php?commonname=1,2,4-triazole)
down the bottom of the page. When start from the PubChem entry, it correctly
detects on H-bond donor group, so it seems to have to do with implicit hydrogens
(not uncommon). Debugging will continue later, when I am done analyzing the
[Beilstein Journal of Organic Chemistry](http://www.beilstein-journals.org/bjoc/)
literature with [Oscar](oscar3-chem.sf.net).

But, I do like to put this question out in the open: how many *H-bond acceptor*
groups does this triazole have? The CDK calculates 3 groups, while [PubChem
counts 2](http://pubchem.ncbi.nlm.nih.gov/summary/summary.cgi?cid=9257&loc=ec_rcs).
[ChemSpider thinks 3](http://www.chemspider.com/RecordView.aspx?rid=16b4a40c-0eaf-45ed-bbf3-10baed079a9b)
too.

Intuitively, I would agree with the CDK and ChemSpider: the nitrogen which acts
as the single H-bond donor still have a free electron pair. What do you think?
Is [PubChem](http://pubchem.ncbi.nlm.nih.gov/) wrong, or is the CDK and [ChemSpider](http://chemspider.com)
wrong? Can this special nitrogen be both a donor and acceptor at the same time?
I think so. However, I do not know how I can easily search [CrystalEye](http://wwmm.ch.cam.ac.uk/crystaleye/)
for this. Bonus points for answering the [Blue Obelisk eXchange question](http://blueobelisk.shapado.com/questions/how-can-i-searched-crystaleye-for-particular-packing-types).
