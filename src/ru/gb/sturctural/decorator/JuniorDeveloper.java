package ru.gb.sturctural.decorator;

public class JuniorDeveloper implements Developer {

    @Override
    public String makeJob() {
        return codeCode();
    }
    
    private String codeCode(){
        return "Writing code";
    }
}
