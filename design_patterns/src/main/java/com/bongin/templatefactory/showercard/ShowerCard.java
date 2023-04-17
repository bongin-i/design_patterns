package com.bongin.templatefactory.showercard;

import com.bongin.templatefactory.entity.Card;
import com.bongin.templatefactory.framework.Product;

public class ShowerCard extends Product {

    private Card card;

    ShowerCard(Card card) {
        System.out.println("制作了" + card.getOwner() + "的洗澡卡。编号为" + card.getNo());
        this.card = card;
    }

    @Override
    public void use() {
        System.out.println("使用了" + card.getOwner() + "的洗澡卡。编号为" + card.getNo());
    }

    public Card getCard() {
        return card;
    }
}
