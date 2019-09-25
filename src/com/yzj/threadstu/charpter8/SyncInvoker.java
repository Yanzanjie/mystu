package com.yzj.threadstu.charpter8;

/**
 * 作者: yzj
 * 日期: 2019/9/25
 */

/**
 * Future             ->代表的是未来的一个凭据
 * FuntureTask        ->将调用逻辑进行隔离
 * FutureService      ->桥接 Funture 和 FuntureTask
 */
public class SyncInvoker {
    public static void main(String[] args) throws InterruptedException {
//        String result = get();
//        System.out.println(result);

        FutureService futureService = new FutureService();
        futureService.submit(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "FINISH";
        },System.out::println);

        System.out.println("======================");
        System.out.println("做其他事情");
        Thread.sleep(1000);
        System.out.println("======================");

//        System.out.println(future.get());
    }

    private static String get() throws InterruptedException{
        Thread.sleep(10000);
        return "FINISH";
    }
}
