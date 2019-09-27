package com.yzj.threadstu.chapter13;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 作者: yzj
 * 日期: 2019/9/27
 */
public class ConsumerThread extends Thread {

    private final MessageQueue messageQueue;

    private final static Random random  = new Random();

    public ConsumerThread(MessageQueue messageQueue,int seq) {
        super("COMSUMER"+seq);
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        while(true){
            try {
                Message message = messageQueue.take();
                System.out.println(Thread.currentThread().getName()+"出来的消息"+message.getData());
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
