package me.unc.designpattern.behavior.strategy.improve;

public class GeGeQuackBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("咯咯叫");
    }
}
