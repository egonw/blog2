---
layout: post
title:  "GitToDo Install Guide #1: the command line utilities"
date:   2011-01-22
blogger-link: https://chem-bla-ics.blogspot.com/2011/01/gittodo-install-guide-1-command-line.html
doi: 10.59350/4s8yg-wa197
tags:
---

Some years ago I was in need of a todo list tool. Of course, the requirements
were simple: distributed, version controlled, command line support (I must be
able to access it with minimal requirements). I also [hooked it up](http://chem-bla-ics.blogspot.com/2008/10/gittodo-support-for-freemind-graphical.html)
with the [Freemind](http://freemind.sourceforge.net/wiki/index.php/Main_Page)
mindmapping tool. I am in the process of installing it on my new laptop, so
thought a walk-through might be useful.

First thing to do is to get a copy of the [source code](https://github.com/egonw/gtd)
(sorry, no binaries yet).Because we are compiling from source we have to install
some utilities (using Debian/Ubuntu formalism; tune to your platform):

```shell
sudo aptitude install openjdk-6-jdk git ant
```

We also need to install Java libraries used by GitToDo:

```shell
sudo aptitude install libcommons-cli-java
```

Then, we are ready to download the source:

```shell
git clone git://github.com/egonw/gtd.git
```

The source for the command line utilities is found in the com.github.gittodo,
which is in fact an Eclipse project too:

```shell
cd gtd
cd com.github.gittodo
```

The [README](https://github.com/egonw/gtd/blob/master/com.github.gittodo/README)
file in this folder explains how to continue, which is first to compile the
code with [Ant](http://ant.sf.net). We first need to tell Ant where the dependencies
are found, for which we use a *.properties* file:

```shell
cp ant.properties.template ant.properties
nano ant.properties
```

The template properties are written for Debian/Ubuntu systems, but you can tune
it to your likes.

The compiling itself is then as simple as any project using Ant:

```shell
ant clean make
sudo ant install
```

We now have our command line utilities installed. However, there is one last
step left, or otherwise you get an error message like this:

```shell
gtd-list-items
java.io.FileNotFoundException: /home/egonw/.gtdrc (No such file or directory)
```

We now need to set up a git repository at a convenient place and let GitToDo
know about it. We create the git repository with (I have it in *$HOME/var/Projects/hg*):

```shell
cd $HOME/var/Projects/hg
mkdir gtdrepos
cd gtdrepos
git init
git add .
```

And we edit the $HOME/.gtdrc file to point it to this new repository, so that:

```shell
cat ~/.gtdrc
Repository=/home/egonw/var/gtdrepos
```

Now we are ready to add a first todo item:

```shell
gtd-create-item Install GitTodo-Freemind and the GitToDo GUI.
gtd-list-items
```
