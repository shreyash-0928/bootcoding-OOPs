package com.bootcoding.java.OOPs.Singleton;

public class Singleton {

    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        // Check weather one object is created or not
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
