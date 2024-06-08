package model.familyTree;

import java.io.Serializable;

public interface FamilyTreeItem<T> extends Comparable<T>,Serializable {
    String getName();
    String toString();
}
