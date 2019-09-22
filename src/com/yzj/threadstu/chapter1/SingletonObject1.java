package com.yzj.threadstu.chapter1;

/**
 * 作者: yzj
 * 日期: 2019/9/22
 */
public class SingletonObject1 {

    //不能懒加载
    private static final SingletonObject1 instance = new SingletonObject1();

    private SingletonObject1(){

    }

    private static SingletonObject1 getInstance(){
        return instance;
    }
}
