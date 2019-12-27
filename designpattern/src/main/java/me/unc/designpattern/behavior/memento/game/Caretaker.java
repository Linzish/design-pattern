package me.unc.designpattern.behavior.memento.game;

import java.util.List;
import java.util.Map;

//守护者对象，保存游戏角色状态
public class Caretaker {

    //如果只保存一次状态
    private Memento memento;

    //对GameRole保存多次
    private List<Memento> mementos;

    //对多个游戏角色保存多个状态
    private Map<String, List<Memento>> rolesMementos;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public List<Memento> getMementos() {
        return mementos;
    }

    public void setMementos(List<Memento> mementos) {
        this.mementos = mementos;
    }

    public Map<String, List<Memento>> getRolesMementos() {
        return rolesMementos;
    }

    public void setRolesMementos(Map<String, List<Memento>> rolesMementos) {
        this.rolesMementos = rolesMementos;
    }
}
