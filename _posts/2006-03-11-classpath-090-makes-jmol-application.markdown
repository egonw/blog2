---
layout: post
title:  "Classpath 0.90 makes the Jmol application run"
date:   2006-03-11
blogger-link: https://chem-bla-ics.blogspot.com/2006/03/classpath-090-makes-jmol-application.html
tags: jmol inchikey:SLMFWJQZLPEDDU-UHFFFAOYSA-N
---

A few days back, [Classpath 0.90](http://www.gnu.org/software/classpath/announce/20060306.html) was released, the first release after the 0.20 release. Earlier Classpath releases
[could run the rendering engine <i class="fa-solid fa-recycle fa-xs"></i>](/blog/2005/11/27/open-source-swing-jmol-renderer-runs.html),
but [running the application failed so far <i class="fa-solid fa-recycle fa-xs"></i>](/blog/2005/11/18/goal-live-chemblaics-cd.html).

Today it hit Debian unstable, so upgrade my sid32 chroot and had [Cacao](http://www.cacaojvm.org/) run Jmol.
I had some memory issues opening a small molecule (4-methyl-2-pentyne),
and the rendering speed was a factor 100 or so slower than Sun's JVM, but it runs!

Using the command `cacao -Xmx512M -jar Jmol.jar triplebond.mol` I got results.

Note the exceptions copied to the console. Many thanx to the Classpath team!

The stacktrace:

```shell
The full stack trace:

java.lang.IllegalArgumentException: width<=0 height<=0
at java.awt.image.SampleModel.<init> (SampleModel.java:63)
at java.awt.image.SinglePixelPackedSampleModel.<init> (SinglePixelPackedSampleModel.java:61)
at java.awt.image.SinglePixelPackedSampleModel.<init> (SinglePixelPackedSampleModel.java:55)
at org.jmol.g3d.Swing3D.allocateImage (Swing3D.java:65)
at org.jmol.g3d.Platform3D.allocateBuffers (Platform3D.java:102)
at org.jmol.g3d.Graphics3D.beginRendering (Graphics3D.java:697)
at org.jmol.viewer.Viewer.render1 (Viewer.java:1840)
at org.jmol.viewer.Viewer.renderScreenImage (Viewer.java:1798)
at org.openscience.jmol.app.DisplayPanel.paint (DisplayPanel.java:100)
at javax.swing.JComponent.paintChildren (JComponent.java:1659)
at javax.swing.JComponent.paint (JComponent.java:1564)
at javax.swing.JComponent.paintChildren (JComponent.java:1659)
at javax.swing.JComponent.paint (JComponent.java:1564)
at javax.swing.JComponent.paintChildren (JComponent.java:1659)
at javax.swing.JComponent.paint (JComponent.java:1564)
at javax.swing.JComponent.paintChildren (JComponent.java:1659)
at javax.swing.JComponent.paint (JComponent.java:1564)
at javax.swing.JComponent.paintChildren (JComponent.java:1659)
at javax.swing.JComponent.paint (JComponent.java:1564)
at javax.swing.JLayeredPane.paint (JLayeredPane.java:647)
at javax.swing.JComponent.paintChildren (JComponent.java:1659)
at javax.swing.JComponent.paint (JComponent.java:1564)
at javax.swing.JComponent.paintDoubleBuffered (JComponent.java:1782)
at javax.swing.JComponent.paint (JComponent.java:1555)
at java.awt.Container$GfxPaintVisitor.visit (Container.java:1888)
at java.awt.Container.visitChild (Container.java:1703)
at java.awt.Container.visitChildren (Container.java:1674)
at java.awt.Container.paint (Container.java:770)
at gnu.java.awt.peer.gtk.GtkWindowPeer.handleEvent (GtkWindowPeer.java:268)
at java.awt.Component.dispatchEventImpl (Component.java:4968)
at java.awt.Container.dispatchEventImpl (Container.java:1723)
at java.awt.Window.dispatchEventImpl (Window.java:626)
at java.awt.Component.dispatchEvent (Component.java:2320)
at java.awt.EventQueue.dispatchEvent (EventQueue.java:474)
at java.awt.EventDispatchThread.run (EventDispatchThread.java:60)
at java.lang.VMThread.run (VMThread.java:121)
```
