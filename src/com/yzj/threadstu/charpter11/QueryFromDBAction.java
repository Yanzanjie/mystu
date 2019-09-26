package com.yzj.threadstu.charpter11;

/**
 * 作者: yzj
 * 日期: 2019/9/26
 */
public class QueryFromDBAction {

    public void execute(Context context){
        try {
            Thread.sleep(1000);
            String name = "Alex"+Thread.currentThread().getId();
            context.setName(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
