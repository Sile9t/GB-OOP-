package ru.gb.educ_stream.group;

import java.util.Iterator;
import java.util.List;

public class StudentIterator<T extends GroupItem<T>> implements Iterator<T>{
    private int index;
    private List<T> list;

    public StudentIterator(List<T> list) {
        this.list = list;
    }
    @Override
    public boolean hasNext() {
        return list.size() > index;
    }

    @Override
    public T next() {
        return list.get(index++);
    }

}