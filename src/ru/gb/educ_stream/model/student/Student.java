package ru.gb.educ_stream.model.student;

import ru.gb.educ_stream.model.group.GroupItem;

public class Student implements GroupItem<Student>{
    public long id;
    private  String name;
    private int age;
    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return String.format("%d. %s, %d years old", id, name, age);
    }
    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}
