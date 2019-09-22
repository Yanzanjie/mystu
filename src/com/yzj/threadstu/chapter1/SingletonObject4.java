package com.yzj.threadstu.chapter1;

/**
 * 作者: yzj
 * 日期: 2019/9/22
 */
public class SingletonObject4 {

    private static SingletonObject4 instance;

    private SingletonObject4(){

    }

    //两次检查
    private static SingletonObject4 getInstance(){
        if(null == instance){
            synchronized (SingletonObject4.class){
                if(null == instance)
                    instance = new SingletonObject4();
            }
        }

        return SingletonObject4.instance;
    }
}
