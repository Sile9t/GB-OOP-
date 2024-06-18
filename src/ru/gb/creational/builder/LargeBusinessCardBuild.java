package ru.gb.creational.builder;

public class LargeBusinessCardBuild extends BusinessCardBuilder {

    @Override
    protected void createName() {
        getCard().setName("Large business card");
    }

    @Override
    protected void createPrise() {
        getCard().setPrice(100);
    }

    @Override
    protected void createSize() {
        getCard().setSize(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
    }
    
}
