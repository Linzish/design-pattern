package me.unc.designpattern.build.singleton.staticclass;

/**
 * 静态内部类单例模式
 * 优缺点：
 * 1.这种方式采用了类装载的机制来保证初始化实例时只有一个线程
 * 2.静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载
 *  SingletonInstance类，从而完成对Singleton的实例化
 * 3.内的静态属性只会在第一次加载类时初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类实例化时，别的线程是无法进入。
 * 4.优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高。
 * 5.结论：推荐使用。
 */
public class StaticClassSingleton {
    public static void main(String[] args) {
        System.out.println("静态内部类");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
//        System.out.println(instance == instance2);  //true
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
    }
}

/*
静态内部类特点：
    1.类在装载时，静态内部类是不会立刻装载的。
    2.当调用静态内部类时，静态内部类才会装载。类装载时线程是安全的（jvm机制）。
 */
class Singleton {
    //1.私有化构造器
    private Singleton() {
    }

    //2.写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    //3.提供一个静态共有方法获取类实例
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}