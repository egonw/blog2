---
layout: post
title:  "Specifying unit test dependencies with JExample"
date:   2010-08-14 00:10
modified_date: 2026-08-17
blogger-link: https://chem-bla-ics.blogspot.com/2010/08/specifying-unit-test-dependencies-with.html
doi: 10.59350/4xeej-wct60
tags: java junit justdoi:10.1007/978-3-540-68255-4_8
image: /blog/assets/images/jexample.png
---

A while ago [I asked on StackOverflow](http://stackoverflow.com/questions/2584629/how-can-i-specifiy-junit-test-dependencies) about options
to specify unit test dependencies. An example from the [CDK](http://cdk.sf.net/) would be that aromaticity detection in some molecule would
require that all atom types are correctly perceived. I could test both in separate unit tests, but with [JUnit](http://www.junit.org/) I
cannot have the aromaticity test ignored of the atom typing already failed. Now, being to specify such dependencies is useful, as the failing
aromaticity test may be caused by the faulty atom typing, but the failing aromaticity test seems to imply something is wrong with the
aromaticity detection algorithm.

One of the answers was [JExample](http://scg.unibe.ch/research/jexample). Consider this code:

```java
@RunWith(JExample.class)
public class MoleculeTest {

  @Test
  public MoleculeFactory testNewMoleculeFactory() {
    Assert.fail("too bad");
    return new MoleculeFactory();
  }

  @Given("#testNewMoleculeFactory()")
  public IMolecule testNewMolecule(MoleculeFactory factory) {
    Assert.fail("too bad");
    return factory.getImmutable();
  }

}
```

Reading this Java code requires some experience with JUnit4, but those who already know JUnit4 will also see that the code is somewhat
unusual. For of all, we define a special class to run the tests with: *JExample.class*. A second thing to note is that the top test method
actually returns something. The bottom test method is also differnt: instead of being annotated with *@Test*, it is annotated with
*@Given*. This latter annotation is introduced by JExample to define the dependencies between the tests. The parameter of this annotation
defines which test method it depends on. Moreover, it is now also clear what happens with the return value of the top test method: it is
passed as argument to the second test method.

Just to show that the system actually works, you can find a screenshot of the [Eclipse](http://www.eclipse.org/) JUnit View
(the JExample update site did not work with Eclipse 3.6, so I have the JExample jar defined as build dependency in the project instead):

![](/blog/assets/images/jexample.png)

Clearly, only one test failed, while the *testNewMolecule()* method was ignored.

Now, I was wondering if the first method could be reused, and if so, if it would construct a new object. And it does, as is clear from the output of this code:

```java
  @Test
  public MoleculeFactory testNewMoleculeFactory() {
    return new MoleculeFactory();
  }

  @Given("#testNewMoleculeFactory()")
  public IMolecule testNewMolecule(MoleculeFactory factory) {
    System.out.println("Factory1: " + factory);
    return factory.getImmutable();
  }

  @Given("#testNewMoleculeFactory()")
  public IMolecule testNewMolecule2(MoleculeFactory factory) {
    System.out.println("Factory2: " + factory);
    return factory.getImmutable();
  }
```

which outputs:

```
Factory2: com.github.egonw.odk.model.MoleculeFactory@7bd63e39
Factory1: com.github.egonw.odk.model.MoleculeFactory@42b988a6
```

This seems pretty useful. I am not sure yet if it solves all my dependency requirements, though. For example, what I really like to do, is link more complex tests to more than one more simpler tests, where it is clear that the complexer test will fail if one or more of the simpler tests fail. However, the JExample examples suggest that I can only define one dependency, whereas, for example, aromaticity detection depends on correct atom type perception, but also on ring detection. For now, this is a welcome extension of JUnit.

