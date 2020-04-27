package me.unc.designpattern.build.prototype.sheep;

/**
 * 传统的方式的优缺点 （逐个创建）
 * 1) 优点是比较好理解，简单易操作。
 * 2) 在创建新的对象时，总是需要重新获取原始对象的属性，如果创建的对象比较复杂时，效率较低
 * 3) 总是需要重新初始化对象，而不是动态地获得对象运行时的状态, 不够灵活
 *
 * 改进的思路分析
 * 思路：Java 中 Object 类是所有类的根类，Object 类提供了一个 clone()方法，该方法可以将一个 Java 对象复制一份，
 *  但是需要实现 clone 的 Java 类必须要实现一个接口 Cloneable，该接口表示该类能够复制且具有 复制的能力 =>原型模式
 *
 *  (注意，克隆出来的实例hashcode不一样)
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("使用原型模式");
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();

        System.out.println("sheep1 = " + sheep1);
        System.out.println("sheep2 = " + sheep2);
        System.out.println("sheep3 = " + sheep3);
        System.out.println("sheep4 = " + sheep4);
        System.out.println("sheep5 = " + sheep5);
    }
}
