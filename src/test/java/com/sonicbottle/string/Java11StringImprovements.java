package com.sonicbottle.string;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

public class Java11StringImprovements {

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
}
