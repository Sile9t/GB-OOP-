package familyTree;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import human.Human;

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
    public void WriteTo(String path){
        new FamilyTreeSerializer().Write(path, this);
    }
    public void ReadFrom(String path){
        tree = new FamilyTreeSerializer().Read(path).tree;
    }
    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(tree);
    }
    public void sort() {
        Collections.sort(tree);
    }
}
