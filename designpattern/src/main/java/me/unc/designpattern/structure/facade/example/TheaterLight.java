package me.unc.designpattern.structure.facade.example;

public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    private TheaterLight() {
    }

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("TheaterLight is on");
    }

    public void off() {
        System.out.println("TheaterLight is off");
    }

    public void dim() {
        System.out.println("TheaterLight is dim");
    }

    public void bright() {
        System.out.println("TheaterLight is bright");
    }

}
