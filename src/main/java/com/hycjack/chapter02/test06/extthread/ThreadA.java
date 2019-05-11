package com.hycjack.chapter02.test06.extthread;

import com.hycjack.chapter02.test06.service.Sub;

public class ThreadA extends Thread {
    private Sub sub;

    public ThreadA(Sub sub) {
        super();
        this.sub = sub;
    }

    public void run(){
        super.run();
        sub.serviceMethod();
    }
}
