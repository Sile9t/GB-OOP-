package view.commands;

import view.ConsoleView;

public class SortByBirthDate extends Command {
    public SortByBirthDate(ConsoleView view) {
        super(view, "Sort tree by birth date");
    }
    @Override
    public void execute() {
        getConsoleView().sortByBirthDate();
    }
    
}
