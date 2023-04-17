package com.bongin.templatefactory.entity;

public class Card {
    private String owner;
    private Integer no;

    public Card(String owner, Integer no) {
        this.owner = owner;
        this.no = no;
    }

    public Card() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }
}
