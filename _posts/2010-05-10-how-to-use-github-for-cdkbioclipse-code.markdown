---
layout: post
title:  "How to use GitHub for [CDK|Bioclipse] code review"
date:   2010-05-10 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2010/05/how-to-use-github-for-cdkbioclipse-code.html
doi: 10.59350/nfcyx-jxj82
tags: cdk bioclipe github
image: /blog/assets/images/codeReview6.png
---

Triggered by posts in the past [three](http://chem-bla-ics.blogspot.com/2010/05/web-20-technologies-in-student.html)
[days](http://chem-bla-ics.blogspot.com/2010/05/github-simplifies-code-review-and.html), I though about writing up a short
tutorial on how to perform code review for existing code on [GitHub](http://www.github.com/). Therefore, this applied to
[CDK](http://cdk.sf.net/) and [Bioclipse](http://www.bioclipse.net/) source code, many but will work for any project hosted
in GitHub. Even if it is not, you could consider putting up a copy there yourself. This example will demonstrate the
procedure on CDK functionality in Bioclipse in the [bioclipse.cheminformatics](http://github.com/egonw/bioclipse.cheminformatics/)
repository.

*Click on the images to get a higher resolution version.*

## Step 1: find the class you want to review

Use the GitHub web interface to browse your way towards the source code of the class you want to review. For example,
the [SmartsMatchingHelper.java](http://github.com/egonw/bioclipse.cheminformatics/blob/master/plugins/net.bioclipse.cdk.smartsmatching/src/net/bioclipse/cdk/smartsmatching/SmartsMatchingHelper.java):

![](/blog/assets/images/codeReview1.png)

## Step 2: identify something you like to comment on

Next step is to perform some code reviewing. For example, we might want to ask something about how parseProperty() works:

![](/blog/assets/images/codeReview2.png)

Now, this page on GitHub does not provide the means to leave comments; instead, you comment on commits.

## Step 3: find the last commit that touched the line you like to comment on

Git has a [blame option](http://ftp.sunet.se/pub//Linux/kernel.org/software/scm/git/docs/git-blame.html) (also called annotate)
which will show you for each line who last changed that line. The GitHub web page makes this functionality available with the
'blame' link just above the first line of the source code:

![](/blog/assets/images/codeReview3.png)

This link will lead us to a page with a new column on the left side showing commit hashes, name of the commit author,
and the first few characters of the commit message. For example, the
[web page](http://github.com/egonw/bioclipse.cheminformatics/blame/master/plugins/net.bioclipse.cdk.smartsmatching/src/net/bioclipse/cdk/smartsmatching/SmartsMatchingHelper.java)
bits relevant to code we want to comment on, looks like:

![](/blog/assets/images/codeReview4.png)

This shows us that commit [3ce78ba5](http://github.com/egonw/bioclipse.cheminformatics/commit/3ce78ba572e0fbb32536cfb24ae9848297057575)
is the one we are interested in:

![](/blog/assets/images/codeReview5.png)

## Step 4: Look up the line again and add a comment

In the web page with the appropriate commit looked in the previous step, you scroll down to the line you want to comment on.
If you hover over that line, a blue comment bubble will show up on the left side:

![](/blog/assets/images/codeReview6.png)

Clicking that blue comment icon, you get a dialog where you can enter your comment:

![](/blog/assets/images/codeReview7.png)

The 'Add Line Note' button confirms and saves your comment:

![](/blog/assets/images/codeReview8.png)

## Step 5: inform the commiter about your review

The next step would be to inform the commit author. GitHub actually helps here, and should send a message,
like this one:

![](/blog/assets/images/codeReview9.png)

But it would certainly not hurt of you filed a bug report or sent an email.

*Now, I should only convert this into a screencast...*
