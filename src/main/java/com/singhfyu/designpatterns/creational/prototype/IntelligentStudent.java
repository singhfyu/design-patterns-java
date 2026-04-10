package com.singhfyu.designpatterns.creational.prototype;

public class IntelligentStudent extends Student{
    public int iqLevel;

    public IntelligentStudent( int batchId, String univName, double avgBatchScore, int iqLevel){
        super(batchId, univName, avgBatchScore);
        this.iqLevel=iqLevel;
    }
    public IntelligentStudent(IntelligentStudent original){
        super(original.batchId, original.univName, original.avgBatchScore);
        this.iqLevel= original.iqLevel;
    }
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
