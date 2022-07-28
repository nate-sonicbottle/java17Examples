package com.sonicbottle.record;

import org.junit.jupiter.api.Test;

class RecordWithInheritance {

    @Test
    void testInheritance(){
        var teacher = new Teacher("Bob");
        var student = new Student("Alice");

        System.out.println("Is Teacher an Instance of Person: " + (teacher instanceof Person));
        System.out.println(printPersonName(student));
        System.out.println(teacher.printName());
    }

    static String printPersonName(Person person) {
        return "The Person's name is " + person.name();
    }
}


interface Person {
    String name();

    default String printName() {
        return "The Person's name is " + this.name();
    }
}

record Teacher(String name) implements Person {}
record Student(String name) implements Person {}
