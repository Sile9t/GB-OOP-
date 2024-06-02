package familyTree;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import human.Human;
import human.comparators.HumanNameComparator;

public class FamilyTree implements Serializable, Iterable<Human> {
    private ArrayList<Human> tree;
    public FamilyTree() {
        this(new ArrayList<Human>());
    }
    public FamilyTree(ArrayList<Human> tree) {
        this.tree = tree;
    }
    public ArrayList<Human> tree(){
        return tree;
    }
    public Boolean add(Human numan){
        if (tree.contains(numan)) return false;
        return tree.add(numan);
    }
    public Human remove(int index){
        return tree.remove(index);
    }
    public Human getFirst(){
        return tree.getFirst();
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("FamilyTree:\n");
        if (tree == null) sb.append("Empty\n");
        for(var human : tree)
            sb.append(human.toString() + "\n");
        return sb.toString();
    }
    public void writeTo(String path){
        new FamilyTreeSerializer().write(path, this);
    }
    public void readFrom(String path){
        tree = new FamilyTreeSerializer().read(path).tree;
    }
    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(tree);
    }
    public void sort() {
        Collections.sort(tree);
    }
    public void sortByName(){
        tree.sort(new HumanNameComparator());
    }
}
