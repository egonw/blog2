---
layout: post
title:  "QSPR modeling with signatures"
date:   2010-06-20
blogger-link: https://chem-bla-ics.blogspot.com/2010/06/qspr-modeling-with-signatures.html
doi: 10.59350/8d6w8-avm05
tags: cdk chemometrics justdoi:10.1021/ci020345w doi:10.1021/ci050282s
image: /blog/assets/images/signaturePrediction.png
---

I had to dig deep to find posts on QSAR modeling. There are quite a few on [QSAR in Bioclipse](http://chem-bla-ics.blogspot.com/search?q=qsar+bioclipse),
but that focuses on the descriptor calculation. In a quick scan, I could only spot two modeling posts:

* [The CDK/Metabolomics/Chemometrics Unconference results](http://chem-bla-ics.blogspot.com/2008/04/cdkmetabolomicschemometrics.html)
* [When to stop including QSAR model variables...](http://chem-bla-ics.blogspot.com/2005/11/when-to-stop-including-qsar-model.html)

Given the prominent place [QSAR has in my thesis](http://chem-bla-ics.blogspot.com/2008/03/todo-april-2nd-defend-my-phd-work.html),
this is somewhat surprising. Anyway, here is some more QSAR modeling talk.

[Gilleain](http://gilleain.blogspot.com/) [implemented](http://www.blogger.com/github.com/gilleain/signatures) the signature descriptors developed by Faulon et al.
(see doi:[10.1021/ci020345w](https://doi.org/10.1021/ci020345w); I [mentioned the paper in 2006](http://chem-bla-ics.blogspot.com/2006/02/novel-qsar-and-qspr-descriptors_24.html)),
and the [CDK patch](http://sourceforge.net/tracker/?func=detail&aid=3017759&group_id=20024&atid=320024) is currently being reviewed.
With some transformations, the atomic signatures for a molecule can be transformed into a fixed-length numerical representation:
`[70:1, 54:1, 23:1, 22:1, 9:9, 45:2]`. This string means that atomic signature 70 occurs once in this molecule and signature 9 occurs
nine times. At this moment, I am not yet concerned about the actual signature, but just checking how well these signature can be used
in QSPR modeling.

[Rajarshi](http://blog.rguha.net/)'s [fingerprint](http://cran.r-project.org/web/packages/fingerprint/index.html) code provides a good
template to parse this into a X matrix in [R](http://www.r-project.org/):

For my test case, I have used the boiling point data I used in my thesis paper *On the Use of 1H and 13C 1D NMR Spectra as QSPR Descriptors*
(see doi:[10.1021/ci050282s](https://doi.org/10.1021/ci050282s)). Some of this data is actually [available from ChemSpider](http://www.chemspider.com/blog/gathering-physicochemical-data-onto-chemspider.html),
but I do not think I ever uploaded the boiling point data. This constitutes a data set with 277 molecules, and my paper provides
some reference model quality statistics; that way, I have something to compare against. Moreover, I can use my previous scripts
to do the PLS modeling (there are many [tutorials online](http://www.google.se/search?q=tutorial+partial+least+squares), but you
can always buy an expensive book like the one shown on the right, if you really have to), (10-fold) cross-validation (CV), and
5 repeats of random sampling.

I strongly suggest people interested in statistical modeling to read this
[interesting post from Noel](http://baoilleach.blogspot.com/2010/06/non-random-method-to-improve-your-qsar.html): whatever test
set sampling method you use, you ***must*** do some repeats to learn about the sensitivity of your modeling approach to changes
in the data set. Depending on the actual sampling approach, you might see different sizes of variance, but until you measure it,
you will not know. For my application, these are the numbers:

```R
# source("pls.R")
Read 277 items
   rank=66     LV=42     R2=0.987     Q2=0.921  RMSEP=31.37
   rank=66     LV=42     R2=0.983     Q2=0.924  RMSEP=12.405
   rank=65     LV=42     R2=0.985     Q2=0.949  RMSEP=38.503
   rank=63     LV=42     R2=0.983     Q2=0.948  RMSEP=36.981
   rank=65     LV=42     R2=0.986     Q2=0.923  RMSEP=21.49
   rank=64     LV=42     R2=0.983     Q2=0.91  RMSEP=17.759
   rank=64     LV=42     R2=0.983     Q2=0.921  RMSEP=17.062
   rank=66     LV=42     R2=0.986     Q2=0.94  RMSEP=40.311
   rank=66     LV=42     R2=0.982     Q2=0.927  RMSEP=13
   rank=68     LV=42     R2=0.986     Q2=0.929  RMSEP=16.23
```

I know 42 is the answer to the universe, but 42 latent variables (LVs)?!? Well, it's just a start. A more accurate number of LVs
seems to be around 15, but my script had to make the transition from the old pls.pcr package to the newer pls package. And I have
yet to discover how I can get the new package to return me the lowest number of LVs for which the CV statistic is no longer
significantly different from the best (see my paper how that works). Actually, I have set the maximum LVs to consider to 1/5th of
the number of objects (which is about the accepted ratio in the QSAR community); otherwise, it would have happily increased.

However, the five repeats nicely show the variance in the quality statistics, R², Q², and root mean square error of prediction
(RMSEP). From the numbers, a model with Q² = 0.94 is **not** better than one with Q² = 0.93 (and I have seen the variance quite some
larger). Bottom line: just measure that variability, and put it in the publication, will you??

Anyway, what we all have been waiting for: the prediction results visualized (in black the CV predictions; in red the test set
predictions):

![](/blog/assets/images/signaturePrediction.png)

Well, there is still much work to do, and you can expect the result to get better. Part of statistical modeling is to find
the source of variance, and I have yet to explore a few of them. For example, what are the effects of:

* creating signature from the hydrogen-depleted graph
* effect of tautomerism (see [this special issue](http://www.springerlink.com/content/l3p3t7066645/?p=bff6cd9b91bd40c59aa0d7afe11cf78a&pi=0))
* effect of the height of the signature

And there are so many other things I like to do. But this will do for now.
