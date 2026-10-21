---
layout: post
title:  "Extracting 3D coordinates from PDB files with Groovy CDK"
date:   2011-01-31
blogger-link: https://chem-bla-ics.blogspot.com/2011/01/extracting-3d-coordinates-from-pdb.html
doi: 10.59350/my5bc-38a88
tags: cdk groovy pdb doi:10.1186/1471-2105-10-397
---

[BioStar](http://biostar.stackexchange.com/) featured a question today about
[how to extract 3D coordinates from PDB files](http://biostar.stackexchange.com/questions/1638/how-to-extract-just-the-coordinate-values-from-a-pdb-file-converted-to-a-text-fil).
Now, a simple script may actually do, and [BioJava was mentioned too](http://biostar.stackexchange.com/questions/1638/how-to-extract-just-the-coordinate-values-from-a-pdb-file-converted-to-a-text-fil/1640#1640).
Of course, it can also be done with the [CDK](http://cdk.sf.net). For example
using this Groovy code:

```groovy
import org.openscience.cdk.interfaces.*;
import org.openscience.cdk.io.*;
import org.openscience.cdk.tools.manipulator.*;
import org.openscience.cdk.io.IChemObjectReader.Mode;
import org.openscience.cdk.*;
import java.io.File;
import java.util.zip.GZIPInputStream;

reader = new PDBReader(
  new GZIPInputStream(
    new URL(
      "http://www.pdb.org/pdb/files/1CRN.pdb.gz"
    ).openStream()
  )
);
crambin = reader.read(new ChemFile());
for (container in
     ChemFileManipulator.getAllAtomContainers(
       crambin
     )) {
  for (atom in container.atoms()) {
    println atom.point3d;
  }
}
```

Wondering what the [Bioclipse Scripting Language](http://www.biomedcentral.com/1471-2105/10/397)
version would look like... and, it can likely be done with Jmol script too.
