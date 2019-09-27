package com.yzj.threadstu.chapter6;

import java.util.Random;

/**
 * 作者: yzj
 * 日期: 2019/9/24
 */
public class WriterWorker extends  Thread{

    private static final Random random = new Random(System.currentTimeMillis());

    private final ShareData data;

    private final String filler;

    private int index = 0;


    public WriterWorker(ShareData data, String filler) {
        this.data = data;
        this.filler = filler;
    }

    @Override
    public void run() {
        try {
            while(true){
                char c = nexChar();
                data.write(c);
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private char nexChar(){
        char c = filler.charAt(index);
        index++;
        if(index >= filler.length()){
            index = 0;
        }
        return c;
    }
}
