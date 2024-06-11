package view;

import java.util.ArrayList;
import java.util.List;

import view.commands.*;

public class Menu {
    List<Command> commands;
    public Menu(ConsoleView view) {
        commands = new ArrayList<>();
        commands.add(new AddHuman(view));
        commands.add(new GetFamilyTree(view));
        commands.add(new SortByName(view));
        commands.add(new SortByBirthDate(view));
        commands.add(new Finish(view));
    }
    public String menu(){
        StringBuilder sb = new StringBuilder();
        sb.append("Commands list:\n");
        for (int i = 0; i < commands.size(); i++) {
            sb.append((i + 1) + " " + commands.get(i).getDescription() + "\n");
        }
        return sb.toString();
    }
    public void execute(int choise){
        Command command = commands.get(choise-1);
        command.execute();
    }
    public int size(){
        return commands.size();
    }
}
