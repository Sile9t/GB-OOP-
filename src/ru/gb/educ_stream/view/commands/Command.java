package ru.gb.educ_stream.view.commands;

import ru.gb.educ_stream.view.ConsoleView;

public abstract class Command {
    private ConsoleView view;
    private String description;
    public Command(ConsoleView view, String description) {
        this.view = view;
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    ConsoleView getConsoleView(){
        return view;
    }
    public abstract void execute();
}
