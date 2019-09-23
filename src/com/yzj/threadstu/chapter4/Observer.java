package com.yzj.threadstu.chapter4;

/**
 * 作者: yzj
 * 日期: 2019/9/23
 */
public abstract class Observer {

    protected Subject subject;

    public Observer(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    public abstract void update();
}
