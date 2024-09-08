---
layout: post
title:  "Programming in the Life Sciences #5: converting the results into HTML"
date:   2013-10-09
blogger-link: https://chem-bla-ics.blogspot.com/2013/10/programming-in-life-sciences-5.html
tags: pra3006 html javascript
image: /assets/images/mscpils1_output.png
---

Now that we have [the communication working](http://chem-bla-ics.blogspot.nl/2013/10/programming-in-life-sciences-4.html)
with the Open PHACTS LDA, it is time to make a nice GUI. I will not go into details, but we can use basic JavaScript to
iterate over the JSON results, and, for example, create a HTML table:

![](/assets/images/mscpils1_output.png)

In fact, I hooked in some HTML `onClick()` functionality so that when you click one of the compound names, you get further
details (under *Compound Details*), though that only outputs the ConceptWiki URI at this moment. A simple for-loop does
the heavy work:

```javascript
html = "<table>";
for (var i=0; i<response.length; i++) {
  html += "<tr>";
  html += "<td>";
  dataJSON = JSON.stringify(response[i]);
  //   dataJSON.replace(/"/g, "'");
  html += "Name: <span>" + response[i].prefLabel + "</span>";
  html += "</td>";
  html += "</tr>";
}
html += "</table>";
document.getElementById("table").innerHTML = html;
```

So, we're set to teach the students all the basics of programming: loops, variables, functions, etc.
