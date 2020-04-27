package me.unc.designpattern.build.singleton.doublecheck;

/**
 * 双重检测单例模式（解决线程安全问题+效率问题）（推荐使用！）
 * Double-Check 在多线程开发中经常用到，如代码所示，使用了两次if判断检查，保证线程安全。
 * 这样实例化代码只会执行一次，后面如有继续访问会直接返回实例，也避免了反复进行方法同步。
 * 线程安全；延迟加载；效率较高
 * 结论：在实际开发中，推荐使用这种单例模式设计
 */
public class DoubleCheckSingleton {
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
//        System.out.println(instance == instance2);  //true
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
    }
}

class Singleton {
    //volatile 使实例修改敏感
    private static volatile Singleton instance;

    private Singleton() {
    }

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题。
    //同时保证了效率问题
    public static Singleton getInstance() {
        if (instance == null) {
            //即使多个线程同时进入，只要有一个线程修改了instance，下面if判断就会立刻变化。
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}