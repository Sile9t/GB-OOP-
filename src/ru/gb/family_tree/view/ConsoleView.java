package view;

import java.util.Scanner;

import model.human.Gender;
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
        if (isDigit(choiseStr)){
            int choise = Integer.parseInt(choiseStr);
            return (choise > 0 && choise <= menu.size());
        }
        return false;
    }
    public boolean isDigit(String str){
        return str.matches("[0-9]");
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
        System.out.println("Add parents ('y'/'n')?");
        String addParentsAns = scanner.nextLine();
        if (addParentsAns.equalsIgnoreCase("y")){
            getFamilyTree();
            presenter.addHuman(name, getParent(Gender.Female), getParent(Gender.Male));
            return;
        }
        presenter.addHuman(name);
    }
    private Human getParent(Gender gender){
        System.out.println("Enter " + gender + " parent id");
        String idStr = scanner.nextLine();
        Human human;
        while(true){
            if (isDigit(idStr)){
                int id = Integer.parseInt(idStr);
                human = getHuman(id);
                if (human.getGender() == gender) break;
            }
            System.out.println("Wrong input! Try again.");
        }
        return human;
    }
    public Human getHuman(int id){
        return presenter.getHuman(id);
    }
    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
    
}
