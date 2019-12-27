package me.unc.designpattern.structure.adapter;

import me.unc.designpattern.structure.adapter.myspringmvc.DispatchServlet;

/**
 * 适配器模式
 *
 * 1)类适配器模式
 * @see me.unc.designpattern.structure.adapter.classadapter.Client
 *
 * 类适配器模式注意事项和细节：
 * 1) Java 是单继承机制，所以类适配器需要继承 src 类这一点算是一个缺点, 因为这要求 dst 必须是接口，有一定局限性;
 * 2) src 类的方法在 Adapter 中都会暴露出来，也增加了使用的成本。
 * 3) 由于其继承了 src 类，所以它可以根据需求重写 src 类的方法，使得 Adapter 的灵活性增强了。
 *
 * 2)对象适配器模式
 * @see me.unc.designpattern.structure.adapter.objectadapter.Client
 *
 * 对象适配器模式注意事项和细节：
 * 1) 对象适配器和类适配器其实算是同一种思想，只不过实现方式不同。
 *   根据合成复用原则，使用组合替代继承， 所以它解决了类适配器必须继承 src 的局限性问题，也不再要求 dst 必须是接口。
 * 2) 使用成本更低，更灵活。
 *
 * 3)接口适配器模式
 * @see me.unc.designpattern.structure.adapter.interfaceadapter.Client
 *
 *
 * 适配器模式在 SpringMVC 框架应用
 * @see DispatchServlet
 *
 * 适配器模式的注意事项和细节：
 * 1) 三种命名方式，是根据 src 是以怎样的形式给到 Adapter（在 Adapter 里的形式）来命名的。
 * 2) 类适配器：以类给到，在 Adapter 里，就是将 src 当做类，继承
 *    对象适配器：以对象给到，在 Adapter 里，将 src 作为一个对象，持有
 *    接口适配器：以接口给到，在 Adapter 里，将 src 作为一个接口，实现
 * 3) Adapter 模式最大的作用还是将原本不兼容的接口融合在一起工作。
 * 4) 实际开发中，实现起来不拘泥于我们讲解的三种经典形式
 *
 */
public class AdapterMain {
}
