package com.zsy.poly_;

public class Animal {
    // 定义变量
    private String variety;
    public int age = 10;
    // 构造器


    // 定义方法
    public void eat(){
        System.out.println("吃");
    }
    public void run(){
        System.out.println("跑");
    }
    public void sleep(){
        System.out.println("睡觉");
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

}
