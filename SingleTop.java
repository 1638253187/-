package com.example.day_two_lx;

public class SingleTop {
    //懒汉模式 单例模式 双检锁
    private static SingleTop singleTop;

    public SingleTop() {
    }

    public static SingleTop getSingleTop() {
        if (singleTop == null) {
            synchronized (SingleTop.class) {
                if (singleTop == null) {
                    singleTop = new SingleTop();
                }
            }
        }
        return singleTop;
    }
}
