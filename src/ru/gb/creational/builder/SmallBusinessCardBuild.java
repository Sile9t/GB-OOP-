package ru.gb.creational.builder;

public class SmallBusinessCardBuild extends BusinessCardBuilder {

    @Override
    public void createName() {
        getCard().setName("Small buisness card");
    }

    @Override
    public void createPrise() {
        getCard().setPrice(50);
    }

    @Override
    public void createSize() {
        getCard().setSize(new int[] {5, 17, 29});
    }
    
}
