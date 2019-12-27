package me.unc.princple.isp.improve;

public class IspTest_improve {
    public static void main(String[] args) {
        //用一把
        A a = new A();
        a.depend1(new B()); //A类通过接口去依赖B类
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D()); //C类通过接口去依赖D类
        c.depend4(new D());
        c.depend5(new D());
    }
}

//拆分接口
//接口1
interface Interface1 {
    void operation1();
}
//接口2
interface Interface2 {
    void operation2();
    void operation3();
}
//接口3
interface Interface3 {
    void operation4();
    void operation5();
}

//B类继承接口
class B implements Interface1,Interface2 {
    @Override
    public void operation1() {
        System.out.println("B 实现的 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现的 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现的 operation3");
    }
}

//D类继承接口
class D implements Interface1, Interface3 {
    @Override
    public void operation1() {
        System.out.println("D 实现的 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现的 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现的 operation5");
    }
}

//A 类通过接口Interface1,Interface2 依赖使用 B类 ，但是只会用到1，2，3方法
class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend2(Interface2 i) {
        i.operation2();
    }
    public void depend3(Interface2 i) {
        i.operation3();
    }
}

//C 类通过接口Interface1,Interface3 依赖使用 D类 ，但是只会用到1，4，5方法
class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend4(Interface3 i) {
        i.operation4();
    }
    public void depend5(Interface3 i) {
        i.operation5();
    }
}