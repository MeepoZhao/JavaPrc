package com.zsy.extendstest;

public class ExtendsDetail {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);
    }

}

class Graph {
    String name = "爷爷";
    String hobby = "旅游";
}

class Father extends Graph {
    String name = "爸爸";
    String hobby = "游戏";
    int age = 30;
}

class Son extends Father {
    String name = "儿子";
}
