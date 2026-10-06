---
layout: post
title:  "Installing Oscar"
date:   2010-11-22 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2010/11/installing-oscar.html
doi: 10.59350/g30hd-nnd21
tags: oscar textmining
---

About half-way my Oscar project now. I blogged about the Oscar [Java API](http://chem-bla-ics.blogspot.com/2010/10/oscar4-java-api-chemical-name.html),
the [command line utility](http://chem-bla-ics.blogspot.com/2010/11/oscar4-command-line-utilities.html),
and the [Taverna plugin](http://chem-bla-ics.blogspot.com/2010/10/oscar-text-mining-in-taverna.html)
(all in development). Also, David Jessop joined in, boosting the refactoring.
The meeting with the [ChEBI](http://www.ebi.ac.uk/chebi/) team last week was
great too. We worked out details for the use cases, involving Oscar and Lezan's
[ChemicalTagger](http://www-ucc.ch.cam.ac.uk/products/software/chemicaltagger).

Here follow some install instructions to get going. Please give things a try,
even though we are under heavy development. You can monitor the stability of
the code via these Hudson pages for [oscar4](https://hudson.ch.cam.ac.uk/job/oscar4/),
[oscar4-cli](https://hudson.ch.cam.ac.uk/job/oscar4-cli/), [ChemicalTagger](https://hudson.ch.cam.ac.uk/job/ChemicalTagger/),
and [others](https://hudson.ch.cam.ac.uk/). This continuous building of software
should be set up for any scientific code.

**Requirements**
The follow the below instructions, you will need a working environment with
a tool to process [zip files](http://en.wikipedia.org/wiki/ZIP_%28file_format%29)
(or equivalent), [Java DK](http://en.wikipedia.org/wiki/Java_Development_Kit),
and [Maven](http://maven.apache.org/). Having wget makes things easier. Oh,
and you need a working internet connection.

The pattern is otherwise the same for all above tools. I will demonstrate the
process with oscar4-cli.

Ubuntu and Debian users can use:

```shell
sudo aptitude install unzip maven2 \\
  openjdk-6-jdk wget
```

**Downloading the source**
The source code for the above tools is all hosted on [BitBucket](http://bitbucket.org),
using the [Mercurial](http://mercurial.selenic.com/) version control system.
However, there is no need to worry about that, because BitBucket provides source
drops. At [this page](http://bitbucket.org/egonw/oscar4-cli/downloads) you can
download a .zip file for the command line utilities, which you can unzip with
your favorite tool.

If you have *wget* installed you could do from the command line:

```shell
wget http://bitbucket.org/egonw/oscar4-cli/get/tip.zip
unzip tip.zip
```

which downloads and unzips the latest version in the repository. (This is where
monitoring Hudson comes in; there you can check if there are failing unit tests.)

**Compiling the code**
With the source code locally installed, it is same for Maven to come into action.
Again, I have no clue how to do this on Windows (other than with Cygwin, which
every Windows users should have installed, if a virtual machine with a full
Linux is no option), but maven should run the '[assembly:single](http://maven.apache.org/plugins/maven-assembly-plugin/single-mojo.html)'
target. Or, from the command line:

```shell
cd oscar4-cli/
mvn assembly:assembly
cp target/oscar4-cli-4.0-SNAPSHOT-jar-with-dependencies.jar \\
  ./oscar4-cli-4.0-SNAPSHOT.jar
```

That should do: the created *oscar4-cli-4.0-SNAPSHOT.jar* can be used now to
run the [command line utilities](http://chem-bla-ics.blogspot.com/2010/11/oscar4-command-line-utilities.html).
Actually, it should also do fine for using the [Oscar4 Java API](ttp://chem-bla-ics.blogspot.com/2010/10/oscar4-java-api-chemical-name.html).

**Provide feedback**
We most welcome feedback, or any kind. Feature requests can be posted [here](http://sourceforge.net/tracker/?group_id=169991&atid=852565),
and bug reports [here](http://sourceforge.net/tracker/?group_id=169991&atid=852562).
You can also send email to the [oscar3-chem-developers](http://sourceforge.net/mailarchive/forum.php?forum_name=oscar3-chem-developers)
mailing list.

**Update**: *mvn assembly:assembly* should be used instead of *mvn assembly:single*.
