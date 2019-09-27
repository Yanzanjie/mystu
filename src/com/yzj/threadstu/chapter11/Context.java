package com.yzj.threadstu.chapter11;

/**
 * 作者: yzj
 * 日期: 2019/9/26
 */
public class Context {

    private String name;
    private String cardId;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardId() {
        return cardId;
    }
}
