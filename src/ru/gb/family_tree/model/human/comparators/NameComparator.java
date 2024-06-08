package model.human.comparators;

import java.util.Comparator;

import model.familyTree.FamilyTreeItem;

public class NameComparator<T extends FamilyTreeItem<T>> implements Comparator<T>{

    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
