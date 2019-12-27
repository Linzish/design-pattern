package me.unc.designpattern.behavior.iterator.example;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator<Object> {

    // 信息工程学院是以 List 方式存放系
    private List<Department> departmentList;
    private int index = -1; //索引

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //判断 list 中还有没有下一个元素
    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    //remove默认空实现
    public void remove() {

    }
}
