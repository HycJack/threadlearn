package com.hycjack.chapter02.test05.test;

import com.hycjack.chapter02.test05.extthread.ThreadA;
import com.hycjack.chapter02.test05.extthread.ThreadB;
import com.hycjack.chapter02.test05.service.Service;

/**
 * 出现异常，锁自动释放
 */
public class Run {
    public static void main(String[] args) {
        test01();

    }

    private static void test01() {
        try {
            Service service = new Service();
            ThreadA athread = new ThreadA(service);
            athread.setName("a");
            athread.start();
            Thread.sleep(500);
            ThreadB bthread = new ThreadB(service);
            bthread.setName("b");
            bthread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
