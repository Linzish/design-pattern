package me.unc.designpattern.build.singleton.hungry;

/**
 * 饿汉单例模式（静态代码块）
 * 优缺点与静态变量写法一样
 */
public class HungrySingleton2 {
    public static void main(String[] args) {
        System.out.println("饿汉式");
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
//        System.out.println(instance == instance2);  //true
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
    }
}

class Singleton2 {
    //1.私有化构造器
    private Singleton2() {
    }

    //2.本类内部创建
    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    //3.提供共有的静态方法，返回实例对象
    public static Singleton2 getInstance() {
        return instance;
    }
}