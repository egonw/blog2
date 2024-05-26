---
layout: post
title:  "CIA statistics for Blue Obelisk"
date:   2005-10-17
modified_date: 2023-07-27
blogger-link: https://chem-bla-ics.blogspot.com/2005/10/cia-statistics-for-blue-obelisk.html
tags: blue-obelisk
doi: 10.59350/f4370-9cz05
---

I have just enabled [CIA <i class="fa-solid fa-box-archive fa-xs"></i>](https://web.archive.org/web/20051024075530/http://cia.navi.cx/) statistics for the
[Blue Obelisk SVN <i class="fa-solid fa-box-archive fa-xs"></i>](https://web.archive.org/web/20060422193559/http://www.blueobelisk.org/repos/blueobelisk/):
[/stats/project/cdk/blueobelisk  <i class="fa-solid fa-link-slash fa-xs"></i>](http://cia.navi.cx/stats/project/cdk/blueobelisk).

It's done by using the [ciabot_svn.py <i class="fa-solid fa-box-archive fa-xs"></i>](https://web.archive.org/web/20050924050012/http://cia.navi.cx/doc/clients)
client script and hooked into the `$REPOS/hooks/post-commit` hook on the SVN server. The client script is slightly hacked to hard code the module name, which
otherwise did not show up on the [chat channel](irc://irc.freenode.net/#cdk).
