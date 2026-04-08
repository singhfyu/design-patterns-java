package com.singhfyu.designpatterns;

import com.singhfyu.designpatterns.creational.singleton.basiclazy.LazySingleton;
import com.singhfyu.designpatterns.creational.singleton.bestpractice.BillPughSingleton;
import com.singhfyu.designpatterns.creational.singleton.bestpractice.EnumSingleton;
import com.singhfyu.designpatterns.creational.singleton.eager.EagerSingleton;
import com.singhfyu.designpatterns.creational.singleton.realworld.Logger.DoubleCheckedLogger.LogLevel;
import com.singhfyu.designpatterns.creational.singleton.realworld.Logger.DoubleCheckedLogger.LoggerImpl;
import com.singhfyu.designpatterns.creational.singleton.realworld.Logger.EnumLogger.Logger;
import com.singhfyu.designpatterns.creational.singleton.threadsafe.DoubleCheckedLockingSingleton;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Design patterns started");
        //lazy
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        System.out.println(lazy1==lazy2);

        //Eager
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();
        System.out.println(eager2==eager1);

        //threads - SynchronisedSingleton
        Runnable task = ()-> {
            //SynchronisedSingleton instance = SynchronisedSingleton.getInstance();
            DoubleCheckedLockingSingleton instance = DoubleCheckedLockingSingleton.getInstace();
            System.out.println(Thread.currentThread().getName() + " -> " + instance);
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        //Enum singleton
        EnumSingleton enum1 = EnumSingleton.INSTANCE;
        EnumSingleton enum2 = EnumSingleton.INSTANCE;
        System.out.println(enum1==enum2);

        //Bill Pugh singleton
        BillPughSingleton bps1 = BillPughSingleton.getInstance();
        BillPughSingleton bps2 = BillPughSingleton.getInstance();
        System.out.println(bps1==bps2);

       /* //Enum Logger
        Logger logger =  Logger.INSTANCE;
        logger.info("Application started");
        logger.debug("Debugging enabled");
        logger.warn("This is a warning");
        logger.error("Something went wrong");
*/
        //Real logger implementation
        LoggerImpl logger1 = LoggerImpl.getInstance();

        logger1.setLogFile("app.log");
        logger1.log(LogLevel.INFO, "Application started");
        logger1.log(LogLevel.DEBUG, "Loading configuration");
        logger1.log(LogLevel.WARN, "Low memory warning");
        logger1.log(LogLevel.ERROR, "Something went wrong");
        logger1.flush();
        logger1.close();

    }
}
