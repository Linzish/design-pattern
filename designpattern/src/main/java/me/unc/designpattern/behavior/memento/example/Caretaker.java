package me.unc.designpattern.behavior.memento.example;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    //在此集合中，会有很多备忘录对象
    private List<Memento> mementoList = new ArrayList<>();

    //保存状态
    public void add(Memento memento) {
        mementoList.add(memento);
    }

    //获取到第index个Originator 的备忘录对象
    public Memento get(int index) {
        return mementoList.get(index);
    }

}
