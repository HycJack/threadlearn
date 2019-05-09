package com.hycjack.chapter02.test02.test;

import com.hycjack.chapter02.test02.extobject.MyObject;
import com.hycjack.chapter02.test02.extthread.ThreadA;
import com.hycjack.chapter02.test02.extthread.ThreadB;
import com.hycjack.chapter02.test02.service.HasSelfPrivateNum;

/**
 * 验证synchronized是对象锁
 */
public class Run {
    public static void main(String[] args) {
        test01();

    }

    private static void test01() {
        MyObject object = new MyObject();
        ThreadA athread = new ThreadA(object);
        athread.setName("A");
        ThreadB bthread = new ThreadB(object);
        bthread.setName("B");
        athread.start();
        bthread.start();
    }

}
