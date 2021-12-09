package com.zsy.extendstest;

public class Sub extends Base{
    public Sub(){
        super("meepo"); // 此处默认调用父类的无参构造器，也可以显示的列出调用的构造器
        System.out.println("Sub()类。。。。");
    }

    public void say(){
        System.out.println(n1 + " " + n2 + " " + n3);
    }
}
