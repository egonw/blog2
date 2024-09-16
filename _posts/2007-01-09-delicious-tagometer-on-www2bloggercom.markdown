---
layout: post
title:  "The del.icio.us tagometer on www2.blogger.com"
date:   2007-01-09
blogger-link: https://chem-bla-ics.blogspot.com/2007/01/delicious-tagometer-on-www2bloggercom.html
tags: blog
---

Yesterday I blogged about [how to include the new del.icio.us tagometer on a
www.blogger.com blog](http://chem-bla-ics.blogspot.com/2007/01/delicious-tagometer-on-blogspotcom.html),
just like [Improbulus did last December](http://consumingexperience.blogspot.com/2006/12/delicious-tagometer-howto-manual-mode.html)
as I discovered later. [Felix](http://chemical-quantum-images.blogspot.com/)
asked me how it could be done on the new www2.blogger.com template system. Well,
here it is.

Like with the old blogger.com template system, you need to add this to the header,
just before the `</head>` end tag:

```html
<!-- del.icio.us badge stuff -->
<script type="text/javascript">
  if (typeof window.Delicious == "undefined") window.Delicious = {};
  Delicious.BLOGBADGE_MANUAL_MODE = true;
</script>
<link id="delicious-blogbadge-css" 
      href="http://images.del.icio.us/static/css/blogbadge.css"
      rel="stylesheet" type="text/css" />
<script src="http://images.del.icio.us/static/js/blogbadge.js" />
```

And, for the blog entry template bit, look for this the `<p>` element of class
'post-footer-line post-footer-line-3', which was empty for me. Add this `<div>`
to that:

```html
<p class='post-footer-line post-footer-line-3'>
  <div class="delicious-blogbadge-line" expr:id="data:post.id">
    <script type="text/javascript">
      Delicious.BlogBadge.register('<data:post.id/>', '<data:post.url/>', '<data:post.title/>');
    </script>
  </div>
</p>
```

To get at the right place, with the full template XHTML content, go to your
[www2.blogger.com/home](http://www2.blogger.com/home) homepage, click the
Template tab, then pick the *Edit HTML* option, and make sure to enable the
**Expand Widget Templates** option.
