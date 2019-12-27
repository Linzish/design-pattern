package me.unc.princple.lsp;

/**
 * 里氏替换原则示例
 * 在使用继承时，遵守里氏替换原则，在子类中尽量不要重写父类的方法
 * 在适当情况下，可以通过聚合，组合，依赖来解决问题。
 */
public class LspTest {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = " + a.func1(11, 3));
        System.out.println("1 - 8 = " + a.func1(1, 8));

        System.out.println("---------------");
        B b = new B();
        System.out.println("11 - 3 = " + b.func1(11, 3));
        System.out.println("1 - 8 = " + b.func1(1, 8));
        System.out.println("11 + 3 + 9" + b.func2(11, 3));
    }

}

//A类
class A {
    //返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2 ;
    }
}

// B类基础了A
// 本意时增加一个新功能，完成两个数的相加再加9求和
// 但可能无意间把func1重写了，在调用时func1时会与父类不同
// 这种错误在频繁运行多态时会容易出现

//解决方法
// 通用方法是：原来的父类和子类都继承一个更通俗的基类，原有的继承关系去掉，采用依赖，组合，聚合等关系代替。
class B extends A {
    // 重写了func1
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}