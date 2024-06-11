package view.commands;

public abstract class Command {
    String description;
    String getDescription(){
        return description;
    }
    public abstract void execute();
}
