package com.hycjack.chapter02.test01.extthread;

import com.hycjack.chapter02.test01.service.HasSelfPrivateNum;

public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    public void run(){
        super.run();
        numRef.addI("b");
    }
}
