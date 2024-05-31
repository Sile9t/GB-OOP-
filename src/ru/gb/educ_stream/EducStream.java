package ru.gb.educ_stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EducStream implements Iterable {
    public List<Group> list;
    public EducStream() {
        list = new ArrayList<Group>();
    }
    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
    
}
