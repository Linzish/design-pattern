package me.unc.designpattern.structure.adapter.classadapter;

public class Voltage220V {

    //输出 220V 的电压
    public int output220V() {
        int src = 220;
        System.out.println("电压 = " + src + "伏");
        return src;
    }

}
