package com.yzj.threadstu.chapter10;

/**
 * 作者: yzj
 * 日期: 2019/9/26
 */
public class ThreadLocalSimpleTest {

    private static ThreadLocal<String> threadLocal = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return "Alex1";
        }
    };

    public static void main(String[] args) throws InterruptedException {
//        threadLocal.set("Alex");
        Thread.sleep(1000);
        String value = threadLocal.get();
        System.out.println(value);
    }
}
