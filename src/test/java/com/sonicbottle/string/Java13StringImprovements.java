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

        System.out.println(testJson.formatted("Bob", 23));
        System.out.println(testJson.formatted("Tim", 24));
    }
}
