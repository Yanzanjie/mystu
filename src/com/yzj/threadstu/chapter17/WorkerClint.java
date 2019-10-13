package com.yzj.threadstu.chapter17;

/**
 * 作者: yzj
 * 日期: 2019/10/13
 */
public class WorkerClint {

    public static void main(String[] args) {
        final Channel channel = new Channel(5);
        channel.startWorker();

        new TransportThread("Alex",channel).start();
        new TransportThread("jj",channel).start();
        new TransportThread("cc",channel).start();

    }
}
