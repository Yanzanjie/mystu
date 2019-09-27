package com.yzj.threadstu.chapter13;

/**
 * 作者: yzj
 * 日期: 2019/9/27
 */
public class ProducterAndConsumerClient {

    public static void main(String[] args) {
        final MessageQueue messageQueue = new MessageQueue();

        new ProducterThread(messageQueue,1).start();
        new ProducterThread(messageQueue,2).start();
        new ProducterThread(messageQueue,3).start();
        new ProducterThread(messageQueue,4).start();
        new ConsumerThread(messageQueue,1).start();
        new ConsumerThread(messageQueue,2).start();
    }
}
