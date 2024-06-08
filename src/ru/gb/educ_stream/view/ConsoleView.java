package ru.gb.educ_stream.view;

import java.util.Scanner;

public class ConsoleView implements View {
    private Scanner scanner;
    
    public ConsoleView() {
        scanner = new Scanner(System.in);
    }
    @Override
    public void start() {
            
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
    
}
