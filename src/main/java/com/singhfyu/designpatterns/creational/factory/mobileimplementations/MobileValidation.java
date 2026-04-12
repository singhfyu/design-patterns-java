package com.singhfyu.designpatterns.creational.factory.mobileimplementations;

import com.singhfyu.designpatterns.creational.factory.productinterfaces.Validation;

public class MobileValidation implements Validation {
    @Override
    public void validate() {
        //Validation logic
        System.out.println("Mobile validated");
    }
}
