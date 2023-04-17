package com.bongin.adapter.mod1;

/**
 * 使用继承方式的适配器
 */

public class Banner {
    private String str;

    public Banner(String str) {
        this.str = str;
    }

    public Banner() {
    }

    public void showWithParen() {
        System.out.println("(" + str + ")");
    }

    public void showWithAster() {
        System.out.println("*" + str + "*");
    }
}
