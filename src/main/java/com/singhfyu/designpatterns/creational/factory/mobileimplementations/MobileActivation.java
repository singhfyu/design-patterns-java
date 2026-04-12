package com.singhfyu.designpatterns.creational.factory.mobileimplementations;

import com.singhfyu.designpatterns.creational.factory.productinterfaces.Activation;

public class MobileActivation implements Activation {

    @Override
    public void activate() {
        //OTP logic
        System.out.println("Mobile activated using OTP.");
    }
}
