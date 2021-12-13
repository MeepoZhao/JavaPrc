package com.zsy.poly_.dynamic_;

public class A {
    public int i = 10;

    public int getI() {
        return i;
    }
    // 调用
    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }
}
