package me.unc.designpattern.build.factory.abstractfactory.pizzastore.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪pizza");
        System.out.println("给制作北京风味奶酪pizza准备原材");
    }
}
