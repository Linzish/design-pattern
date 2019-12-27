package me.unc.designpattern.structure.adapter.classadapter;

/**
 * 类的适配器模式
 * 问题引入：
 * 以生活中充电器的例子来讲解适配器，充电器本身相当于 Adapter，220V 交流电相当于 src (即被适配者)， 我们的目 dst(即 目标)是 5V 直流电
 *
 * 基本介绍：Adapter 类，通过继承 src 类，实现 dst 类接口，完成 src->dst 的适配。
 *
 */
public class Client {
    public static void main(String[] args) {
        //System.out.println("==== 类的适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
