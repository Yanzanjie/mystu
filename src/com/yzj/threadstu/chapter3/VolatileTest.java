package com.yzj.threadstu.chapter3;

/**
 * 作者: yzj
 * 日期: 2019/9/22
 */
public class VolatileTest {

    private volatile static int INIT_VALUE = 0;

    private final static int MAX_LIMIT = 5;

    public static void main(String[] args) {

        new Thread(()->{
            int localValue = INIT_VALUE;
            while(localValue < MAX_LIMIT){
                if(localValue != INIT_VALUE){
                    System.out.println("数据被更新了"+INIT_VALUE);
                    localValue = INIT_VALUE;
                }
            }
        },"Reader").start();

        new Thread(()->{
            int localValue = INIT_VALUE;
            while(INIT_VALUE < MAX_LIMIT){
                System.out.println("将数据更新到"+ ++localValue);
                INIT_VALUE = localValue;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Updater").start();
    }
}
