package me.unc.designpattern.build.prototype;

/**
 * 原型模式
 *
 * 问题引入：
 * 克隆羊问题：现在有一只羊 tom，姓名为: tom, 年龄为：1，颜色为：白色，请编写程序创建和 tom 羊 属性完全相同的 10 只羊。
 *
 * 原型模式介绍：
 * 1) 原型模式(Prototype 模式)是指：用原型实例指定创建对象的种类，并且通过拷贝这些原型，创建新的对象
 * 2) 原型模式是一种创建型设计模式，允许一个对象再创建另外一个可定制的对象，无需知道如何创建的细节
 * 3) 工作原理是:通过将一个原型对象传给那个要发动创建的对象，这个要发动创建的对象通过请求
 *  原型对象拷贝它们自己来实施创建，即 对象.clone()
 * 4) 形象的理解：孙大圣拔出猴毛， 变出其它孙大圣
 * @see me.unc.designpattern.build.prototype.sheep.Client
 *
 * Spring框架中的bean作用域 “prototype” 使用了原型模式
 *
 * 浅拷贝&深拷贝
 * 浅拷贝
 * @see me.unc.designpattern.build.prototype.shallowcopy.Client
 *
 * 深拷贝
 * @see me.unc.designpattern.build.prototype.deepclone.Client
 *
 * 原型模式的注意事项和细节
 * 1) 创建新的对象比较复杂时，可以利用原型模式简化对象的创建过程，同时也能够提高效率
 * 2) 不用重新初始化对象，而是动态地获得对象运行时的状态
 * 3) 如果原始对象发生变化(增加或者减少属性)，其它克隆对象的也会发生相应的变化，无需修改代码
 * 4) 在实现深克隆的时候可能需要比较复杂的代码
 * 5) 缺点：需要为每一个类配备一个克隆方法，这对全新的类来说不是很难，
 *  但对已有的类进行改造时，需要修改其源代码，违背了 ocp 原则，这点请同学们注意.
 *
 */
public class PrototypeMain {
}
