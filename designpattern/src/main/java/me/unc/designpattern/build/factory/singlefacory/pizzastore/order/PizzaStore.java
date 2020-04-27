package me.unc.designpattern.build.factory.singlefacory.pizzastore.order;

/**
 * 示例说明：
 * 看一个披萨的项目：要便于披萨种类的扩展，要便于维护
 * 1) 披萨的种类很多(比如 GreekPizz、CheesePizz 等)
 * 2) 披萨的制作有 prepare，bake, cut, box
 * 3) 完成披萨店订购功能。
 * 使用传统的方式来完成
 *
 * 传统的方式的优缺点
 * 1) 优点是比较好理解，简单易操作。
 * 2) 缺点是违反了设计模式的 ocp 原则，即对扩展开放，对修改关闭。即当我们给类增加新功能的时候，
 *  尽量不修改代码，或者尽可能少修改代码.
 * 3) 比如我们这时要新增加一个 Pizza 的种类(Pepper 披萨)，我们需要做如下 修改. 如果我们增加一个 Pizza 类，只要是订购 Pizza 的代码都需要修改.
 *
 * 改进思路分析：
 * 分析：修改代码可以接受，但是如果我们在其它的地方也有创建 Pizza 的代码，就意味着，也需要修改，而创建 Pizza的代码，往往有多处。
 * 思路：把创建 Pizza 对象封装到一个类中，这样我们有新的 Pizza 种类时，
 *  只需要修改该类就可，其它有创建到 Pizza 对象的代码就不需要修改了  ->  简单工厂模式
 *
 * 简单工厂模式分析
 * （也可以叫静态工厂模式 -> 工厂类的工厂方法为静态方法，这样构造器不需要传值）
 * 1) 简单工厂模式的设计方案: 定义一个可以实例化 Pizza 对象的类，封装创建对象的代码。
 *
 */
public class PizzaStore {
    public static void main(String[] args) {
        //相当于一个客户端，发出订单
        //new OrderPizza();

        //使用简单工厂模式
//        new OrderPizza(new SimpleFactory());
//        System.out.println("程序退出~");

        //使用静态工厂
        new OrderPizza2();
        System.out.println("程序退出~");
    }
}
