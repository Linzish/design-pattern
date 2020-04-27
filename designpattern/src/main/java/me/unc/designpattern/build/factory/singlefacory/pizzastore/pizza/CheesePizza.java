package me.unc.designpattern.build.factory.singlefacory.pizzastore.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作奶酪pizza准备原材");
    }
}
