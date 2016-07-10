package io.github.benas.randombeans.beans;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import io.github.lukehutch.fastclasspathscanner.FastClasspathScanner;


public class BugDemonstrationTest {

    @Test
    public void test() {
        FastClasspathScanner classpathScanner = new FastClasspathScanner();
        classpathScanner.verbose(true);
        classpathScanner.scan();
        List<String> namesOfSubclassesOf = classpathScanner.getNamesOfSubclassesOf(Bar.class);
        System.out.println(namesOfSubclassesOf);
        Assert.assertFalse(namesOfSubclassesOf.isEmpty());
    }

}
