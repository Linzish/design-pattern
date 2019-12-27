package me.unc.designpattern.structure.decorator.coffee;

/**
 * 装饰者模式解决咖啡店加调料问题
 *
 */
public class CoffeeBar {
    public static void main(String[] args) {
        //装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack

        //1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("费用 = " + order.cost());
        System.out.println("描述 = " + order.getDes());

        //2. 加一份牛奶
        order = new Milk(order);
        System.out.println("order 加一份牛奶 费用 = " + order.cost());
        System.out.println("order 加一份牛奶 描述 = " + order.getDes());

        //3. 加一份巧克力
        order = new Chocolate(order);
        System.out.println("order 加一份巧克力 加一份牛奶 费用 = " + order.cost());
        System.out.println("order 加一份巧克力 加一份牛奶 描述 = " + order.getDes());

        //3. 再加一份巧克力
        order = new Chocolate(order);
        System.out.println("order 加两份巧克力 加一份牛奶 费用 = " + order.cost());
        System.out.println("order 加两份巧克力 加一份牛奶 描述 = " + order.getDes());

        System.out.println("======================");
        Drink order2 = new DeCaf();
        System.out.println("费用 = " + order2.cost());
        System.out.println("描述 = " + order2.getDes());

        //加一份豆浆
        order2 = new Soy(order2);
        System.out.println("order2 加一份豆浆 费用 = " + order2.cost());
        System.out.println("order2 加一份豆浆描述 = " + order2.getDes());

    }
}
