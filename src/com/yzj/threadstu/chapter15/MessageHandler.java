package com.yzj.threadstu.chapter15;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 作者: yzj
 * 日期: 2019/9/28
 */
public class MessageHandler {

    private final static Random random = new Random(System.currentTimeMillis());

    private final static Executor executor = Executors.newFixedThreadPool(5);

    public void request(Message message){
        executor.execute(()->{
            String value = message.getValue();
            try {
                Thread.sleep(random.nextInt(1000));
                System.out.println("线程休息结束:"+Thread.currentThread().getName()+" "+value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
//        new Thread(()->{
//            String value = message.getValue();
//            try {
//                Thread.sleep(random.nextInt(1000));
//                System.out.println("线程休息结束:"+Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }).start();
    }
    public void shutdown(){
        ((ExecutorService) executor).shutdown();
    }
}
