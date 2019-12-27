package me.unc.designpattern.structure.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        System.out.println("使用对象适配器，进行适配~~");
        //获取到 220V 电压
        int srcV = output220V();
        System.out.println("适配完成");
        //转 成 5v
        return srcV / 44;
    }
}
