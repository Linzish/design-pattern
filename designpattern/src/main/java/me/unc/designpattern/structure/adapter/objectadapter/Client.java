package me.unc.designpattern.structure.adapter.objectadapter;

/**
 * 对象的适配器模式
 *
 * 示例引入：
 * 以生活中充电器的例子来讲解适配器，充电器本身相当于 Adapter，220V 交流电相当于 src (即被适配者)， 我们的目 dst(即目标)是 5V 直流电，使用对象适配器模式完成。
 *
 */
public class Client {
    public static void main(String[] args) {
        //System.out.println("==== 对象的适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
