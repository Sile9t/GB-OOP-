package model.familyTree;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import model.human.comparators.NameComparator;

public class FamilyTree<T extends FamilyTreeItem<T>> implements Serializable, Iterable<T> {
    private ArrayList<T> tree;
    public FamilyTree() {
        tree = new ArrayList<T>();
    }
    public FamilyTree(ArrayList<T> tree) {
        this.tree = tree;
    }
    public ArrayList<T> tree(){
        return tree;
    }
    public Boolean add(T el){
        if (tree.contains(el)) return false;
        return tree.add(el);
    }
    public T remove(int index){
        return tree.remove(index);
    }
    public T getFirst(){
        return tree.getFirst();
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("FamilyTree:\n");
        if (tree == null) sb.append("Empty\n");
        for(var el : tree)
            sb.append(el.toString() + "\n");
        return sb.toString();
    }
    public void writeTo(String path){
        new FamilyTreeSerializer<T>().write(path, this);
    }
    public void ReadFrom(String path){
        tree = new FamilyTreeSerializer<T>().read(path).tree;
    }
    @Override
    public Iterator<T> iterator() {
        return new HumanIterator<T>(tree);
    }
    public void sort() {
        Collections.sort(tree);
    }
    public void sortByName(){
        tree.sort(new NameComparator<T>());
    }
}
