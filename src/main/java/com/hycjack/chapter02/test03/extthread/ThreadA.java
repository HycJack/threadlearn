package com.hycjack.chapter02.test02.extthread;

import com.hycjack.chapter02.test02.extobject.MyObject;

public class ThreadA extends Thread {
    private MyObject object;

    public ThreadA(MyObject object) {
        super();
        this.object = object;
    }

    public void run(){
        super.run();
        object.methodA();
    }
}
