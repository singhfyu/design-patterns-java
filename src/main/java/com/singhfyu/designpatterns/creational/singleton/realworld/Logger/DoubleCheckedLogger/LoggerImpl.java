package com.singhfyu.designpatterns.creational.singleton.realworld.Logger.DoubleCheckedLogger;


//import org.springframework.boot.logging.LogLevel;
import java.io.PrintWriter;
import java.io.FileWriter;

public class LoggerImpl implements Logger {
   // private static final String LocaDateTime = null;
    private static LoggerImpl instance;
    private String filePath;
    private PrintWriter printWriter;
    private LoggerImpl(){}
    public static LoggerImpl getInstance(){
        if(instance==null){
            synchronized(LoggerImpl.class){
                if(instance==null){
                    instance= new LoggerImpl();
                }
            }
        }
        return instance;
    }

    public static void resetInstance(){
        instance=null;
    }

    @Override
    public void log(LogLevel level, String message) {
        if(printWriter == null){
            throw new IllegalStateException("Logger not initialised");
        }
        String logMessage = System.currentTimeMillis()
                +"["+level + "]"
                + message;

        printWriter.println(logMessage);
    }

    @Override
    public void setLogFile(String filePath) {
        try{
            this.filePath=filePath;
            this.printWriter= new PrintWriter(new FileWriter(filePath,true));
        } catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getLogFile() {
        return filePath;
    }

    @Override
    public void flush() {
        if(printWriter != null)
            printWriter.flush();
    }

    @Override
    public void close() {
        if(printWriter != null)
            printWriter.close();
        printWriter=null;
    }
}
