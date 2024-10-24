---
layout: post
title:  "ChEMBL-RDF: Uploading data to Kasabi with pytassium"
date:   2011-10-22
blogger-link: https://chem-bla-ics.blogspot.com/2011/10/chembl-rdf-uploading-data-to-kasabi.html
tags: kasabi chembl semweb
doi: 10.59350/k1860-kks41
---

I reported earlier how to I [uploaded the ChemPedia (RIP) data onto Kasabi](http://chem-bla-ics.blogspot.com/2011/07/chempedia-rdf-3-uploading-data-to.html).
But for ChEMBL-RDF I have used the [pytassium](https://github.com/iand/pytassium) tool, not just because it has a cool name :) I discovered yesterday,
however, that I did not write down in this lab notebook, what steps I needed to take to reproduce it. And I just wanted to uploaded new triples to the
[ChEMBL-RDF data set on Kasabi](http://kasabi.com/dataset/chembl-rdf).

The new triples I wanted to upload, link the [new public CHEMBL identifiers](http://chembl.blogspot.com/2011/08/chembl-11-released.html)
(like [CHEMBL25 for aspirin](https://www.ebi.ac.uk/chembldb/index.php/compound/inspect/CHEMBL25)) to the internal ChEMBL database identifier I used for
ChEMBL 09 for the URIs. So, I am adding a lot of triples like:

```turtle
<http://data.kasabi.com/dataset/chembl-rdf/09/molecule/m517180> <http://www.w3.org/2002/07/owl#sameAs>
<http://data.kasabi.com/dataset/chembl-rdf/09/chemblid/CHEMBL1>
```

And the pytassium code I use to upload this to Kasabi looks like:

```python
import pytassium
import time

dataset = pytassium.Dataset('chembl-rdf','XXX')

# Store the contents of a turtle file
dataset.store_file('chemblids.nt', media_type='text/plain')
```

So, that omission in my log book has been corrected now.
