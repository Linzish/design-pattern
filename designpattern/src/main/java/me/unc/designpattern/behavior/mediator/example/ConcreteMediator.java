package me.unc.designpattern.behavior.mediator.example;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator extends Mediator {

    //集合，放入所有的同时类
    private Map<String, Colleague> colleagueMap;
    private Map<String, String>  interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);

        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        }
    }

    //具体中介者的核心方法
    //1. 根据得到消息，完成对应任务
    //2. 中介者在这个方法，协调各个具体的同事对象，完成任务
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        //处理闹钟发出的消息
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine)(colleagueMap.get(interMap.get("CoffeeMachine")))).startCoffee();
                ((TV)(colleagueMap.get(interMap.get("TV")))).startTV();
            } else if (stateChange == 1) {
                ((TV)(colleagueMap.get(interMap.get("TV")))).stopTV();
            }
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            //处理咖啡机信息
            ((Curtains) (colleagueMap.get(interMap.get("Curtains")))) .UpCurtains();
        } else if (colleagueMap.get(colleagueName) instanceof TV) {
            //如果 TV 发现消息

        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
            //如果是以窗帘发出的消息，这里处理...
        }
    }

    @Override
    public void sendMessage() {

    }
}
