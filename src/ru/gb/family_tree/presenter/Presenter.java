package presenter;

import model.familyTree.FamilyTreeItem;
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

    public void addTreeItem(String name) {
        service.addHuman(name);
        getFamilyTree();
    }

    public void addTreeItem(String name, int motherId, int fatherId){
        service.addHuman(name, motherId, fatherId);
        getFamilyTree();
    }

    public FamilyTreeItem<Human> getTreeItem(int id) {
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
