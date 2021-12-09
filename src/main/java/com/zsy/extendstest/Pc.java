package com.zsy.extendstest;

public class Pc extends Computer{
    private String brand;

    public Pc(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // 打印信息


    @Override
    public String getDetail() {
        return super.getDetail() + " brand =" + getBrand();
    }
}
