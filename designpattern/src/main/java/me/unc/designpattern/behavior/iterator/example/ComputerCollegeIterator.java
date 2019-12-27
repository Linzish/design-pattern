package me.unc.designpattern.behavior.iterator.example;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator<Object> {

    //这里我们需要 Department 是以怎样的方式存放=>数组
    private Department[] departments;
    int position = 0; //遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断下一个元素是否为空
    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    //remove默认空实现
    public void remove() {

    }
}
