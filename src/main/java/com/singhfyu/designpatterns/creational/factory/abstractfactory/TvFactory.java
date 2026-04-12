package com.singhfyu.designpatterns.creational.factory.abstractfactory;

import com.singhfyu.designpatterns.creational.factory.mobileimplementations.MobileActivation;
import com.singhfyu.designpatterns.creational.factory.mobileimplementations.MobileValidation;
import com.singhfyu.designpatterns.creational.factory.productinterfaces.Activation;
import com.singhfyu.designpatterns.creational.factory.productinterfaces.Validation;
import com.singhfyu.designpatterns.creational.factory.tvimplementations.TvActivation;
import com.singhfyu.designpatterns.creational.factory.tvimplementations.TvValidation;

public class TvFactory implements DeviceFactory{
    public Activation createActivation(){
            return new TvActivation();
    }
    public Validation createValidation(){
            return new TvValidation();
    }
}
