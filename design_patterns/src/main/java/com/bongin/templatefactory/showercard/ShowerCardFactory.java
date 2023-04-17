package com.bongin.templatefactory.showercard;

import com.bongin.templatefactory.entity.Card;
import com.bongin.templatefactory.framework.Factory;
import com.bongin.templatefactory.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class ShowerCardFactory extends Factory {
    private List cards = new ArrayList();

    @Override
    protected Product createProduct(String owner,Integer no) {
        Card card = new Card(owner,no);
        return new ShowerCard(card);
    }

    @Override
    protected void registerProduct(Product product) {
        cards.add(((ShowerCard)product).getCard());
    }

    public List getOwners() {
        return cards;
    }
}
