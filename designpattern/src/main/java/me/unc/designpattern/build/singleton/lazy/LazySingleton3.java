package me.unc.designpattern.build.singleton.lazy;

/**
 * 懒汉式单例模式（线程安全 + 同步代码块）
 * 优缺点：
 * 1.这种方式，本意时想对线程安全写法进行改进，因为同步效率太低，改为同步产生实例化的代码块
 * 2.但这种铜鼓并不能起到线程同步的作用！！（同时进入if判断就完蛋）
 * 结论：在实际开发中，不能使用这种方式。
 */
public class LazySingleton3 {
    public static void main(String[] args) {
        System.out.println("懒汉式（线程安全）");
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
//        System.out.println(instance == instance2);  //true
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
    }
}

class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    //提供一个静态的公有方法，加入同步处理代码块，解决线程安全问题
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                instance = new Singleton3();
            }
        }
        return instance;
    }
}