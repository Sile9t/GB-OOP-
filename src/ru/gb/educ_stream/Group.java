package ru.gb.educ_stream;

import java.util.ArrayList;
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
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator();
    }
    class StudentIterator implements Iterator<Student>{
        private int index;
        
        @Override
        public boolean hasNext() {
            return students.size() > index;
        }

        @Override
        public Student next() {
            return students.get(index++);
        }

    }
}
