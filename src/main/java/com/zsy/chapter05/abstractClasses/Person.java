package com.zsy.chapter05.abstractClasses;

public abstract class Person { // 定义一个抽象类
    public abstract String getDescription();
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
