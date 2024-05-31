package ru.gb.educ_stream;

import java.util.Iterator;
import java.util.List;

class StudentIterator implements Iterator<Student>{
    private int index;
    private List<Student> list;

    public StudentIterator(List<Student> list) {
        this.list = list;
    }
    @Override
    public boolean hasNext() {
        return list.size() > index;
    }

    @Override
    public Student next() {
        return list.get(index++);
    }

}