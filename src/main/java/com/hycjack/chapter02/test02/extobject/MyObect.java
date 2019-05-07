package com.hycjack.chapter02.test02.extobject;

public class MyObect {
    public void methodA(){
        try{
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName() );
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
