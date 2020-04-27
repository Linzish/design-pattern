package me.unc.designpattern.build.singleton.lazy;

/**
 * 懒汉式单例模式（线程安全）
 * 优缺点分析：
 * 1.解决了线程不安全的问题
 * 2.效率太低，每个线程在想获取类的实例对象时，执行 getInstance 方法都要进行
 *  同步。而其实这个方法只执行一次实例化代码就够了，后面想获取该实例，直接return即可，方法同步效率太低。
 * 结论：在实际开发中，不推荐使用这种方式
 */
public class LazySingleton2 {
    public static void main(String[] args) {
        System.out.println("懒汉式（线程安全）");
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
//        System.out.println(instance == instance2);  //true
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
    }
}

class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    //提供一个静态的公有方法，加入同步处理代码，解决线程安全问题
    public synchronized static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}