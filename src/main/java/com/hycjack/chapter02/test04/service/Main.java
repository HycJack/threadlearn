package com.hycjack.chapter02.test04.service;

public class Main {
    public int i = 10;

    synchronized public void operateInMainMethod(){
        try{
            i--;
            System.out.println("main print i = " + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
