package ru.gb.behavioral.chain;

public class LogNotifier extends Notifier {

    public LogNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Log writing message: " + message);
    }
     
}
