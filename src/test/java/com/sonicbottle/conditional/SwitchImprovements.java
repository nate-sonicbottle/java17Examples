package com.sonicbottle.conditional;

import org.junit.jupiter.api.Test;

import static com.sonicbottle.conditional.SwitchImprovements.Day.MONDAY;
import static com.sonicbottle.conditional.SwitchImprovements.Day.SATURDAY;

class SwitchImprovements {

    /**
     * The general switch improvements are:
     * 		○ No fallthrough (no break statement required)
     * 		○ A single case can have multiple constant labels.
     *      ○ Default case is compulsory now. (unless an enum)
     */
    private static String isWeekday(String day) {
        return switch (day) {
            case "Monday", "Tuesday", "Wednesday","Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Invalid";
        };
    }

    enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    /**
     * The switch improvements for Enums are:
     *      ○  Default case can be skipped (if it covers all cases)
     */
    private static String isWeekday(Day day) {
        return switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Weekday";
            case SATURDAY,SUNDAY -> "Weekend";
        };
    }


    private static String yieldExample(Day day) {
        var isWeekday = switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                System.out.printf("%s is a Weekday%n", day);
                yield  "Weekday";
            }
            case SATURDAY,SUNDAY -> {
                System.out.printf("%s is a weekend%n", day);
                yield "Weekend";
            }
        };
        return isWeekday;
    }

    @Test
    void newSwitchStatement() {
        System.out.println(isWeekday("Monday"));
        System.out.println(isWeekday("Bob"));
    }

    @Test
    void newSwitchStatementEnums() {
        System.out.println(isWeekday(MONDAY));
    }

    @Test
    void yieldSwitchExample() {
        System.out.println(yieldExample(MONDAY));
        System.out.println(yieldExample(SATURDAY));
    }

}
