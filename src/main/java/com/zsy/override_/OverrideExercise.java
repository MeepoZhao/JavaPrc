package com.zsy.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("jack",35);
        Student student = new Student("tom",25,123,78);
        System.out.println(person.say());
        System.out.println(student.say());
    }

}

class Student extends Person{
    private int id;
    private int score;

    public Student(String name, int age, int id, int score) {
        super(name, age); // 调用父类构造器
        this.id = id;
        this.score = score;
    }

    // 定义say方法，返回自我介绍信息

    @Override
    public String say() {
        return super.say() + " id = " + id + " score = " + score ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 定义say方法，返回自我介绍的字符串
    public String say() {
        return "my name is " + name + " and my age is " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
