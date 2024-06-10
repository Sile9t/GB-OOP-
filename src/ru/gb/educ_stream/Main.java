package ru.gb.educ_stream;

import ru.gb.educ_stream.view.ConsoleView;
import ru.gb.educ_stream.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleView();
        view.start();
    }
}
