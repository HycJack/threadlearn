package com.hycjack.chapter02.test04.service;

public class Sub extends Main {

    synchronized public void operateInSubMethod(){
        try {
            while (this.i > 0) {
                i--;
                System.out.println("Sub print i = " + i);
                Thread.sleep(100);
                this.operateInMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
