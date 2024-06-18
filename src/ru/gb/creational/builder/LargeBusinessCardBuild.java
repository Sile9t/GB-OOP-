package ru.gb.creational.builder;

public class LargeBusinessCardBuild extends BusinessCardBuilder {

    @Override
    public void createName() {
        getCard().setName("Large business card");
    }

    @Override
    public void createPrise() {
        getCard().setPrice(100);
    }

    @Override
    public void createSize() {
        getCard().setSize(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
    }
    
}
