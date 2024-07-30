---
layout: post
title:  "Classpath 0.92 has been released"
date:   2006-08-14
blogger-link: https://chem-bla-ics.blogspot.com/2006/08/classpath-092-has-been-released.html
tags: java cdk jchempaint taverna
---

[Bling! Bling!](http://gnu.wildebeest.org/diary/index.php?p=163). Mark Wielaard announced the [GNU Classpath 0.92](http://savannah.gnu.org/forum/forum.php?forum_id=4573)
release, with the following changes: *an alternative awt peer implementation based on Escher that uses the X protocol directly. Various ImageIO providers for png,
gif and bmp images. Support for reading and writing midi files and reading .au and .wav files have been added. Various tools and support classes have been added
for jar, native2ascii, serialver, keytool, jarsigner. A GConf based util.peers backend has been added. Support for using alternative root certificate authorities
with the security and crypto packages. Start of javax.management and runtime lang.managment runtime support. NIO channels now support scatter-gather operations.*

IMAGE LOST

This means new items on my TODO list: remove the dust from the [CDK based test suite](http://chem-bla-ics.blogspot.com/2006/02/test-suite-for-free-open-source-jvms.html),
test if [Jmol](http://chem-bla-ics.blogspot.com/2006/03/classpath-090-makes-jmol-application.html),
[JChemPaint](http://chem-bla-ics.blogspot.com/2005/11/open-source-swing-jchempaint-runs.html), [Taverna](http://chem-bla-ics.blogspot.com/2006/05/taverna-runs-with-classpath-091.html)
still work, and report the outcome on the [Classpath website](http://developer.classpath.org/mediation/FreeSwingTestApps). I wonder how the Cairo
and Escher patches for AWT and Swing affect my favorite chemblaics tools.

BTW, that the Classpath team appreciates such testing efforts is clear from the foto in the 'Bling! Bling!' blog by Mark mentioned above.
