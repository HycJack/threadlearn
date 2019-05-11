package com.hycjack.chapter02.test04.extthread;

import com.hycjack.chapter02.test04.service.Service;

public class MyThread extends Thread {

    public void run(){
        super.run();
        Service service = new Service();
        service.service1();
    }
}
