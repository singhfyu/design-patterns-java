package com.singhfyu.designpatterns.creational.prototype;

public class Student implements Cloneable<Student>{
    //Student specific sttributes
    public String name;
    public int age;
    public int id;

    //Batch related attributes which will remain same for all students
    //in the same batch
    public int batchId;
    public String univName;
    public double avgBatchScore;

    //public Student(){}
    public Student( int batchId, String univName, double avgBatchScore){
        this.batchId=batchId;
        this.univName=univName;
        this.avgBatchScore=avgBatchScore;
    }
    public Student(Student original){
           this.batchId= original.batchId;
           this.univName= original.univName;
           this.avgBatchScore= original.avgBatchScore;
    }
    @Override
    public Student clone(){
        return new Student(this);
    }
}
