package com.singhfyu.designpatterns.creational.singleton.bestpractice;

public class BillPughSingleton {
    private BillPughSingleton(){}
    //lazy loading= loaded only when first object creation in done
    //thread safety= a class in loaded only once by jvm, som second thread wont be able to enter Holder class
    private static class Holder{
        private static final BillPughSingleton instance =  new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return Holder.instance;
    }
}
