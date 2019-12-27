package me.unc.designpattern.structure.composite.example;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

    //存放Department
    private List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String des) {
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

    //实际需求中可能添加屙删除的方法会不简单
    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println("--------------" + getName() + "--------------");
        //遍历organizationComponents，调用print
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
