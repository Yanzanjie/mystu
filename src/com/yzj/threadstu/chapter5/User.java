package com.yzj.threadstu.chapter5;

/**
 * 作者: yzj
 * 日期: 2019/9/23
 */
public class User extends Thread {

    private final String myName;

    private final String myAddress;

    private final Gate gate;

    private static Object LOCK = new Object();

    public User(String myName, String myAddress, Gate gate) {
        this.myName = myName;
        this.myAddress = myAddress;
        this.gate = gate;
    }

    @Override
    public void run() {
        System.out.println(myName+"BEGIN");
//        synchronized (LOCK) {
            while (true) {
                this.gate.pass(myName, myAddress);
            }
//        }
    }
}
