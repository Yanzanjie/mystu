package com.yzj.threadstu.chapter9;

import java.util.LinkedList;

/**
 * 作者: yzj
 * 日期: 2019/9/26
 */
public class RequestQueue {

    private final LinkedList<Request> queue = new LinkedList<>();

    public Request getRequest(){
        synchronized (queue){
            while (queue.size() <= 0 ){
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    return null;
                }
            }
            return queue.removeFirst();
        }
    }

    public void putRequest(Request request){
        synchronized (queue){
            queue.addLast(request);
            queue.notifyAll();
        }
    }
}
