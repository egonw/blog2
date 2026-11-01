---
layout: post
title:  "CKAN and RDF: a nice example of why ontologies matter"
date:   2011-02-21
blogger-link: https://chem-bla-ics.blogspot.com/2011/02/ckan-and-rdf-nice-example-on-why.html
doi: 10.59350/qgd1w-x2514
tags: chembl nmrshiftdb rdf
---

<img src="https://assets.okfn.org/p/ckan/img/ckan_logo_box.png" style="width: 30%; display: block; margin-left: auto; margin-right: auto; float: right" />
For a while now I have been a so-called [invited expert](http://www.w3.org/2004/08/invexp)
to the [Linking Open Drug Data](http://www.w3.org/wiki/HCLSIG/LODD) (LODD) task
force of the W3C's [Health Care and Life Sciences Interest Group](http://www.w3.org/wiki/HCLSIG)
(HCLSIG). I also participate in the [open-science](http://wiki.okfn.org/OpenScience)
group of the [Open Knowledge Foundation](http://okfn.org/) (OKF). This is not
really worth blogging about if the two are not being mashed up. Members from
both sides are interested in learning how Open (think [Is It Open Data?](http://www.isitopendata.org/))
the *open data* from the LODD network really is.

In fact, the Open Data definition as outlined in the [Panton Principles](http://chem-bla-ics.blogspot.com/2010/02/open-data-panton-principles.html)
does not allow for a non-commercial clause, which several LODD data sets are
labeled with. Clear copyright and license statements are really important. This
[applies to source code](http://chem-bla-ics.blogspot.com/2009/06/making-patches-attribution-copyright.html),
but most certainly to data too.

So, early March there will be a virtual, online hack session on making a start
clarifying the licensing and copyrights of the various LODD data sets. CKAN,
the OKF's registry of data sets sounds like a suitable place to organize things.
And, they support RDF making it even a nicer match. Or...

**Records, data sets, packages, lists, ...**  
Well, I am running into a number of problems that need to be solved. The first
one is, in fact, rather fundamental. A record in the CKAN catalog is typed as
a [CatalogRecord](http://www.w3.org/ns/dcat#CatalogRecord). Nothing more, nothing
less. However, looking at the database content each record is like a data set.
The GUI confirms that with links like 'Add a dataset'. Then again, [following
the link](http://ckan.net/package/new), it is described as a 'data package'
as well as a 'dataset'. This is confusing.

Yes, it is! Really! Just look at how people are using it.

Take for example the record for [LODD](http://ckan.net/package/linking-open-drug-data)
(well, there is [a second LODD record](http://ckan.net/package/lodd_group) and
I haven't found a way to delete records). But, the LODD data is not a single
data set, but a aggregation (package?) of data sets. This is basically one of
the standing issues with Linked Open Data: license incompatibilities, just like
with mixing GPL v2 and v3 in source code. As such, these records which are basically
lists of datasets typically not have a license listed, as multiple license apply.

There seem two solutions: the use of [groups](http://ckan.net/group/) and of
[tags](http://ckan.net/tag/). I opted for a new [W3C's HCLSIG LODD task force](http://ckan.net/group/hclsig_lodd)
group.

**Small issues**  
As said, I could not find a way yet to remove datasets, so cleaning up the catalog
is a bit difficult. You can add comments, but I am not sure if these get read.
Earlier, I noted that the GNU FDL license was missing, but that is available
from the list now, so I have updated the [NMRShiftDB record](http://ckan.net/package/nmrshiftdb).
The combination of Attribution and Share-Alike for the Creative Commons license
is missing from the list though, affecting the [ChEMBL record](http://ckan.net/package/chembl).

**Redistribution?**  
Another issue that must be addressed in CKAN is how to deal with redistributions.
For example, the above cited ChEMBL data is also available as [SPARQL end](http://chem-bla-ics.blogspot.com/2010/02/chembl-rdf-1sparql-end-point.html)
point by me, and this end point currently has a [different record](http://ckan.net/package/farmbio-chembl).
Should those records be merged? I guess not, because there is only place for
one maintainer. So, perhaps a CKAN catalog record is not even a dataset, but
a data set provider?

Well, this does make a really nice example of what can go wrong if terms are
not well-defined, e.g. using an ontology. People do not know how to fill the
database, leading to noisy content, limiting the usefulness of the data. I do
hope we get to see definitions for what groups and datasets are in the catalog
before our hack session in March.
