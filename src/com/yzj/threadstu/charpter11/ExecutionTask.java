package com.yzj.threadstu.charpter11;

/**
 * 作者: yzj
 * 日期: 2019/9/26
 */
public class ExecutionTask implements Runnable {

    private QueryFromDBAction queryAction = new QueryFromDBAction();

    private QueryFromHttpAction httpAction = new QueryFromHttpAction();

    @Override
    public void run() {
        final Context context = new Context();
        queryAction.execute(context);
        System.out.println("成功获取名称");
        httpAction.execture(context);
        System.out.println("成功获取卡号");
        System.out.println("姓名："+context.getName()+"卡号："+context.getCardId());

    }
}
