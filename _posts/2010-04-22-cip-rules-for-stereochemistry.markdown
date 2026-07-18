---
layout: post
title:  "CIP rules for stereochemistry"
date:   2010-04-22
modified_date: 2026-06-14
blogger-link: https://chem-bla-ics.blogspot.com/2010/04/cip-rules-for-stereochemistry.html
doi: 10.59350/1n6nz-z2572
tags: cdk chemistry cheminf scholia
image: /assets/images/(R)-bromo(chloro)iodomethane.png
---

Uniquely identifying [stereochemical enantiomers](http://en.wikipedia.org/wiki/Stereochemistry) is an important aspect of data
exchange of chemical structures. The simplest, most neglected solution is to pass around 3D models, but a lot of people like to
stick to things like [SMILES](http://www.opensmiles.org/), or [IUPAC names](http://www.chem.qmul.ac.uk/iupac/). Now, given that
we want to uniquely represent the stereochemistry, we can use special rules. One example for enantiomers are the
[Cahn-Ingold-Prelog (CIP) rules](http://en.wikipedia.org/wiki/Cahn%E2%80%93Ingold%E2%80%93Prelog_priority_rules).

The [CDK](http://cdk.sf.net/) does not have an implementation of (part of) the CIP rules. However, we recently started a
collaboration with Dr [Lars Carlsson](http://se.linkedin.com/pub/lars-carlsson/9/641/203) in the Computational Toxicology,
Global Safety Assessment group at [AstraZeneca R&D Mölndal](http://www.astrazeneca.se/om_oss/verksamheten-i-Sverige/Forskning/Molndal/?itemId=3118278),
headed by Dr Scott Boyer. Within this collaboration I have started an partial implementation of the CIP rules. The full set of
rules is quite extensive, and some subrules are outside the scope of the collaboration. For example, we will likely not look at
axial or helical stereochemistry within this collaboration. The kind of things it is able to do is distinguish between these
mirror images (yeah, I should use [Jmol](http://www.jmol.org/), but [Scholia](https://qlever.scholia.wiki/) needs more plugging
right now: click the images):

<a href="https://qlever.scholia.wiki/chemical/Q105313057" imageanchor="1" style="margin-left: 1em; margin-right: 1em;">
  <img border="0" src="/assets/images/(R)-bromo(chloro)iodomethane.png">
</a>
<a href="https://qlever.scholia.wiki/chemical/Q140196930" imageanchor="1" style="margin-left: 1em; margin-right: 1em;">
  <img border="0" src="/assets/images/(S)-bromo(chloro)iodomethane.png">
</a>

The current patch is not looking into the problem of which atom is chiral; that problem is quite complex in itself, and Tim
is writing up a nice set of [blogs](http://timvdm.blogspot.com/2010/03/detecting-stereogenic-units-alternative.html)
[about](http://timvdm.blogspot.com/2009/09/more-para-stereocenters-permutation.html) [that](http://timvdm.blogspot.com/2009/09/as-promised-here-are-some-molecules.html).
Further, the current aims focuses only at application to atoms of ligancy four; that is, carbons.

The CIP rules uniquely define the stereochemistry of such a carbon, by uniquely ordering the ligands around the atom. Using
rules the ligands are ordered, and they include rules defining priority based on atomic number, mass number, etc. It is the
recursion that makes things more interesting, but I will not delve into the details of the algorithm here (see the aforelinked
Wikipedia page instead, or a cheminformatics book like the one shown on the right). Here, I want to introduce some of the API
of the current patch for the CDK.

## Ligands and their Priorities

Core to the implementation are the CIP priority rules, that allow ordering of the ligand. So, we define a molecule, and ligands:

```java
IMolecule molecule = parser.parseSmiles("IC(Br)(Cl)[H]");
ILigand ligand1 = new Ligand(
  molecule.getAtom(1), molecule.getAtom(2)
);
ILigand ligand2 = new Ligand(
  molecule, molecule.getAtom(1), molecule.getAtom(0)
);
ISequenceSubRule rule = new CIPLigandRule();
Assert.assertEquals(-1, rule.compare(ligand1, ligand2));
Assert.assertEquals(1, rule.compare(ligand2, ligand1));
```

This [JUnit](http://www.junit.org/) test looks at the chiral compound given earlier, but without specifying the stereochemistry
using the @@/@ SMILES syntax; we get to that later. Here, the example defines two ligands around atom 1 (which is the carbon;
the index starts at 0). The first ligand is the bromine, the second ligand is the iodine. Because the latter takes priority
according to the CIP rules, the compare(ligand1, ligand2) returns -1.

## The CIPTool

This *CIPLigandRule* is used in the CIPTool to provide more user-oriented methods. The goal, obviously, is this bit of code:

```java
IMolecule molecule = parser.parseSmiles("ClC(Br)(I)[H]");
LigancyFourChirality chirality =
  CIPTool.defineLigancyFourChirality(
    molecule, 1, 4, 0, 2, 3, STEREO.CLOCK_WISE
  );
Assert.assertEquals(
  CIP_CHIRALITY.R,
  CIPTool.getCIPChirality(chirality)
);
```

Because we do not have 3D coordinates in our SMILES, we define the stereochemistry as CLOCK_WISE and ANTI_CLOCK_WISE.
The former here means that, looking from the first ligand, following atoms 2, 3, and 4 are oriented in a circle in a
clock-wise turn. This defines uniquely the geometrical orientation, but which changes between CLOCK_WISE and ANTI_CLOCK_WISE
upon every atom-atom exchange. Therefore, we uniquely prioritize the ligands, project, and translate the resulting
CLOCK_WISE or ANTI_CLOCK_WISE in the appropriate R and S stereochemistry.

That's all for now. Questions, ideas and others most welcome in the comment!
