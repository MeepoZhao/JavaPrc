package com.zsy.extendstest;

public class NotePad extends Computer {
    String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    @Override
    public String getDetail() {
        return super.getDetail();
    }
}
