package com.singhfyu.designpatterns.creational.factory.tvimplementations;

import com.singhfyu.designpatterns.creational.factory.productinterfaces.Activation;

public class TvActivation implements Activation {
    @Override
    public void activate() {
        //Token based TV activation logic
        System.out.println("TV activated using token.");
    }
}
