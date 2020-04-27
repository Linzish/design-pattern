package me.unc.designpattern.build.factory.abstractfactory.pizzastore.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒pizza");
        System.out.println("给制作伦敦风味胡椒pizza准备原材");
    }
}
