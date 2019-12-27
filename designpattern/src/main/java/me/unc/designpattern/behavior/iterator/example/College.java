package me.unc.designpattern.behavior.iterator.example;

import java.util.Iterator;

public interface College {
    String getName();
    void addDepartment(String name, String desc);
    Iterator<Object> createIterator();
}
