package com.yzj.threadstu.charpter7;

import java.util.stream.IntStream;

/**
 * 作者: yzj
 * 日期: 2019/9/24
 */
public class ImmutableClient {
    public static void main(String[] args) {
        Person person = new Person("Al","gs");

        IntStream.range(0,5).forEach(i->{
            new UsePersonThread(person).start();
        });
    }
}
