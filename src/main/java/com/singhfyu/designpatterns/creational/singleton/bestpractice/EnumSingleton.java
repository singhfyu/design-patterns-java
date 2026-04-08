package com.singhfyu.designpatterns.creational.singleton.bestpractice;

public enum EnumSingleton {
    INSTANCE;

    EnumSingleton(){}
    public EnumSingleton getInstance(){
        return INSTANCE;
    }

}
