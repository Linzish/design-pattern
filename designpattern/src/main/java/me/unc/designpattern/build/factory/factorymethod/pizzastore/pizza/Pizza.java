package me.unc.designpattern.build.factory.factorymethod.pizzastore.pizza;

//将pizza类做出抽象
public abstract class Pizza {
    protected String name; //pizza名字

    //准备原材料，不同pizza不一样，因此，做成抽象方法
    public abstract void prepare();

    //烘烤
    public void bake() {
        System.out.println(name + " baking;");
    }

    //切割
    public void cut() {
        System.out.println(name + " cutting;");
    }

    //打包
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
