package view;

import java.util.Scanner;

public class ConsoleView implements View {
    private Scanner scanner;
    
    public ConsoleView() {
        scanner = new Scanner(System.in);
    }
    @Override
    public void start() {
        System.out.println("Console is working...");
        while(true){
            System.out.println("Choose command:");
            System.out.println("1. Add student");
            System.out.println("2. Get students list");
            System.out.println("3. Sort list by name");
            System.out.println("4. Sort list by age");
            System.out.println("5. Exit");

            String choice = scanner.nextLine();

            switch (choice){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Wrong input. Try again.");
            }
        }
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
    
}
