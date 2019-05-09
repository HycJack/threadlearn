package com.hycjack.chapter02.test02.extobject;

/**
 * 调用synchronized一定是排队的，
 * A先持有object的对象的Lock锁，B线程可以以异步的方式调用object对象中的非synchronized方法
 * 先持有object的对象的Lock锁，B线程如果调用object对象中的synchronized方法，则需要等待，即同步
 */
public class MyObject {

    synchronized public void methodA(){
        try{
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName() );
            Thread.sleep(5000);
            System.out.println("end, endTime= " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized public void methodB(){
        try{
            System.out.println("begin methodB threadName=" + Thread.currentThread().getName() + "begin Time= " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
