package ru.gb.educ_stream.view.commands;

import ru.gb.educ_stream.view.ConsoleView;

public class AddStudent {
    private ConsoleView view;
    private String description;
    public AddStudent(ConsoleView view) {
        this.view = view; 
    }
    public void execute(){
        view.addStudent();
    }
    public String getDescription(){
        return description;
    }
}
