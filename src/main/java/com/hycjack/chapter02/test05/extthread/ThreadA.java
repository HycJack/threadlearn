package com.hycjack.chapter02.test05.extthread;

import com.hycjack.chapter02.test05.service.Service;

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    public void run(){
        super.run();
        service.testMethod();
    }
}
