package me.unc.designpattern.behavior.mediator.example;

/**
 * 中介者模式
 */
public class Client {
    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建Alarm并且加入 ConcreteMediator 对象的HashMap
        Alarm alarm = new Alarm("alarm", mediator);
        CoffeeMachine coffeeMachine = new CoffeeMachine("coffeeMachine", mediator);
        Curtains curtains = new Curtains("curtains", mediator);
        TV tv = new TV("TV", mediator);

        alarm.sendMessage(0);
        coffeeMachine.finishCoffee();
        alarm.sendMessage(1);
    }
}
