package ru.gb.educ_stream.view.commands;

import ru.gb.educ_stream.view.ConsoleView;

public class GetStudentsListInfo extends Command {

    public GetStudentsListInfo(ConsoleView view) {
        super(view, "Get students list");
    }
    void execute(){
        getConsoleView().getStudentsListInfo();
    }    
}
