---
layout: post
title:  "Integrating CiteULike in LaTeX-based paper writing"
date:   2011-02-02
blogger-link: https://chem-bla-ics.blogspot.com/2011/02/integrating-citeulike-in-latex-based.html
doi: 10.59350/t7h8q-7rr87
tags: citeulike latex
---

Just a quick note. I started using [CiteULike](http://www.citeulike.org) as
replacement for [JabRef](http://jabref.sf.net) (I hope that it will abstract
the backend interface, allowing CiteULike to act as online store), and picked
up an idea from someone to use [groups](http://wiki.citeulike.org/index.php/Groups)
for individual papers I am working on. And, I extended my [Makefile](http://www.gnu.org/software/make/)
([Marcus](http://blog.cryos.net/), yeah, I know I should use [cmake](http://www.cmake.org/) :)
to download the references in the [group](http://www.citeulike.org/bibtex/group/14384) in BibTeX format:

```Makefile
book.bib:
        @echo "" >> book.bib
        @wget -O - http://www.citeulike.org/bibtex/group/14384 >> book.bib
```

BTW, does anyone have experience with the new [biblatex](http://ctan.org/pkg/biblatex)?
