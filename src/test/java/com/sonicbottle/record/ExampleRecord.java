package com.sonicbottle.record;

public record ExampleRecord(
        String firstName,
        String lastName){

    public static ExampleRecord of(String firstName, String lastName) {
        return new ExampleRecord(firstName, lastName);
    }
}
