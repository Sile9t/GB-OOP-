package ru.gb.educ_stream.view.commands;

import ru.gb.educ_stream.view.ConsoleView;

public class SortByName extends Command {

    public SortByName(ConsoleView view) {
        super(view, "Sort by name");
    }
    void execute(){
        getConsoleView().sortByName();
    }    
}
