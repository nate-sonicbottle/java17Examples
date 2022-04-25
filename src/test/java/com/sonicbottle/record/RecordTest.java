package com.sonicbottle.record;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RecordTest {

    @Test
    void test() {
        var bob = new ExampleRecord("Bob", "Jones");

        System.out.println("First Name: " + bob.firstName());
        System.out.println("Last Name: " + bob.lastName());
    }

    @Test
    void testToString() {
        var bob = new ExampleRecord("Bob", "Jones");
        System.out.println("toString(): \t" + bob);
    }

    @Test
    void testEquals() {
        var bob1 = new ExampleRecord("Bob", "Jones");
        var bob2 = new ExampleRecord("Bob", "Jones");

        Assertions.assertEquals(bob1, bob2);
    }

    @Test
    void testHashCode() {
        var bob1 = new ExampleRecord("Bob", "Jones");
        System.out.println(bob1.hashCode()); //73832226

        var bob2 = new ExampleRecord("Bob", "Jones");
        System.out.println(bob2.hashCode()); //73832226
    }
}
