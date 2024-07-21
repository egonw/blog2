---
layout: post
title:  "Machine crash; SVN went along"
date:   2005-11-23
modified_date: 2023-08-02
blogger-link: https://chem-bla-ics.blogspot.com/2005/11/machine-crash-svn-went-along.html
tags: svn
doi: 10.59350/bzqem-cqy33
---

Doesn't happen often, but my machine crashed two hours ago. Not a big deal, because I have my important files in SVN. Oh wait, SVN had a commit
in progress during the crash. So, `svn recover`. Mmmm... doesn't work either. OK, SVN FAQ: try `db_recover`. That worked. No, it did not:
`svn commit` still not working for the files I was trying to commit. Fortunately, I make regular SVN db backups so I created a brand new
SVN repository from scratch and recovered the back up. That worked. Really.
