package com.singhfyu.designpatterns.creational.factory;

import com.singhfyu.designpatterns.creational.factory.abstractfactory.DeviceFactory;
import com.singhfyu.designpatterns.creational.factory.abstractfactory.MobileFactory;
import com.singhfyu.designpatterns.creational.factory.abstractfactory.TvFactory;

import java.util.Scanner;

public class ClientAbstractFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter device type:");
        String deviceType = sc.nextLine();

        DeviceFactory factory=null;
        if(deviceType.equals("MOBILE")) {
            factory = new MobileFactory();
        }
        else if(deviceType.equals("TV")) {
            factory = new TvFactory();
        }
        factory.createActivation().activate();
        factory.createValidation().validate();
    }
}
