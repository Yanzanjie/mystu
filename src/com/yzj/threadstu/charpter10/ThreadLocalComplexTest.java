package com.yzj.threadstu.charpter10;

import java.util.Random;

/**
 * 作者: yzj
 * 日期: 2019/9/26
 */
public class ThreadLocalComplexTest {

    private final static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    private final static Random random = new Random(System.currentTimeMillis());
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() ->{
           threadLocal.set("Thread-t1");
            try {
                Thread.sleep(random.nextInt(1000));
                System.out.println(Thread.currentThread().getName()+""+threadLocal.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t1");

        Thread t2 = new Thread(() ->{
            threadLocal.set("Thread-t2");
            try {
                Thread.sleep(random.nextInt(1000));
                System.out.println(Thread.currentThread().getName()+""+threadLocal.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("=======================");
        System.out.println(Thread.currentThread().getName()+""+threadLocal.get());
    }
}
