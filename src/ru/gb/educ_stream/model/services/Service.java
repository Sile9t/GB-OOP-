package ru.gb.educ_stream.model.services;

import ru.gb.educ_stream.model.builders.StudentBuilder;
import ru.gb.educ_stream.model.group.Group;
import ru.gb.educ_stream.model.student.Student;

public class Service {
    private Group<Student> group;
    private StudentBuilder builder;
    public Service() {
        group = new Group<>();
        builder = new StudentBuilder();
    }
    public void addStudent(String name, int age){
        var student = builder.build(name, age);
        group.addStudent(student);
    }
    public String getStudentListInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Students list:\n");
        for(Student student : group){
            sb.append(student + "\n");
        }
        return sb.toString();
    }
    public void sortByName(){
        group.sortByName();
    }
    public void sortByAge(){
        group.sortByAge();
    }
}