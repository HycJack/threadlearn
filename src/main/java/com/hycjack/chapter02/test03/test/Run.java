package com.hycjack.chapter02.test03.test;

import com.hycjack.chapter02.test03.entity.PublicVar;
import com.hycjack.chapter02.test03.extthread.ThreadA;

/**
 * 脏读
 */
public class Run {
    public static void main(String[] args) {
        test01();

    }

    private static void test01() {
        try {
            PublicVar publicVarRef = new PublicVar();
            ThreadA thread = new ThreadA(publicVarRef);
            thread.setName("A");
            thread.start();
            Thread.sleep(1000);
            publicVarRef.getVlaue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
