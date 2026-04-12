package com.singhfyu.designpatterns.creational.factory.tvimplementations;

import com.singhfyu.designpatterns.creational.factory.productinterfaces.Validation;

public class TvValidation implements Validation {
    @Override
    public void validate() {
        //Validation logic
        System.out.println("TV validation");
    }
}
