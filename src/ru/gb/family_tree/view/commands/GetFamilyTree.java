package view.commands;

import view.ConsoleView;

public class GetFamilyTree extends Command {
    public GetFamilyTree(ConsoleView view) {
        super(view, "Get family tree list");
    }
    @Override
    public void execute() {
        getConsoleView().getFamilyTree();
    }
    
}
