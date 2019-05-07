package com.hycjack.chapter02.test02.test;

import com.hycjack.chapter02.test02.extthread.ThreadA;
import com.hycjack.chapter02.test02.extthread.ThreadB;
import com.hycjack.chapter02.test02.service.HasSelfPrivateNum;

/**
 * 方法内变量为线程安全
 */
public class Run {
    public static void main(String[] args) {
        test01();
//        test02();

    }

    private static void test01() {
        // 两个线程同时访问一个没有同步的方法
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA athread = new ThreadA(numRef);
        athread.start();
        ThreadB bthread = new ThreadB(numRef);
        bthread.start();
    }

    /**
     * 多个对象对个锁，twoObjectTwoLock
     * 两个线程分别访问同一个类的两个不同实例的相同名称的同步方法，效果是以异步的方式运行的
     */
    private static void test02() {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        ThreadA athread = new ThreadA(numRef1);
        athread.start();
        ThreadB bthread = new ThreadB(numRef2);
        bthread.start();
    }
}
