package com.yzj.threadstu.chapter1;

/**
 * 作者: yzj
 * 日期: 2019/9/22
 */
public class SingletonObject6 {

    private SingletonObject6(){

    }
    private static class InstanceHolder{
        private final static SingletonObject6 instance = new SingletonObject6();
    }

    private static SingletonObject6 getInstance(){
        return InstanceHolder.instance;
    }
}
