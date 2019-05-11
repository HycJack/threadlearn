package com.hycjack.chapter02.test06.service;

public class Sub extends Main {

    /**
     * 同步不能继承，可以在子类方法行添加synchronized关键字
     */
     public void serviceMethod() {
        try {
            System.out.println("int sub 下一步 sleep begin threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步 sleep end threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
