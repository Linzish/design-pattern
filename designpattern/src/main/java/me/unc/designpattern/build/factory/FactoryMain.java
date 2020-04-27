package me.unc.designpattern.build.factory;

/**
 * 工厂方法模式
 *
 * 工厂模式引入示例：
 * 看一个披萨的项目：要便于披萨种类的扩展，要便于维护
 * 1) 披萨的种类很多(比如 GreekPizza、CheesePizza 等)
 * 2) 披萨的制作有 prepare，bake, cut, box
 * 3) 完成披萨店订购功能。
 *
 * 1) 工厂模式的意义
 *   将实例化对象的代码提取出来，放到一个类中统一管理和维护，达到和主项目的依赖关系的解耦。
 *   从而提高项 目的扩展和维护性。
 *
 * 2) 三种工厂模式
 *   简单工厂模式
 *   @see me.unc.designpattern.build.factory.singlefacory.pizzastore.order.PizzaStore (包含与传统模式的对比)
 *   工厂方法模式
 *   @see me.unc.designpattern.build.factory.factorymethod.pizzastore.order.PizzaStore
 *   抽象工厂模式
 *   @see me.unc.designpattern.build.factory.abstractfactory.pizzastore.order.PizzaStore
 *
 *  3) 设计模式的依赖抽象原则
 *    创建对象实例时，不要直接 new 类, 而是把这个 new 类的动作放在一个工厂的方法中，并返回。
 *     有的书上说，变量不要直接持有具体类的引用。
 *    不要让类继承具体类，而是继承抽象类或者是实现 interface(接口)
 *    不要覆盖基类中已经实现的方法。
 */
public class FactoryMain {
}
