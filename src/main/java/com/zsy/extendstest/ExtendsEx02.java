package com.zsy.extendstest;

public class ExtendsEx02 {
}

class A02{
    public A02(){
        System.out.println("我是A02类");
    }
}

class B02 extends A02{
    public B02(){
        System.out.println("我是B02类的无参构造");

    }
    public B02(String name){
        System.out.println(name + "我是B02类的有参构造");
    }
}