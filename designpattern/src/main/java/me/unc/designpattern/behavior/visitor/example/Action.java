package me.unc.designpattern.behavior.visitor.example;

public abstract class Action {
    //得到男性 的测评
    public abstract void getManResult(Man man);
    //得到女的 测评
    public abstract void getWomanResult(Woman woman);
}
