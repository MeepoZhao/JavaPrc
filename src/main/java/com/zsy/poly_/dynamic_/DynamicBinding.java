package com.zsy.poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum()); // 调用的是运行类型的方法，得到结果是40
        System.out.println(a.sum1()); // 得到结果是 30

        // 将B列中sum方法注销掉后，涉及到动态绑定的知识
        // a.sum()方法会调用A类的sum方法，sum方法中调用了getI()方法
        // 此时会调用子类B类中的getI()方法，该方法返回的是B列中的i值
        // 所以此时返回的结果是30

        // 将B列中sum1方法注销掉后，a.sum1()方法会调用A类自身的方法

        // 当调用对象的方法时，该方法会和运行类型进行绑定
        // 属性没有动态绑定特性，在哪个类中调用，就使用哪个类中的属性

        System.out.println(a.getI());
    }

}


