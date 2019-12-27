package me.unc.designpattern.structure.facade.example;

public class Popcorn {

    private static Popcorn instance = new Popcorn();

    private Popcorn() {
    }

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Popcorn id on");
    }

    public void off() {
        System.out.println("Popcorn id off");
    }

    public void pop() {
        System.out.println("Popcorn id pop");
    }

}
