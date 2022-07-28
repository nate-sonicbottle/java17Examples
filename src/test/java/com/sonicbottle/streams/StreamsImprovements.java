package com.sonicbottle.streams;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

class StreamsImprovements {

    @Test
    void toListExample() {
        var strings = IntStream.range(1, 10)
                .mapToObj(String::valueOf)
                .toList();

        System.out.println(strings);
    }
}
