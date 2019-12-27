package me.unc.designpattern.behavior.strategy.example;

public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }

    //假设北京鸭不能飞
    @Override
    public void fly() {
        System.out.println("北京鸭不能飞");
    }
}
