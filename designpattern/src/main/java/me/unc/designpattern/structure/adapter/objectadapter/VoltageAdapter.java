package me.unc.designpattern.structure.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V {

    //不使用继承，使用聚合关系
    private Voltage220V voltage220V;

    //构造器传入
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if(null != voltage220V) {
            int src = voltage220V.output220V();
            // 获 取 220V 电 压
            System.out.println("使用对象适配器，进行适配~~");
            dst = src / 44;
            System.out.println("适配完成，输出的电压为=" + dst);
        }
        return dst;
    }
}
