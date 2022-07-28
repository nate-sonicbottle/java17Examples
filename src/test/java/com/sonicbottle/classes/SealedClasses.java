package com.sonicbottle.classes;

import org.junit.jupiter.api.Test;

class SealedClasses {

    @Test
    void testSealedClasses() {
        var teacher = new Teacher("Charlie");
        System.out.println(teacher.getName());

        var student = new Student("Bob");
        System.out.println(student.getName());

        var assistantTeacher = new AssistantTeacher("Alice");
        System.out.println(assistantTeacher.getName());

        var fresher = new Fresher("Dave");
        System.out.println(fresher.getName());
    }
}

abstract sealed class Person permits Teacher, Student {
    String name;
    String getName() {
        return name;
    }

}

non-sealed class Teacher extends Person {

    Teacher(String name) {
        this.name = name;
    }
}

class AssistantTeacher extends Teacher {

    AssistantTeacher(String name) {
        super(name);
    }
}

sealed class Student extends Person {

    Student(String name) {
        this.name = name;
    }
}

final class Fresher extends Student {

    Fresher(String name) {
        super(name);
    }
}



