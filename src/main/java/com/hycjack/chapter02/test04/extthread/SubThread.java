package com.hycjack.chapter02.test04.extthread;

import com.hycjack.chapter02.test04.service.Sub;

public class SubThread extends Thread {

    public void run(){

        Sub sub = new Sub();
        sub.operateInSubMethod();
    }

}
