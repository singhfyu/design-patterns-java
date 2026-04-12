package com.singhfyu.designpatterns.creational.factory.abstractfactory;

import com.singhfyu.designpatterns.creational.factory.productinterfaces.Activation;
import com.singhfyu.designpatterns.creational.factory.productinterfaces.Validation;

public interface DeviceFactory {
    public Activation createActivation();
    public Validation createValidation();

}
