package me.unc.designpattern.build.factory.factorymethod.pizzastore.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪pizza");
        System.out.println("给制作伦敦风味奶酪pizza准备原材");
    }
}
