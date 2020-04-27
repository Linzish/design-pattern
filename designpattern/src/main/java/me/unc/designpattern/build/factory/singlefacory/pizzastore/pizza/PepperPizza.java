package me.unc.designpattern.build.factory.singlefacory.pizzastore.pizza;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作胡椒pizza准备原材");
    }
}
