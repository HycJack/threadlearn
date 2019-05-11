package com.hycjack.chapter02.test03.extthread;

import com.hycjack.chapter02.test03.entity.PublicVar;

public class ThreadA extends Thread {
    private PublicVar object;

    public ThreadA(PublicVar object) {
        super();
        this.object = object;
    }

    public void run(){
        super.run();
        object.setValue("B", "BB");
    }
}
