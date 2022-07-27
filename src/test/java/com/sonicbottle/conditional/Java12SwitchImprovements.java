package com.sonicbottle.conditional;

import org.junit.jupiter.api.Test;

class Java12SwitchImprovements {

    @Test
    void newSwitchStatement() {
        System.out.println(isWeekday("Monday"));
        System.out.println(isWeekday("Bob"));
    }

    private static String isWeekday(String day) {
        return switch (day) {
            case "Monday", "Tuesday", "Wednesday","Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Invalid";
        };
    }
}
