---
layout: post
title:  "Kubuntu, XRandR and TV-OUT"
date:   2006-01-03
blogger-link: https://chem-bla-ics.blogspot.com/2006/01/kubuntu-xrandr-and-tv-out.html
tags: kde linux
---

One of the things I had not fully figured out up to today, was how to configure my [Kubuntu](http://www.kubuntu.org/) system to easily view DVDs on our TV,
using my [NVIDIA](http://www.nvidia.com/)'s TV-OUT. I've seen xorg.conf files that define a X11 server for the monitor and a second for the TV, and files
that use TwinView. Now, I did not really like the way first option worked, so tried the second.

Unfortunately, I had to reconfigure and restart my X11 each time my kids wanted to see [Bob the Builder <i class="fa-solid fa-recycle fa-xs"></i>](https://nl.wikipedia.org/wiki/Bob_de_Bouwer).
I already knew about [XRandR](http://wiki.x.org/X11R6.8.1/doc/Xrandr.3.html), and today finally had a look at it again, and got it to work without much
trouble this time. (Lesson: if something does not work, let it rest and try again half a year later.)

For the googlers, this is what my [xorg.conf](http://wiki.x.org/X11R6.8.0/doc/xorg.conf.5.html) `Screen` section now looks like:

```
Section "Screen"
 Identifier "Default Screen"
 Device  "NVIDIA Corporation NV18 [GeForce4 MX 4000 AGP 8x]"
 Monitor  "Hansol H711"
 DefaultDepth 24
 Option "TwinView" "on"
 Option "TwinViewOrientation" "clone"
 Option "SecondMonitorHorizSync"     "30-50"
 Option "SecondMonitorVertRefresh"   "60"
 Option  "MetaModes" "1280x1024,1280x1024;1024x768,1024x768"
 Option "TVStandard" "PAL-B"
 Option "TVOutFormat" "SVIDEO"
 Option "ConnectedMonitor" "crt, tv"
 SubSection "Display"
  Depth  24
  Modes  "1280x1024" "1024x768" "832x624" "800x600" "720x400" "640x480"
 EndSubSection
EndSection
```

And now, to switch resolution, I can just do:

```shell
sudo xrandr -s 1
# watch DVD
sudo xrandr -s 0
```

PS. Happy new year!
