package ru.gb.educ_stream.view.commands;

import ru.gb.educ_stream.view.ConsoleView;

public class AddStudent extends Command{

    public AddStudent(ConsoleView view) {
        super(view, "Add student");
    }
    @Override
    void execute(){
        getConsoleView().addStudent();
    }
}
