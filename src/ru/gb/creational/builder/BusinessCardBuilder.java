package ru.gb.creational.builder;

public abstract class BusinessCardBuilder {
    private BusinessCard card;

    protected abstract void createName();
    protected abstract void createPrise();
    protected abstract void createSize();

    private void createCard(){
        card = new BusinessCard();
    }

    protected BusinessCard getCard(){
        return card;
    }

    public BusinessCard build(){
        createCard();
        createName();
        createPrise();
        createSize();

        return card;
    }
}
