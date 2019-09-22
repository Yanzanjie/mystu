package com.yzj.threadstu.chapter1;

/**
 * 作者: yzj
 * 日期: 2019/9/22
 */
public class SingletonObject5 {

    //将instance设置为可见并禁止重排
    private static volatile SingletonObject5 instance;

    private SingletonObject5(){

    }

    //两次检查
    private static SingletonObject5 getInstance(){
        if(null == instance){
            synchronized (SingletonObject5.class){
                if(null == instance)
                    instance = new SingletonObject5();
            }
        }
        return SingletonObject5.instance;
    }
}
