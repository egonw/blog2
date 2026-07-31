---
layout: post
title:  "Setting up a local Semantic MediaWiki with RDFIO and SPARQL support"
date:   2010-07-17
blogger-link: https://chem-bla-ics.blogspot.com/2010/07/setting-up-local-semantic-wiki-with.html
doi: 10.59350/ms1t8-8zm32
tags: rdf sparql wiki bio2rdf bioclipse
image: /blog/assets/images/rdfImport.png
---


My now former student Samuel is doing a really cool [Google Summer of Code](http://en.wikipedia.org/wiki/Google_Summer_of_Code)
project on import and export of [RDF](http://chem-bla-ics.blogspot.com/search?q=RDF) from a
[Semantic MediaWiki](http://semantic-mediawiki.org/) server. His [screencast](http://saml.rilspace.org/screencast-rdf-import-and-sparql-update-in-semantic-mediawiki)
of today shows very nicely where things are going!

So, time to get something installed on my [Ubuntu](http://www.ubuntu.com/) system, based on Samuel description here:

1. `sudo aptitude install mediawiki-extensions php-apc imagemagick texlive-latex-base gs-gpl cjk-latex`
2. configure MediaWiki
    1. `zcat /usr/share/doc/mediawiki/README.Debian.gz | more`
    2. follow instructions on [http://www.mediawiki.org/wiki/Manual:Installing_Mediawiki_on_Ubuntu_10.04](http://www.mediawiki.org/wiki/Manual:Installing_Mediawiki_on_Ubuntu_10.04)
    3. create a MySQL account as described [here](http://techpad.co.uk/content.php?sid=89)
    4. do config stuff at [http://localhost/mediawiki/config/index.php](http://localhost/mediawiki/config/index.php)
3. set up a save place for local checkouts for MediaWiki extensions
    1. `sudo mkdir -p /usr/local/lib/mediawiki/extensions`
    2. `sudo chown egonw:egonw -R /usr/local/lib/mediawiki`
4. configure Semantic MediaWiki
    1. `cd /usr/local/lib/mediawiki/extensions`
    2. `svn checkout http://svn.wikimedia.org/svnroot/mediawiki/trunk/extensions/SemanticMediaWiki/`
    3. `cd /var/lib/mediawiki/extensions`
    4. `sudo ln -s /usr/local/lib/mediawiki/extensions/SemanticMediaWiki`
    5. `sudo nano /var/lib/mediawiki/LocalSettings.php`
        1. add: `include_once("/var/lib/mediawiki/extensions/SemanticMediaWiki/SemanticMediaWiki.php");`
        2. add: `enableSemantics('localhost');`
        3. add: `$smwgShowFactbox= SMW_FACTBOX_NONEMPTY;`
    6. visit [http://localhost/mediawiki/indSpecial:SMWAdminSpecial:SMWAdminex.php/Special:SMWAdmin](http://localhost/mediawiki/indSpecial:SMWAdminSpecial:SMWAdminex.php/Special:SMWAdmin)

Next step is to install Samuel's extension in its requirements:

1. set up the required extensions SMWWriter and POM:
    1. `cd /usr/local/lib/mediawiki/extensions`
    2. `svn checkout http://svn.wikimedia.org/svnroot/mediawiki/trunk/extensions/SMWWriter/`
    3. `svn checkout http://svn.wikimedia.org/svnroot/mediawiki/trunk/extensions/PageObjectModel/`
    4. `cd /var/lib/mediawiki/extensions`
    5. `sudo ln -s /usr/local/lib/mediawiki/extensions/SMWWriter`
    6. `sudo ln -s /usr/local/lib/mediawiki/extensions/PageObjectModel/`
2. apply the patch (where is it filed upstream?)
    1. `cd SMWWriter`
    2. `wget http://saml.rilspace.com/smwwriter-fixesfor-rdfio-20100716-r2.patch`
    3. `patch -p0 < smwwriter-fixesfor-rdfio-20100716-r2.patch`
3. set up the RDFIO work from Samuel
    1. `cd /usr/local/lib/mediawiki/extensions`
    2. `mkdir RDFIO`
    3. `cd RDFIO`
    4. `svn checkout http://smwrdfio.googlecode.com/svn/trunk/ .`
    5. `sudo nano /var/lib/mediawiki/LocalSettings.php`
        1. and add the RDFIO blob given on Samuel's [Install page](http://code.google.com/p/smwrdfio/wiki/InstallAll)
4. install ARC2
    1. `cd /usr/local/lib/mediawiki/extensions/SemanticMediaWiki/libs`
    2. `wget http://code.semsol.org/source/arc.tar.gz`
    3. `tar zxvf arc.tar.gz`
5. install the RDFIO pages onto the main page for easy access, add:
    1. `[[Special:ARC2Admin|ARC2Admin]]`
    2. `[[Special:RDFImport|RDFImport]]`
    3. `[[Special:SPARQLEndpoint|SPARQLEndpoint]]`

That's it. Not quite the 5 minutes that Samuel promised me, but I'm happy to have this available for my conference
tour next month! I installed the default RDF, and got the nice default wiki page to which I can now start adding
manual annotation:

![](/blog/assets/images/rdfImport.png)

If you are wondering about the use case, this RDF import is ideal for building up knowledge bases, as detailed in my
[Critical mass for Open Notebook Science wikis by prepopulation with RDF data](http://chem-bla-ics.blogspot.com/2010/06/critical-mass-for-open-notebook-science.html)
post last month. Just aggregate the info on the web you can find (yes, that's another story), put it in your wiki
and complement it with your local knowledge, import into [Bioclipse](http://www.bioclipse.net/),
and run your analyses to verify your hypotheses!

Thanx to [Samuel](http://saml.rilspace.org/) for this really great work!
