package com.yzj.threadstu.chapter1;

/**
 * 作者: yzj
 * 日期: 2019/9/22
 */
public class SingletonObject2 {

    private static SingletonObject2 instance;

    private SingletonObject2(){

    }

    private static SingletonObject2 getInstance(){
        if(null == instance)
            instance = new SingletonObject2();
        return instance;
    }
}
