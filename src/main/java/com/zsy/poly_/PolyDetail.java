package com.zsy.poly_;

public class PolyDetail {
    public static void main(String[] args) {
        // 编译类型和运行类型
        Animal animal = new Cat();
        // 此处animal的编译类型是Animal，运行类型是Cat
        // 执行eat操作是从运行类中寻找方法，如果未找到，才会从父类中寻找
        animal.eat();
        animal.sleep();

        System.out.println(animal.age); // 属性是从父类中找？

        Cat cat = new Cat();
        System.out.println(cat.age); //
    }
}
