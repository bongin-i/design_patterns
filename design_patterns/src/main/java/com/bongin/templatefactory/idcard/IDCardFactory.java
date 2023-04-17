package com.bongin.templatefactory.idcard;

import com.bongin.templatefactory.entity.Card;
import com.bongin.templatefactory.framework.Factory;
import com.bongin.templatefactory.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List cards = new ArrayList();

    @Override
    protected Product createProduct(String owner,Integer no) {
        Card card = new Card(owner,no);
        return new IDCard(card);
    }

    @Override
    protected void registerProduct(Product product) {
        cards.add(((IDCard)product).getCard());
    }

    public List getCards() {
        return cards;
    }
}
