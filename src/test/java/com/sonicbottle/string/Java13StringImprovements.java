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
                    "name" : "Mahesh",
                    "RollNO" : "32"
                 }        
                        
                """;
        System.out.println(jsonExample);
    }
}
