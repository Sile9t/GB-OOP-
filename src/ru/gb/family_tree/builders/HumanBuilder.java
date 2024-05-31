package builders;

import java.time.LocalDate;

import human.Human;

public class HumanBuilder {
    private int genId;
    public Human build(String name){
        return new Human(genId++, name, LocalDate.now());
    }
    public Human build(String name, Human mother, Human father){
        return new Human(genId++, name, LocalDate.now(), mother, father);
    }
}
