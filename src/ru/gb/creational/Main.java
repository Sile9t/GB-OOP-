package ru.gb.creational;

import ru.gb.creational.builder.BusinessCard;
import ru.gb.creational.builder.BusinessCardBuilder;
import ru.gb.creational.builder.LargeBusinessCardBuild;

public class Main {
    public static void main(String[] args) {
        BusinessCardBuilder builder = new LargeBusinessCardBuild();

        BusinessCard card = builder.build();
        
        System.out.println(card);
    }
}
