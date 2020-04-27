package me.unc.designpattern.build.singleton;

import me.unc.designpattern.build.singleton.doublecheck.DoubleCheckSingleton;
import me.unc.designpattern.build.singleton.enumsingleton.EnumSingleton;
import me.unc.designpattern.build.singleton.hungry.HungrySingleton;
import me.unc.designpattern.build.singleton.hungry.HungrySingleton2;
import me.unc.designpattern.build.singleton.lazy.LazySingleton;
import me.unc.designpattern.build.singleton.lazy.LazySingleton2;
import me.unc.designpattern.build.singleton.lazy.LazySingleton3;
import me.unc.designpattern.build.singleton.staticclass.StaticClassSingleton;

/**
 * 单例设计模式介绍
 *  所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，
 *  并且该类只提供一个取得其对象实例的方法(静态方法)。
 *
 *  比如 Hibernate 的 SessionFactory，它充当数据存储源的代理，并负责创建 Session 对象。 SessionFactory 并不是轻量级的，
 *  一般情况下，一个项目通常只需要一个 SessionFactory 就够，这是就会使用 到单例模式。
 *
 *  单例设计模式八种方式 （✔推荐使用）
 *  1) 饿汉式(静态常量)  ✔
 *      @see HungrySingleton
 *  2) 饿汉式（静态代码块） ✔
 *      @see HungrySingleton2
 *  3) 懒汉式(线程不安全)
 *      @see LazySingleton
 *  4) 懒汉式(线程安全，同步方法)
 *      @see LazySingleton2
 *  5) 懒汉式(线程安全，同步代码块)
 *      @see LazySingleton3
 *  6) 双重检查        ✔
 *      @see DoubleCheckSingleton
 *  7) 静态内部类      ✔
 *      @see StaticClassSingleton
 *  8) 枚举           ✔
 *      @see EnumSingleton
 *
 * 单例模式注意事项和细节说明
 * 1) 单例模式保证了 系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使用单例模式可以提高系统性能
 * 2) 当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用 new
 * 3) 单例模式使用的场景：需要频繁的进行创建和销毁的对象、创建对象时耗时过多或耗费资源过多(即：重量级 对象)，
 *  但又经常用到的对象、工具类对象、频繁访问数据库或文件的对象(比如数据源、session 工厂等)
 */
public class SingletonMain {
}
