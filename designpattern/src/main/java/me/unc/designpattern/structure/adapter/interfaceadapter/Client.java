package me.unc.designpattern.structure.adapter.interfaceadapter;

/**
 * 接口的适配器模式
 *
 * 介绍：
 * 1) 一些书籍称为：适配器模式(Default Adapter Pattern)或缺省适配器模式。
 * 2) 核心思路：当不需要全部实现接口提供的方法时，可先设计一个抽象类实现接口，并为该接口中每个方法提供
 *  一个默认实现（空方法），那么该抽象类的子类可有选择地覆盖父类的某些方法来实现需求
 * 3) 适用于一个接口不想使用其所有的方法的情况。
 *
 * 接口适配器模式应用实例：
 * Android 中的属性动画 ValueAnimator 类可以通过 addListener(AnimatorListener listener)方法添加监 听器
 *
 */
public class Client {
    public static void main(String[] args) {
        //
        AbstractAdapter adapter = new AbstractAdapter() {
            //只需要去覆盖我们 需要使用 接口方法
            @Override
            public void m1() {
                System.out.println("使用了 m1 方法");
            }
        };
        //调用
        adapter.m1();
    }
}
