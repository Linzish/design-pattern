package me.unc.designpattern.build.singleton.hungry;

/**
 * 饿汉式单例模式（静态变量）
 *
 * 优点：写法简单，在类装载时就完成了初始化，避免相册同步问题。
 * 缺点：在类装载时就完成了初始化，没有达到Lazy Loading的效果，如果从开始到结束未使用过这个实例，会造成内存浪费。
 *
 * 这种方式基于classloader机制避免了多线程的同步问题。
 * 结论：这种单例模式可用，可能会造成内存浪费。（确定使用没有问题）
 */
public class HungrySingleton {
    public static void main(String[] args) {
        System.out.println("饿汉式");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
//        System.out.println(instance == instance2);  //true
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
    }
}

class Singleton {
    //1.私有化构造器
    private Singleton() {
    }

    //2.本类内部创建
    private static final Singleton instance = new Singleton();

    //3.提供共有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
