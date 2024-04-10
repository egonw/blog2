---
layout: post
title:  "BioHackathon Europe 2021 #1: CiTO annotations in BioHackrXiv"
date:   2021-11-15
blogger-link: https://chem-bla-ics.blogspot.com/2021/11/biohackathon-europe-2021-1-cito.html
tags: cito biohackrxiv markdown pandoc biohackeu12 justdoi:10.7717/peerj-cs.112
image: /assets/images/citoBioHackrXiv.png
---

Serendipity. I did not plan this hack at the [BioHackathon Europe 2021](https://biohackathon-europe.org/) but it happened anyway.
Based on earlier work in the [Journal of Cheminformatics](https://www.biomedcentral.com/collections/cito), extending on the
[work by Krewinkel et al.](https://doi.org/10.7717/peerj-cs.112) I looked into the idea of using the Lua filter for
[BioHackrXiv](https://biohackrxiv.org/), a preprint server for BioHackathons. Actually, I started by looking at the
Citation Styling Language file used by the BioHackrXiv tools. But that was just wrong.

Long story short: [it worked](https://github.com/biohackrxiv/bhxiv-gen-pdf/pull/10)! Thanks to the encouragements from
[Pjotr](https://github.com/pjotrp) and [Tazro](https://github.com/inutano) and suggestions from
[Lars](https://twitter.com/larswillighagen/status/1458059589925187585) and some code on how to
[dump a Lua data structure to stdout](http://lua-users.org/wiki/TableUtils).

In the Markdown/BibTeX combination you would normally write `[@bibtexkey]` to add the reference to the article with the given key
in the `.bib` file. To type the citation (to state the intention why you cite that source), for example because you use a method
in it, you write `[@usesMethodIn:bibtexkey]`. This is different from
[how it currently works for the Journal of Cheminformatics](https://github.com/jcheminform/markdown-jcheminf),
where the intention cannot be given at citation level yet. You can even use more than one intention, e.g. `[@usesMethodIn:extends:bibtexkey]`.

If you want to try it, just create a compatible Markdown file with BibTeX file in a new GitHub repository, and post the repository URL on
this [cool preview website](http://preview.biohackrxiv.org/).

Here's what the created PDF could look like:

![](/assets/images/citoBioHackrXiv.png)
