package me.unc.designpattern.structure.facade.example;

public class Projector {

    private static Projector instance = new Projector();

    private Projector() {
    }

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Projector id on");
    }

    public void off() {
        System.out.println("Projector id off");
    }

    public void focus() {
        System.out.println("Projector id focus");
    }

    public void zoom() {
        System.out.println("Projector id zoom");
    }

}
