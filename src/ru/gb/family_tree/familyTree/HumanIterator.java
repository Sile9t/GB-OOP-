package familyTree;

import java.util.Iterator;
import java.util.List;

public class HumanIterator<T extends FamilyTreeItem<T>> implements Iterator<T>{
    private int index;
    private List<T> tree;
    public HumanIterator(List<T> list) {
        tree = list;
    }
    @Override
    public boolean hasNext() {
        return tree.size() > index;
    }
    @Override
    public T next() {
        return tree.get(index++);
    }

}
