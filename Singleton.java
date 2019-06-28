package com.example.day_two_lx;

public class Singleton {
    private static  Singleton instance;

    public Singleton() {
    }

    public static synchronized Singleton getSingleton() {
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
