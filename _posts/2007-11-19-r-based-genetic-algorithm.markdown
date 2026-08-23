---
layout: post
title:  "An R-based genetic algorithm"
date:   2007-11-19
modified_date: 2025-02-15
doi: 10.59350/hfw6p-d6p02
blogger-link: https://chem-bla-ics.blogspot.com/2007/11/r-based-genetic-algorithm.html
tags: rstats chemometrics
cited-in: cito:usesMethodIn:10.1007/s10489-009-0203-x
---

During my PhD I wrote a simple but [effective genetic algorithm](http://cran.r-project.org/src/contrib/Descriptions/genalg.html) package for
[R](http://www.r-project.org/). Because there was a bug recently found, and there is interest in extending the functionality,
I have set up a [SourceForge](http://sourceforge.net/) project called
[genalg](http://sourceforge.net/projects/genalg).

The package provides GA support for binary and real-value chromosomes (and integer chromosomes is something that will
be added soon), and allows to use custom evaluation functions. Here is some example code:

```R
# optimize two values to match pi and sqrt(50)
evaluate <- function(string=c()) {
    returnVal = NA;
    if (length(string) == 2) {
        returnVal = abs(string[1]-pi) + abs(string[2]-sqrt(50));
    } else {
        stop("Expecting a chromosome of length 2!");
    }
    returnVal
}
monitor <- function(obj) {
    # plot the population
    xlim = c(obj$stringMin[1], obj$stringMax[1]);
    ylim = c(obj$stringMin[2], obj$stringMax[2]);
    plot(obj$population, xlim=xlim, ylim=ylim, xlab="pi", ylab="sqrt(50)");
}
rbga.results = rbga(c(1, 1), c(5, 10), monitorFunc=monitor,
    evalFunc=evaluate, verbose=TRUE, mutationChance=0.01)
plot(rbga.results)
plot(rbga.results, type="hist")
plot(rbga.results, type="vars")
```
