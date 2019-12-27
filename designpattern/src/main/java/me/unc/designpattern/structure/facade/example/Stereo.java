package me.unc.designpattern.structure.facade.example;

public class Stereo {

    private static Stereo instance = new Stereo();

    private Stereo() {
    }

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

}
