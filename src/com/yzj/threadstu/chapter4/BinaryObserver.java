package com.yzj.threadstu.chapter4;

/**
 * 作者: yzj
 * 日期: 2019/9/23
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("二进制："+Integer.toBinaryString(subject.getState()));
    }
}
