package me.unc.designpattern.behavior.strategy.improve;

public class NoQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
