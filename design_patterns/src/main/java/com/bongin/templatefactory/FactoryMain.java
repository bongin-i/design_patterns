package com.bongin.templatefactory;

import com.bongin.templatefactory.framework.Factory;
import com.bongin.templatefactory.framework.Product;
import com.bongin.templatefactory.idcard.IDCardFactory;
import com.bongin.templatefactory.showercard.ShowerCardFactory;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Factory factory1 = new ShowerCardFactory();
        Product card1 = factory.create("小明",1);
        Product card2 = factory1.create("小红",1);
        Product card3 = factory.create("小刚",2);
        Product card4 = factory1.create("小王",2);
        card1.use();
        card2.use();
        card3.use();
        card4.use();
        System.out.println(((IDCardFactory)factory).getCards());
        System.out.println(((ShowerCardFactory)factory1).getOwners());
    }
}
