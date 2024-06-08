package ru.gb.educ_stream.model.group;

public interface GroupItem<T> extends Comparable<T>{
    String getName();
    int getAge();
}