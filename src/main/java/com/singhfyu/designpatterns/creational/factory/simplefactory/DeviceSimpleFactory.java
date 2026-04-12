package com.singhfyu.designpatterns.creational.factory.simplefactory;

import com.singhfyu.designpatterns.creational.factory.mobileimplementations.MobileActivation;
import com.singhfyu.designpatterns.creational.factory.mobileimplementations.MobileValidation;
import com.singhfyu.designpatterns.creational.factory.productinterfaces.Activation;
import com.singhfyu.designpatterns.creational.factory.productinterfaces.Validation;
import com.singhfyu.designpatterns.creational.factory.tvimplementations.TvActivation;
import com.singhfyu.designpatterns.creational.factory.tvimplementations.TvValidation;

public class DeviceSimpleFactory {

    public static Activation getActivation(String deviceType){
        if(deviceType.equals("MOBILE")){
            return new MobileActivation();
        }
        else if(deviceType.equals("TV")){
            return new TvActivation();
        }
        throw new RuntimeException("Invalid device type");
    }
    public static Validation getValidation(String deviceType){
        if(deviceType.equals("MOBILE")){
            return new MobileValidation();
        }
        else if(deviceType.equals("TV")){
            return new TvValidation();
        }
        throw new RuntimeException("Invalid device type");

    }
}
