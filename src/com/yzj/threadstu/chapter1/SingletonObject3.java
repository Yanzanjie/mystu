package com.yzj.threadstu.chapter1;

/**
 * 作者: yzj
 * 日期: 2019/9/22
 */
public class SingletonObject3 {

    private static SingletonObject3 instance;

    private SingletonObject3(){

    }

    private synchronized static SingletonObject3 getInstance(){
        if(null == instance)
            instance = new SingletonObject3();
        return SingletonObject3.instance;
    }
}
