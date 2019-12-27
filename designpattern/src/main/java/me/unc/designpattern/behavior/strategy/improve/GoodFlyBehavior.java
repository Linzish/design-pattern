package me.unc.designpattern.behavior.strategy.improve;

public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" 飞翔技术很好 ");
    }
}
