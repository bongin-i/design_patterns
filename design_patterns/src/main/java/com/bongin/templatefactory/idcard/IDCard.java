package com.bongin.templatefactory.idcard;

import com.bongin.templatefactory.entity.Card;
import com.bongin.templatefactory.framework.Product;

public class IDCard extends Product {
    private Card card;
    IDCard(Card card) {
        System.out.println("制作" + card.getOwner() + "的ID卡。编号为" + card.getNo());
        this.card = card;
    }

    @Override
    public void use() {
        System.out.println("使用" + card.getOwner() + "的ID卡。编号为" + card.getNo());
    }

    public Card getCard() {
        return card;
    }
}
