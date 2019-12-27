package me.unc.designpattern.behavior.mediator.example;

//同事抽象类
public abstract class Colleague {

    protected String name;
    private Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void sendMessage(int stateChange);
}
