package human;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Human implements Serializable{
    private long id;
    private String name;
    private LocalDate birthDate;
    private LocalDate deathDate = null;
    private Gender gender;
    private Human mother, father = null;
    private ArrayList<Human> children = null;
    
    public Human(long id, String name, LocalDate birthDate) {
        this(id, name, birthDate, null, null, null);
    }
    public Human(long id, String name, LocalDate birthDate, Human mother, Human father) {
        this(id, name, birthDate, mother, father, null);
    }
    public Human(long id, String name, LocalDate birthDate, Human mother,
     Human father, ArrayList<Human> children) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = id % 2 == 0? Gender.Male : Gender.Female;
        this.mother = mother;
        if (this.mother != null) this.mother.children.add(this);
        this.father = father;
        if (this.father != null) this.father.children.add(this);
        this.children = children == null? (new ArrayList<Human>()) : children;
    }
    
    public String getName(){
        return name;
    }
    public LocalDate getBirthDate(){
        return birthDate;
    }
    public Gender getGender(){
        return gender;
    }
    public Human getMother(){
        return mother;
    }
    public Human getFather(){
        return father;
    }
    public List<Human> getChildren(){
        return children;
    }
    public Boolean addChild(Human child){
        if (children.contains(child)) return false;
        return children.add(child);
    }
    public Boolean addChildren(ArrayList<Human> children){
        return children.addAll(children);
    }
    public Boolean setDeathDate(LocalDate deathDate){
        if (this.deathDate != null) return false;
        this.deathDate = deathDate;
        return true;
    }
    public LocalDate getDeathDate(){
        return deathDate;
    }
    public int getAge(){
        LocalDate d2 = LocalDate.now();
        if (deathDate != null) d2 = deathDate;
        return DiffBetween(deathDate,d2).getYears();
    }
    private Period DiffBetween(LocalDate d1, LocalDate d2){
        return Period.between(d1, d2);
    }
    @Override
    public String toString(){
        return String.format("%d %s %s born: %s mother: %s father: %s", id, name,
         gender, birthDate, mother != null? mother.name : "none", 
         father != null? father.name : "none");
    }
    public String FamilyTree(){
        return FamilyTree(0);
    }
    public String FamilyTree(int tabsCount){
        StringBuilder sb = new StringBuilder();
        sb.append(this.toString() + "\n");
        String tabs = "\t".repeat(tabsCount);
        tabsCount++;
        for(var child : children)
            sb.append(tabs + child.FamilyTree(tabsCount));
        return sb.toString();
    }
}