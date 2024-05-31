package ru.gb.educ_stream.student;

public class Student implements Comparable<Student>{
    public long id;
    private  String name;
    private int age;
    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
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
