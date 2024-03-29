package com.yzj.threadstu.chapter5;

/**
 * 作者: yzj
 * 日期: 2019/9/23
 */
public class Gate {

    private int counter = 0;

    private String name = "Nobody";

    private String address = "Nowhere";

    //临界值
    public synchronized void pass(String name,String address){
        this.counter++;
        this.name = name;
        this.address = address;
        verify();
    }

    private void verify() {
        if(this.name.charAt(0) != this.address.charAt(0)){
            System.out.println("*********出现问题*******"+toString());
        }
    }
    public synchronized String toString(){
        return "No."+ counter + ":" + name + "," + address;
    }
}
