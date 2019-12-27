package me.unc.designpattern.behavior.strategy.improve;

public abstract class Duck {

    //策略接口
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void quack() {
        quackBehavior.quack();
    }

/*
    public void swim() {
        System.out.println("鸭子会游泳~~");
    }
*/

    public void fly() {
        //改进
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
