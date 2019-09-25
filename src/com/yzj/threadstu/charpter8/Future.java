package com.yzj.threadstu.charpter8;

public interface Future<T> {

    T get() throws InterruptedException;


}
