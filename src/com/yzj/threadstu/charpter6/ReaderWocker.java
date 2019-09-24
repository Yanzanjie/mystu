package com.yzj.threadstu.charpter6;

/**
 * 作者: yzj
 * 日期: 2019/9/24
 */
public class ReaderWocker extends Thread {

    private final ShareData data;

    public ReaderWocker(ShareData data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            while (true) {
                char[] readBuf = data.read();
                System.out.println(Thread.currentThread().getName()+"读："+
                        String.valueOf(readBuf));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
