package com.singhfyu.designpatterns.creational.factory;

import com.singhfyu.designpatterns.creational.factory.abstractfactory.DeviceFactory;
import com.singhfyu.designpatterns.creational.factory.abstractfactory.FactoryHolder;


import java.util.Scanner;

public class ClientWithFactoryHolder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter device type:");
        String deviceType = sc.nextLine();

        DeviceFactory factory1 = FactoryHolder.getFactory(deviceType);
        factory1.createActivation().activate();
        factory1.createValidation().validate();
    }
}
