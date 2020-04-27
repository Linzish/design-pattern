package me.unc.designpattern.build.builder.improve;

//抽象建造者，主要定义建造流程
public abstract class HouseBuilder {

    protected House house = new House();

    //将建造的流程写好，抽象方法
    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();

    //返回建造好的房子，将产品返回
    public House buildHouse() {
        return this.house;
    }

}
