package com.yzj.threadstu.chapter17;

import java.util.Random;

/**
 * 作者: yzj
 * 日期: 2019/10/11
 */
public class WorkerThread extends Thread{

    private final Channel channel;

    private static final Random random = new Random(System.currentTimeMillis());

    public WorkerThread(String name,Channel channel){
        super(name);
        this.channel = channel;
    }

    @Override
    public void run() {
        while(true){
            channel.take().exectue();
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
