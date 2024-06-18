package ru.gb.sturctural.decorator;

public class MiddleDeveloper extends DeveloperDecorator {

    public MiddleDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + "\n" + codeReview();
    }
    
    private String codeReview(){
        return "Doing code review";
    }
}
