package me.unc.princple.dip;

/**
 * 依赖倒转原则示例
 *
 * 介绍：
 * 1.高层模块不应该依赖底层模块，二者都应该依赖其他抽象。
 * 2.抽象不应该依赖细节，细节应该依赖抽象。
 * 3.依赖倒置的中心思想是面向接口编程。
 * 4.依赖倒置原则是基于这样的设计理念：相对于细节的多变性，抽象的东西要稳定的多。
 * 以抽象为基础搭建的框架比细节为基础搭建的框架要稳定的多。在Java中，抽象指接口或抽象类，细节就是具体的实现类。
 * 5.使用接口或抽象类的目的是指定号规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去实现。
 *
 * 注意事项&细节：
 * 1.底层模块尽量都要有抽象类或接口，或者两者都有，程序稳定性更好。
 * 2.变量的声明类型尽量是抽象或接口，这样我们屙变量引用和实际对象间就存在一个缓冲层，利于程序的拓展和优化。
 * 3.继承时遵循里氏替换原则。
 */
public class DipTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }

}

//电邮类
class Email {
    public String getInfo() {
        return "电子邮件信息：HelloWorld";
    }
}

//完成Person接受消息的功能
//方式1完成
//方式1的分析
//1. 简单容易
//2. 如果我们获取的是微信，短信等等，则新增类，同时，Person也要增加响应的接受方法
//3. 解决思路：
//  引入一个抽象接口IReceiver,表示接收者，这样Person类与接口IReceiver发生依赖
//  因为Email，WeiXin订单属于接受的范围，他们各自实现IReceiver接口，这样我们就附件二依赖倒置原则
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}