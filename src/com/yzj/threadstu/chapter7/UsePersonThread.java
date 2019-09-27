package com.yzj.threadstu.chapter7;

/**
 * 作者: yzj
 * 日期: 2019/9/24
 */
public class UsePersonThread extends Thread {

    private Person person;

    public UsePersonThread(Person person){
        this.person = person;
    }

    @Override
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName()+" print "+person.toString());
        }
    }
}
