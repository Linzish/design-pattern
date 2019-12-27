package me.unc.designpattern.structure.facade.example;

public class Screen {

    private static Screen instance = new Screen();

    private Screen() {
    }

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("Screen is up");
    }

    public void down() {
        System.out.println("Screen is down");
    }

}
