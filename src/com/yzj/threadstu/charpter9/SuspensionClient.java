package com.yzj.threadstu.charpter9;

/**
 * 作者: yzj
 * 日期: 2019/9/26
 */
public class SuspensionClient {
    public static void main(String[] args) throws InterruptedException {

        final RequestQueue queue = new RequestQueue();
        new ClientThread(queue,"Alex").start();
        ServerThread serverThread = new ServerThread(queue);
        serverThread.start();
//        serverThread.join();
        Thread.sleep(10000);
        serverThread.close();
    }
}
