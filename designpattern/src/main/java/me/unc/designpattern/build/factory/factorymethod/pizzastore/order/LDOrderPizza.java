package me.unc.designpattern.build.factory.factorymethod.pizzastore.order;

import me.unc.designpattern.build.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import me.unc.designpattern.build.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import me.unc.designpattern.build.factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
