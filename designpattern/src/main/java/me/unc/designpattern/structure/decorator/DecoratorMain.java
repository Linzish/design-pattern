package me.unc.designpattern.structure.decorator;

import me.unc.designpattern.structure.decorator.coffee.CoffeeBar;

/**
 * 装饰器模式
 *
 * 问题引入：
 * 星巴克咖啡订单项目（咖啡馆）：
 * 1) 咖啡种类/单品咖啡：Espresso(意大利浓咖啡)、ShortBlack、LongBlack(美式咖啡)、Decaf(无因咖啡)
 * 2) 调料：Milk、Soy(豆浆)、Chocolate
 * 3) 要求在扩展新的咖啡种类时，具有良好的扩展性、改动方便、维护方便
 * 4) 使用 OO 的来计算不同种类咖啡的费用: 客户可以点单品咖啡，也可以单品咖啡+调料组合。
 *
 * 方案一：
 * 逐个创建
 * 问题：这样设计，会有很多类，当我们增加一个单品咖啡，或者一个新的调料，类的数量就会倍增，就会出现类 爆炸
 *
 * 方案二：
 * 1) 前面分析到方案 1 因为咖啡单品+调料组合会造成类的倍增，因此可以做改进，将调料内置到 Drink 类，这样就不会造成类数量过多。从而提高项目的维护性
 * 问题分析：
 * 1) 方案 2 可以控制类的数量，不至于造成很多的类
 * 2) 在增加或者删除调料种类时，代码的维护量很大
 * 3) 考虑到用户可以添加多份 调料时，可以将 hasMilk 返回一个对应 int
 * 4) 考虑使用 装饰者 模式
 *
 * 装饰者模式定义
 * 1) 装饰者模式：动态的将新功能附加到对象上。在对象功能扩展方面，它比继承更有弹性，装饰者模式也体现了开闭原则(ocp)
 * 2) 这里提到的动态的将新功能附加到对象和 ocp 原则，在后面的应用实例上会以代码的形式体现，请同学们注 意体会。
 *
 * 装饰者模式解决星巴克咖啡订单
 * @see CoffeeBar
 *
 * 装饰者模式在 JDK 应用
 * Java 的 IO 结构，FilterInputStream 就是一个装饰者
 * 1. InputStream 是抽象类, 类似我们前面讲的 Drink
 * 2. FileInputStream 是 InputStream 子类，类似我们前面的 DeCaf, LongBlack
 * 3. FilterInputStream 是 InputStream 子类：类似我们前面 的 Decorator 修饰者
 * 4. DataInputStream 是 FilterInputStream 子类，具体的修饰者，类似前面的 Milk, Soy 等
 * 5. FilterInputStream 类 有 protected volatile InputStream in; 即含被装饰者
 * 6. 分析得出在 jdk 的 io 体系中，就是使用装饰者模式
 *
 */
public class DecoratorMain {
}
