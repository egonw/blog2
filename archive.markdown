---
layout: page
title: Archive
permalink: /archive/
---

{% assign grouped_by_year = site.posts | group_by_exp: "post", "post.date | date: '%Y'" %}
{% for year in grouped_by_year %}
### {{ year.name }} [<i class="fa-solid fa-link" style="font-size: 70%"></i>]({{ '/archive/' | append: year.name | append: '/' | relative_url }})
  {% assign grouped_by_month = year.items | group_by_exp: "post", "post.date | date: '%m'" %}
  {% for month in grouped_by_month %}
#### {{ month.items.first.date | date: '%B' }} [<i class="fa-solid fa-link" style="font-size: 70%"></i>]({{ '/archive/' | append: year.name | append: '/' | append: month.name | append: '/' | relative_url }})
  {% for post in month.items %}* [{{ post.title | replace: "|", "\|" }}]({{ post.url | prepend: site.baseurl | prepend: site.url }})
  {% endfor %}
  {% endfor %}
{% endfor %}
