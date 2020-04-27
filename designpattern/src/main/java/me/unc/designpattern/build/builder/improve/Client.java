package me.unc.designpattern.build.builder.improve;

/**
 * 建造者模式
 * 1) 建造者模式（Builder Pattern） 又叫生成器模式，是一种对象构建模式。它可以将复杂对象的建造过程抽象
 *  出来（抽象类别），使这个抽象过程的不同实现方法可以构造出不同表现（属性）的对象。
 * 2) 建造者模式 是一步一步创建一个复杂的对象，它允许用户只通过指定复杂对象的类型和内容就可以构建它们，
 *  用户不需要知道内部的具体构建细节。
 *
 * 建造者模式的四个角色
 * 1) Product（产品角色）： 一个具体的产品对象。
 * 2) Builder（抽象建造者）： 创建一个 Product 对象的各个部件指定的 接口/抽象类。
 * 3) ConcreteBuilder（具体建造者）： 实现接口，构建和装配各个部件。
 * 4) Director（指挥者）： 构建一个使用 Builder 接口的对象。它主要是用于创建一个复杂的对象。
 *  它主要有两个作用，一是：隔离了客户与对象的生产过程，二是：负责控制产品对象的生产过程。
 *
 */
public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //完成盖房子，返回产品（普通房子）
        House houseCommon = houseDirector.constructHouse();

        System.out.println("------------------------");
        //盖高楼
        HighBuilding highBuilding = new HighBuilding();
        //重置建造者
        houseDirector.setHouseBuilder(highBuilding);
        //完成盖房子，返回产品（高楼）
        houseDirector.constructHouse();

    }
}
