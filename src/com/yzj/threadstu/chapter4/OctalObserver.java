package com.yzj.threadstu.chapter4;

/**
 * 作者: yzj
 * 日期: 2019/9/23
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("八进制："+Integer.toOctalString(subject.getState()));
    }
}
