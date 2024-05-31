package ru.gb.educ_stream.student.comparators;

import java.util.Comparator;

import ru.gb.educ_stream.student.Student;

public class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
    
}