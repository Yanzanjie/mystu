package com.yzj.threadstu.charpter11;

/**
 * 作者: yzj
 * 日期: 2019/9/26
 */
public class QueryFromDBAction {

    public void execute(){
        try {
            Thread.sleep(1000);
            String name = "Alex"+Thread.currentThread().getId();
            ActionContext.getActionContext().getContext().setName(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
