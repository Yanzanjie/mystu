package com.yzj.text;

/**
 * 作者: yzj
 * 日期: 2019/9/29
 */
public class TextThis {

    private static Object a =3;

    private Object b = 3;

    private boolean eq(){
//        System.out.println(this);
//        System.out.println(a);
//        System.out.println(b);
        return a.equals(b);
    }

    public static void main(String[] args) {
        TextThis tt = new TextThis();
        tt.eq();
        System.out.println(tt.eq());
    }
}
