package com.singhfyu.designpatterns.creational.factory;

import com.singhfyu.designpatterns.creational.factory.productinterfaces.Activation;
import com.singhfyu.designpatterns.creational.factory.productinterfaces.Validation;
import com.singhfyu.designpatterns.creational.factory.simplefactory.DeviceSimpleFactory;

import java.util.Scanner;

public class ClientSimpleFactory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter device type:");
        String deviceType = sc.nextLine();

        //simple factory
        Activation a = DeviceSimpleFactory.getActivation(deviceType);
        Validation v = DeviceSimpleFactory.getValidation(deviceType);
        a.activate();
        v.validate();
    }
}
