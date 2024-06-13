package view.commands;

import view.ConsoleView;

public class AddTreeItem extends Command {
    public AddTreeItem(ConsoleView view) {
        super(view, "Add tree item");
    }
    @Override
    public void execute(){
        getConsoleView().addTreeItem();
    }
}
