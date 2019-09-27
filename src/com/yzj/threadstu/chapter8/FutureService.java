package com.yzj.threadstu.chapter8;

import java.util.function.Consumer;

/**
 * 作者: yzj
 * 日期: 2019/9/25
 */
public class FutureService {

    public <T> Future<T> submit(final FutureTask<T> task){
        AsynFuture<T> asynFuture =  new AsynFuture<>();
        new Thread(()->{
            T result = task.call();
            asynFuture.done(result);
        }).start();
        return asynFuture;
    }

    public <T> Future<T> submit(final FutureTask<T> task,final Consumer<T> consumer){
        AsynFuture<T> asynFuture =  new AsynFuture<>();
        new Thread(()->{
            T result = task.call();
            asynFuture.done(result);
            consumer.accept(result);
        }).start();
        return asynFuture;
    }
}
