---
layout: post
title:  "Jumbo 5.0 and the CDK"
date:   2005-12-10
modified_date: 2023-08-05
blogger-link: https://chem-bla-ics.blogspot.com/2005/12/jumbo-50-and-cdk.html
tags: cdk cml java
doi: 10.59350/y0mte-4ns18
---

I [reported earlier <i class="fa-solid fa-recycle fa-xs"></i>](https://egonw.github.io/blog/2005/12/08/jumbo-50-and-cml-support-in-cdk.html) that the CDK has been updated in CVS to use
CML from the new Jumbo 5.0. The transition actually involved a lot of changes in the CDK, some I would like to address in the following comments.
One thing is that CML write support (not reading!) uses the new Jumbo library which requires Java 1.5. Thus, if Java 1.5 is not available,
then CML writing should not be compiled. This is how this is done.

### The JavaDoc

The CDK makes extensive use of [JavaDoc taglets](http://java.sun.com/j2se/1.5.0/docs/guide/javadoc/taglet/spec/com/sun/tools/doclets/Taglet.html).
CDK uses tags of type `@cdk.SOMETAG`. And an important tag in this case, is the `@cdk.require` tag, becuase it allows us to make the CDK build
system aware that the class requires Java 5.0 to be compiled. Thus, we have for example
[this code in CVS](http://cvs.sourceforge.net/viewcvs.py/cdk/cdk/src/org/openscience/cdk/io/CMLWriter.java?rev=1.90&view=log), of which bits are:

```java
/**
 * Serializes a SetOfMolecules or a Molecule object to CML 2 code.
 * Chemical Markup Language is an XML based file format {@cdk.cite PMR99}.
 * Output can be redirected to other Writer objects like StringWriter
 * and FileWriter.
 *
 * @cdk.module       libio-cml
 * @cdk.builddepends xom-1.0.jar
 * @cdk.depends      jumbo50.jar
 * @cdk.require      java1.5
 */
public class CMLWriter extends DefaultChemObjectWriter {
}
```

As probably is clear compiling this jars requires a two jars to be present, of which the `jumbo50.jar` itself is not required for compiling
the class source code. It also shows the use of the `@cdk.require` tag.

### The build.xml

Because the CDK still does not require Java 1.5, the CDK is supposed to be buildable with Java 1.4 (the oldest supported Java release). The
[Ant](http://ant.apache.org/) [build.xml](http://cvs.sourceforge.net/viewcvs.py/cdk/cdk/build.xml?rev=1.310&view=markup) script is quite
able to conditionally leave out compiling parts of the CDK, if configured correctly using proper JavaDoc tags, as explained earlier.

First, the build.xml checks what libraries are available for compiling certain parts of the CDK. For example, the build.xml code to check for Java 1.5 looks like:

```xml
<condition property="isJava15">
  <contains string="${java.version}" substring="1.5"/>
</condition>
```

Run `ant info` to see what is being checked for, or look at the `build.xml` source code for the check target.

All compiling is done by the compile-module target, and there it in- and excludes bits of the CDK depending on the checked conditions:

```xml
<javac srcdir="${build.src}" destdir="${build}" optimize="${optimization}" 
       debug="${debug}" deprecation="${deprecation}">

  <excludesfile name="${src}/java1.4+.javafiles" if="isJava13"/>
  <excludesfile name="${src}/java1.4.javafiles" unless="isJava14"/>
  <excludesfile name="${src}/java1.5.javafiles" unless="isJava15"/>
  <excludesfile name="${src}/ant1.6.javafiles" unless="hasAnt16"/>
  <excludesfile name="${src}/r-project.javafiles" unless="rispresent"/>

  <includesfile name="${src}/${module}.javafiles"/>
</javac>
```

Keep in mind that the `*.javafiles` are created with JavaDoc based on the CDK JavaDoc tags mentioned earlier.

### The build.xml 2

While the above mechanism has been present since for some time now, having jumbo50.jar in CVS made the situation a bit trickier:
the `jumbo50.jar` uses the 49.0 class format used in Java 1.5, and cannot be processed by Java 1.4 systems. Since the classpath
used when compiling CDK source code, is defined in configuration files for those modules in
[src/META-INF](http://cvs.sourceforge.net/viewcvs.py/cdk/cdk/src/META-INF/), the problem did not occur when compiling the modules.
However, it did show an error in the `reallyRunDoclet` target today, when I was creating the `*.javafiles` with JavaDoc.
The solution was trivial:

```xml
<target name="reallyRunDoclet" id="reallyRunDoclet"
  depends="compileDoclet" unless="dotjavafiles.uptodate">
  <javadoc private="true"  maxmemory="128m">
    <classpath>
      <fileset dir="${lib}">
        <include name="*.jar" />
        <!-- some jars require some Java version -->
        <exclude name="jumbo50.jar" unless="isJava15"/>
      </fileset>
      <fileset dir="${lib}/libio">
        <include name="*.jar" />
      </fileset>
      <fileset dir="${devellib}">
        <include name="*.jar" />
      </fileset>
    </classpath>

    <doclet name="net.sf.cdk.tools.MakeJavaFilesFilesDoclet"
      path="${doc}/javadoc"/>

    <packageset dir="${src}">
      <include name="org/openscience/cdk/**"/>
    </packageset>

</javadoc>
```

### cdk.applications.FileConvertor

There is another area of interest: the `FileConvertor`, which is, sort of, CDK's
[OpenBabel](http://openbabel.sf.net/)'s `babel` variant. The FileConvertor must
be compiled in all cases, so we need to conditionally instantiate the `CMLWriter`, which is not really a problem. However, compiling
the source code is more troublesome: the `CMLWriter` class must be loaded on runtime, and not occur hardcoded in the source code.

In the past I have solved this by using `.getInstance()` constructs, but the
[ChemObjectWriter interface](http://cvs.sourceforge.net/viewcvs.py/cdk/cdk/src/org/openscience/cdk/io/ChemObjectWriter.java?rev=1.19&view=log) does not define this
functionality, so I decided to use the `java.lang.reflect` mechanism:

```java
} else if (format.equalsIgnoreCase("CML")) {
  Class cmlWriterClass = this.getClass().getClassLoader().
    loadClass("org.opscience.cdk.io.CMLWriter");
  if (cmlWriterClass != null) {
    writer = (ChemObjectWriter)cmlWriterClass.newInstance();
  }
  Constructor constructor = writer.getClass().getConstructor(new Class[]{Writer.class});
  writer = (ChemObjectWriter)constructor.newInstance(new Object[]{fileWriter});
} else {
```

Now, this has been, by far, the longest blog item I have written so far. I hope it gave you good insight in some techniques CDK uses to deal with
situations where functionality might, or might not, be present at build and at run time.
