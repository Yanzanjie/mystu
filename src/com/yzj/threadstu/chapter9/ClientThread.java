package com.yzj.threadstu.chapter9;

import java.util.Random;

/**
 * 作者: yzj
 * 日期: 2019/9/26
 */
public class ClientThread extends Thread {

    private final RequestQueue queue;

    private final Random random;

    private final String sendValue;

    public ClientThread(RequestQueue queue, String sendValue) {
        this.queue = queue;
        this.sendValue = sendValue;
        random = new Random(System.currentTimeMillis());
    }

    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println("Client -> request "+sendValue);
            queue.putRequest(new Request(sendValue));
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
