package com.yzj.threadstu.chapter16;

import java.util.Random;

/**
 * 作者: yzj
 * 日期: 2019/10/1
 */
public class CounterIncrement extends Thread {

    private volatile  boolean terminated = false;

    private int counter = 0;

    private Random random = new Random(System.currentTimeMillis());

    @Override
    public void run() {
        try {
            while(!terminated){
                System.out.println(Thread.currentThread().getName()+"  "+counter++);
                Thread.sleep(random.nextInt(1000));
            }
        }catch (InterruptedException e) {
//            e.printStackTrace();
        } finally{
            this.clean();
        }
    }

    private void clean(){
        System.out.println("线程关闭"+counter);
    }

    public void close(){
        this.terminated = true;
        this.interrupt();
    }
}
