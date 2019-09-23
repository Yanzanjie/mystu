package com.yzj.threadstu.chapter4;

import java.util.List;

/**
 * 作者: yzj
 * 日期: 2019/9/23
 */
public class ThreadLifeCycleObserver implements  LifeCycleListener{

    private final Object LOCK = new Object();

    public void concurrentQuery(List<String> ids){
        if(ids == null || ids.isEmpty())
            return;

        ids.stream().forEach(id -> new Thread(new ObservableRunnable(this) {
            @Override
            public void run() {
                try{
                    notifyChange(new RunnableEvent(RunnableState.RUNNING,Thread.currentThread(),null));
                    System.out.println("当前ID："+id);
                    Thread.sleep(1000L);
                    notifyChange(new RunnableEvent(RunnableState.DONE,Thread.currentThread(),null));
                } catch (Exception e) {
                    notifyChange(new RunnableEvent(RunnableState.DONE,Thread.currentThread(),e));
                }
            }
        },id).start());
    }

    @Override
    public void onEvent(ObservableRunnable.RunnableEvent event) {
        synchronized (LOCK){
            System.out.println("在运行的线程："+event.getThread().getName()+"数据和状态变化："+
                    event.getState());

            if(event.getCaues() != null){
                System.out.println("在运行的线程："+event.getThread().getName()+"失败了");
                event.getCaues().printStackTrace();
            }
        }
    }
}
