package ru.gb.educ_stream.model.builders;

import ru.gb.educ_stream.model.student.Student;

public class StudentBuilder {
    private long genId;
    public Student build(String name, int age){
        return new Student(genId++, name, age);
    }
}
