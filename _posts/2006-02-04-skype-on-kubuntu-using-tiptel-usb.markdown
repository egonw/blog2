---
layout: post
title:  "Skype on Kubuntu using a Tiptel USB telephone"
date:   2006-02-04
blogger-link: https://chem-bla-ics.blogspot.com/2006/02/skype-on-kubuntu-using-tiptel-usb.html
tags: linux
---

Because I wanted to test internet telephony I downloaded [Skype](http://www.skype.com/) and tried to get it to work on my
[Kubuntu](http://www.kubuntu.org/) system. Unfortunately, the Skype version is only 1.2.0.18, and it does not work well with
`arts` :( That is, using `artsdsp` it crashes with segfaults whenever I start even a chat, let alone a phone call. This
could be worked around by disabling sound in my KDE session, and then the `/dev/dsp` is open again.

Better even, I bought a USB telephone yesterday: a reasonably cheap [Tiptel 115](http://www.tiptel.nl/), with
[Skype support](http://www.skypefoon.nl/skype_telefoon_info.php/products_id/126). Kubunty breezy recognized the USB device,
added a `/dev/dsp1` and after running `alsamixer` to raise the sound levels, it seems to work fine, though did not have an
actual phone call yet :) I enabled KDE sound again, which is in the first device, and Skype runs on the second.
No more segfaults it seems.
