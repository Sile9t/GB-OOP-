package ru.gb.educ_stream.student.comparators;

import java.util.Comparator;

import ru.gb.educ_stream.group.GroupItem;

public class StudentComparator<T extends GroupItem<T>> implements Comparator<T>{

    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
    
}