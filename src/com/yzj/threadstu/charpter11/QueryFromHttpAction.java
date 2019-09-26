package com.yzj.threadstu.charpter11;

/**
 * 作者: yzj
 * 日期: 2019/9/26
 */
public class QueryFromHttpAction {
    public void execture(Context context){
        String name = context.getName();
        String cardId = getCardId(name);
        context.setCardId(cardId);
    }

    private String getCardId(String name){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "123456789"+Thread.currentThread().getId();
    }
}
