package com.sonicbottle.string;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

class Java12NumberFormatting {

    @Test
    void formatNumbersLong() {
        int thousand = 1_000;
        int tenThousand = 10_000;
        int oneMillion = 1_000_000;
        int oneBillion = 1_000_000_000;

        NumberFormat formatter = NumberFormat.getCompactNumberInstance(
                Locale.UK, NumberFormat.Style.LONG);

        System.out.println(formatter.format(thousand));
        System.out.println(formatter.format(tenThousand));
        System.out.println(formatter.format(oneMillion));
        System.out.println(formatter.format(oneBillion));
    }

    @Test
    void formatNumbersShort() {
        int thousand = 1_000;
        int tenThousand = 10_000;
        int oneMillion = 1_000_000;
        int oneBillion = 1_000_000_000;

        NumberFormat formatter = NumberFormat.getCompactNumberInstance(
                Locale.UK, NumberFormat.Style.SHORT);

        System.out.println(formatter.format(thousand));
        System.out.println(formatter.format(tenThousand));
        System.out.println(formatter.format(oneMillion));
        System.out.println(formatter.format(oneBillion));
    }
}
