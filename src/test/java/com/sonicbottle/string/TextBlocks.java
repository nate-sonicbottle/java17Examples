package com.sonicbottle.string;

import org.junit.jupiter.api.Test;

class TextBlocks {

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
        System.out.println(tim.length());
    }

    @Test
    void lengthTest() {
        var string5Chars = "12345";
        System.out.println(string5Chars.length());      // 5

        var textBlock5Chars = """
                               1
                                    2
                                        3
                                            4
                                                5
                                """;

        System.out.println(textBlock5Chars);   // 54

        var replace = textBlock5Chars
                .replace("\n", "\\n")
                .replace("\t", "\\t")
                .replace("\s", "\\s");

        System.out.println(replace);

    }

    @Test
    void equalsTest() {
        var s1 = "Hello";
        var s2 = "Hello\n";

        var t1 = """
                Hello
                """;
        System.out.println(s1.equals(t1));  // false
        System.out.println(s2.equals(t1));  // true

        var t2 = """
                Hello""";

        System.out.println(t2.equals(s1));  // true

        System.out.println(s1.equals(t1.stripTrailing()));  // true

        var replace = t1.replace("\n", "\\n")
                .replace("\t", "\\t")
                .replace("\s", "\\s");

        System.out.println(replace);
    }

}
