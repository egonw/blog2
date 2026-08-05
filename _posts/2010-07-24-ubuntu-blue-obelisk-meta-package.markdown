---
layout: post
title:  "An Ubuntu Blue Obelisk meta package"
date:   2010-07-24
blogger-link: https://chem-bla-ics.blogspot.com/2010/07/ubuntu-blue-obelisk-meta-package.html
doi: 10.59350/421nq-ga745
tags: blue-obelisk linux
---

There was some talk recently about [Blue Obelisk](http://www.blueobelisk.org/) software available as [Ubuntu](http://www.ubuntu.com/) /
[Debian](http://www.debian.org/) packages. This morning I had trouble waking up, so hacked up a metapackage, so that you can now do:

```shell
sudo add-apt-repository [ppa:egonw](https://launchpad.net/~egonw/+archive/ppa)
sudo aptitude install blueobelisk
```

Currently, it installs BODR, Kalzium, Gnome Chemistry Utils, Chemical-MIME, [OpenBabel](http://www.openbabel.org/), and the
[CDK](http://cdk.sf.net/). Ideas, feature requests, patches, etc, welcome via [GitHub](http://github.com/egonw/blueobelisk.debian).
