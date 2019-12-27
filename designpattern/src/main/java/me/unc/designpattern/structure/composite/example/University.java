package me.unc.designpattern.structure.composite.example;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent {

    //存放College
    private List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //重写，树形添加
    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    // 重写，删除
    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    //print 方法，就是输出 University 包含的学院
    @Override
    public void print() {
        System.out.println("--------------" + getName() + "--------------");
        //遍历organizationComponents，调用print
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
