package com.sonicbottle.string;

import org.junit.jupiter.api.Test;

import java.util.Optional;

class Java12StringImprovements {

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
