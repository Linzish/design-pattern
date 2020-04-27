package me.unc.designpattern.build.factory.singlefacory.pizzastore.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作希腊pizza准备原材");
    }
}
