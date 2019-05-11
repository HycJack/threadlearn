package com.hycjack.chapter02.test04.service;

public class Service {

    synchronized public void service1(){
        System.out.println("service 1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service 2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service 3");
    }
}
