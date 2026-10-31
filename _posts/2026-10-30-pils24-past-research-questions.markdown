---
layout: post
title:  "Programming in the Life Sciences #24: past research questions"
date:   2026-10-30
modified_date: 2026-10-31
doi: 10.59350/tyyke-w9649
tags: pra3006 sparql wikidata wikipathways chembl
#comments:
#  host: social.edu.nl
#  username: egonw
#  id: ...
---

Fourteen years ago we [started](https://chem-bla-ics.linkedchemistry.info/2013/10/05/programming-in-life-sciences-1-six-day.html) the
Programming in the Life Sciences ([PRA3006](https://chem-bla-ics.linkedchemistry.info/tag/pra3006)).
The course is designed as a practical, because there surely is theory, but programming is also
skills. Originally it was zooming in on pharmacology and the [Open PHACTS](https://en.wikipedia.org/wiki/OpenPHACTS) webservices
(see [this](https://chem-bla-ics.linkedchemistry.info/2013/12/06/programming-in-life-sciences-12-first.html),
[this](https://chem-bla-ics.linkedchemistry.info/2013/12/06/programming-in-life-sciences-13-another.html),
and [this post](https://chem-bla-ics.linkedchemistry.info/2015/01/11/programming-in-life-sciences-21-2014.html)).
By now, the focus is on [life sciences SPARQL endpoints](https://tgx-um.github.io/PRA3006-SPARQL/).

Over the years, not all, but a good number of students have made their project available on GitHub, each with a separate
biologically-oriented research question. In this post, I collect a number of them. Because webservices change, some
code may not work anymore, but the overview of questions the students were able to study or even answer is
interesting in itself. Some years students worked in small teams, some years alone.

* 2019: [pathways associated with 2338 different diseases](https://github.com/fennakadir/pils) (Wikidata)
* 2020: [increased risks for drugs for people with certain diseases](https://github.com/alexanderleonidas/PRA3006-Programming-in-the-Life-Sciences) (Bio2RDF)
* 2021: [relation of drug and drug doses and cancer](https://github.com/Alex-AI-code/PRA3006) (Wikidata)
* 2021: [proteins involved in cellular senescence](https://github.com/nikasimicic/programming-pra3006) (Wikidata)
* 2021: [drug targeting in PTS](https://github.com/Laelil/PRA3006) (Wikidata)
* 2022: [interactions of drugs psychiatric conditions](https://github.com/Snrts/PRA3006-Project_Repository) (Wikidata)
* 2022: [symptoms of infectious diseases and their treatments](https://github.com/amsche/PRA3006-Project) (Wikidata)
* 2023: [liver steatosis adverse outcome pathway network](https://github.com/LauryneGlub/PRA3006-Project11) (ChEMBL RDF)
* 2023: [the molecular mechanisms involved in Duchenne Muscular Dystrophy](https://github.com/Thammarak7/Case_DMD_PRA3006_Project) (ChEMBL RDF)
* 2023: [visualizing the chemical structure of metabolites in biological pathways](https://github.com/TegestGaetti/PRA3006-Visualising-the-chemical-structure-of-metabolite-in-biological-pathways) (WikiPathways)
* 2023: [types of cancers and the treatments](https://github.com/marinacastellano/pils_project/tree/main) (Wikidata)
* 2023: [adverse outcome (AO) & key event (KE) per chemical and species](https://github.com/cleopheebruchou/PRA3006) (AOP-Wiki RDF)
* 2024: [dopaminergic pathways of the drugs used to treat Parkinson's disease](https://github.com/reneecarr/PRA3006-Group-8/tree/main) (Wikidata)
* 2024: [the dying blue: phylogenetic tree of marine species](https://github.com/Baxby-UM/PRA3006) (custom SPARQL endpoint)
* 2024: [global prevalence of dementia and associated symptoms and treatments](https://github.com/matlaofmalta/PRA3006) ([demo](https://matlaofmalta.github.io/PRA3006/); Wikidata)
* 2024: [drug combinations and interactions](https://github.com/pakumidori/PRA3006) (Wikidata)
* 2024: [endangered species](https://github.com/judebethinger/PRA3006-Programming-in-the-life-sciences) (Wikidata)
* 2024: [caloric values of various food items](https://github.com/MirkoGijsen/PRA3006-programming-in-the-life-sciences) (Wikidata)
* 2024: [viruses across their host species](https://github.com/Rhys-Wittry/Pra3006_Programming_in_the_life_sciences) (UniProtKB)
* 2025: [exploring protein targets of radiopharmaceuticals](https://github.com/eszter-csenteri/PRA3006-g7) ([demo](https://eszter-csenteri.github.io/PRA3006-g7/); ChEMBL RDF)
* 2025: [socioeconomic impact on species endangerment](https://github.com/jdiaz1604/PRA3006-Group-6-) (Wikidata)
* 2025: [diseases are caused by smoking](https://github.com/serenalucarini/PRA3006-G1) (Wikidata)
* 2025: [pathways involved in types I diabetes](https://github.com/Cl0t1lde/PRA3006_groupe_2_final) (WikiPathways)

Originally, the course started with the OpenPHACTS SPARQL endpoint, tho it was hidden behind a REST API.
Wikidata is now are default SPARQL endpoint, but it is nice to see that other life sciences SPARQL endpoints
are used too: UniProtKB, ChEMBL-RDF, AOP-Wiki RDF, and Bio2RDF.

Huge thanks to all the [Maastricht Science Programme](https://www.maastrichtuniversity.nl/education/bachelor/programmes/maastricht-science-programme)
students for their creative projects! I like to stress, the course only runs for 5 weeks, with one practical day of 5 hours.
And each year, they surprise me with how much they learned and got done.
