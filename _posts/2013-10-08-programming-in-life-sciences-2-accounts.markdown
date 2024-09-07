---
layout: post
title:  "Programming in the Life Sciences #2: accounts and API keys"
date:   2013-10-08
blogger-link: https://chem-bla-ics.blogspot.com/2013/10/programming-in-life-sciences-2-accounts.html
tags: pra3006 openphacts javascript rest
image: /assets/images/gscholar1.png
---

I have outlined the scope of the [six-day course](http://chem-bla-ics.blogspot.nl/2013/10/programming-in-life-sciences-1-six-day.html):
the students will learn to program while hacking on the [Open PHACTS' Linked Data API](https://dev.openphacts.org/docs) (LDA). The first
step is to get an account for the LDA. I have already done that to save time. But these are the steps to take. You go to
[https://dev.openphacts.org/signup](https://dev.openphacts.org/signup):

![](/assets/images/gscholar1.png)

You then approve the account via your email account and you are set. The account is needed to get an API key. Using this key,
Open PHACTS developers can contact you if your scripts go berserk  So, you are kindly invited to make crazy hypotheses and hack the
hell out of the platform. That's what I hope my students will do.

To try your new key, go to the documentation page, and open, for example, the *SMILES to URL* method:

![](/assets/images/mscpils.png)

Here you can see what parameters this LDA method has. We focus now on the `app_id` and `app_key` fields. Each account comes by default
with a, um, default `app_id` and default `app_key`. Just click on the field and select them:

![](/assets/images/mscpils1.png)

Select the defaults and enter a SMILES (try: [CC(=O)NC1=CC=C(C=C1)O)](https://apps.ideaconsult.net:8080/ambit2/depict?search=CC(=O)NC1=CC=C(C=C1)O)).
You can select the format you like (I like Turtle) and you get Linked Data back on this [compound](https://rdf.chemspider.com/1906).

Now, go explore the LDA methods.
