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
        students.sort(new StudentComparator());
        // students.sort((o1, o2) -> o1.getAge() - o2.getAge());
        // students.sort(Comparator.comparingInt(Student::getAge));
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(students);
    }
}
