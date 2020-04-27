package me.unc.designpattern.build.factory.factorymethod.pizzastore.order;

import me.unc.designpattern.build.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import me.unc.designpattern.build.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import me.unc.designpattern.build.factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        //根据不同类型，创建相对应的pizza
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
