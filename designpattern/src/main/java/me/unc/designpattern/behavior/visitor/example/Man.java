package me.unc.designpattern.behavior.visitor.example;

public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
