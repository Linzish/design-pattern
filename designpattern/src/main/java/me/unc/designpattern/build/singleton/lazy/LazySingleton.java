package me.unc.designpattern.build.singleton.lazy;

/**
 * 懒汉式单例模式（线程不安全）
 * 优缺点分析：
 * 1.起到了Lazy Loading的效果，但只能在单线程下使用。
 * 2.如果多线程下，一个线程进入了 if (instance == null) 判断语句块，还未来得及往下执行，
 *  另一个线程也通过了这个判断语句这是便会产生多个实例，所以，在多线程环境下不可使用这种模式。
 * 结论：在实际开发中，不要使用这种方式
 */
public class LazySingleton {
    public static void main(String[] args) {
        System.out.println("懒汉式（线程不安全）");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
//        System.out.println(instance == instance2);  //true
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //提供一个静态的公有方法，当使用该方法时，才去创建instance
    //即懒汉式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}