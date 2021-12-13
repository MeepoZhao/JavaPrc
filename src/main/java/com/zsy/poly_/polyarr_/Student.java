package com.zsy.poly_.polyarr_;

public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public String say(){
        return super.say() + " 我的成绩是：" +score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // 特有属性
    public void study(){
        System.out.println("学生 " + getName() + " 正在学习课程");
    }
}
