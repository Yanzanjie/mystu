package com.yzj.threadstu.chapter13;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 作者: yzj
 * 日期: 2019/9/27
 */
public class ProducterThread extends Thread {

    private final MessageQueue messageQueue;

    private final static Random random  = new Random();

    private final static AtomicInteger counter = new AtomicInteger(0);

    public ProducterThread(MessageQueue messageQueue,int seq) {
        super("PRODUCTER"+seq);
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        while(true){
            try {
                Message message = new Message("Message" + counter.getAndIncrement());
                messageQueue.put(message);
                System.out.println(Thread.currentThread().getName()+"进入的消息"+message.getData());
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
