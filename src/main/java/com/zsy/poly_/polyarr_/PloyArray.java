package com.zsy.poly_.polyarr_;

public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Jack", 30);
        persons[1] = new Student("Tom", 25, 70);
        persons[2] = new Student("Tomcat", 18, 80);
        persons[3] = new Teacher("Lora", 47, 6000);
        persons[4] = new Teacher("Jane", 61, 9000);

        for (Person p : persons) {
            if(p instanceof Student){
                Student student = (Student) p;
                student.study();
            } else if(p instanceof Teacher){
                ((Teacher) p).teach();
            } else {
                System.out.println(p.say());
            }
        }
    }
}
