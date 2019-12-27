package me.unc.princple.srp;

public class SrpTest2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

//分析：
//1.遵守了单一职责原则
//2.但是这样注意改动很大（将类分解，同时修改客户端），成本高
//3.还能改进：直接修改Vehicle ==>方案3

//方案2
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路运行");
    }
}
class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空运行");
    }
}
class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水中运行");
    }
}