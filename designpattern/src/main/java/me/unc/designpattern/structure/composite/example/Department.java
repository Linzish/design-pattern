package me.unc.designpattern.structure.composite.example;

public class Department extends OrganizationComponent {
    //叶子节点没有集合

    public Department(String name, String des) {
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

    //不需要重写add、remove，因为它是叶子节点

    @Override
    public void print() {
        System.out.println(getName());
    }
}
