package view;

import java.util.Scanner;

import model.human.Human;
import presenter.Presenter;

public class ConsoleView implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    
    public ConsoleView() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
    }
    @Override
    public void start() {
        System.out.println("Console is working...");
        while(work){
            System.out.println("Choose command:");
            System.out.println("1. Add human");
            System.out.println("2. Get family tree");
            System.out.println("3. Sort tree by name");
            System.out.println("4. Sort tree by birth date");
            System.out.println("5. Exit");

            String choice = scanner.nextLine();

            switch (choice){
                case "1":
                    addHuman();
                    break;
                case "2":
                    getFamilyTree();
                    break;
                case "3":
                    sortByName();
                    break;
                case "4":
                    sortByBirthDate();
                    break;
                case "5":
                    finish();
                    break;
                default:
                    System.out.println("Wrong input. Try again.");
            }
        }
    }

    public void sortByBirthDate() {
        presenter.sortByBirthDate();
    }
    public void sortByName() {
        presenter.sortByName();
    }
    public void getFamilyTree() {
        presenter.getFamilyTree();
    }
    public void finish() {
        System.out.println("Console is finished");
        work = false;
    }
    public void addHuman() {
        System.out.println("Enter human name");
        String name = scanner.nextLine();
        presenter.addHuman(name);
    }
    public Human getHuman(int id){
        return presenter.getHuman(id);
    }
    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
    
}
