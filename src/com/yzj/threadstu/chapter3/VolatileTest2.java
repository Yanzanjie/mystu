package com.yzj.threadstu.chapter3;

/**
 * 作者: yzj
 * 日期: 2019/9/22
 */
public class VolatileTest2 {

    private static int INIT_VALUE = 0;

    private final static int MAX_LIMIT = 50;

    public static void main(String[] args) {

        //因为有写的操作所以会在主内存上获取数据而不是在cache上获取
        new Thread(()->{
            while(INIT_VALUE < MAX_LIMIT){
                System.out.println("T1："+ (++INIT_VALUE));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"ADD-1").start();

        new Thread(()->{
            while(INIT_VALUE < MAX_LIMIT){
                System.out.println("T2："+ (++INIT_VALUE));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"ADD-2").start();
    }
}
