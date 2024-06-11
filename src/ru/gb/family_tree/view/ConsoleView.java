package view;

import java.util.Scanner;

import model.human.Human;
import presenter.Presenter;

public class ConsoleView implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private Menu menu;
    
    public ConsoleView() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new Menu(this);
    }
    @Override
    public void start() {
        System.out.println("Console is working...");
        while(work){
            System.out.println(menu.menu());
            String choiseStr = scanner.nextLine();
            if (!checkInput(choiseStr)) continue;
            int choise = Integer.parseInt(choiseStr);
            menu.execute(choise);
        }
    }
        
    private boolean checkInput(String choiseStr) {
        if (choiseStr.matches("[0-9]")){
            int choise = Integer.parseInt(choiseStr);
            return (choise > 0 && choise <= menu.size());
        }
        return false;
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
