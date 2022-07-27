package com.sonicbottle.string;

import org.junit.jupiter.api.Test;

class Java13StringImprovements {

    @Test
    void textBlocks() {
        var textBlockString =
                """
                This is first line
                This is the second line
                """;
        System.out.println(textBlockString);

        var jsonExample =
                """
                {
                    "name" : "Bob",
                    "studentNo" : 32
                 }        
                        
                """;
        System.out.println(jsonExample);
    }

    @Test
    void formattedTextBlocks() {
        var testJson = """
                        {
                            "firstName": "%s",
                            "studentNo": %d
                        } 
                        """;

        var bob=  testJson.formatted("Bob", 23);
        var tim = testJson.formatted("Tim", 24);

        System.out.println(bob);
        System.out.println(tim);
    }
}
