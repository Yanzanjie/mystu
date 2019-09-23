package com.yzj.threadstu.chapter4;

/**
 * 作者: yzj
 * 日期: 2019/9/23
 */
public class ObserverClient {

    public static void main(String[] args) {

        final Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        System.out.println("======================");
        subject.setState(10);

        System.out.println("======================");
        subject.setState(10);

        System.out.println("======================");
        subject.setState(15);
    }
}
