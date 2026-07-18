---
layout: post
title:  "Updated my blog template"
date:   2010-03-27
blogger-link: https://chem-bla-ics.blogspot.com/2010/03/updated-my-blog-template.html
doi: 10.59350/5jy73-b2a88
tags: blog
image: /assets/images/bloggerPages.png
---

I noted today that [blogger.com](http://blogger.com/), the blog service provider I am using, had [new templates](http://bloggerindraft.blogspot.com/2010/03/blogger-template-designer.html).
I was getting tired of the old one anyway, so tried the simple template using the usual orange: quite satisfactory! At least, beats buying a book like this
[Blogger: Beyond the Basics](http://www.amazon.com/Blogger-Customize-templates-advertising-Technologies/dp/184719317X?ie=UTF8&link_code=btl&camp=213689&creative=392969).
Don't have time for that.

I tweaked the template a bit. For example, the default labels widget does not allow me to limit the shown labels to those with at least X uses. So, I hacked the HTML of the widget and added an extra if statement:

```xml
<b:loop values='data:labels' var='label'>
  <b:if cond='data:label.count > 6'>
    <span expr:class='"label-size label-size-" + data:label.cssSize'>
      <b:if cond='data:blog.url == data:label.url'>
        <span expr:dir='data:blog.languageDirection'>
          <data:label.name/>
        </span>
      <b:else/>
        <a expr:dir='data:blog.languageDirection'
           expr:href='data:label.url'>
          <data:label.name/>
        </a>
      </b:if>
      <b:if cond='data:showFreqNumbers'>
        <span class='label-count' dir='ltr'>
          (<data:label.count/>)
        </span>
      </b:if>
    </span>
  </b:if>
</b:loop>
```

## Blogger.com Pages
I also move around some element, and also nice is the [new Pages concept](http://buzz.blogger.com/2010/02/create-pages-in-blogger.html).
I wish I could hide the side bar on these pages, but the currently fairly happy with the ability to embed my
[egonw.github.com](http://egonw.github.com/) homepage:

![](/assets/images/bloggerPages.png)

## Internet Explorer 6 EOL
The new template does not work with Internet Explorer 6.0. Honestly, I see no reason why you would like to run that browser anyway,
but now you no longer can use it to read my blog. Just upgrade, and complain with your IT department if you cannot do it yourself.
There are not so many of you, though. Only 18.95% uses Internet Explorer, of which about 20% still uses 6.0:

![](/assets/images/ie6.png)

Actually, of the 73 visits with IE6 in the past 30 days, only 12 were hits of regular visitors. So, could I please ask this one visitor
to email me offline if upgrading is not an option?
