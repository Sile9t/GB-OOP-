package ru.gb.creational.builder;

public class SmallBusinessCardBuild extends BusinessCardBuilder {

    @Override
    protected void createName() {
        getCard().setName("Small buisness card");
    }

    @Override
    protected void createPrise() {
        getCard().setPrice(50);
    }

    @Override
    protected void createSize() {
        getCard().setSize(new int[] {5, 17, 29});
    }
    
}
