package me.unc.designpattern.build.factory.factorymethod.pizzastore.order;

import me.unc.designpattern.build.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    //定义一个抽象方法，createPizza，让各个工厂子类实现自己实现。
    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        //根据不同pizza做准备
        Pizza pizza = null;
        String orderType;  //订购pizza的类型
        do {
            orderType = getType();
            if (orderType == "") {
                break;
            }
            pizza = createPizza(orderType);  //抽象方法，由工厂子类完成

            //输出pizza制作信息
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类");
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
