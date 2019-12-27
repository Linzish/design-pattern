package me.unc.designpattern.behavior.command.example;

public interface Command {
    //执行动作
    void execute();
    void undo();
}
