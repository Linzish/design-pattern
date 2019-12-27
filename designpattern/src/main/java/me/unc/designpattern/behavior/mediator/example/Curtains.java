package me.unc.designpattern.behavior.mediator.example;

public class Curtains extends Colleague {

    public Curtains(String name, Mediator mediator) {
        super(name, mediator);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void UpCurtains() {
        System.out.println("I am holding Up Curtains!");
    }

}
