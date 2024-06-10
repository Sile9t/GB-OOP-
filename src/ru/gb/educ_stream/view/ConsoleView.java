package ru.gb.educ_stream.view;

import java.util.Scanner;

import ru.gb.educ_stream.presenter.Presenter;

public class ConsoleView implements View {
    private Scanner scanner;
    private Presenter presenter;
    
    public ConsoleView() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
    }
    @Override
    public void start() {
        System.out.println("Console is running");
        while(true){
            System.out.println("Choose command:");
            System.out.println("1 - Add student");
            System.out.println("2 - Get students list");
            System.out.println("3 - Sort list by name");
            System.out.println("4 - Sort by age");
            System.out.println("5 - Exit");

            String choice = scanner.nextLine();
            switch(choice){
                case "1":
                    addStudent();
                    break;
                case "2":
                    getStudentsListInfo();
                    break;
                case "3":
                    sortByName();
                    break;
                case "4":
                    sortByAge();
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Wrong input! Try again.");
                    break;
            }
        }
    }
    private void sortByAge() {
        presenter.sortByAge();
    }
    private void sortByName() {
        presenter.sortByName();
    }
    private void getStudentsListInfo() {
        presenter.getStudentsListInfo();
    }
    private void addStudent() {
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
