package me.unc.designpattern.behavior.mediator.example;

public class TV extends Colleague {

    public TV(String name, Mediator mediator) {
        super(name, mediator);
        //在创建Alarm同时对象时，将自己放入到ConcreteMediator对象中（集合）
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void startTV() {
        System.out.println("It's time to Start TV");
    }

    public void stopTV() {
        System.out.println("Stop TV");
    }
}
