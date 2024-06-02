package ru.gb.educ_stream.group;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import ru.gb.educ_stream.student.comparators.StudentComparator;
  
public class Group<T extends GroupItem<T>> implements Iterable<T>{
    public List<T> students;
    public Group() {
        students = new ArrayList<>();
    }
    public void addStudent(T student){
        students.add(student);
    }
    public void sortByName(){
        Collections.sort(students);
    }
    public void sortByAge(){
        students.sort(new StudentComparator<>());
        // students.sort((o1, o2) -> o1.getAge() - o2.getAge());
        // students.sort(Comparator.comparingInt(Student::getAge));
    }
    @Override
    public Iterator<T> iterator() {
        return new StudentIterator<>(students);
    }
}
