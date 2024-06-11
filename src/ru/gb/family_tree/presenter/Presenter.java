package presenter;

import model.human.Human;
import model.services.Service;
import view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view){
        this.view = view;
        this.service = new Service();
    }

    public void addHuman(String name) {
        service.addHuman(name);
    }

    public void addHuman(String name, Human mother, Human father){
        service.addHuman(name, mother, father);
    }

    public Human getHuman(int id) {
        return service.getHuman(id);
    }

    public void getFamilyTree() {
        String answer = service.getFamilyTree();
        view.printAnswer(answer);
    }

    public void sortByName() {
        service.sortByName();
        getFamilyTree();
    }

    public void sortByBirthDate() {
        service.sortByBirthDate();
        getFamilyTree();
    }
}
