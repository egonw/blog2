---
layout: post
title:  "Invisible InChI's"
date:   2007-02-20
blogger-link: https://chem-bla-ics.blogspot.com/2007/02/invisible-inchis.html
tags: inchi
---

Some [InChI](http://www.iupac.org/inchi/)'s are short, such as that for methane: <span class="chem:inchi">InChI=1/CH4/h1H4</span>.
Others are long (think [crambin](http://chem-bla-ics.blogspot.com/2006/03/inchis-in-latex-and-cdk-news.html)), and you don't
want to show them inline. Or you just want to show them anyway, but still want the chemistry to be understood. Here come the
invisible InChI's.

## Alt text for images

One solution is to put the InChI as content of the @alt attribute of the HTML `<img>` element. This has the downside that it
has no explicit semantic meaning. For example, the [Molecule Of The Day](http://scienceblogs.com/moleculeoftheday/) blog is using
this approach. It's an excellent start, but not the solution.

## As Keyword

Another option is to put it in as keyword, in the HTML `<head>` element: `<meta name="keywords" content="InChI=1/CH4/h1H4">`.
But Google does not index this, so the use is restricted.

## Invisible text

The most promosing alternative, however, is to put it in using the `<span>` element, in combination with microformats or RDFa,
Like this: <span class="chem:inchi" style="font-size: 0%; visibility: hidden;">InChI=1/CH4/h1H4</span>.
It does not show up, does it? But it is really there, as you would see, if you have
[the special Greasemonkey](http://chem-bla-ics.blogspot.com/2006/12/chemistry-in-html-greasemonkey-again.html) installed.

This is the HTML code for this example:

```html
<span class="chem:inchi" style="font-size: 0%; visibility: hidden;">InChI=1/CH4/h1H4</span>
```

The `@style` attribute marks the text's visibility as hidden, and the font-size is set to 0%. It is important not to set it
to zero itself, because many web browsers do not interpret zero font size correctly, and take the default font size instead.

This should solve the standing problem that we would like to include the InChI's in our blogs, if it would just not be so
long and unreadable. Just hide it.
