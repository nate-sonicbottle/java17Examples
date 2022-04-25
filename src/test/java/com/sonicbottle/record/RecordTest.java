package com.sonicbottle.record;

import org.junit.jupiter.api.Test;

class RecordTest {

    @Test
    void test() {
        var bob = new ExampleRecord("Bob", "Jones");

        System.out.println("First Name" + bob.firstName());
        System.out.println("Last Name " + bob.lastName());
    }
}
