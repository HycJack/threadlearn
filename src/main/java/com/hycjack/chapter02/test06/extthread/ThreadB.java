package com.hycjack.chapter02.test06.extthread;

import com.hycjack.chapter02.test06.service.Sub;

public class ThreadB extends Thread {
    private Sub sub;

    public ThreadB(Sub sub) {
        super();
        this.sub = sub;
    }

    public void run(){
        super.run();
        sub.serviceMethod();
    }
}
