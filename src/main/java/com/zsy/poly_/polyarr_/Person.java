package com.zsy.poly_.polyarr_;

public class Person {
    // 含有两个属性
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // say方法
    public String say() {
        return "我的名字是：" + name + " 年龄是:" + age;
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
