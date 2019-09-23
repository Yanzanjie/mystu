package com.yzj.threadstu.chapter4;

import java.util.Arrays;

/**
 * 作者: yzj
 * 日期: 2019/9/23
 */
public class ThreadLifeCycleClient {

    public static void main(String[] args){
        new ThreadLifeCycleObserver().concurrentQuery(Arrays.asList("1","2"));
    }
}
