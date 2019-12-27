package me.unc.designpattern.structure.decorator.coffee;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
