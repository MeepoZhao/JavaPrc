package com.zsy.poly_;

public class Cat extends Animal{
    // 定义属性
    private String color;
    public int age = 20;
    // 使用构造器

    // 定义方法
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
