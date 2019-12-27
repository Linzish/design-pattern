package me.unc.designpattern.behavior.mediator.example;

//具体同事类 --闹钟
public class Alarm extends Colleague {

    public Alarm(String name, Mediator mediator) {
        super(name, mediator);
        //在创建Alarm同时对象时，将自己放入到ConcreteMediator对象中（集合）
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        //调用的中介者对象的getMessage
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }

}
