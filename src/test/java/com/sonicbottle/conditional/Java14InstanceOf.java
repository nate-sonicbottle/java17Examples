package com.sonicbottle.conditional;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class Java14InstanceOf {

    @Test
    void instanceOfValue() {
        String string = "This is really a String";
        Object object = string;

        if (object instanceof String value) {
            System.out.println(value.toUpperCase(Locale.ROOT));
        }
    }
}
