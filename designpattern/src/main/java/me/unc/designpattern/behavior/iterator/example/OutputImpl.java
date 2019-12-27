package me.unc.designpattern.behavior.iterator.example;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {

    //学院集合
    private List<College> colleges;

    public OutputImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    //遍历所有学院,然后调用 printDepartment 输出各个学院的系
    public void printCollege() {
        //从 collegeList 取出所有学院, Java 中的 List 已经实 现Iterator
        Iterator<College> iterator = colleges.iterator();
        while (iterator.hasNext()) {
            //取出一个学院
            College college = iterator.next();
            System.out.println("=========== " + college.getName() + " ===========");
            //college.createIterator()得到 对应迭代器
            //打印 输出 学院输出 系
            printDepartment(college.createIterator());
        }
    }

    private void printDepartment(Iterator<Object> iterator) {
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }

}
