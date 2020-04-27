package me.unc.designpattern.build.singleton.enumsingleton;

/**
 * 枚举单例模式
 * 优缺点：
 * 1.这借助 JDK1.5 中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创 建新的对象。
 *  （抗反射，其他方式可以通过反射破解，而枚举不可以）
 * 2.这种方式是 Effective Java 作者 Josh Bloch 提倡的方式
 * 3.结论：推荐使用
 */
public class EnumSingleton {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
//        System.out.println(instance == instance2); //true
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());

        instance.sayOK();
    }
}

//写一个枚举Singleton
//使用枚举可以实现单例
enum Singleton {
    INSTANCE;  //属性
    public void sayOK(){
        System.out.println("ok~");
    }
}
