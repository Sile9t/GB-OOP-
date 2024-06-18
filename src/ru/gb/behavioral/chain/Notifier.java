package ru.gb.behavioral.chain;

public abstract class Notifier {
    private int priority;
    private Notifier nexNotifier;

    public Notifier(int priority){
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier){
        this.nexNotifier = nextNotifier;
    }

    abstract void write(String message);

    public void menageMessage(int priority, String message){
        if (this.priority <= priority)
            write(message);
        if (nexNotifier != null)
            nexNotifier.menageMessage(priority, message);
    }
}
