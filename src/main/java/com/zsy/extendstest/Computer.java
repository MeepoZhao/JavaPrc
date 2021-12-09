package com.zsy.extendstest;

public class Computer {
    // 该类含有CPU、内存、硬盘属性
    // getDetail方法用于返回Computer类信息

    private String cpu;
    private int memory;
    private int disk;

    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    // 读取类信息
    public String getDetail() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", memory=" + memory +
                ", disk=" + disk +
                '}';
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
