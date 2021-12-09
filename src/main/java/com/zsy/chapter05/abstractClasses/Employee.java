package com.zsy.chapter05.abstractClasses;

import java.time.LocalDate;

public class Employee extends Person {
    // 自带的属性
    private double salary;
    private LocalDate hireDay;

    // 构造器
    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public String getDescription(){
        return String.format("an employee with a salary of $%.2f",salary);
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }


}
