package me.unc.princple.isp;

/**
 * 接口隔离原则
 * 一个类不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上。
 */
public class IspTest {
    public static void main(String[] args) {

    }
}

//问题分析：
//1.由于A类只需要1，2，3方法，C类只需要1，4，5方法，有两个方法都空着，不符合接口隔离原则
//应该对接口进行拆分，类A和类C分别与他们需要的接口建立依赖关系。就是采用接口隔离原则

//接口
interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

//B类继承接口
class B implements Interface1 {
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

    @Override
    public void operation4() {
        System.out.println("B 实现的 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现的 operation5");
    }
}

//D类继承接口
class D implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("D 实现的 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现的 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现的 operation3");
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

//A 类通过接口Interface1 依赖使用 B类 ，但是只会用到1，2，3方法
class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend2(Interface1 i) {
        i.operation2();
    }
    public void depend3(Interface1 i) {
        i.operation3();
    }
}

//C 类通过接口Interface1 依赖使用 D类 ，但是只会用到1，4，5方法
class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend4(Interface1 i) {
        i.operation4();
    }
    public void depend5(Interface1 i) {
        i.operation5();
    }
}