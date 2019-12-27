package me.unc.princple.srp;

/**
 * 单一职责原则
 * 对类来说的，即一个类一个个只负责一项职责。如果A负责两个不同职责：职责1，职责2。
 * 当职责1需求变更而改变A时，可能造成职责2执行错误，所以需要将类A的粒度分解为A1，A2
 * 注意事项&细节：
 * 1.降低类的复杂度，一个类只负责一项职责。
 * 2.提高类的可读性，可维护性。
 * 3.降低变更引起的风险。
 * 4.通常情况下，我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级违反单一职责原则；
 *  只有类中的方法梳数量足够少，可以在方法级别保持单一职责原则。
 */
public class SrpTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

//分析：
//1.在方式1 的run方法中违反了单一职责原则
//2.解决的方案非常的简单，根据交通巩固运行方法不同，分解成不同的类

//方式1
//交通工具类
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }
}