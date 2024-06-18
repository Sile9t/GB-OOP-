package ru.gb.sturctural;

import ru.gb.sturctural.decorator.Developer;
import ru.gb.sturctural.decorator.JuniorDeveloper;
import ru.gb.sturctural.decorator.MiddleDeveloper;

public class Main {
    public static void main(String[] args) {
        JuniorDeveloper jun = new JuniorDeveloper();
        Developer middle = new MiddleDeveloper(jun);

        System.out.println(middle.makeJob());
    }
}
