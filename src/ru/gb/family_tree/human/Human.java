package human;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Human implements Serializable{
    private long id;
    private String _name;
    private LocalDate _birthDate;
    private LocalDate _deathDate = null;
    private Gender _gender;
    private Human _mother, _father = null;
    private ArrayList<Human> _children = null;
    static long Count = 0;
    
    public Human(String name, LocalDate birthDate) {
        this(name, birthDate, null, null, null);
    }
    public Human(String name, LocalDate birthDate, Human mother, Human father) {
        this(name, birthDate, mother, father, null);
    }
    public Human(String name, LocalDate birthDate, Human mother,
     Human father, ArrayList<Human> children) {
        id = Count++;
        _name = name;
        _birthDate = birthDate;
        _gender = Count % 2 == 0? Gender.Male : Gender.Female;
        _mother = mother;
        if (_mother != null) _mother._children.add(this);
        _father = father;
        if (_father != null) _father._children.add(this);
        _children = children == null? (new ArrayList<Human>()) : children;
    }
    
    public String getName(){
        return _name;
    }
    public LocalDate getBirthDate(){
        return _birthDate;
    }
    public Gender getGender(){
        return _gender;
    }
    public Human getMother(){
        return _mother;
    }
    public Human getFather(){
        return _father;
    }
    public List<Human> getChildren(){
        return _children;
    }
    public Boolean addChild(Human child){
        if (_children.contains(child)) return false;
        return _children.add(child);
    }
    public Boolean addChildren(ArrayList<Human> children){
        return _children.addAll(children);
    }
    public Boolean setDeathDate(LocalDate deathDate){
        if (_deathDate != null) return false;
        _deathDate = deathDate;
        return true;
    }
    public LocalDate getDeathDate(){
        return _deathDate;
    }
    public int getAge(){
        LocalDate d2 = LocalDate.now();
        if (_deathDate != null) d2 = _deathDate;
        return DiffBetween(_deathDate,d2).getYears();
    }
    private Period DiffBetween(LocalDate d1, LocalDate d2){
        return Period.between(d1, d2);
    }
    @Override
    public String toString(){
        return String.format("%d %s %s born: %s mother: %s father: %s", id, _name,
         _gender, _birthDate, _mother != null? _mother._name : "none", 
         _father != null? _father._name : "none");
    }
    public String FamilyTree(){
        return FamilyTree(0);
    }
    public String FamilyTree(int tabsCount){
        StringBuilder sb = new StringBuilder();
        sb.append(this.toString() + "\n");
        String tabs = "\t".repeat(tabsCount);
        tabsCount++;
        for(var child : _children)
            sb.append(tabs + child.FamilyTree(tabsCount));
        return sb.toString();
    }
}