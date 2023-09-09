---
layout: post
title:  "Making BridgeDb Derby files with Groovy"
date:   2023-09-09
tags: groovy bridgedb
---

I just want to drop this here. There are various ways to make [BridgeDb](https://www.bridgedb.org/) identifier mapping files. Some of the tools
predate my joining the BiGCaT research group and the BridgeDb project, but this Groovy page is basically what we
have been using to create the metabolite identifier mapping databases:

```groovy
@Grab(group='org.bridgedb', module='org.bridgedb.bio', version='3.0.23')
@Grab(group='org.bridgedb', module='org.bridgedb.rdb.construct', version='3.0.23')

import java.text.SimpleDateFormat;
import java.util.Date;

import org.bridgedb.IDMapperException;
import org.bridgedb.DataSource;
import org.bridgedb.Xref;
import org.bridgedb.bio.DataSourceTxt;
import org.bridgedb.rdb.construct.DBConnector;
import org.bridgedb.rdb.construct.DataDerby;
import org.bridgedb.rdb.construct.GdbConstruct;
import org.bridgedb.rdb.construct.GdbConstructImpl4;

DataSourceTxt.init()

GdbConstruct database = GdbConstructImpl4.createInstance(
  "test", new DataDerby(), DBConnector.PROP_RECREATE
);
database.createGdbTables();
database.preInsert();

inchikeyDS = DataSource.getExistingBySystemCode("Ik")
lmDS = DataSource.getExistingBySystemCode("Lm")
swisslipidsDS = DataSource.getExistingBySystemCode("Sl")

String dateStr = new SimpleDateFormat("yyyyMMdd").format(new Date());
database.setInfo("BUILDDATE", dateStr);
database.setInfo("DATASOURCENAME", "LIPIDMAPS_SWISSLIPIDS");
database.setInfo("DATASOURCEVERSION", "LIPID_TEST");
database.setInfo("DATATYPE", "Metabolite");
database.setInfo("SERIES", "standard_metabolite");

ref1 = new Xref("YECLLIMZHNYFCK-RRNJGNTNSA-J", inchikeyDS, true);
ref2 = new Xref("LMFA07050035", lmDS, false);
database.addGene(ref1)
database.addGene(ref2)
database.addLink(ref1, ref1)
database.addLink(ref1, ref2)

ref3 = new Xref("SLM:000000493", swisslipidsDS, true);
database.addGene(ref3)
database.addLink(ref1, ref3)

database.commit();
database.finalize();
```

For the people who have worked with BridgeDb Java in the past, note the new SQL schema 4, as used by the
`GdbConstructImpl4`. This schema allows indicating of an identifiers is outdated/retired/etc. This is
actually the case for the `LMFA07050035` identifiers, and hence the `false` parameter in the `new Xref()`
call.
