package com.yzj.threadstu.charpter11;

import java.util.stream.IntStream;

/**
 * 作者: yzj
 * 日期: 2019/9/26
 */
public class ContextTest {
    public static void main(String[] args) {

        IntStream.range(1,5).forEach(i->
            new Thread(new ExecutionTask()).start()
        );
    }
}
