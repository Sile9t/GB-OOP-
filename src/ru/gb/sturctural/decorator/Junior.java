package ru.gb.sturctural.decorator;

public class Junior implements Developer {

    @Override
    public String makeJob() {
        return codeCode();
    }
    
    private String codeCode(){
        return "Writing code";
    }
}
