---
layout: post
title:  "Konqueror Web Shortcuts for CHEMINF"
date:   2010-12-05
blogger-link: https://chem-bla-ics.blogspot.com/2010/12/konqueror-web-shortcuts-for-cheminf.html
doi: 10.59350/45pje-3mc88
image: /blog/assets/images/ws1.png
tags: cdk cheminf kde ontologies
---

In 2004 I wrote up a short [CDK News](http://cdknews.org) [article](http://www.steinbeck-molecular.de/cdknews/index.php/CDKNews/article/view/16)
on how to set up [Konqueror](http://www.konqueror.org/) web shortcuts for the
[CDK](http://cdk.sf.net) (Windows users can download Konqueror [here](http://windows.kde.org/download.php)).
They are very handy, and I just found another simple use case, and as I have
not seen it get much attention recently, and it is a great productivity tool,
here goes.

[CHEMINF](http://code.google.com/p/semanticchemistry/) is an ontology under
development by people at the EBI, Canada and Sweden, for cheminformatics. I
was aggregation [examples](http://code.google.com/p/semanticchemistry/wiki/Examples),
and when you browse these, you immediately run into the problem that all OWL
resources have rather cryptic names, like [CHEMINF_000000](http://semanticscience.org/resource/CHEMINF_000000).
Of course, any decent [OWL](http://en.wikipedia.org/wiki/Web_Ontology_Language)
tool will just view the *rdfs:label*, but I and others prefer to work in plain
text editors, rather than, for example, [Protege](http://protege.stanford.edu/).

Fortunately, the Michel and/or Leonid have made the CHEMINF ontology [LinkedData](http://en.wikipedia.org/wiki/Linked_Data),
which is where the web shortcuts come in. So, CHEMINF_000000 has the [URI](http://en.wikipedia.org/wiki/URI)
[http://semanticscience.org/resource/CHEMINF_000000](http://semanticscience.org/resource/CHEMINF_000000).
For the RDF and ontology users, a web shortcut is just like defining a namespace
(actually, a bit more general), so we will define *cheminf:CHEMINF_000000*.
Actually, let's skip this step, and make use of web shortcuts fully, and define *cheminf:000000*.
After all, a web shortcut is nothing more than an simple expansion.

Open Konqueror's *Settings* -> *Configure Konqueror* dialog, and select that *Web
Shortcuts* page:

![](/blog/assets/images/ws1.png)

Click new New button on the right:

![](/blog/assets/images/ws3.png)

and fill out the dialog like this:

![](/blog/assets/images/ws2.png)

Now, I can open the *cheminf:000000* URI in Konqueror and get the information
about a CHEMINF resource:

![](/blog/assets/images/ws5.png)
