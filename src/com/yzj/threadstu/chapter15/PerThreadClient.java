package com.yzj.threadstu.chapter15;

import java.util.stream.IntStream;

/**
 * 作者: yzj
 * 日期: 2019/9/28
 */
public class PerThreadClient {

    public static void main(String[] args) {
        final MessageHandler handler = new MessageHandler();
        IntStream.rangeClosed(0,10).forEach(i->handler.request(new Message(String.valueOf(i))));

        handler.shutdown();
    }
}
