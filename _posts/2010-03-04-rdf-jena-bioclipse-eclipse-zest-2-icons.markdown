---
layout: post
title:  "RDF, Jena, Bioclipse, Eclipse, Zest #2: icons and an extension point"
date:   2010-03-04
blogger-link: https://chem-bla-ics.blogspot.com/2010/03/rdf-jena-bioclipse-eclipse-zest-2-icons.html
doi: 10.59350/11ezg-n8811
tags: rdf bioclipse jena
image: /assets/images/rdfEditorIcons.png
modified_date: 2026-10-17
---

[Jonathan](http://se.linkedin.com/in/jonathanalvarssson) worked this week on new features for the [Bioclipse](http://www.bioclipse.net/)
RDF editor (see [these <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/02/07/rdf-jena-bioclipse-eclipse-zest-mashups.html)
[two <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/02/11/bioclipse-understands-ontologies-note.html) earlier items). This version still does
not edit, but only display using [Zest](http://www.eclipse.org/mylyn/zest.php). Jonathan created for me an extension point so
that anyone can make the editor aware of domain objects, by simply registering the extension implementation along with the
*rdf:Class* URI of the *rdf:type* of an object. This fixes the problem of having to hardcode dependencies of the RDF editor
on all the domain code, as was the case [earlier <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/02/11/bioclipse-understands-ontologies-note.html).

For example, the cheminformatics [IMolecule](http://wiki.bioclipse.net/index.php?title=Molecule) object is now linked to
the `rdf:type <http://www.bioclipse.net/structuredb/#Molecule>`:

```xml
<extension point="net.bioclipse.rdf.rdf2bioobjectfactory">
  <Factory
    instance="net.bioclipse.rdf.ui.RDFToCDKMoleculeFactory"
    uri="http://www.bioclipse.net/structuredb/#Molecule" >
  </Factory>
</extension>
```

The API for this factory looks like:

```
public IBioObject rdfToBioObject( Model model, Resource res );
public ImageDescriptor getImageDescriptor();
```

This is very much tied into the Jena data model, so not entirely clean, but has to do for now. The first method converts RDF content
into a Bioclipse IBioObject, such as an IMolecule (see this [list of currently supported objects](http://wiki.bioclipse.net/index.php?title=Bioclipse2_core_object_model)).
The second method returns an icon, which makes the editor more visually pleasing, and provides a nice way to see when you can double
click the RDF node to have it open in an domain specific editor:

![](/assets/images/rdfEditorIcons.png)

For example, double clicking the *ron:mol2* node, would open up a JChemPaint editor.
