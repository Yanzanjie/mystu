package com.yzj.threadstu.chapter11;

/**
 * 作者: yzj
 * 日期: 2019/9/26
 */
public class ExecutionTask implements Runnable {

    private QueryFromDBAction queryAction = new QueryFromDBAction();

    private QueryFromHttpAction httpAction = new QueryFromHttpAction();

    @Override
    public void run() {

        queryAction.execute();
        System.out.println("成功获取名称");
        httpAction.execture();
        System.out.println("成功获取卡号");
        Context context = ActionContext.getActionContext().getContext();
        System.out.println("姓名："+context.getName()+"卡号："+context.getCardId());

    }
}
