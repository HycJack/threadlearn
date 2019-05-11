package com.hycjack.chapter02.test04.test;

import com.hycjack.chapter02.test04.extthread.MyThread;
import com.hycjack.chapter02.test04.extthread.SubThread;

/**
 * synchronized 重入锁
 * 可重入锁的概念：自己可以再次获取自己内部的锁，比如有1条线程获得了某个对象的锁，此时这个对象锁还没有释放，当其再次想要获取这个对象的锁的时候还是可以获取的
 * 如果不可重入锁的话，就会找出死锁
 * 可重入锁也支持在父子类继承关系的环境中
 */
public class Run {
    public static void main(String[] args) {
        test01();
        test02();

    }

    private static void test02() {
        try {

            SubThread thread = new SubThread();
            thread.setName("SubThread");
            thread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void test01() {
        try {

            MyThread thread = new MyThread();
            thread.setName("MyThread");
            thread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
