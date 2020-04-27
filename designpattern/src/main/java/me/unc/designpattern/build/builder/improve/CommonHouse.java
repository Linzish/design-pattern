package me.unc.designpattern.build.builder.improve;

//一个具体建造者，普通防止建造者
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基5m ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌墙20cm ");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子封顶 ");
    }
}
