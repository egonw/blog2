---
layout: post
title:  "GitHub Tip: download commits as patches"
date:   2011-01-30
blogger-link: https://chem-bla-ics.blogspot.com/2011/01/github-tip-download-commits-as-patches.html
tags: github
image: assets/images/1000px-GitHub.svg.png
---

<img style="float: right;" src="/assets/images/1000px-GitHub.svg.png" width="200" />

Some time ago, the brilliant [GitHub](http://github.com/) people gave me the following tip. Rajarshi is
[lazy](https://sourceforge.net/tracker/index.php?func=detail&aid=3160093&group_id=20024&atid=120024#), and might
find it interesting. By appending `.patch` to the commit URL, a commit can easily be downloaded as patch. That way,
developers can easily download it with `wget` or `curl` and apply it locally with `git am`,
without having the fetch the full repository.

For example, Dmitry made this commit in his branch, having the URL
[https://github.com/dmak/cdk/commit/9b0478d50c7b5ca10f77fb01d89329db5fe80625](https://github.com/dmak/cdk/commit/9b0478d50c7b5ca10f77fb01d89329db5fe80625).
The patch for this commit can then be downloaded at this URL
[https://github.com/dmak/cdk/commit/9b0478d50c7b5ca10f77fb01d89329db5fe80625.patch](https://github.com/dmak/cdk/commit/9b0478d50c7b5ca10f77fb01d89329db5fe80625.patch).
