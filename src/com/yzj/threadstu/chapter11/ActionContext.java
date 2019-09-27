package com.yzj.threadstu.chapter11;

/**
 * 作者: yzj
 * 日期: 2019/9/26
 */
public final class ActionContext {

    private static final ThreadLocal<Context> threadLocal = new ThreadLocal<Context>(){

        @Override
        protected Context initialValue() {
            return new Context();
        }
    };

    private static class ContextHolder{
        private final static ActionContext actionContext = new ActionContext();

    }

    public static ActionContext getActionContext(){
        return ContextHolder.actionContext;
    }

    public Context getContext(){
        return threadLocal.get();
    }
}
