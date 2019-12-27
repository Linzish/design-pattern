package me.unc.designpattern.structure.decorator.coffee;

public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        //自己价格+饮品价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        //装饰者描述 + 装饰者价格 + 被装饰者描述
        return super.getDes() + " " + super.getPrice() + " && " + obj.getDes();
    }
}
