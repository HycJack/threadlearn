package com.hycjack.chapter02.test01.test;

import com.hycjack.chapter02.test01.extthread.ThreadA;
import com.hycjack.chapter02.test01.extthread.ThreadB;
import com.hycjack.chapter02.test01.service.HasSelfPrivateNum;

/**
 * 方法内变量为线程安全
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA athread = new ThreadA(numRef);
        athread.start();
        ThreadB bthread = new ThreadB(numRef);
        bthread.start();

    }
}
