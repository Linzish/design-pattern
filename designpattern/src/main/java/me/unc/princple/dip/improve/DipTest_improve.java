package me.unc.princple.dip.improve;

public class DipTest_improve {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());

        person.receive(new WeiXin());
    }

}

//定义接口
interface IReceiver {
    String getInfo();
}

//电邮类
class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息：HelloWorld";
    }
}

//增加微信
class WeiXin implements IReceiver {
    public String getInfo() {
        return "微信信息：hello,ok";
    }
}

//方式2
class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}