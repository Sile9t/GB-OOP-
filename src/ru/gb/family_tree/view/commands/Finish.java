package view.commands;

import view.ConsoleView;

public class Finish extends Command {
    public Finish(ConsoleView view) {
        super(view, "Exit");
    }
    @Override
    public void execute() {
        getConsoleView().finish();
    }
    
}
