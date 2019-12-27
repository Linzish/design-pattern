package me.unc.designpattern.behavior.strategy.improve;

public class GaGaQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("嘎嘎叫");
    }
}
