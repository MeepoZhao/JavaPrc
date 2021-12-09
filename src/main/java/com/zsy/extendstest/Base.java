package com.zsy.extendstest;

public class Base {
    // 定义四个访问权限级别的属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {
        System.out.println("Base()类。。。。");
    }
    public Base(String name){
        System.out.println("Base(String name)类。。。。");
    }

    // 定义四个访问权限级别的方法
    public void test01() {
        System.out.println("test01()");
    }

    void test02() {
        System.out.println("test02()");
    }

    protected void test03() {
        System.out.println("test03()");
    }

    private void test04() {
        System.out.println("test04()");
    }

}
