package me.unc.designpattern.build.factory.abstractfactory.pizzastore.order;

import me.unc.designpattern.build.factory.abstractfactory.pizzastore.pizza.LDCheesePizza;
import me.unc.designpattern.build.factory.abstractfactory.pizzastore.pizza.LDPepperPizza;
import me.unc.designpattern.build.factory.abstractfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
