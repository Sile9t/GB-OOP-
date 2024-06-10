package ru.gb.educ_stream.view;

import java.util.Scanner;

import ru.gb.educ_stream.presenter.Presenter;

public class ConsoleView implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;
    
    public ConsoleView() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new MainMenu(this);
    }
    @Override
    public void start() {
        System.out.println("Console is running");
        while(work){
           System.out.println(menu.menu());
           String choise = scanner.nextLine();
           //input validation
           int choice = Integer.parseInt(choise);
           menu.execute(choice);
        }
    }
    public void finish() {
        System.out.println("Console finished");
        work = false;
    }
    public void sortByAge() {
        presenter.sortByAge();
    }
    public void sortByName() {
        presenter.sortByName();
    }
    public void getStudentsListInfo() {
        presenter.getStudentsListInfo();
    }
    public void addStudent() {
        System.out.println("Enter student name");
        String name = scanner.nextLine();
        System.out.println("Enter student age");
        String ageStr = scanner.nextLine();
        //inout validation
        int age = Integer.parseInt(ageStr);
        presenter.addStudent(name, age);
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
    
}
