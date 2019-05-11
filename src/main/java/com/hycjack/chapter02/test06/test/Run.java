package com.hycjack.chapter02.test06.test;

import com.hycjack.chapter02.test06.extthread.ThreadA;
import com.hycjack.chapter02.test06.extthread.ThreadB;
import com.hycjack.chapter02.test06.service.Sub;

/**
 * 同步不具备继承性
 */
public class Run {
    public static void main(String[] args) {
        test01();

    }

    private static void test01() {
        Sub subRef = new Sub();
        ThreadA athread = new ThreadA(subRef);
        athread.setName("A");
        athread.start();
        ThreadB bthread = new ThreadB(subRef);
        bthread.setName("B");
        bthread.start();
    }
}
