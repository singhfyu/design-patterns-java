package com.singhfyu.designpatterns.creational.singleton.threadsafe;

public class DoubleCheckedLockingSingleton {
    private static DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton(){}

    public static DoubleCheckedLockingSingleton getInstace(){
        if(instance == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if(instance == null)
                    instance= new DoubleCheckedLockingSingleton();
            }
        }
        return instance;
    }
}
