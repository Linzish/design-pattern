package me.unc.princple.ocp;

/**
 * 开闭原则示例
 * 开闭原则时编程中最重要、最重要的设计原则
 * 一个软件实现如类，模块和函数应该对拓展开放，对修改关闭。用抽象构建框架，用实现拓展喜结。
 * 当软件需要变化时，尽量通过拓展软件实体的行为来实现行为，而不是通过修改现有的代码实现变化
 * 设计模式的目的就是遵守开闭原则。
 */
public class OcpTest {

    public static void main(String[] args) {
        //使用看看存在问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        //但增加一个图形时，需要修改代码比较多，不符合开闭原则
        graphicEditor.drawShape(new Triangle());
    }

}

//这是一个用于绘图的类
class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3) {  //新增绘制三角形逻辑
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println(" 绘制矩形 ");
    }

    public void drawCircle(Shape r) {
        System.out.println(" 绘制圆形 ");
    }
    //新增三角形的绘制方法
    public void drawTriangle(Shape r) {
        System.out.println(" 绘制三角形 ");
    }
}

//图形基类
class Shape {
    int m_type;
}

//矩形
class Rectangle extends Shape {
    public Rectangle() {
        super.m_type = 1;
    }
}
//圆形
class Circle extends Shape {
    public Circle() {
        super.m_type = 2;
    }
}

//新增一个三角形
class Triangle extends Shape {
    public Triangle() {
        super.m_type = 3;
    }
}