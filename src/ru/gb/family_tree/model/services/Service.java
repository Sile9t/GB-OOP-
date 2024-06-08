package model.services;

import model.builders.HumanBuilder;
import model.familyTree.FamilyTree;
import model.human.Human;

public class Service {
    private FamilyTree<Human> tree;
    private HumanBuilder humanBuilder;
    public Service() {
        tree = new FamilyTree<>();
        humanBuilder = new HumanBuilder();
    }
    public void addHuman(String name){
        var human = humanBuilder.build(name);
        tree.add(human);
    }
    public String getFamilyTree(){
        StringBuilder sb = new StringBuilder();
        sb.append("Family tree:\n");
        for(Human human : tree)
            sb.append(human + "\n");
        return sb.toString();
    }
    public void sortByBirthDate(){
        tree.sort();
    }
    public void sortByName(){
        tree.sortByName();
    }
}
