package com.singhfyu.designpatterns.creational.singleton.realworld;

import java.time.LocalDateTime;

public enum Logger {
    INSTANCE;
    private Logger(){}

    public void info(String message){
        System.out.println(format("INFO", message));
    }
    public void warn(String message){
        System.out.println(format("WARN", message));
    }
    public void error(String message){
        System.out.println(format("ERROR", message));
    }
    public void debug(String message){
        System.out.println(format("DEBUG", message));
    }
    public String format(String level, String message){
        return "["+ LocalDateTime.now() + "] [" + level + "] " + message;
    }
}
