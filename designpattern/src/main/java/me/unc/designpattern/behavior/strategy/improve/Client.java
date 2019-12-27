package me.unc.designpattern.behavior.strategy.improve;

/**
 * 策略模式
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.quack();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
        toyDuck.quack();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();
        pekingDuck.quack();

    }
}
