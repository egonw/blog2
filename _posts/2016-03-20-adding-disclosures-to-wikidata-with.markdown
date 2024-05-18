---
layout: post
title:  "Adding disclosures to Wikidata with Bioclipse"
date:   2016-03-20
blogger-link: https://chem-bla-ics.blogspot.com/2016/03/adding-disclosures-to-wikidata-with.html
tags: acs bioclipse chembl inchi pubchem wikidata acssandiego doi:10.1186/1471-2105-8-59 doi:10.3897/RIO.1.E7573
---

Last week the huge, bi-annual ACS meeting took place ([#ACSSanDiego](https://twitter.com/search?q=%23ACSSanDiego)),
during which commonly new drug (leads) are disclosed. This time too, like this one tweeted by
[Bethany Halford](https://twitter.com/beth_halford):

<iframe id="twitter-widget-3" scrolling="no" frameborder="0" allowtransparency="true" allowfullscreen="true" class=""
  title="X Post" src="https://platform.twitter.com/embed/Tweet.html?dnt=false&amp;embedId=twitter-widget-3&amp;features=eyJ0ZndfdGltZWxpbmVfbGlzdCI6eyJidWNrZXQiOltdLCJ2ZXJzaW9uIjpudWxsfSwidGZ3X2ZvbGxvd2VyX2NvdW50X3N1bnNldCI6eyJidWNrZXQiOnRydWUsInZlcnNpb24iOm51bGx9LCJ0ZndfdHdlZXRfZWRpdF9iYWNrZW5kIjp7ImJ1Y2tldCI6Im9uIiwidmVyc2lvbiI6bnVsbH0sInRmd19yZWZzcmNfc2Vzc2lvbiI6eyJidWNrZXQiOiJvbiIsInZlcnNpb24iOm51bGx9LCJ0ZndfZm9zbnJfc29mdF9pbnRlcnZlbnRpb25zX2VuYWJsZWQiOnsiYnVja2V0Ijoib24iLCJ2ZXJzaW9uIjpudWxsfSwidGZ3X21peGVkX21lZGlhXzE1ODk3Ijp7ImJ1Y2tldCI6InRyZWF0bWVudCIsInZlcnNpb24iOm51bGx9LCJ0ZndfZXhwZXJpbWVudHNfY29va2llX2V4cGlyYXRpb24iOnsiYnVja2V0IjoxMjA5NjAwLCJ2ZXJzaW9uIjpudWxsfSwidGZ3X3Nob3dfYmlyZHdhdGNoX3Bpdm90c19lbmFibGVkIjp7ImJ1Y2tldCI6Im9uIiwidmVyc2lvbiI6bnVsbH0sInRmd19kdXBsaWNhdGVfc2NyaWJlc190b19zZXR0aW5ncyI6eyJidWNrZXQiOiJvbiIsInZlcnNpb24iOm51bGx9LCJ0ZndfdXNlX3Byb2ZpbGVfaW1hZ2Vfc2hhcGVfZW5hYmxlZCI6eyJidWNrZXQiOiJvbiIsInZlcnNpb24iOm51bGx9LCJ0ZndfdmlkZW9faGxzX2R5bmFtaWNfbWFuaWZlc3RzXzE1MDgyIjp7ImJ1Y2tldCI6InRydWVfYml0cmF0ZSIsInZlcnNpb24iOm51bGx9LCJ0ZndfbGVnYWN5X3RpbWVsaW5lX3N1bnNldCI6eyJidWNrZXQiOnRydWUsInZlcnNpb24iOm51bGx9LCJ0ZndfdHdlZXRfZWRpdF9mcm9udGVuZCI6eyJidWNrZXQiOiJvbiIsInZlcnNpb24iOm51bGx9fQ%3D%3D&amp;frame=false&amp;hideCard=false&amp;hideThread=false&amp;id=710543705812426752&amp;lang=en&amp;origin=https%3A%2F%2Fchem-bla-ics.blogspot.com%2F2016%2F03%2Fadding-disclosures-to-wikidata-with.html&amp;sessionId=ba8a9ed10d55387ac0f656bfaf73f3a579e1e77a&amp;theme=light&amp;widgetsVersion=2615f7e52b7e0%3A1702314776716&amp;width=550px"
  style="position: static; visibility: visible; width: 550px; height: 1311px; display: block; flex-grow: 1;"
  data-tweet-id="710543705812426752"></iframe> <br />

Because getting this information out in the open is important, I think it's a good idea to add them to
[Wikidata](http://wikidata.org/) (see doi:[10.3897/rio.1.e7573](http://dx.doi.org/10.3897/rio.1.e7573)).
So, with [Bioclipse](http://www.bioclipse.net/) (doi:[10.1186/1471-2105-8-59](http://dx.doi.org/10.1186/1471-2105-8-59))
I redrew the structure:

![](/assets/images/strucutre.png)

I previously blogged about how to [add chemicals to Wikidata](http://chem-bla-ics.blogspot.nl/2016/01/adding-chemical-compound-to-wikidata.html),
but I realized that I wanted to also use Bioclipse to automate this process a bit. So, I wrote this script to generated the SMILES, InChI,
InChIKey, double check the compound is not already in Wikidata (using the [Wikidata SPARQL endpoint](https://query.wikidata.org/)),
an look up the [PubChem](https://pubchem.ncbi.nlm.nih.gov/) compound identifier (example SMILES).

```groovy
smiles = "CCCC"

mol = cdk.fromSMILES(smiles)
ui.open(mol)

inchiObj = inchi.generate(mol)
inchiShort = inchiObj.value.substring(6)
key = inchiObj.key // key = "GDGXJFJBRMKYDL-FYWRMAATSA-N"

sparql = """
PREFIX wdt: <http://www.wikidata.org/prop/direct/>
SELECT ?compound WHERE {
  ?compound wdt:P235 "$key" .
}
"""

if (bioclipse.isOnline()) {
  results = rdf.sparqlRemote(
    "https://query.wikidata.org/sparql", sparql
  )
  missing = results.rowCount == 0
} else {
  missing = true
}

formula = cdk.molecularFormula(mol)

// Create the Wikidata QuickStatement,
// see https://tools.wmflabs.org/wikidata-todo/quick_statements.php

item = "LAST" // set to Qxxxx if you need to append info,
              // e.g. item = "Q22579236"

pubchemLine = ""
if (bioclipse.isOnline()) {
  pcResults = pubchem.search(key)
  if (pcResults.size == 1) {
    cid = pcResults[0]
    pubchemLine = "$item\tP662\t\"$cid\""
  }
}

if (!missing) {
  println "===================="
  println "Already in Wikidata as " + results.get(1,"compound")
  println "===================="
} else {
  statement = """
    CREATE
    
    $item\tDen\t\"chemical compound\"
    $item\tP233\t\"$smiles\"
    $item\tP274\t\"$formula\"
    $item\tP234\t\"$inchiShort\"
    $item\tP235\t\"$key\"
    $pubchemLine
  """

  println "===================="
  println statement
  println "===================="
}
```

The output of this script is a [QuickStatement](https://tools.wmflabs.org/wikidata-todo/quick_statements.php) for
[Magnus Manske](http://twitter.org/MagnusManske)'s tool (IMPORTANT: it's not meant to automate editing Wikidata! I only automate
creating the input, which I carefully check (e.g. checking all stereochemistry is defined)! Note, how Bioclipse opens up the
structure in a viewer with ui.open()), which is a list of commands to create and edit entries in Wikidata. You need to enable
it first, but if you have an account, this is not too hard. Of course, the advantage is that it is a lot quicker. I have similar
script to create QuickStatements starting with only a [ChEMBL](https://www.ebi.ac.uk/chembl/) identifier.

The QuickStatement for GDC-0853 looks like:

```
    CREATE
    
    LAST Den "chemical compound"
    LAST P233 "O=C1C(=CC(=CN1C)c2ccnc(c2CO)N4C(=O)c3cc5c(n3CC4)CC(C)(C)C5)Nc6ncc(cc6)N7CCN(C[C@@H]7C)C8COC8"
    LAST P274 "C37H44N8O4"
    LAST P234 "1S/C37H44N8O4/c1-23-18-42(27-21-49-22-27)9-10-43(23)26-5-6-33(39-17-26)40-30-13-25(19-41(4)35(30)47)28-7-8-38-34(29(28)20-46)45-12-11-44-31(36(45)48)14-24-15-37(2,3)16-32(24)44/h5-8,13-14,17,19,23,27,46H,9-12,15-16,18,20-22H2,1-4H3,(H,39,40)/t23-/m0/s1"
    LAST P235 "WNEODWDFDXWOLU-QHCPKHFHSA-N"
    LAST P662 "86567195"
```

The first line creates a new Wikidata item, while the next ones add information about this compound. GDC-0853 is now also
[Q23304817](https://www.wikidata.org/wiki/Q23304817). The label I added manually afterwards. Note how the Bioclipse script found
the PubChem identifier, using the InChIKey. I also use this approach to add compounds to Wikidata that we have in
[WikiPathways](http://wikipathways.org/).
