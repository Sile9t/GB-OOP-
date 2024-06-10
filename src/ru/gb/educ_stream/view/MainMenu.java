package ru.gb.educ_stream.view;

import java.util.ArrayList;
import java.util.List;

import ru.gb.educ_stream.view.commands.*;

public class MainMenu {
    List<Command> commands;

    public MainMenu(ConsoleView view) {
        commands = new ArrayList<>();
        commands.add(new AddStudent(view));
        commands.add(new GetStudentsListInfo(view));
        commands.add(new SortByName(view));
        commands.add(new SortByAge(view));
        commands.add(new Finish(view));
    }

    public String menu(){
        StringBuilder sb = new StringBuilder();
        sb.append("Commands list:\n");
        for (int i = 0; i < commands.size(); i++) {
            sb.append((i + 1) + " - " + commands.get(i).getDescription() + "\n");
        }
        return sb.toString();
    }

    public void execute(int choice){
        Command command = commands.get(choice-1);
        command.execute();
    }
    public int size(){
        return commands.size();
    }
}
