package com.singhfyu.designpatterns.creational.prototype;

public class GeniusStudent extends Student{
    //we dont have to write implements Cloneable<GeniusStudent> here as clone() method
    //will be inherited from parent Student class
    public int scorePercentage;

    public GeniusStudent( int batchId, String univName, double avgBatchScore, int scorePercentage){
        super(batchId, univName, avgBatchScore);
        this.scorePercentage=scorePercentage;
    }
    public GeniusStudent(GeniusStudent original){
        super(original.batchId, original.univName, original.avgBatchScore);
        this.scorePercentage= original.scorePercentage;
    }
    public GeniusStudent clone(){
        return new GeniusStudent(this);
    }
}
