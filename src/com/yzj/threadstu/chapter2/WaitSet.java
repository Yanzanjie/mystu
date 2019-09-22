package com.yzj.threadstu.chapter2;

import java.util.Optional;
import java.util.stream.IntStream;

/**
 * 作者: yzj
 * 日期: 2019/9/22
 */
public class WaitSet {

    private static final Object LOCK = new Object();

    private static void work(){
        synchronized (LOCK){
            System.out.println("Begin....");
            try {
                System.out.println("线程将进入等待");
                LOCK.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程等待结束");
        }
    }

    //1.所有的对象都有一个wait set,是用来存放调用了该对象wait方法后进入block状态的线程
    //2.线程被notify之后不一定立即执行
    //3.线程被从wait set中被唤醒后顺序不一定与wait顺序相同
    //4.线程被唤醒后要重新获取锁，但是会有记录到等待前所被等待的地方，
    // 获取锁后再从被等待的地方重新执行。
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                work();
            }
        }.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (LOCK){
            LOCK.notify();
        }


        IntStream.rangeClosed(1,10).forEach(i->new Thread(String.valueOf(i)){
            @Override
            public void run() {
                synchronized (LOCK){
                    try {
                        Optional.of(Thread.currentThread().getName()+"准备等待")
                                .ifPresent(System.out::println);
                        LOCK.wait();
                        Optional.of(Thread.currentThread().getName()+"等待结束")
                                .ifPresent(System.out::println);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        IntStream.rangeClosed(1,10).forEach(i->{
                    synchronized(LOCK){
                        LOCK.notify();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
        }
        );
    }
}
