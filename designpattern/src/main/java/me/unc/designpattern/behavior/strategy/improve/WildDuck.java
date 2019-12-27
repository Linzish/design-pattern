package me.unc.designpattern.behavior.strategy.improve;

public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭~~");
    }
}
