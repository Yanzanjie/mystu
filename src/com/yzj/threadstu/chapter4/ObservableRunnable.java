package com.yzj.threadstu.chapter4;

/**
 * 作者: yzj
 * 日期: 2019/9/23
 */
public abstract class ObservableRunnable implements Runnable {

    final protected LifeCycleListener listener;

    public ObservableRunnable(final LifeCycleListener listener){
        this.listener = listener;
    }

    protected void notifyChange(final RunnableEvent event){
        listener.onEvent(event);
    }

    public enum RunnableState{
        RUNNING,ERROR,DONE;
    }

    public static class RunnableEvent{
        private final RunnableState state;
        private final Thread thread;
        private final Throwable caues;


        public RunnableEvent(RunnableState state, Thread thread, Throwable caues) {
            this.state = state;
            this.thread = thread;
            this.caues = caues;
        }

        public RunnableState getState() {
            return state;
        }

        public Thread getThread() {
            return thread;
        }

        public Throwable getCaues() {
            return caues;
        }
    }

}
