package me.unc.designpattern.behavior.strategy.improve;

public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GeGeQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }

}
