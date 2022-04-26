package com.sonicbottle.predicate;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

class Java11PredicateImprovements {

    Predicate<Integer> isDivisibleBy3 = n -> n % 3 == 0;
    Predicate<Integer> isDivisibleBy5 = n -> n % 5 == 0;

    @Test
    void test() {
        System.out.println(isDivisibleBy3.test(3));  // true
        System.out.println(isDivisibleBy5.test(3)); // false
        System.out.println(isDivisibleBy5.and(isDivisibleBy3).test(15)); // true
        System.out.println(isDivisibleBy3.or(isDivisibleBy5).test(9)); // true
        // New Java 11 Improvement
        System.out.println(Predicate.not(isDivisibleBy3).test(3)); // false
    }
}
