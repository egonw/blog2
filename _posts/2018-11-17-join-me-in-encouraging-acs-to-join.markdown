---
layout: post
title:  "Join me in encouraging the ACS to join the Initiative for Open Citations"
date:   2018-11-17
blogger-link: https://chem-bla-ics.blogspot.com/2018/11/join-me-in-encouraging-acs-to-join.html
tags: acs i4oc publishing
image: /assets/images/exploring.png
---

My research is into abstract representation of chemical information, important for other research to be performed. Indeed, my work
is generally reused, but knowing which research fields my work is used in, or which societal problems it is helping solve, is not
easily retrieved or determined. Efforts like [WikiCite](https://meta.wikimedia.org/wiki/WikiCite) and
[Scholia](https://tools.wmflabs.org/scholia/topic/Q45340488) do allow me to navigate the citation network, so that I can determine
which research fields my output influences and which diseases are studied with methods I proposed. Here's a
[network of topics of articles citing my work](https://query.wikidata.org/embed.html#%23defaultView%3AGraph%0ASELECT%0A%20%20%3Ftopic1%20%3Ftopic1Label%20%3Ftopic2%20%3Ftopic2Label%20%3Fcount%0AWITH%20%7B%0A%20%20SELECT%0A%20%20%20%20(COUNT(%3Fwork)%20AS%20%3Fcount)%20%3Ftopic1%20%3Ftopic2%0A%20%20WHERE%20%7B%0A%20%20%20%20%23%20Find%20works%20that%20are%20marked%20with%20main%20subject%20of%20the%20topic.%0A%20%20%20%20%3Fwork%20wdt%3AP2860%2Fwdt%3AP50%20wd%3AQ20895241%20.%0A%20%20%20%20%0A%20%20%20%20%23%20Identify%20co-occuring%20topics.%20%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Ftopic1%2C%20%3Ftopic2%20.%20%0A%0A%20%20%20%20%23%20article%20by%20author%0A%20%20%20%20MINUS%20%7B%20%3Fwork%20wdt%3AP50%20wd%3AQ20895241%20.%20%7D%0A%20%20%20%20FILTER%20(%20%3Ftopic1%20!%3D%20%3Ftopic2%20)%0A%20%20%7D%0A%20%20GROUP%20BY%20%3Ftopic1%20%3Ftopic2%0A%20%20ORDER%20BY%20DESC(%3Fcount)%0A%0A%20%20%23%20There%20a%20performance%20problems%20in%20the%20browser%3A%20We%20cannot%20show%20large%20graphs%2C%0A%20%20%23%20so%20we%20put%20a%20limit%20on%20the%20number%20of%20links%20displayed.%0A%20%20LIMIT%20400%0A%0A%7D%20AS%20%25results%0AWHERE%20%7B%0A%20%20INCLUDE%20%25results%0A%20%20%0A%20%20%23%20Label%20the%20results%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%0A%20%20%20%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%0A%20%20%7D%0A%7D%0A%0A):

![](/assets/images/exploring.png)

Graphs like this show information on how people are using my work, which in turn allows me to further support. But this relies on
open citations.

In my opinion, citations are an essential part of our research process. It gives us access to import prior work on which a study
is based, and reflects how a work influences other research or even is essential to that other work. For example, it allows us
to not repeat earlier published work, while preserving the ability to reproduce the full work. The
[Initiative for Open Citations](https://i4oc.org/) encourages these citations to be publicly available to benefit research, but
removing barriers to access this critical part of scholarly communication. While many societies and publishers have joined this
initiative, the [American Chemical Society](https://pubs.acs.org/) (ACS) has not yet. By not joining the limit the sharing of
knowledge for unclear reasons.

And I would really like to see the ACS to join this initiative, and proposed this a few times already. Because they still have
not joined the initiative, I have [started this petition](https://www.change.org/p/the-american-chemical-society-to-join-the-initiative-for-open-citations).
If you agree, please sign and share it with others.
