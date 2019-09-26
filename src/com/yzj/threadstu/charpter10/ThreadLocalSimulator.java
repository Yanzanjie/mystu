package com.yzj.threadstu.charpter10;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者: yzj
 * 日期: 2019/9/26
 */
public class ThreadLocalSimulator<T> {

    private final Map<Thread,T> storage = new HashMap<>();

    public void set(T t){
        synchronized (this){
            Thread key = Thread.currentThread();
            storage.put(key,t);
        }
    }

    public T get(){
        synchronized (this){
            Thread key = Thread.currentThread();
            T value = storage.get(key);
            if(value == null){
                return initialValue();
            }
            return value;
        }
    }

    private T initialValue() {
        return null;
    }
}
