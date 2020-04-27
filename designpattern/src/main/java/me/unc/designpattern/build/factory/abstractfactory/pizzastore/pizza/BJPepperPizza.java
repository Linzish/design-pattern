package me.unc.designpattern.build.factory.abstractfactory.pizzastore.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒pizza");
        System.out.println("给制作北京风味胡椒pizza准备原材");
    }
}
