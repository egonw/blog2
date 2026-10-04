---
layout: post
title:  "Multiple unit test inheritance with JExample"
date:   2010-10-26 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2010/10/multiple-unit-test-inheritance-with.html
doi: 10.59350/b3fxm-rg432
tags: java junit
modified_date: 2026-09-27
---

Two months ago I wrote about [JExample](http://scg.unibe.ch/research/jexample) (see
[Specifying unit test dependencies with JExample <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/08/14/specifying-unit-test-dependencies-with.html)).
At the time, my examples did not include multiple unit test inheritance, but was informed later by @jexample
that is possible. I just got time to try it in the [Oscar <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/10/15/working-on-oscar-for-three-months.html)
project:

```java
@Test public Oscar testConstructor()
throws URISyntaxException
{
  Oscar oscar = new Oscar();
  Assert.assertNotNull(oscar);
  return oscar;
}

@Given("#testConstructor")
public String testNormalize(Oscar oscar)
throws URISyntaxException
{
  String input = oscar.normalize(
    "This is a simple input string with benzene."
  );
  Assert.assertNotNull(input);
  return input;
}

@Given("#testConstructor,#testNormalize")
public List testTokenize(
  Oscar oscar, String input) throws Exception
{
  List tokens = oscar.tokenize(input);
  Assert.assertNotNull(tokens);
  Assert.assertNotSame(0, tokens.size());
  return tokens;
}

@Given("#testConstructor,#testTokenize")
public List testRecognizeNamedEntities(
  Oscar oscar, List tokens)
throws Exception
{
  List entities =
    oscar.recognizeNamedEntities(tokens);
  Assert.assertNotNull(entities);
  Assert.assertEquals(1, entities.size());
  return entities;
}
```

The pattern here is that each test method returns one variable, so that any method depending on two
other unit test will have two parameters. The order is defined by the order in which they are given
by the *@Given* clause.
