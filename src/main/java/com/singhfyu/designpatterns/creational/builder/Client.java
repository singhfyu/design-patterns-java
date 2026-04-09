package com.singhfyu.designpatterns.creational.builder;

public class Client {
    public static void main(String[] args) throws Exception {

        Student student1 = Student.builder().setAge(10).setName("Shubham").setId(1).build();


    }
}
