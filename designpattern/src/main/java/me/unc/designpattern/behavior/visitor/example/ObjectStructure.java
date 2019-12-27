package me.unc.designpattern.behavior.visitor.example;

import java.util.LinkedList;
import java.util.List;

//数据机构，管理很多的人(Person类)
public class ObjectStructure {

    //维护一个集合
    private List<Person> persons = new LinkedList<>();

    //添加到List
    public void attach(Person p) {
        persons.add(p);
    }

    //移除
    public void detach(Person p) {
        persons.remove(p);
    }

    //显示测评情况
    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }

}
