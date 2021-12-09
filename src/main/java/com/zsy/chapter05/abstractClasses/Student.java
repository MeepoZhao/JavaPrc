package com.zsy.chapter05.abstractClasses;

public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public String getDescription() {
        return String.format("a student majoring in " + major);
    }
}
