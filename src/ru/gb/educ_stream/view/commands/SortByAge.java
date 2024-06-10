package ru.gb.educ_stream.view.commands;

import ru.gb.educ_stream.view.ConsoleView;

public class SortByAge extends Command {

    public SortByAge(ConsoleView view) {
        super(view, "Sort by age");
    }
    void execute(){
        getConsoleView().getStudentsListInfo();
    }    
}
