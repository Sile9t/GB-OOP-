package ru.gb.educ_stream;

public class Student implements Comparable<Student>{
    public long id;
    public String name;
    public int age;
    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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
