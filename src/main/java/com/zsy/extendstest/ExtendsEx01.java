package com.zsy.extendstest;

public class ExtendsEx01 {
    public static void main(String[] args) {
        B b = new B();
    }

}

class A {
    A() {
        System.out.println("a");
    }

    A(String name) {
        System.out.println("a name");
    }
}

class B extends A {
    B() {
        this("abc"); // 调用B(String name)构造器
        System.out.println("b");
    }

    B(String name) {
        // 此处还有一个隐藏的父类无参构造器
        System.out.println("b name");
    }
}
