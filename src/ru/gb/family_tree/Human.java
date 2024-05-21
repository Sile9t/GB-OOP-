import java.time.LocalDate;
import java.util.List;

public class Human {
    private long id;
    private String _name;
    private LocalDate _birthDate;
    private LocalDate _deathDate = null;
    private Gender _gender;
    private Human _mother, _father = null;
    private List<Human> _children = null;
    static long Count = 0;
    public Human(String name, LocalDate birthDate) {
        this(name, birthDate, null, null, null);
    }
    public Human(String name, LocalDate birthDate, Human mother,
     Human father, List<Human> children) {
        id = Count++;
        _name = name;
        _birthDate = birthDate;
        _gender = Count % 2 == 0? Gender.Male : Gender.Female;
        _mother = mother;
        _father = father;
        _children = children;
    }
    
}