package ru.gb.educ_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Group implements Iterable<Student>{
    public List<Student> students;
    public Group() {
        students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void sortByName(){
        Collections.sort(students);
    }
    public void sortByAge(){
        Collections.sort(students, new StudentComparator());
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(students);
    }
}
