package me.unc.designpattern.build.builder.improve;

//高楼建造者
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" 高楼的打地基100m");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 高楼的砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println(" 高楼的透明屋顶");
    }
}
