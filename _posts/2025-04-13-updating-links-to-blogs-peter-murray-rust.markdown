---
layout: post
title:  "Updating links to blogs: Peter Murray-Rust"
date:   2025-04-13
doi: 10.59350/mxfta-p1k55
tags: blog
image: /assets/images/pmr_internet_archive.png
---

One reason to [move my blog](https://chem-bla-ics.linkedchemistry.info/2023/07/27/archiving-and-updating-my-blog.html)
from Blogger to a git-backed repository is that I can update links but that the version history shows exactly what
change was made. I have been using three icons: when I can find a new URL for the website, I use&nbsp;<i class="fa-solid fa-recycle fa-xs"></i>;
when I cannot find a new URL, but the old URL is in the [Internet Archive](https://web.archive.org/),
I use a&nbsp;<i class="fa-solid fa-box-archive fa-xs"></i>;
finally, if I cannot find anything to replace the broken link, I use&nbsp;<i class="fa-solid fa-link-slash fa-xs"></i>.
For example, the blog of Rich Apodaca is [now archived](https://chem-bla-ics.linkedchemistry.info/2024/12/27/archiving_blogs.html),
and I have been updating the many links to his (still running) blog to use DOI links. That has the added benefit
of [making blog-to-blog citations more FAIR](https://chem-bla-ics.linkedchemistry.info/2024/12/30/fair-blog-to-blog-citations.html).

Now, another blog I link to a lot, is the blog by Peter Murray-Rust, which has run at various URLs, including
[http://wwmm.ch.cam.ac.uk/blogs/murrayrust/](http://wwmm.ch.cam.ac.uk/blogs/murrayrust/) and now at
[https://blogs.ch.cam.ac.uk/pmr/](https://blogs.ch.cam.ac.uk/pmr/). My posts on Blogger have a lot of links
to the `wwmm.ch.cam.ac.uk` domain, e.g. `http://wwmm.ch.cam.ac.uk/blogs/murrayrust/?p=845`. The problem  <!-- keep link -->
with these URLs is that they do not get properly rewritten and all point to a *European copyright: Cancel Articles 3, 11 and 13*
post from 2018.

But here too, the Internet Archive is helping. It gives me the opportunity to find what `p=845` pointed too.
Now, not all blog posts are archived and therefore sometimes need to figure out which posts it was using archived
posts just before or after the post I linked too. Of course, this only works because Peter's blog is still online
with all posts. First step is to list all pages using the old URL pattern in the archive, e.g. with
`https://web.archive.org/web/*/http://wwmm.ch.cam.ac.uk/blogs/murrayrust/*`. <!-- keep link -->
Here, the first `*` indicates `any date`, while the second `*` indicates `any URL that started with the preceding`.

This gives [a list of 1233 posts](https://web.archive.org/web/*/http://wwmm.ch.cam.ac.uk/blogs/murrayrust/*), <!-- keep link -->
which you can filter with the text box on the top right of the list, where I filtered
here for URLs with `p=`:

![](/assets/images/pmr_internet_archive.png)

However, if the blog post I am looking for is listed, it does not mean it actually has been archived. In the above
screenshot, note the `From` column, and that date needs to be from before the `wwmm.ch.cam.ac.uk` stopped being
used. For example, the following post has an Internet Archive, but after the move and the original content is
not visible, but a redirect message instead, here visible as a green date:

![](/assets/images/pmr_no_luck.png)

This way, I have been able to update various links already, not with a DOI and blog-to-blog citation as for
Rich's blog, but just with an updated link so that readers of these older posts actually end up on
the post I originally linked to, such as
[here](https://github.com/egonw/blog2/commit/d4c5e02c725ba799609e643f46389ea3b5266f6c#diff-863da47bd5bf4b33d3701c737854d2b3cd30a1802abaa225c78acac72d6d6f83L36-R38):

![](/assets/images/pmr_update.png)
