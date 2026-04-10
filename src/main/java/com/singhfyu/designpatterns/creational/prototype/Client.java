package com.singhfyu.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {


        Student originalStudent = new Student(2014, "BIT Mesra", 7.4);
        IntelligentStudent originalIntelligentStudent = new IntelligentStudent(2014, "BIT Mesra", 8.5, 145);

        //storing prototype in map values
        Map<String, Student> registry = new HashMap<>();
        registry.put("NORMAL",originalStudent);
        registry.put("INTELLIGENT", originalIntelligentStudent);

        //copy
        Student intelligentStudentPrototype = registry.get("INTELLIGENT");
        Student s1= intelligentStudentPrototype.clone();
        s1.name="Shubham";
        s1.age=29;
        s1.id=01;

        Student s2 = intelligentStudentPrototype.clone();
        s2.name="Rishav";
        s2.age=29;
        s2.id=02;

        System.out.println(s1==s2);
        System.out.println(s1.name + " " + s2.name);
        System.out.println(s1.avgBatchScore + " " + s2.avgBatchScore);

    }
}
