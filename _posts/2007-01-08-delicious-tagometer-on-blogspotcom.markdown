---
layout: post
title:  "The del.icio.us tagometer on Blogspot.com"
date:   2007-01-08
blogger-link: https://chem-bla-ics.blogspot.com/2007/01/delicious-tagometer-on-blogspotcom.html
tags: blog
---

Some days ago I read about the [del.icio.us](http://del.icio.us/)
[tagometer](http://blog.del.icio.us/blog/2006/12/the_new_and_tag.html#more), which
is basically sort of save as I had before on this blog. The tagometer, however,
shows some interesting properties of the blog items, like the number of people who
bookmarked the item, and what tags they used. The
[tagometer help](http://del.icio.us/help/tagometer) does not show how it can be
integrated with [blogspot.com](http://www.blogspot.com/) (where this blog is hosted),
but with the source from [0xDECAFBAD](http://decafbad.com/blog/) I got it working.
These blogs are not yet moved to the new blogger.com system (so, www.blogger.com,
not www2.blogger.com), so the below principally applies to the older system.

First you need to adapt this blob to the `<head>` of the template:

```html
<$BlogMetaData$>

<!-- del.icio.us badge stuff -->
<script type="text/javascript">
  if (typeof window.Delicious == "undefined") window.Delicious = {};
  Delicious.BLOGBADGE_MANUAL_MODE = true;
</script>
<link id="delicious-blogbadge-css" 
      href="http://images.del.icio.us/static/css/blogbadge.css"
      rel="stylesheet" type="text/css" />
<script src="http://images.del.icio.us/static/js/blogbadge.js"></script>

</head>
```

where `<$BlogMetaData$>` and `</head>` should already be present in the template.

Further down the template, you need to add a bit in the `<div class="blogPost">`
section, just after the last `<div class="byline">` element in your template.
The bits you add use blogger variables, so make sure to get it right:

```html
<div class="delicious-blogbadge-line" id="badge-<$BlogItemNumber$>">
  <script type="text/javascript">
    Delicious.BlogBadge.register('badge-<$BlogItemNumber$>', '<$BlogItemPermalinkURL$>', "<$BlogItemTitle$>");
  </script>
</div>
```

Note the quotes of the third argument. Do this properly, the quotes in the output
of `<$BlogItemTitle$>` should be escaped, so that it does not interfere with the
quotes of the `register()` JavaScript call. Can anyone tell me how to do that
in JavaScript?
