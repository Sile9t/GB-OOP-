import java.time.LocalDate;
import java.util.ArrayList;

public class FamilyTree {
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
    public void GenerateChildren(int count, Human mother, Human father){
        for (int i = 0; i < count; i++) {
            Human child1 = new Human(Integer.toString(_tree.size()), LocalDate.now(),
             mother, father);
            _tree.add(child1);
            Human child2 = new Human(Integer.toString(_tree.size()), LocalDate.now(),
              mother, father);
            _tree.add(child2);
            GenerateChildren(count-2, child1, child2);
        }
    }
    public void Generate(int count){
        for (int i = 0; i < count; i++) {
            Human human = new Human(Integer.toString(_tree.size()), LocalDate.MIN);
            _tree.add(human);
        }
        for (int i = 0; i < count; i++){
            GenerateChildren(6, _tree.get(i), _tree.get(++i));
        }
    }
}
