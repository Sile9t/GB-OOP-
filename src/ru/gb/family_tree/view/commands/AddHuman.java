package view.commands;

import view.ConsoleView;

public class AddHuman extends Command {
    public AddHuman(ConsoleView view) {
        super(view, "Add human");
    }
    @Override
    public void execute(){
        getConsoleView().addHuman();
    }
}
