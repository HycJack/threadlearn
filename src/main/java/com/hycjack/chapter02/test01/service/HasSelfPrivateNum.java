package com.hycjack.chapter02.test01.service;

public class HasSelfPrivateNum {

    public void addI(String username) {
        try {
            // 方法中的变量不存在非线程安全问题，永远都是线程安全的，这是方法内部的变量私有的特性造成的
            int num = 0;
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
