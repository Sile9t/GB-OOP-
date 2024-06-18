package ru.gb.creational.singleton;

public class SimpleResource {
    private static SimpleResource simpleResource;
    
    public static SimpleResource getSimpleResource(){
        if (simpleResource == null)
            simpleResource = new SimpleResource();
        
        return simpleResource;
    }
}
