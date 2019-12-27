package me.unc.designpattern.behavior.visitor.example;

/**
 * 访问者模式
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Man());
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);

        System.out.println("========================");

        Fail fail = new Fail();
        objectStructure.display(fail);

        System.out.println("==========给的事待定的测评===========");
        Wait wait = new Wait();
        objectStructure.display(wait);

        //对评价次数进行限制
//        objectStructure.detach(xx);
    }
}
