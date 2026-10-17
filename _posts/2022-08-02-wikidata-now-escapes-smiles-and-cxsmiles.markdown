---
layout: post
title:  "Wikidata now escapes SMILES and CXSMILES!"
date:   2022-08-02
blogger-link: https://chem-bla-ics.blogspot.com/2022/08/wikidata-now-escapes-smiles-and-cxsmiles.html
doi: 10.59350/458r6-cmn16
tags: wikidata cxsmiles
modified_date: 2026-10-17
---

In the end it was a very [simple change](https://www.wikidata.org/w/index.php?title=MediaWiki%3AGadget-AuthorityControl.js&type=revision&diff=1694196586&oldid=1409657932)
today (huge thanks to [Nikki](https://www.wikidata.org/wiki/User:Nikki)!), but [Wikidata](https://wikidata.org/)
now escapes SMILES and CXSMILES ([P10718](https://wikidata.org/entity/P10718)) with the formatter URL
([P1630](https://wikidata.org/entity/P1630))!

![](/assets/images/Screenshot_20220802_100605.png)

That means that the link to [CDK Depict](https://cdkdepict.cloud.vhp4safety.nl/) now also works for SMILES
([P233](https://wikidata.org/entity/P233) and [P2017](https://wikidata.org/entity/P2017)) with a triple bond in it :) And because
[Adriano](https://twitter.com/Adafede) created the so far missing `formatter URL` for CXSMILES, it also
works for lipid classes (see [my post yesterday <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2022/08/01/biology-acps-lipids-cheminformatics-and.html)),
polymers, etc :)

![](/assets/images/Screenshot_20220802_100818.png)

<center>CXSMILES for a group of acyl-carrier proteins.</center><br />

![](/assets/images/Screenshot_20220802_100841.png)

<center>The <i>formatter URL</i> info added to make the link outs for CXSMILES work. The patch
by Nikki ensures that characters like # are escaped before the URL is created.</center><br />
