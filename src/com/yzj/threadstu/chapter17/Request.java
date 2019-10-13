package com.yzj.threadstu.chapter17;

/**
 * 作者: yzj
 * 日期: 2019/10/11
 */
public class Request {

    private final String name;

    private final int number;


    public Request(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void exectue(){
        System.out.println(Thread.currentThread().getName()+"exectue"+this);
    }

    @Override
    public String toString(){
        return "Request => No. "+number +"Name "+name;
    }
}
