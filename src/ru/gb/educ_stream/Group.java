package ru.gb.educ_stream;

import java.util.ArrayList;
import java.util.List;

public class Group {
    public List<Student> students;
    public Group() {
        students = new ArrayList<Student>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
}
