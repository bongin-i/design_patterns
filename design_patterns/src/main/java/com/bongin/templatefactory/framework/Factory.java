package com.bongin.templatefactory.framework;

import com.bongin.templatefactory.entity.Card;

public abstract class Factory {
    public final Product create(String owner, Integer no) {
        Product p = createProduct(owner, no);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner, Integer no);
    protected abstract void registerProduct(Product product);
}
