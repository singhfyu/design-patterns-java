package com.singhfyu.designpatterns.creational.factory;

import com.singhfyu.designpatterns.creational.factory.productinterfaces.Activation;
import com.singhfyu.designpatterns.creational.factory.productinterfaces.Validation;
import com.singhfyu.designpatterns.creational.factory.simplefactory.DeviceSimpleFactory;

public class Client {
    public static void main(String[] args) {
        String deviceType = "TV";
        Activation a = DeviceSimpleFactory.getActivation(deviceType);
        Validation v = DeviceSimpleFactory.getValidation(deviceType);
        a.activate();
        v.validate();
    }
}
