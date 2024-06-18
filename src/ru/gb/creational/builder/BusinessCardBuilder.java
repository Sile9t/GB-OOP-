package ru.gb.creational.builder;

public abstract class BusinessCardBuilder {
    private BusinessCard card;

    public abstract void createName();
    public abstract void createPrise();
    public abstract void createSize();

    public void createCard(){
        card = new BusinessCard();
    }

    public BusinessCard build(){
        createCard();
        createName();
        createPrise();
        createSize();

        return card;
    }
}
