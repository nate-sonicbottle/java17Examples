package com.sonicbottle.conditional;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class InstanceOf {

    @Test
    void instanceOfValue() {
        String string = "This is really a String";
        Object object = string;

        // Old Way
        if (object instanceof String) {
            System.out.println(((String) object).toUpperCase(Locale.ROOT));
        }

        // New Way
        if (object instanceof String value) {
            System.out.println(value.toUpperCase(Locale.ROOT));
        }
    }
}
