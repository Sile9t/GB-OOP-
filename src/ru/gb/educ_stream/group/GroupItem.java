package ru.gb.educ_stream.group;

public interface GroupItem<T> extends Comparable<T>{
    String getName();
    int getAge();
}