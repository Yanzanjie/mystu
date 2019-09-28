package com.yzj.threadstu.chapter14;

/**
 * 作者: yzj
 * 日期: 2019/9/28
 */
public class CountDown {

    private final int total;

    private int counter = 0;

    public CountDown(int total) {
        this.total = total;
    }

    public void down(){
        synchronized (this){
            this.counter++;
            this.notifyAll();
        }
    }

    public void await() throws InterruptedException {
        synchronized (this){
            while(counter != total){
                this.wait();
            }
        }
    }
}
