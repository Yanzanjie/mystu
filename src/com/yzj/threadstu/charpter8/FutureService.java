package com.yzj.threadstu.charpter8;

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
}
