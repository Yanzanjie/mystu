package com.yzj.threadstu.chapter16;

/**
 * 作者: yzj
 * 日期: 2019/10/1
 */
public class CounterTest {

    public static void main(String[] args) throws InterruptedException {
        CounterIncrement counterIncrement = new CounterIncrement();
        counterIncrement.start();

        Thread.sleep(10000);
        counterIncrement.close();
    }
}
