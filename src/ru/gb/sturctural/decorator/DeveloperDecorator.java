package ru.gb.sturctural.decorator;

public abstract class DeveloperDecorator implements Developer {
    private Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob(){
        return developer.makeJob();
    }
}
