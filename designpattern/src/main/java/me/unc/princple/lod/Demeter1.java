package me.unc.princple.lod;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示迪米特法则
 * 举例一个学院员工信息打印，学院员工包含学校总部员工和学院员工
 *
 * 迪米特法则又叫最少知道法则，即一个类对自己以来的类知道的越少越好
 * 重要概念：直接朋友 --> 出现在一个类的成员变量，方法参数，方法返回值中的类称为直接朋友，主要出现在局部变量不算
 */
public class Demeter1 {

    public static void main(String[] args) {
        //创建SchoolManger对象
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }

}

//学院总雇员雇员
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

//学校学院雇员
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

//管理学院
class CollegeManager {
    //返回员工得所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工id " + i);
            list.add(collegeEmployee);
        }
        return list;
    }
}

//学校管理类
//分析
//SchoolManager得直接朋友有Employee，CollegeManager
//但是printAllEmployee方法中出现了局部变量，CollegeEmployee，它不是直接朋友，是一个陌生类
// 违反了迪米特法则
class SchoolManager {
    //返回学校总部所有员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学院总部员工id= " + i);
            list.add(employee);
        }
        return list;
    }

    //分析问题
    //1.这里CollegeEmployee以局部变量出现，它不是直接朋友，
    //2.违反迪米特法则

    //打印学校总部和学院员工所有员工
    void printAllEmployee(CollegeManager sub) {
        //获取学院员工
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("--------学校学院员工--------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("--------学校总部员工--------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}