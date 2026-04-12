package com.singhfyu.designpatterns.creational.factory.abstractfactory;

public class FactoryHolder {
    public static DeviceFactory getFactory(String type){
        if(type.equalsIgnoreCase("MOBILE")){
            return new MobileFactory();
        }else if(type.equalsIgnoreCase("TV")){
            return new TvFactory();
        }
        throw new RuntimeException("Invalid device type!");
    }
}
