package ru.gb.educ_stream;

public class StudentBuilder {
    private long genId;
    public Student build(String name, int age){
        return new Student(genId++, name, age); 
    }
}
