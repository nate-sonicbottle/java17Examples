package com.sonicbottle.conditional;

import org.junit.jupiter.api.Test;

class OldSwitchExample {

    @Test
    void switchStatement() {
        System.out.println(isWeekday("Monday"));
        System.out.println(isWeekday("Bob"));
    }

    public static String isWeekday(String day) {
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                return "Weekday";
            case "Saturday":
            case "Sunday":
                return "Weekend";
            default:
                return "Invalid";
        }
    }

    enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static String isWeekday(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                return "Weekday";
            case SATURDAY:
            case SUNDAY:
                return "Weekend";
            default:
                return "Invalid";
        }
    }

    @Test
    void testOldSwitchEnum() {
        System.out.println(isWeekday(Day.MONDAY));
    }

}
