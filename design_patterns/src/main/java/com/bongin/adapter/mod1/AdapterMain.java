package com.bongin.adapter.mod1;

public class AdapterMain {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

    }
}
