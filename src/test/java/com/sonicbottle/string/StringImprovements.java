package com.sonicbottle.string;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

public class StringImprovements {

    /**
     *  Java 11 String Improvements
     */

    @Test
    void testRepeat() {
        System.out.println(" abc".repeat(2)); // abc abc
    }

    @Test
    void testisBlank() {
        System.out.println("abc".isBlank()); // false
        System.out.println("".isBlank()); // true
    }

    @Test
    void testStrip() {
        System.out.println("a" + " bc ".strip() + "d"); // abcd
    }

    @Test
    void testStripLeading() {
        System.out.println("abc " + " d".stripLeading()); // abc d
    }

    @Test
    void testStripTrailing() {
        System.out.println("abc ".stripTrailing() + " d"); //abc d
    }

    @Test
    void testLines() {
       var output = "a\nA\nb\nB\nc\nC".lines()
                .map(s -> s.charAt(0))
                .filter(Character::isUpperCase)
                .map(Object::toString)
                .collect(Collectors.joining());

       System.out.println(output); // ABC
    }

    @Test
    void testFormatted() {
        var helloBob = "Hello %s".formatted("Bob");
        System.out.println(helloBob);
    }

    /**
     *  Java 12
     */

    @Test
    void indent() {
        System.out.println("\t\tTabs");
        System.out.println("\t1\t2\t3\t4");
        var s = "\t\t\tTabbed to 3 spaces";
        System.out.println(s);
        System.out.println(s.indent(-1)); // Remove a Tab
        System.out.println(s.indent(4)); // Add a Tab (4 spaces)
    }

    @Test
    void transform() {
        var alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Before " + alpha);
        var transformed = alpha.transform(s -> new StringBuilder(s).reverse().toString());
        System.out.println("Transformed: " + transformed);
    }

    @Test
    void describeConstable() {
        var input = "Fox jumps over the lazy dog";
        System.out.println(input);
        System.out.println(input.describeConstable());
    }

}
