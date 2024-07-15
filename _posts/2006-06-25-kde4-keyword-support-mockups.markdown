---
layout: post
title:  "KDE4 keyword support mockups"
date:   2006-06-25
blogger-link: https://chem-bla-ics.blogspot.com/2006/06/kde4-keyword-support-mockups.html
tags: kde strigi
image: /blog/assets/images/kfileXAttrSupport2.png
---

In reply to interesting comments to [my previous blog](http://chem-bla-ics.blogspot.com/2006/06/strigi-gets-kfile-plugin-support.html)
on [Strigi](http://www.vandenoever.info/software/strigi/) and xAttr support in [KDE](http://www.kde.org/)4, I would like to suggest
the following mockups, which I would find very useful. The deal with the ability to store keywords, for example, not but necessarily
using xAttr. I have no idea on how to implement these mockups, so any help or pointers are appreciated.

The first plot is an example of how these keyword markup could be used in KDE, other than searching itself. When showing the properties
of a directory in KDE, it would show an overview of hottest keywords for that directory, such as used on social bookmark website like
[Technorati](http://technorati.com/) too:

![](/blog/assets/images/kfileXAttrSupport.png)

This example shows that the keyword 'Strigi' was used much inside the index_files directory (they are not just the keywords given for
that directory, but a summary of the directory content!). Now, these keywords could be stored as xAttr, but in a database too. The
first requires a filesystem that supports xAttr, while the second requires a database daemon to be running. However, for speed
performance reasons this would be required anyway. Strigi indexes xAttr now (post 0.3.0 release), and basically allows both.

Independent of the chosen/prefered way to store keywords, these keywords can be edited from the Properties dialog:

![](/blog/assets/images/kfileXAttrSupport2.png)

Now comes the tricky part: though I would like to add this to KDE, I do not have the C++/KDE experience to actually do this.
I'm already happy that I was able to extend the Strigi with support for KDE's kfile architecture. Yes, the Strigi version in
SVN will index all metadata extractable with kfile plugins installed on the KDE installation.
