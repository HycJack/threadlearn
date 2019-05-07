package com.hycjack.chapter02.test02.service;

public class HasSelfPrivateNum {
    // 若两个线程同时操作业务对象中的实例变量，则有可能会出现非线程安全问题
    // 只需要在方法前加关键字synchronized即可
    private int num = 0;
    synchronized public void addI(String username) {
        try {
            // 方法中的变量不存在非线程安全问题，永远都是线程安全的，这是方法内部的变量私有的特性造成的
//            int num = 0;
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
