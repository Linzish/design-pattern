package me.unc.princple.lsp.improve;

public class LspTest_improve {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = " + a.func1(11, 3));
        System.out.println("1 - 8 = " + a.func1(1, 8));

        System.out.println("---------------");
        B b = new B();
        System.out.println("11 + 3 = " + b.func1(11, 3));
        System.out.println("1 + 8 = " + b.func1(1, 8));
        System.out.println("11 + 3 + 9 = " + b.func2(11, 3));
        //使用组合仍然可以使用A的方法
        System.out.println("11 - 3 = " + b.func3(11, 3));
    }

}

//创建一个更加继承的基类
class base {
    //把更加基础的方法和成员写到base类中
}

//A类
class A extends base {
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
class B extends base {

    //如果B需要使用A类的方法，则使用组合关系
    private A a = new A();

    // 重写了func1
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    //如果仍然需要A的方法，就封装一下
    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}