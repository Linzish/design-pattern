package me.unc.designpattern.behavior.mediator.example;

public abstract class Mediator {

    //将中介者对象加入到集合
    public abstract void register(String colleagueName, Colleague colleague);

    //接受消息，由同事类发出
    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void sendMessage();

}
