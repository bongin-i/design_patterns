package com.bongin.templatemethod;

public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();

    /**
     * 使用final修饰的方法无法被重写，但是该方法可以被子类继承，这里使用final的原因：
     * 个人认为是为了保证各个子类行为的一致性
     */
    public final void display() {
        open();
        for(int i = 0;i < 5;i ++) {
            print();
        }
        close();
    }
}
