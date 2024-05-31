package familyTree;

import java.util.Iterator;
import java.util.List;

import human.Human;

public class HumanIterator implements Iterator<Human>{
    private int index;
    private List<Human> tree;
    public HumanIterator(List<Human> list) {
        tree = list;
    }
    @Override
    public boolean hasNext() {
        return tree.size() > index;
    }
    @Override
    public Human next() {
        return tree.get(index++);
    }

}
