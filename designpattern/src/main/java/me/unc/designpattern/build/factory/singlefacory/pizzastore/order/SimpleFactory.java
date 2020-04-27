package me.unc.designpattern.build.factory.singlefacory.pizzastore.order;

import me.unc.designpattern.build.factory.singlefacory.pizzastore.pizza.CheesePizza;
import me.unc.designpattern.build.factory.singlefacory.pizzastore.pizza.GreekPizza;
import me.unc.designpattern.build.factory.singlefacory.pizzastore.pizza.PepperPizza;
import me.unc.designpattern.build.factory.singlefacory.pizzastore.pizza.Pizza;

/**
 * 简单工厂模式
 */
public class SimpleFactory {

    //根据orderType 返回对应的pizza对象
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {  //新增代码
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }

    //静态方法版
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {  //新增代码
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }

}
