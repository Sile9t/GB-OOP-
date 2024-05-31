package familyTree;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

import human.Human;

public class FamilyTree implements Serializable, Iterable<Human> {
    private ArrayList<Human> _tree;
    public FamilyTree() {
        this(new ArrayList<Human>());
    }
    public FamilyTree(ArrayList<Human> tree) {
        _tree = tree;
    }
    public ArrayList<Human> tree(){
        return _tree;
    }
    public Boolean add(Human numan){
        if (_tree.contains(numan)) return false;
        return _tree.add(numan);
    }
    public Human remove(int index){
        return _tree.remove(index);
    }
    public Human getFirst(){
        return _tree.getFirst();
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("FamilyTree:\n");
        if (_tree == null) sb.append("Empty\n");
        for(var human : _tree)
            sb.append(human.toString() + "\n");
        return sb.toString();
    }
    public void WriteTo(String path){
        new FamilyTreeSerializer().Write(path, this);
    }
    public void ReadFrom(String path){
        _tree = new FamilyTreeSerializer().Read(path)._tree;
    }
    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(_tree);
    }
}
