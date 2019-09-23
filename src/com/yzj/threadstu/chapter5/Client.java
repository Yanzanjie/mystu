package com.yzj.threadstu.chapter5;

/**
 * 作者: yzj
 * 日期: 2019/9/23
 */
public class Client {

    public static void main(String[] args) {
        Gate gate = new Gate();
        User bj = new User("Baobao","Beijing",gate);
        User sh = new User("shangHai","shanghai",gate);
        User gz = new User("guangZhou","guangzhou",gate);

        bj.start();
        sh.start();
        gz.start();
    }
}
