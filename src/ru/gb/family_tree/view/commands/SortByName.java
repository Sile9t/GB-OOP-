package view.commands;

import view.ConsoleView;

public class SortByName extends Command {
    public SortByName(ConsoleView view) {
        super(view, "Sort tree by name");
    }
    @Override
    public void execute() {
        getConsoleView().sortByName();
    }
    
}
