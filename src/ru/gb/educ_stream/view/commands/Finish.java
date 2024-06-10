package ru.gb.educ_stream.view.commands;

import ru.gb.educ_stream.view.ConsoleView;

public class Finish extends Command {

    public Finish(ConsoleView view) {
        super(view, "Get students list");
    }
    void execute(){
        getConsoleView().finish();
    }    
}
