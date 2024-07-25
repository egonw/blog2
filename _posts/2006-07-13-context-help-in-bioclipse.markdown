---
layout: post
title:  "Context help in Bioclipse"
date:   2006-07-13
blogger-link: https://chem-bla-ics.blogspot.com/2006/07/context-help-in-bioclipse.html
tags: jmol bioclipse
image: /blog/assets/images/contextHelp.png
---

The [Eclipse](http://www.eclipse.org/) [Rich Client Platform (RCP)](http://wiki.eclipse.org/index.php/Rich_Client_Platform) is very powerfull,
and takes a lot of architectural things of your hand when developing a bio- and chemoinformatics GUIs. [Bioclipse](http://www.bioclipse.net/)
is based on it. One thing the RCP offers is a Help View which works with plain (X)HTML files, and one neat feature is the context help. It is
help shown in the Help View when one focused on a specific GUI element.

As an example, the below figure gives the context help for the JmolView in the [Jmol](http://www.jmol.org/) plugin
([bc_jmol](http://wiki.bioclipse.net/index.php?title=Jmol_plugin)) plugin for Bioclipse:

![](/blog/assets/images/contextHelp.png)

On the right side of the Jmol view (showing [1SPX](http://www.pdb.org/pdb/navbarsearch.do?newSearch=yes&isAuthorSearch=no&radioset=All&inputQuickSearch=1SPX))
is the Help View, showing the context help for the Jmol View pointing to the 'Jmol Script Commands Reference'.
